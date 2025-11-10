package servlet;

import java.io.IOException;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import util.DBUtil;
import java.security.MessageDigest;

@WebServlet("/DepartmentLoginServlet")
public class DepartmentLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try (Connection conn = DBUtil.getConnection()) {
            String sql = "SELECT * FROM departments WHERE username = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String storedHash = rs.getString("password_hash");

                if (storedHash.equals(hashPassword(password))) {
                    // ✅ Login successful — create session
                    HttpSession session = request.getSession(true);
                    session.setAttribute("departmentId", rs.getInt("id"));
                    session.setAttribute("departmentUsername", rs.getString("username"));
                    session.setAttribute("departmentName", rs.getString("fullname"));

                    // Optional: set session timeout (30 mins)
                    session.setMaxInactiveInterval(30 * 60);

                    // Redirect to department panel
                    response.sendRedirect("department_home.jsp");

                } else {
                    // ❌ Wrong password
                    request.setAttribute("error", "Invalid password!");
                    request.getRequestDispatcher("department_login.jsp").forward(request, response);
                }

            } else {
                // ❌ Username not found
                request.setAttribute("error", "No such department user!");
                request.getRequestDispatcher("department_login.jsp").forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Database error: " + e.getMessage());
            request.getRequestDispatcher("department_login.jsp").forward(request, response);
        }
    }

    // 🔒 Utility: SHA-256 password hashing
    private String hashPassword(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashedBytes = md.digest(password.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte b : hashedBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
