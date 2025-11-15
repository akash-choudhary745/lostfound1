<%-- 
    Document   : navbar1
    Created on : 30 Oct, 2025, 11:35:28 AM
    Author     : akash
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
                <link href="styles.css" rel="stylesheet">
                
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
        <a class="navbar-brand" href="index.jsp">Lost & Found</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
          <li class="nav-item"><a class="nav-link" href="register.jsp">Register</a></li>
          <li class="nav-item"><a class="nav-link" href="login.jsp">Login</a></li>
                    <li class="nav-item"><a class="nav-link" href="department_register.jsp">department_staf</a></li>
                    

            </ul>
        </div>
    </div>
</nav>
      
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
