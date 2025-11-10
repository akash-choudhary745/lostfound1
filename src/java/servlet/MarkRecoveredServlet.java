//package servlet;
//
//import dao.ItemDAO;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//
//@WebServlet("/mark_recovered")
//public class MarkRecoveredServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String idStr = req.getParameter("id");
//        try {
//            int id = Integer.parseInt(idStr);
//            ItemDAO dao = new ItemDAO();
//            dao.markAsRecovered(id);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        resp.sendRedirect(req.getContextPath() + "/department_panel");
//    }
//}


package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import util.DBUtil;

@WebServlet("/MarkRecoveredServlet")
public class MarkRecoveredServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int itemId = Integer.parseInt(request.getParameter("id"));

        try (Connection conn = DBUtil.getConnection()) {
            String sql = "UPDATE items SET status='Recovered' WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, itemId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("DepartmentPanelServlet");
    }
}
