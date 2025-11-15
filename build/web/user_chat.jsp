<%@ include file="navbar2.jsp" %>
<%--<%@ page contentType="text/html;charset=UTF-8" %>--%>
<%@ page import="java.util.List" %>
<%@ page import="dao.MessageDAO" %>
<%@ page import="model.Message" %>

<%
    // ? Validate user session
    String userEmail = (String) session.getAttribute("email");
    String userName = (String) session.getAttribute("username");

    if (userEmail == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    String itemId = request.getParameter("itemId");
    String itemTitle = request.getParameter("itemTitle");
%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>User Chat - Lost & Found</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="refresh" content="5">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/styles.css" rel="stylesheet">

  <style>
    body {font-family: 'Poppins', sans-serif; background: #f8f9fa;}
    .chat-box {
      height: 380px;
      overflow-y: auto;
      padding: 15px;
      background: #fff;
      border-radius: 12px;
      border: 1px solid #e9ecef;
    }
    .bubble {
      padding: 10px 14px;
      border-radius: 16px;
      display: inline-block;
      max-width: 75%;
      word-wrap: break-word;
    }
    .bubble-user { background: #0d6efd; color: #fff; }
    .bubble-dept { background: #e9ecef; color: #000; }
    .meta { font-size: 11px; color: #6c757d; margin-top: 6px; }
  </style>
</head>

<body>
<div class="container mt-4">
  <div class="d-flex justify-content-between align-items-center mb-3">
    <h4>User Chat</h4>
    <a href="index.jsp" class="btn btn-outline-secondary btn-sm">? Back to Home</a>
  </div>

  <% if (itemTitle != null) { %>
    <p class="text-muted">Chat regarding item: <strong><%= itemTitle %></strong></p>
  <% } %>

  <!-- Chat Display -->
  <div class="chat-box mb-3">
    <%
        MessageDAO mdao = new MessageDAO();
        List<Message> msgs = mdao.getAllMessages();

        if (msgs != null && !msgs.isEmpty()) {
            for (Message m : msgs) {
                boolean fromUser = userEmail.equalsIgnoreCase(m.getSender());
                String bubbleClass = fromUser ? "bubble-user" : "bubble-dept";
                String align = fromUser ? "text-end" : "text-start";
    %>
                <div class="<%= align %> mb-3">
                  <div class="bubble <%= bubbleClass %>">
                    <strong><%= m.getSender() %></strong><br/>
                    <%= m.getMessage() %>
                  </div>
                  <div class="meta"><%= m.getTimestamp() %></div>
                </div>
    <%
            }
        } else {
    %>
        <p class="text-muted text-center">No messages yet.</p>
    <%
        }
    %>
  </div>

  <!-- Message Sending Form -->
  <form action="MessageServlet" method="post" class="mt-3">
    <input type="hidden" name="sender" value="<%= userEmail %>" />
    <input type="hidden" name="receiver" value="Department" />
    <% if (itemId != null) { %>
      <input type="hidden" name="itemId" value="<%= itemId %>" />
    <% } %>

    <div class="input-group">
      <input name="message" class="form-control" placeholder="Type your message..." >
      <button class="btn btn-primary" type="submit">Send</button>
    </div>
  </form>
</div>
      <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>

</body>
</html>
