<%--<%@ page contentType="text/html;charset=UTF-8" %>--%>
<%@ page import="java.util.List" %>
<%@ page import="dao.MessageDAO" %>
<%@ page import="model.Message" %>
<%@ include file="navbar3.jsp" %>
<%
    // ? Session validation for department
    String deptUser = (String) session.getAttribute("departmentUsername");
    String deptName = (String) session.getAttribute("departmentName");

    if (deptUser == null) {
        response.sendRedirect("department_login.jsp");
        return;
    }

    String itemId = request.getParameter("itemId");
    String itemTitle = request.getParameter("itemTitle");
%>

<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Department Chat - Lost & Found</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="refresh" content="5">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
 <link rel="stylesheet" href="css/styles.css">
  <style>
    body {
      font-family: 'Poppins', sans-serif;
      background: #f8f9fa;
    }
    .chat-box {
      height: 400px;
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
    .bubble-dept { background: #0d6efd; color: #fff; }
    .bubble-user { background: #e9ecef; color: #000; }
    .meta { font-size: 11px; color: #6c757d; margin-top: 4px; }
  </style>
</head>

<body>
<div class="container mt-4">
  <div class="d-flex justify-content-between align-items-center mb-3">
    <h4>Department Chat</h4>
    <div>
      <span class="me-3 text-muted">Logged in as: <strong><%= deptName %></strong></span>
      <a href="LogoutServlet" class="btn btn-outline-danger btn-sm">Logout</a>
      <a href="department_home.jsp" class="btn btn-outline-secondary btn-sm">? Back</a>
    </div>
  </div>

  <% if (itemTitle != null) { %>
    <p class="text-muted">Chat about item: <strong><%= itemTitle %></strong></p>
  <% } %>

  <div class="chat-box mb-3">
    <%
        MessageDAO mdao = new MessageDAO();
        List<Message> msgs = mdao.getAllMessages();

        if (msgs != null && !msgs.isEmpty()) {
            for (Message m : msgs) {
                boolean fromDept = deptUser.equalsIgnoreCase(m.getSender());
                String bubbleClass = fromDept ? "bubble-dept" : "bubble-user";
                String align = fromDept ? "text-end" : "text-start";
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

  <!-- Send Message -->
  <form action="MessageServlet" method="post" class="mt-3">
    <input type="hidden" name="sender" value="<%= deptUser %>">
    <input type="hidden" name="receiver" value="User">
    <% if (itemId != null) { %>
      <input type="hidden" name="itemId" value="<%= itemId %>">
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
