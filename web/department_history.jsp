<%@ page import="java.sql.*, util.DBUtil" %>
<%@ include file="navbar3.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <title>Claimed Items History</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body { background: #f4f7fb; }
        .box {
            max-width: 1100px;
            margin: 40px auto;
            background: #fff;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
        }
        img {
            height: 80px;
            width: 80px;
            object-fit: cover;
            border-radius: 10px;
        }
    </style>
</head>
<body>

<div class="box">
    <h3 class="text-center text-primary mb-4">Claimed / Removed Items History</h3>

    <table class="table table-bordered table-striped">
        <thead class="table-dark">
            <tr>
                <th>Item</th>
                <th>Category</th>
                <th>Location</th>
                <th>Posted By</th>
                <th>Provide By</th>
                <th>Removed Date</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
        <%
            try {
                Connection con = DBUtil.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(
                    "SELECT * FROM history ORDER BY removed_date DESC"
                );

                while (rs.next()) {
        %>
            <tr>
                <td><%= rs.getString("item_name") %></td>
                <td><%= rs.getString("category") %></td>
                <td><%= rs.getString("location") %></td>
                <td><%= rs.getString("posted_by_name") %></td>
                <td class="text-success"><b><%= rs.getString("claimed_by") %></b></td>
                <td><%= rs.getTimestamp("removed_date") %></td>
                <td>
                    <% if (rs.getString("image_path") != null) { %>
                        <img src="<%= request.getContextPath() %>/<%= rs.getString("image_path") %>">
                    <% } else { %>
                        <img src="images/no-image.jpg">
                    <% } %>
                </td>
            </tr>
        <%
                }
                con.close();
            } catch (Exception e) {
                out.println("<tr><td colspan='7' class='text-center text-danger'>Error loading history</td></tr>");
            }
        %>
        </tbody>
    </table>
</div>

</body>
</html>
