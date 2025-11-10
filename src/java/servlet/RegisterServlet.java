package servlet;

import dao.UserDAO;
import model.User;
import java.io.IOException;
import java.security.MessageDigest;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private String hash(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] b = md.digest(input.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte by : b) sb.append(String.format("%02x", by));
        return sb.toString();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fullname = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        try {
            User exist = UserDAO.findByEmail(email);
            if (exist != null) {
                req.setAttribute("error", "Email already registered.");
                req.getRequestDispatcher("register.jsp").forward(req, resp);
                return;
            }
            User u = new User();
            u.setFullname(fullname);
            boolean valid=u.setEmail(email);
            if(!valid)
            {
            req.setAttribute("error", "Email must be contain at least two number");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
            return;
            }
            u.setPasswordHash(hash(password));
            boolean ok = UserDAO.registerUser(u);
            if (ok) {
                resp.sendRedirect("login.jsp");
            } else {
                req.setAttribute("error", "Registration failed.");
                req.getRequestDispatcher("register.jsp").forward(req, resp);
            }
        } catch (Exception ex) {
            throw new ServletException(ex);
        }
    }
}
