<%@ include file="navbar2.jsp" %>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Post Item - Lost & Found</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet">
        
<style>
    .post-section {
      background-color: #fff;
      padding: 40px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
      margin-top: 40px;
      margin-bottom: 60px;
    }
    footer {
      background-color: #0d6efd;
      color: white;
      text-align: center;
      padding: 15px 0;
      position: relative;
      bottom: 0;
      width: 100%;
    }
  </style>
</head>

<body>

<!-- Post Item Form -->
<div class="container">
  <div class="post-section">
    <h2 class="text-center text-primary mb-4">Post Lost / Found Item</h2>

    <form method="post" action="post_item" enctype="multipart/form-data">
      <div class="mb-3">
        <label class="form-label">Title</label>
        <input name="title" class="form-control" placeholder="Enter item title" required />
      </div>

      <div class="mb-3">
        <label class="form-label">Description</label>
        <textarea name="description" class="form-control" rows="3" placeholder="Describe the item"></textarea>
      </div>

      <div class="mb-3">
        <label class="form-label">Category</label>
        <select name="category" class="form-select" required>
          <option value="lost">Lost</option>
          <option value="found">Found</option>
        </select>
      </div>

      <div class="mb-3 row">
        <div class="col-md-6">
          <label class="form-label">Location</label>
          <input name="location" class="form-control" placeholder="Where it was lost or found" required />
        </div>
        <div class="col-md-6">
          <label class="form-label">Date</label>
          <input type="date" name="date_found_lost" class="form-control" required />
        </div>
      </div>

      <div class="mb-3">
        <label class="form-label">Contact Info</label>
        <input name="contact_info" class="form-control" placeholder="Enter your phone or email" required />
      </div>

      <div class="mb-3">
        <label class="form-label">Upload Image</label>
        <input type="file" name="image" class="form-control" accept="image/*" />
      </div>

      <div class="text-center">
        <button type="submit" class="btn btn-custom px-4 py-2">Post Item</button>
      </div>
    </form>
  </div>
</div>

<!-- Footer -->
  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
