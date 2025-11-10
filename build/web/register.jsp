<%@ include file="navbar1.jsp" %>
<%@ page import="java.sql.*, java.util.*, model.Item" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Register - Lost & Found</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="css/styles.css" rel="stylesheet">
      <style>
          .register-container {
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
</head>
<body>
<div class="register-container">
  <div class="card p-4 col-12 col-md-6 col-lg-4">
    <h3 class="text-center mb-4">Create Account</h3>
    <form action="register" method="post">
      <div class="mb-3">
        <label class="form-label">Full Name</label>
        <input type="text" class="form-control" name="name" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Email</label>
        <input type="email" class="form-control" name="email" required>
      </div>
      <div class="mb-3">
        <label class="form-label">Password</label>
        <input type="password" class="form-control" name="password" required>
      </div>
      <div class="mb-3">
        <label class="form-label">role</label>
        <input type="text" class="form-control" name="role" required>
      </div>
      <button type="submit" class="btn btn-custom">Register</button>
      <p class="text-center mt-3">Already have an account? <a href="login.jsp">Login here</a></p>
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
