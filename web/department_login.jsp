
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Department Login - Lost & Found</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
  <link rel="stylesheet" href="css/styles.css">
</head>
<body>

<%@ include file="navbar1.jsp" %>

<div class="container mt-5 mb-5">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card shadow-lg border-0 rounded-4">
        <div class="card-header text-center bg-primary text-white py-3">
          <h4 class="mb-0">Department Login</h4>
        </div>
        <div class="card-body p-4">

          <% if (request.getParameter("msg") != null && request.getParameter("msg").equals("registered")) { %>
            <div class="alert alert-success text-center">Registration successful! Please log in.</div>
          <% } %>

          <% if (request.getAttribute("error") != null) { %>
            <div class="alert alert-danger text-center"><%= request.getAttribute("error") %></div>
          <% } %>

          <form action="DepartmentLoginServlet" method="post">

            <div class="mb-3">
              <label class="form-label">Username</label>
              <input type="text" name="username" class="form-control" placeholder="Enter username" required>
            </div>

            <div class="mb-3">
              <label class="form-label">Password</label>
              <input type="password" name="password" class="form-control" placeholder="Enter password" required>
            </div>

            <div class="d-grid mt-4">
              <button type="submit" class="btn btn-custom" style="background-color: #ffc107">Login</button>
            </div>

          </form>
        </div>
      </div>
    </div>
  </div>
</div>
  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>



</body>
</html>
