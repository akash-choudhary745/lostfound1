
package servlet;

import dao.MessageDAO;
import model.Message;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/ChatServlet")
public class ChatServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //  Ensure only logged-in department users can access chat
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("departmentId") == null) {
            response.sendRedirect("department_login.jsp");
            return;
        }

        // Set response type and encoding
        response.setContentType("text/html;charset=UTF-8");

        try {
            MessageDAO dao = new MessageDAO();
            List<Message> messages = dao.getAllMessages();

            StringBuilder out = new StringBuilder();
            out.append("<div class='chat-box'>");

            for (Message m : messages) {
                boolean fromDept = "Department".equalsIgnoreCase(m.getSender());
                String bubbleClass = fromDept ? "bubble-dept" : "bubble-user";
                out.append("<div class='")
                   .append(fromDept ? "text-end" : "text-start")
                   .append(" mb-2'>")
                   .append("<div class='bubble ").append(bubbleClass).append("'>")
                   .append("<strong>").append(m.getSender()).append(":</strong> ")
                   .append(m.getMessage())
                   .append("</div>")
                   .append("<div class='meta'>").append(m.getTimestamp()).append("</div>")
                   .append("</div>");
            }

            out.append("</div>");
            response.getWriter().write(out.toString());

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("<p>Error loading chat: " + e.getMessage() + "</p>");
        }
    }
}
