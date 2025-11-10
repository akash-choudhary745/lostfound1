<%@ include file="navbar1.jsp" %>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login - Lost & Found</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="css/styles.css" rel="stylesheet">
</head>
<style>
     .login-container {
      min-height: vh;
      display: flex;
      align-items: center;
      justify-content: center;
      padding: 20px;
    }
    .btn-custom {
      background-color: #ffc107;
      color: black;
      font-weight: 600;
      border: none;
      width: 100%;
      transition: 0.3s;
    }
    </style>
<body>



<div class="login-container">
  <div class="card p-4 col-12 col-md-6 col-lg-4">
    <h3 class="text-center mb-4">User Login</h3>
    <form action="login" method="post">
      <div class="mb-3">
        <label class="form-label">Email</label>
        <input type="email" class="form-control" name="email" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Password</label>
        <input type="password" class="form-control" name="password" required>
      </div>
      <button type="submit" class="btn btn-custom">Login</button>
      <p class="text-center mt-3">Don?t have an account? <a href="register.jsp">Register here</a></p>
    </form>
    <% String error = (String) request.getAttribute("error");
       if (error != null) { %>
       <div class="alert alert-danger mt-3 text-center"><%= error %></div>
    <% } %>
  </div>
</div>

  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
