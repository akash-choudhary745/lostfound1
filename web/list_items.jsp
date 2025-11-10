<%@ include file="navbar2.jsp" %>

<%--<%@ page contentType="text/html;charset=UTF-8" %>--%>
<%@ page import="java.util.List" %>
<%@ page import="model.Item" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Items - Lost & Found</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/styles.css" rel="stylesheet">
              <!--<link href="style.css" rel="stylesheet">-->
        <style>
.search-bar {
      background-color: #fff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
      margin-top: 30px;
    }
    .card {
      border: none;
      border-radius: 12px;
      box-shadow: 0 4px 10px rgba(0,0,0,0.1);
      transition: transform 0.2s ease-in-out;
    }
    .card:hover {
      transform: scale(1.03);
    }
    .card img {
      height: 200px;
      object-fit: cover;
      border-radius: 12px 12px 0 0;
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


<!-- Search Bar -->
<div class="container search-bar">
  <form action="list_items" method="get" class="row g-3 align-items-center">
    <div class="col-md-9">
      <input name="q" class="form-control" placeholder="Search title, description, or location..." />
    </div>
    <div class="col-md-3 d-grid">
      <button class="btn btn-custom">Search</button>
    </div>
  </form>
</div>

<!-- Items Grid -->
<div class="container mt-5">
  <div class="row">
    <%
      List<Item> items = (List<Item>) request.getAttribute("items");
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
              <%= it.getDescription() != null && it.getDescription().length() > 100 
                  ? it.getDescription().substring(0,100) + "..." 
                  : it.getDescription() %>
            </p>
            <p class="small text-muted mb-1"><strong>Location:</strong> <%=it.getLocation()%></p>
            <p class="small text-muted mb-1"><strong>Category:</strong> <%=it.getCategory()%></p>
            <p class="small"><strong>Contact:</strong> <%=it.getContactInfo()%></p>
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

<!-- Footer -->
  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
