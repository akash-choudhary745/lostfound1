/////////*
//////// * To change this license header, choose License Headers in Project Properties.
//////// * To change this template file, choose Tools | Templates
//////// * and open the template in the editor.
//////// */
////////package servlet;
////////
////////import java.io.IOException;
////////import java.io.PrintWriter;
////////import javax.servlet.ServletException;
////////import javax.servlet.annotation.WebServlet;
////////import javax.servlet.http.HttpServlet;
////////import javax.servlet.http.HttpServletRequest;
////////import javax.servlet.http.HttpServletResponse;
////////
/////////**
//////// *
//////// * @author akash
//////// */
////////@WebServlet(name = "DepartmentPanelServlet", urlPatterns = {"/DepartmentPanelServlet"})
////////public class DepartmentPanelServlet extends HttpServlet {
////////
////////    /**
////////     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
////////     * methods.
////////     *
////////     * @param request servlet request
////////     * @param response servlet response
////////     * @throws ServletException if a servlet-specific error occurs
////////     * @throws IOException if an I/O error occurs
////////     */
////////    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
////////            throws ServletException, IOException {
////////        response.setContentType("text/html;charset=UTF-8");
////////        try (PrintWriter out = response.getWriter()) {
////////            /* TODO output your page here. You may use following sample code. */
////////            out.println("<!DOCTYPE html>");
////////            out.println("<html>");
////////            out.println("<head>");
////////            out.println("<title>Servlet DepartmentPanelServlet</title>");            
////////            out.println("</head>");
////////            out.println("<body>");
////////            out.println("<h1>Servlet DepartmentPanelServlet at " + request.getContextPath() + "</h1>");
////////            out.println("</body>");
////////            out.println("</html>");
////////        }
////////    }
////////
////////    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
////////    /**
////////     * Handles the HTTP <code>GET</code> method.
////////     *
////////     * @param request servlet request
////////     * @param response servlet response
////////     * @throws ServletException if a servlet-specific error occurs
////////     * @throws IOException if an I/O error occurs
////////     */
////////    @Override
////////    protected void doGet(HttpServletRequest request, HttpServletResponse response)
////////            throws ServletException, IOException {
////////        processRequest(request, response);
////////    }
////////
////////    /**
////////     * Handles the HTTP <code>POST</code> method.
////////     *
////////     * @param request servlet request
////////     * @param response servlet response
////////     * @throws ServletException if a servlet-specific error occurs
////////     * @throws IOException if an I/O error occurs
////////     */
////////    @Override
////////    protected void doPost(HttpServletRequest request, HttpServletResponse response)
////////            throws ServletException, IOException {
////////        processRequest(request, response);
////////    }
////////
////////    /**
////////     * Returns a short description of the servlet.
////////     *
////////     * @return a String containing servlet description
////////     */
////////    @Override
////////    public String getServletInfo() {
////////        return "Short description";
////////    }// </editor-fold>
////////
////////}
//////
//////
//////
//////
//////
//////
//////
//////
//////
////
////package servlet;
////
////import dao.ItemDAO;
////import model.Item;
////import javax.servlet.*;
////import javax.servlet.http.*;
////import java.io.IOException;
////import java.util.List;
////
////public class DepartmentPanelServlet extends HttpServlet {
////    protected void doGet(HttpServletRequest request, HttpServletResponse response)
////        throws ServletException, IOException {
////        ItemDAO dao = new ItemDAO();
////        List<Item> items = dao.getAllActiveItems();
////        request.setAttribute("items", items);
////        RequestDispatcher rd = request.getRequestDispatcher("department_panel.jsp");
////        rd.forward(request, response);
////    }
////}
////
////
////
////
////
//
//
////package servlet;
////
////import dao.ItemDAO;
////import model.Item;
////import javax.servlet.*;
////import javax.servlet.annotation.WebServlet;
////import javax.servlet.http.*;
////import java.io.IOException;
////import java.util.List;
////
////@WebServlet("/DepartmentPanelServlet")
////public class DepartmentPanelServlet extends HttpServlet {
////    @Override
////    protected void doGet(HttpServletRequest request, HttpServletResponse response)
////            throws ServletException, IOException {
////
////        // ✅ Ensure department user is logged in
////        HttpSession session = request.getSession(false);
////        if (session == null || session.getAttribute("departmentId") == null) {
////            response.sendRedirect("department_login.jsp");
////            return;
////        }
////
////        try {
////            ItemDAO dao = new ItemDAO();
////            List<Item> items = dao.getAllActiveItems();
////            request.setAttribute("items", items);
////            RequestDispatcher rd = request.getRequestDispatcher("department_panel.jsp");
////            rd.forward(request, response);
////
////        } catch (Exception e) {
////            e.printStackTrace();
////            request.setAttribute("error", "Unable to load items: " + e.getMessage());
////            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
////            rd.forward(request, response);
////        }
////    }
////}
//
//
//package servlet;
//
//import dao.ItemDAO;
//import model.Item;
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet("/DepartmentPanelServlet")
//public class DepartmentPanelServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        // ✅ Check session (only logged-in department can access)
//        HttpSession session = request.getSession(false);
//        if (session == null || session.getAttribute("departmentId") == null) {
//            response.sendRedirect("department_login.jsp");
//            return;
//        }
//
//        try {
//            // ✅ Fetch active items from database
//            ItemDAO dao = new ItemDAO();
//            List<Item> items = dao.getAllActiveItems();
//
//            // ✅ Send items to JSP
//            request.setAttribute("items", items);
//            RequestDispatcher rd = request.getRequestDispatcher("department_panel.jsp");
//            rd.forward(request, response);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            request.setAttribute("error", "Unable to load items: " + e.getMessage());
//            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
//            rd.forward(request, response);
//        }
//    }
//
//    // Optional: Logout support
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String action = request.getParameter("action");
//        if ("logout".equals(action)) {
//            HttpSession session = request.getSession(false);
//            if (session != null) session.invalidate();
//            response.sendRedirect("department_login.jsp");
//        }
//    }
//}


package servlet;

import dao.ItemDAO;
import model.Item;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/DepartmentPanelServlet")
public class DepartmentPanelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("departmentId") == null) {
            response.sendRedirect("department_login.jsp");
            return;
        }

        String search = request.getParameter("search");
        try {
            ItemDAO dao = new ItemDAO();
            List<Item> items;

            if (search != null && !search.trim().isEmpty()) {
                items = dao.searchItems(search); // ascending order search
            } else {
                items = dao.getAllActiveItems(); // ascending order by default
            }

            request.setAttribute("items", items);
            RequestDispatcher rd = request.getRequestDispatcher("department_panel.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("error", "Unable to load items: " + e.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("logout".equals(action)) {
            HttpSession session = request.getSession(false);
            if (session != null) session.invalidate();
            response.sendRedirect("department_login.jsp");
        }
    }
}
