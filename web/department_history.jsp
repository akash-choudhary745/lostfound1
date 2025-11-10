<%@ page import="java.sql.*,java.util.*,util.DBUtil" %>
<%@ include file="navbar3.jsp" %>
<!DOCTYPE html>
<html>
<head>
  <title>Removed Items History</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <style>
    body { background: #f9f9f9; }
    .table-container {
      margin: 40px auto;
      max-width: 900px;
      background: #fff;
      padding: 25px;
      border-radius: 10px;
      box-shadow: 0 3px 10px rgba(0,0,0,0.1);
    }
  </style>
</head>
<body>

<div class="container table-container">
  <h3 class="text-center text-primary mb-4">Claimed / Removed Items History</h3>

  <table class="table table-bordered table-striped">
    <thead class="table-primary">
      <tr>
        <th>ID</th>
        <th>Item Name</th>
        <th>Item User</th>
        <th>Status</th>
        <th>Removed Date</th>
      </tr>
    </thead>
    <tbody>
      <%
        try {
          Connection con = DBUtil.getConnection();
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery("SELECT * FROM history ORDER BY removed_date DESC");

          while (rs.next()) {
      %>
        <tr>
          <td><%= rs.getInt("id") %></td>
          <td><%= rs.getString("item_name") %></td>
          <td><%= rs.getString("item_user") %></td>
          <td><%= rs.getString("status") %></td>
          <td><%= rs.getTimestamp("removed_date") %></td>
        </tr>
      <%
          }
          con.close();
        } catch (Exception e) {
          out.println("<tr><td colspan='5' class='text-center text-danger'>Error loading history</td></tr>");
        }
      %>
    </tbody>
  </table>
</div>

</body>
</html>
