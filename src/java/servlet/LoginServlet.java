//package servlet;
//
//import dao.UserDAO;
//import model.User;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//import java.security.MessageDigest;
//
//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//    private String hash(String input) throws Exception {
//        MessageDigest md = MessageDigest.getInstance("SHA-256");
//        byte[] b = md.digest(input.getBytes("UTF-8"));
//        StringBuilder sb = new StringBuilder();
//        for (byte by : b) sb.append(String.format("%02x", by));
//        return sb.toString();
//    }
//
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String email = req.getParameter("email");
//        String password = req.getParameter("password");
//        try {
//            User u = UserDAO.findByEmail(email);
//            if (u == null || !u.getPasswordHash().equals(hash(password))) {
//                req.setAttribute("error", "Invalid credentials");
//                req.getRequestDispatcher("login.jsp").forward(req, resp);
//                return;
//            }
//            HttpSession s = req.getSession();
//            s.setAttribute("user", u);
//            resp.sendRedirect("about.jsp");
//        } catch (Exception e) {
//            throw new ServletException(e);
//        }
//    }
//}


package servlet;

import dao.UserDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.security.MessageDigest;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private String hash(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] b = md.digest(input.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte by : b) sb.append(String.format("%02x", by));
        return sb.toString();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        try {
            User u = UserDAO.findByEmail(email);
            if (u == null || !u.getPasswordHash().equals(hash(password))) {
                req.setAttribute("error", "Invalid credentials");
                req.getRequestDispatcher("login.jsp").forward(req, resp);
                return;
            }

            // ✅ Added session handling (no other logic changed)
            HttpSession s = req.getSession();
            s.setAttribute("user", u);
            s.setAttribute("username", u.getFullname());
            s.setAttribute("email", u.getEmail());
            s.setMaxInactiveInterval(30 * 60); // session timeout: 30 minutes

            resp.sendRedirect("about.jsp");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}

