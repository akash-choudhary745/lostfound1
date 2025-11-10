package dao;

import model.User;
import util.DBUtil;

import java.sql.*;

public class UserDAO {

    public static boolean registerUser(User user) throws SQLException {
        String sql = "INSERT INTO users (fullname, email, password_hash, role) VALUES (?, ?, ?, ?)";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, user.getFullname());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPasswordHash());
            ps.setString(4, user.getRole() == null ? "user" : user.getRole());
            int affected = ps.executeUpdate();
            if (affected == 0) return false;
            try (ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) user.setId(rs.getInt(1));
            }
            return true;
        }
    }

    public static User findByEmail(String email) throws SQLException {
        String sql = "SELECT * FROM users WHERE email = ?";
        try (Connection con = DBUtil.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    User u = new User();
                    u.setId(rs.getInt("id"));
                    u.setFullname(rs.getString("fullname"));
                    u.setEmail(rs.getString("email"));
                    u.setPasswordHash(rs.getString("password_hash"));
                    u.setRole(rs.getString("role"));
                    u.setCreatedAt(rs.getTimestamp("created_at"));
                    return u;
                }
            }
        }
        return null;
    }
}
