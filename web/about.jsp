<%@ include file="navbar2.jsp" %>

<%--<%@ page contentType="text/html;charset=UTF-8" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>About - Lost & Found</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
      <link href="css/styles.css" rel="stylesheet">
      
      <style>
           .section-title {
      font-size: 2rem;
      font-weight: 700;
      color: #0d6efd;
      margin-bottom: 20px;
    }
    .info-section {
      padding: 60px 0;
    }
    .icon-circle {
      width: 70px;
      height: 70px;
      background-color: #0d6efd;
      color: #fff;
      display: flex;
      align-items: center;
      justify-content: center;
      border-radius: 50%;
      font-size: 30px;
      margin: 0 auto 15px auto;
    }
    </style>
</head>
<body>
<!-- About Section -->
<section class="info-section text-center">
  <div class="container">
    <h2 class="section-title">How the Lost & Found System Works</h2>
    <p class="text-muted mb-5">
      The Lost & Found web application is designed to help students and staff easily report, find, and return lost belongings within the campus.
    </p>

    <div class="row g-4">
      <div class="col-md-4">
        <div class="icon-circle"><i class="bi bi-search"></i></div>
        <h5>1. Report Lost or Found Items</h5>
        <p>Users can report an item they?ve lost or found by submitting details like title, description, date, and location.</p>
      </div>

      <div class="col-md-4">
        <div class="icon-circle"><i class="bi bi-card-list"></i></div>
        <h5>2. Department Verification</h5>
        <p>The Lost & Found department verifies each report to ensure authenticity and helps match owners with their belongings.</p>
      </div>

      <div class="col-md-4">
        <div class="icon-circle"><i class="bi bi-chat-dots"></i></div>
        <h5>3. Reclaim and Communicate</h5>
        <p>Users can chat with the department team to claim items, and once confirmed, the item is removed from the system.</p>
      </div>
    </div>
  </div>
</section>


<!-- Footer -->
<footer>
  <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  <a href="user_chat.jsp" class="btn btn-outline-primary btn-sm" style="color: #ffc107">Chat with Department</a>
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<!-- Bootstrap icons -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
</body>
</html>
