<<<<<<< HEAD
=======

>>>>>>> be980cf (first commit)

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
