//package servlet;
//
//import dao.MessageDAO;
//import model.Message;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//
//@WebServlet("/message")
//public class MessageServlet extends HttpServlet {
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String sender = req.getParameter("sender");
//        String receiver = req.getParameter("receiver");
//        String messageText = req.getParameter("message");
//        String itemId = req.getParameter("itemId"); // optional
//
//        if (sender == null || messageText == null || messageText.trim().isEmpty()) {
//            resp.sendRedirect("chat");
//            return;
//        }
//
//        Message msg = new Message();
//        msg.setSender(sender);
//        msg.setReceiver(receiver);
//        msg.setMessage(messageText);
//
//        MessageDAO dao = new MessageDAO();
//        dao.insertMessage(msg);
//
//        // If chat was for an item, stay on that item chat by forwarding itemId/title in query
//        if (itemId != null && !itemId.isEmpty()) {
//            resp.sendRedirect(req.getContextPath() + "/chat?itemId=" + itemId);
//        } else {
//            resp.sendRedirect(req.getContextPath() + "/chat");
//        }
//    }
//}


package servlet;

import dao.MessageDAO;
import model.Message;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String sender = request.getParameter("sender");
        String receiver = request.getParameter("receiver");
        String message = request.getParameter("message");

        // Validate input
        if (sender == null || message == null || message.trim().isEmpty()) {
            response.getWriter().write("<p>Error saving message!</p>");
            return;
        }

        Message msg = new Message();
        msg.setSender(sender);
        msg.setReceiver(receiver);
        msg.setMessage(message);

        MessageDAO dao = new MessageDAO();
        boolean saved = dao.saveMessage(msg);

        if(!saved){
            response.getWriter().write("<p>Error saving message!</p>");
        }
        
        request.getRequestDispatcher("user_chat.jsp").forward(request, response);
    }
}
