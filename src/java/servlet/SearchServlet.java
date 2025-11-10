package servlet;

import dao.ItemDAO;
import model.Item;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/search")
public class SearchServlet extends javax.servlet.http.HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String q = req.getParameter("q");
        String p = req.getParameter("p");
        try {
            List<Item> results = ItemDAO.searchItems(q == null ? "" : q, p);
            req.setAttribute("items", results);
            req.getRequestDispatcher("search.jsp").forward(req, resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
