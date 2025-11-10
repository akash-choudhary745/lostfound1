package servlet;

import dao.ItemDAO;
import model.Item;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/list_items")
public class ListItemsServlet extends javax.servlet.http.HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            List<Item> items = ItemDAO.listAll();
            req.setAttribute("items", items);
            req.getRequestDispatcher("list_items.jsp").forward(req, resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
