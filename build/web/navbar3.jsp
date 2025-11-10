<%-- 
    Document   : navbar2
    Created on : 30 Oct, 2025, 11:06:17 AM
    Author     : akash
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                <link href="css/styles.css" rel="stylesheet">
                
                <style>
                     body {
      font-family: 'Poppins', sans-serif;
      background-color: #f8f9fa;
    }
    .navbar {
      background-color: #0d6efd;
    }
    .navbar-brand, .nav-link {
      color: #fff !important;
      font-weight: 500;
    }
    .nav-link:hover {
      color: #ffc107 !important;
    }
                    </style>

    </head>
    <body>
    
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">Lost & Found</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="department_home.jsp">Department_Home</a></li>
               <li class="nav-item"><a class="nav-link" href="department_panel.jsp">Active_Items</a></li>
                <li class="nav-item"><a class="nav-link " href="chat.jsp">Chat</a></li>
                <li class="nav-item"><a href="department_history.jsp" class="nav-link">View History</a>
</li>
            </ul>
             <a href="LogoutServlet" class="btn btn-outline-light ms-3 btn-sm">Logout</a>
        </div>
    </div>
</nav>
      
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
