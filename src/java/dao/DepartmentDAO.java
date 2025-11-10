package dao;

import model.Department; // reuse User model if you want
import util.DBUtil;

import java.sql.*;

public class DepartmentDAO {

    // validate department credentials (returns fullname or null)
//    public String validate(String username, String password) {
//        String sql = "SELECT fullname, password_hash FROM departments WHERE username = ?";
//        try (Connection con = DBUtil.getConnection();
//             PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setString(1, username);
//            try (ResultSet rs = ps.executeQuery()) {
//                if (rs.next()) {
//                    String storedHash = rs.getString("password_hash");
//                    String fullname = rs.getString("fullname"); 
//                    // Simple plain-text compare (development only).
//                    // For production use bcrypt/argon2 verification here.
//                    if (password.equals(storedHash)) {
//                        return fullname;
//                    }
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    
    
    public static boolean registerUser(Department user) throws SQLException {
        String sql = "INSERT INTO departments (username, password_hash, fullname) VALUES (?, ?, ?)";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(3, user.getFullName());
            ps.setString(2, user.gethash_password());
            ps.setString(1, user.getUserName());
            int affected = ps.executeUpdate();
            if (affected == 0) return false;
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) user.setId(rs.getInt(1));
            }
            return true;
        }
    }
    
       public static Department findByusername(String username) throws SQLException {
        String sql = "SELECT * FROM departments WHERE username = ?";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Department d = new Department();
                    
                    return d;
                }
            }
        }
        return null;
    }
}
