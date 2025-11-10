<%--<%@ page contentType="text/html;charset=UTF-8" %>--%>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ include file="navbar3.jsp" %>

<%
    // ? Check session for department login
    HttpSession sessionDept = request.getSession(false);
    if (sessionDept == null || sessionDept.getAttribute("departmentId") == null) {
        response.sendRedirect("department_login.jsp");
        return;
    }

    String deptName = (String) sessionDept.getAttribute("departmentName");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Department Home - Lost & Found</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <!-- Bootstrap + Common CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet">

    <style>
        body { 
            background: #f8f9fa; 
            font-family: 'Poppins', sans-serif;
        }
        .hero {
            background: linear-gradient(135deg, #0d6efd, #6610f2);
            color: white;
            padding: 60px 0;
            text-align: center;
            border-radius: 12px;
        }
        .hero h1 {
            font-weight: 600;
        }
        .hero p {
            font-size: 18px;
            margin-top: 10px;
        }
        .features {
            margin-top: 50px;
        }
        .card {
            border: none;
            border-radius: 12px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
            transition: transform 0.3s;
        }
        .card:hover {
            transform: translateY(-5px);
        }
        .btn-main {
            background: #0d6efd;
            color: white;
            border-radius: 8px;
            padding: 10px 20px;
        }
    </style>
</head>

<body>

<div class="container mt-4">
    <div class="hero mb-5">
        <h1>Welcome, <%= deptName %> Department!</h1>
        <p>Manage lost and found items, communicate with users, and keep the campus organized.</p>
        <div class="mt-3">
            <a href="DepartmentPanelServlet" class="btn btn-light btn-lg me-2">Go to Panel</a>
            <a href="chat.jsp" class="btn btn-outline-light btn-lg me-2">Open Chat</a>
            <a href="LogoutServlet" class="btn btn-danger btn-lg">Logout</a>
        </div>
    </div>

    <div class="features row text-center">
        <div class="col-md-4 mb-4">
            <div class="card p-4">
                <h4 class="mb-2 text-primary">? Manage Lost Items</h4>
                <p>View and update the list of all lost items submitted by users. Mark them as claimed when resolved.</p>
                <a href="DepartmentPanelServlet" class="btn btn-main btn-sm">Open Panel</a>
            </div>
        </div>

        <div class="col-md-4 mb-4">
            <div class="card p-4">
                <h4 class="mb-2 text-success">? Department Chat</h4>
                <p>Chat with users about their lost or found items to coordinate collection or verification.</p>
                <a href="chat.jsp" class="btn btn-main btn-sm">Open Chat</a>
            </div>
        </div>

        <div class="col-md-4 mb-4">
            <div class="card p-4">
                <h4 class="mb-2 text-warning">? Department Info</h4>
                <p>Review and update department details or assigned contact information.</p>
                <a href="department_profile.jsp" class="btn btn-main btn-sm">View Profile</a>
            </div>
        </div>
    </div>
</div>
  <footer>
    <p>&copy; 2025 Lost & Found System | <a href="Team_Member.jsp" style="color: #ffc107">Developed by Team</a></p>
  </footer>

</body>
</html>
