<%@ page import="java.util.List" %>
<%@ page import="model.Item" %>
<%@ include file="navbar3.jsp" %>

<%
    HttpSession sessionObj = request.getSession(false);
    if (sessionObj == null || sessionObj.getAttribute("departmentId") == null) {
        response.sendRedirect("department_login.jsp");
        return;
    }

    String deptName = (String) sessionObj.getAttribute("departmentName");
    List<Item> items = (List<Item>) request.getAttribute("items");
%>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Department Panel - Manage Items</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/styles.css">

  <style>
    .remove-btn {
      background-color: #dc3545;
      color: #fff;
      border: none;
      padding: 6px 12px;
      border-radius: 6px;
      cursor: pointer;
    }
    .remove-btn:hover {
      background-color: #c82333;
    }
    footer {
      background-color: #0d6efd;
      color: white;
      text-align: center;
      padding: 15px 0;
      margin-top: 50px;
    }
  </style>
</head>
<body>

<div class="container mt-4">
  <h2 class="mb-3 text-center">Welcome, <%= deptName %> Department</h2>

  <!-- ? Search Bar -->
  <form action="DepartmentPanelServlet" method="get" class="row g-3 search-bar">
    <div class="col-md-9">
      <input type="text" name="search" class="form-control" placeholder="Search items by name or location..." />
    </div>
    <div class="col-md-3 d-grid">
      <button type="submit" class="btn btn-primary">Search</button>
    </div>
  </form>

  <!-- ? Items Grid -->
  <div class="row mt-4">
    <%
      if (items != null && !items.isEmpty()) {
        for (Item it : items) {
    %>
      <div class="col-md-4 col-sm-6 mb-4">
        <div class="card h-100">
          <% if (it.getImagePath() != null && !it.getImagePath().isEmpty()) { %>
            <img src="<%=request.getContextPath()%>/<%=it.getImagePath()%>" class="card-img-top" alt="Item Image">
          <% } else { %>
            <img src="images/no-image.jpg" class="card-img-top" alt="No Image">
          <% } %>
          <div class="card-body">
            <h5 class="card-title text-primary"><%=it.getTitle()%></h5>
            <p class="card-text">
              <%= it.getDescription() != null && it.getDescription().length() > 80
                  ? it.getDescription().substring(0,80) + "..."
                  : it.getDescription() %>
            </p>
            <p class="small text-muted mb-1"><strong>Location:</strong> <%=it.getLocation()%></p>
            <p class="small text-muted mb-1"><strong>Category:</strong> <%=it.getCategory()%></p>
            <p class="small text-muted"><strong>Date:</strong> <%=it.getDateFoundLost()%></p>
          </div>
          <div class="card-footer bg-white text-center">
            <form action="RemoveItemServlet" method="post" onsubmit="return confirm('Are you sure you want to remove this item?');">
              <input type="hidden" name="id" value="<%=it.getId()%>">
              <button type="submit" class="remove-btn">Remove</button>
            </form>
          </div>
        </div>
      </div>
    <%
        }
      } else {
    %>
      <div class="col-12 text-center text-muted mt-4">
        <p>No items found.</p>
      </div>
    <%
      }
    %>
  </div>
</div>

<footer>
  <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107;">Developed by Team</a></p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
