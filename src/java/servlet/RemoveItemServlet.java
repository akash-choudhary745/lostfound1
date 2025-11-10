package servlet;

import util.DBUtil;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.*;

@WebServlet("/RemoveItemServlet")
public class RemoveItemServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idParam = request.getParameter("id");
        if (idParam == null || idParam.isEmpty()) {
            response.sendRedirect("DepartmentPanelServlet");
            return;
        }

        int id = Integer.parseInt(idParam);
        try (Connection conn = DBUtil.getConnection()) {
            String sql = "DELETE FROM items WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("DepartmentPanelServlet");
    }
}
