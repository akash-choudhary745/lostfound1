package dao;

import model.Item;
import util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO {

    // Mark item as recovered
public void markAsRecovered(int id) {
    String sql = "UPDATE items SET status='recovered' WHERE id=?";
    try (Connection con = DBUtil.getConnection();
         PreparedStatement ps = con.prepareStatement(sql)) {
        ps.setInt(1, id);
        ps.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

// Get all active (not recovered) items
//public List<Item> getAllActiveItems() {
//    List<Item> items = new ArrayList<>();
//    String sql = "SELECT * FROM items WHERE status='active' ORDER BY created_at DESC";
//    try (Connection con = DBUtil.getConnection();
//         PreparedStatement ps = con.prepareStatement(sql);
//         ResultSet rs = ps.executeQuery()) {
//
//        while (rs.next()) {
//            Item item = new Item();
//            item.setId(rs.getInt("id"));
//            item.setTitle(rs.getString("title"));
//            item.setDescription(rs.getString("description"));
//            item.setCategory(rs.getString("category"));
//            item.setLocation(rs.getString("location"));
//            item.setContactInfo(rs.getString("contact_info"));
//            item.setImagePath(rs.getString("image_path"));
//            item.setStatus(rs.getString("status"));
//            item.setCreatedAt(rs.getTimestamp("created_at"));
//            items.add(item);
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return items;
//}

public List<Item> getAllActiveItems() {
    List<Item> items = new ArrayList<>();
    String sql = "SELECT * FROM items WHERE category='Lost'";
    try (Connection conn = DBUtil.getConnection();
         PreparedStatement ps = conn.prepareStatement(sql);
         ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Item item = new Item();
            item.setId(rs.getInt("id"));
            item.setTitle(rs.getString("title"));
            item.setDescription(rs.getString("description"));
            item.setLocation(rs.getString("location"));
            item.setImagePath(rs.getString("image_path"));
            items.add(item);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return items;
}


    public static boolean saveItem(Item item) throws SQLException {
        String sql = "INSERT INTO items (title, description, category, location, date_found_lost, image_path, posted_by, contact_info, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, item.getTitle());
            ps.setString(2, item.getDescription());
            ps.setString(3, item.getCategory());
            ps.setString(4, item.getLocation());
            ps.setDate(5, item.getDateFoundLost());
            ps.setString(6, item.getImagePath());
            if (item.getPostedBy() == 0) ps.setNull(7, Types.INTEGER); else ps.setInt(7, item.getPostedBy());
            ps.setString(8, item.getContactInfo());
            ps.setString(9, item.getStatus());
            int affected = ps.executeUpdate();
            return affected > 0;
        }
    }

    public static List<Item> listAll() throws SQLException {
        String sql = "SELECT * FROM items ORDER BY created_at ASC";
        List<Item> list = new ArrayList<>();
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Item it = new Item();
                it.setId(rs.getInt("id"));
                it.setTitle(rs.getString("title"));
                it.setDescription(rs.getString("description"));
                it.setCategory(rs.getString("category"));
                it.setLocation(rs.getString("location"));
                it.setDateFoundLost(rs.getDate("date_found_lost"));
                it.setImagePath(rs.getString("image_path"));
                it.setPostedBy(rs.getInt("posted_by"));
                it.setContactInfo(rs.getString("contact_info"));
                it.setStatus(rs.getString("status"));
                it.setCreatedAt(rs.getTimestamp("created_at"));
                list.add(it);
            }
        }
        return list;
    }
    
    // Optional: search by item name (ascending order)
    public List<Item> searchItems(String keyword) throws Exception {
        List<Item> list = new ArrayList<>();
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "SELECT * FROM items WHERE status='Active' AND title LIKE ? ORDER BY title ASC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setTitle(rs.getString("title"));
                item.setCategory(rs.getString("category"));
                item.setLocation(rs.getString("location"));
                item.setDateFoundLost(rs.getDate("date_found_lost"));
                list.add(item);
            }
        }
        return list;
    }

    public static List<Item> searchItems(String q,String p) throws SQLException {
        String sql = "SELECT * FROM items WHERE title LIKE ? OR description LIKE ? OR location LIKE ? OR category Like? ORDER BY created_at ASC";
        List<Item> list = new ArrayList<>();
        String like = "%" + q + "%";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, like);
            ps.setString(2, like);
            ps.setString(3, like);
            ps.setString(4, like);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Item it = new Item();
                    it.setId(rs.getInt("id"));
                    it.setTitle(rs.getString("title"));
                    it.setDescription(rs.getString("description"));
                    it.setCategory(rs.getString("category"));
                    it.setLocation(rs.getString("location"));
                    it.setDateFoundLost(rs.getDate("date_found_lost"));
                    it.setImagePath(rs.getString("image_path"));
                    it.setPostedBy(rs.getInt("posted_by"));
                    it.setContactInfo(rs.getString("contact_info"));
                    it.setStatus(rs.getString("status"));
                    it.setCreatedAt(rs.getTimestamp("created_at"));
                    list.add(it);
                }
            }
        }
        return list;
    }
}
