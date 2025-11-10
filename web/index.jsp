<%@ include file="navbar1.jsp" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Lost and Found - Home</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="css/styles.css" rel="stylesheet">

  <style>
    .btn-custom {
      background-color: #ffc107;
      color: #000;
      border: none;
      font-weight: 600;
      padding: 10px 30px;
      border-radius: 50px;
      transition: 0.3s;
    }
  </style>
</head>
<body>

  <!-- Hero Section -->
  <section class="hero-section d-flex align-items-center justify-content-center flex-column min-vh-100">
    <div class="container">
      <h1>Welcome to the Lost & Found Portal</h1>
      <p>Report lost or found items easily and help others reclaim their belongings.</p>
      <a href="login.jsp" class="btn btn-custom mt-4">Get Started</a>
    </div>
  </section>

  <!-- Footer -->
  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>

  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
