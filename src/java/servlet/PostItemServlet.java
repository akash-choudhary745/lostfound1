package servlet;

import dao.ItemDAO;
import model.Item;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;
import java.nio.file.Paths;
import java.sql.Date;

@WebServlet("/post_item")
@MultipartConfig(maxFileSize = 5_242_880) // 5MB
public class PostItemServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // check user
        HttpSession session = req.getSession(false);
        User user = (session != null) ? (User) session.getAttribute("user") : null;

        String title = req.getParameter("title");
        String description = req.getParameter("description");
        String category = req.getParameter("category");
        String location = req.getParameter("location");
        String dateStr = req.getParameter("date_found_lost");
        String contact = req.getParameter("contact_info");

        Part filePart = req.getPart("image");
        String imagePath = null;
        if (filePart != null && filePart.getSize() > 0) {
            String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
            String uploadsDir = req.getServletContext().getRealPath("/uploads");
            File uploads = new File(uploadsDir);
            if (!uploads.exists()) uploads.mkdirs();
            // avoid collisions: prefix timestamp
            String savedName = System.currentTimeMillis() + "_" + fileName;
            File file = new File(uploads, savedName);
            try (InputStream in = filePart.getInputStream(); FileOutputStream out = new FileOutputStream(file)) {
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) != -1) out.write(buffer, 0, len);
            }
            imagePath = "uploads/" + savedName; // relative path for JSP <img src="">
        }

        Item item = new Item();
        item.setTitle(title);
        item.setDescription(description);
        item.setCategory(category);
        item.setLocation(location);
        if (dateStr != null && !dateStr.isEmpty()) item.setDateFoundLost(Date.valueOf(dateStr));
        item.setImagePath(imagePath);
        item.setPostedBy(user != null ? user.getId() : 0);
        item.setContactInfo(contact);
        item.setStatus("open");

        try {
            boolean ok = ItemDAO.saveItem(item);
            if (ok) resp.sendRedirect("list_items");
            else {
                req.setAttribute("error", "Could not save item");
                req.getRequestDispatcher("post_item.jsp").forward(req, resp);
            }
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
