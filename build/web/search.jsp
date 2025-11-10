<%@ include file="navbar2.jsp" %>

<%@ page import="java.sql.*, java.util.*, model.Item" %>
<%@ page import="dao.ItemDAO" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Search Items - Lost & Found</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet">
    <style>
        .search-section {
            padding: 40px 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
            margin-top: 30px;
        }
        .card {
            border: none;
            border-radius: 12px;
            box-shadow: 0 3px 8px rgba(0,0,0,0.1);
            transition: transform 0.2s ease-in-out;
        }
        .card:hover {
            transform: scale(1.02);
        }
        .card img {
            border-radius: 12px 12px 0 0;
            height: 200px;
            object-fit: cover;
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

<!-- Search Section -->
<div class="container search-section">
    <h2 class="text-center mb-4 text-primary">Search Lost & Found Items</h2>
    <form class="row g-3" method="get" action="search">
        <div class="col-md-6">
            <input type="text" name="keyword" class="form-control" placeholder="Enter item name or description"
                   value="<%= request.getParameter("keyword") != null ? request.getParameter("keyword") : "" %>">
        </div>
        <div class="col-md-3">
            <select name="category" class="form-select">
                <option value="category">All Categories</option>
                <option value="Lost">Lost</option>
                <option value="Found">Found</option>
            </select>
        </div>
        <div class="col-md-3">
            <button type="submit" class="btn btn-primary w-100">Search</button>
        </div>
    </form>
</div>

<!-- Results Section -->
<div class="container mt-5">
    <div class="row">
        <%
            String keyword = request.getParameter("keyword");
            String category = request.getParameter("category");

            List<Item> itemList = new ArrayList<>();

            if (keyword != null || category != null) {
                try {
                    ItemDAO dao = new ItemDAO();
                    itemList = dao.searchItems(keyword, category);
                } catch (Exception e) {
                    out.println("<p class='text-danger text-center'>Error fetching data.</p>");
                }
            }

            if (itemList != null && !itemList.isEmpty()) {
                for (Item item : itemList) {
        %>
        <div class="col-md-4 mb-4">
            <div class="card">
                <img src="<%= item.getImagePath() != null ? item.getImagePath() : "images/no-image.jpg" %>" class="card-img-top" alt="Item Image">
                <div class="card-body">
                    <h5 class="card-title text-primary"><%= item.getTitle() %></h5>
                    <p class="card-text"><%= item.getDescription() %></p>
                    <p class="small text-muted mb-1"><strong>Location:</strong> <%= item.getLocation() %></p>
                    <p class="small text-muted mb-1"><strong>Date:</strong> <%= item.getDateFoundLost() %></p>
                    <p class="small text-muted"><strong>Status:</strong> <%= item.getStatus() %></p>
                </div>
            </div>
        </div>
        <%
                }
            } else if (keyword != null) {
        %>
        <p class="text-center text-muted mt-4">No items found matching your search.</p>
        <% } %>
    </div>
</div>

<!-- Footer -->
  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
