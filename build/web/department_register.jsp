<%@ include file="navbar1.jsp" %>
<%@ page import="java.sql.*, java.util.*, model.Department, servlet.DepartmentRegisterServlet"  %>
<%--<%@ page contentType="text/html;charset=UTF-8" %>--%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Department Registration - Lost & Found</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="css/styles.css">
  
  <style>
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
<div class="container mt-5 mb-5">
  <div class="row justif
y-content-center">
    <div class="col-md-6">
      <div class="card shadow-lg border-0 rounded-4">
        <div class="card-header text-center bg-primary text-white py-3">
          <h4 class="mb-0">Department Registration</h4>
        </div>
        <div class="card-body p-4">
          <form action="department_register" method="post">
            
            <div class="mb-3">
              <label class="form-label">Full Name</label>
              <input type="text" name="fullname" class="form-control" placeholder="Enter full name" required>
            </div>

            <div class="mb-3">
              <label class="form-label">Username</label>
              <input type="text" name="username" class="form-control" placeholder="Choose a username" required>
            </div>

            <div class="mb-3">
              <label class="form-label">Password</label>
              <input type="password" name="password" class="form-control" placeholder="Enter password" required>
            </div>

            <div class="d-grid mt-4">
              <button type="submit" class="btn btn-custom">Register</button>
            </div>
              <p class="text-center mt-3">Already have an account? <a href="department_login.jsp">Login here</a></p>
              
          </form>
             <% String message = (String) request.getAttribute("message");
       if (message != null) { %>
       <div class="alert alert-success mt-3 text-center"><%= message %></div>
    <% } %>
        </div>
      </div>
    </div>
  </div>
</div>
  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>

<%--<%@ include file="footer.jsp" %>--%>

</body>
</html>
