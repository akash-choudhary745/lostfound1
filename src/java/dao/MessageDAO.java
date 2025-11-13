


package dao;

import model.Message;
import util.DBUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MessageDAO {

    // ✅ Save new message
    public boolean saveMessage(Message msg) {
        String sql = "INSERT INTO messages (sender, receiver, message) VALUES (?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, msg.getSender());
            ps.setString(2, msg.getReceiver());
            ps.setString(3, msg.getMessage());
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // ✅ Retrieve all messages
    public List<Message> getAllMessages() {
        List<Message> list = new ArrayList<>();
        String sql = "SELECT * FROM messages ORDER BY timestamp Desc";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Message m = new Message();
                m.setId(rs.getInt("id"));
                m.setSender(rs.getString("sender"));
                m.setReceiver(rs.getString("receiver"));
                m.setMessage(rs.getString("message"));
                m.setTimestamp(rs.getTimestamp("timestamp"));
                list.add(m);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
