//package servlet;
//
//import util.DBUtil;
//import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//import java.sql.*;
//
//@WebServlet("/RemoveItemServlet")
//public class RemoveItemServlet extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String idParam = request.getParameter("id");
//        if (idParam == null || idParam.isEmpty()) {
//            response.sendRedirect("DepartmentPanelServlet");
//            return;
//        }
//
//        int id = Integer.parseInt(idParam);
//        try (Connection conn = DBUtil.getConnection()) {
//            String sql = "DELETE FROM items WHERE id=?";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, id);
//            ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        response.sendRedirect("DepartmentPanelServlet");
//    }
//}


package servlet;

import util.DBUtil;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/RemoveItemServlet")
public class RemoveItemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idParam = request.getParameter("id");
        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("departmentName") == null) {
            response.sendRedirect("department_login.jsp");
            return;
        }

        String claimedBy = (String) session.getAttribute("departmentName");

        if (idParam == null || idParam.isEmpty()) {
            response.sendRedirect("DepartmentPanelServlet");
            return;
        }

        int id = Integer.parseInt(idParam);

        try (Connection con = DBUtil.getConnection()) {

            // 1️⃣ Fetch full item data
            String fetchSql = "SELECT * FROM items WHERE id=?";
            PreparedStatement psFetch = con.prepareStatement(fetchSql);
            psFetch.setInt(1, id);
            ResultSet rs = psFetch.executeQuery();

            if (rs.next()) {

                // 2️⃣ Insert into history table
                String insertHistory = 
                    "INSERT INTO history (item_id, item_name, category, location, description, " +
                    "posted_by, posted_by_name, claimed_by, image_path, status) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, 'Claimed')";

                PreparedStatement psHistory = con.prepareStatement(insertHistory);

                psHistory.setInt(1, rs.getInt("id"));
                psHistory.setString(2, rs.getString("title"));
                psHistory.setString(3, rs.getString("category"));
                psHistory.setString(4, rs.getString("location"));
                psHistory.setString(5, rs.getString("description"));
                psHistory.setInt(6, rs.getInt("posted_by"));
                psHistory.setString(7, rs.getString("contact_info")); // posted_by user name/phone
                psHistory.setString(8, claimedBy);
                psHistory.setString(9, rs.getString("image_path"));

                psHistory.executeUpdate();
            }

            // 3️⃣ Delete the item
            String deleteSql = "DELETE FROM items WHERE id=?";
            PreparedStatement psDelete = con.prepareStatement(deleteSql);
            psDelete.setInt(1, id);
            psDelete.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("DepartmentPanelServlet?msg=Item+Removed+Successfully");
    }
}
