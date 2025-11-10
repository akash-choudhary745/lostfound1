////package servlet;
////
////import javax.servlet.annotation.WebServlet;
////import javax.servlet.http.*;
////import java.io.IOException;
////
////@WebServlet("/logout")
////public class LogoutServlet extends javax.servlet.http.HttpServlet {
////    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
////        HttpSession s = req.getSession(false);
////        if (s != null) s.invalidate();
////        resp.sendRedirect("login.jsp");
////    }
////}
//
//
//package servlet;
//
//import java.io.IOException;
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//
//@WebServlet("/logout")
//public class LogoutServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        HttpSession session = request.getSession(false);
//        if (session != null) session.invalidate();
//        response.sendRedirect("department_login.jsp");
//    }
//}


package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        response.sendRedirect("index.jsp");
    }
}
