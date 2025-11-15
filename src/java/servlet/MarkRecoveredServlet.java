<<<<<<< HEAD

=======
>>>>>>> be980cf (first commit)


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
