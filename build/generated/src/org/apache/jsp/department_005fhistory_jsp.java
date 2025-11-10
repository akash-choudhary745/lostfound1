package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import util.DBUtil;

public final class department_005fhistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar3.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Page</title>\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("                <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("                \n");
      out.write("                <style>\n");
      out.write("                     body {\n");
      out.write("      font-family: 'Poppins', sans-serif;\n");
      out.write("      background-color: #f8f9fa;\n");
      out.write("    }\n");
      out.write("    .navbar {\n");
      out.write("      background-color: #0d6efd;\n");
      out.write("    }\n");
      out.write("    .navbar-brand, .nav-link {\n");
      out.write("      color: #fff !important;\n");
      out.write("      font-weight: 500;\n");
      out.write("    }\n");
      out.write("    .nav-link:hover {\n");
      out.write("      color: #ffc107 !important;\n");
      out.write("    }\n");
      out.write("                    </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Lost & Found</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"department_home.jsp\">Department_Home</a></li>\n");
      out.write("               <li class=\"nav-item\"><a class=\"nav-link active\" href=\"department_panel.jsp\">Active_Items</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link \" href=\"chat.jsp\">Chat</a></li>\n");
      out.write("                <li class=\"nav-item\"><a href=\"department_history.jsp\" class=\"btn btn-outline-primary\">View History</a>\n");
      out.write("</li>\n");
      out.write("            </ul>\n");
      out.write("             <a href=\"LogoutServlet\" class=\"btn btn-outline-light ms-3 btn-sm\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <title>Removed Items History</title>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write("    body { background: #f9f9f9; }\n");
      out.write("    .table-container {\n");
      out.write("      margin: 40px auto;\n");
      out.write("      max-width: 900px;\n");
      out.write("      background: #fff;\n");
      out.write("      padding: 25px;\n");
      out.write("      border-radius: 10px;\n");
      out.write("      box-shadow: 0 3px 10px rgba(0,0,0,0.1);\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container table-container\">\n");
      out.write("  <h3 class=\"text-center text-primary mb-4\">Claimed / Removed Items History</h3>\n");
      out.write("\n");
      out.write("  <table class=\"table table-bordered table-striped\">\n");
      out.write("    <thead class=\"table-primary\">\n");
      out.write("      <tr>\n");
      out.write("        <th>ID</th>\n");
      out.write("        <th>Item Name</th>\n");
      out.write("        <th>Item User</th>\n");
      out.write("        <th>Status</th>\n");
      out.write("        <th>Removed Date</th>\n");
      out.write("      </tr>\n");
      out.write("    </thead>\n");
      out.write("    <tbody>\n");
      out.write("      ");

        try {
          Connection con = DBUtil.getConnection();
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery("SELECT * FROM history ORDER BY removed_date DESC");

          while (rs.next()) {
      
      out.write("\n");
      out.write("        <tr>\n");
      out.write("          <td>");
      out.print( rs.getInt("id") );
      out.write("</td>\n");
      out.write("          <td>");
      out.print( rs.getString("item_name") );
      out.write("</td>\n");
      out.write("          <td>");
      out.print( rs.getString("item_user") );
      out.write("</td>\n");
      out.write("          <td>");
      out.print( rs.getString("status") );
      out.write("</td>\n");
      out.write("          <td>");
      out.print( rs.getTimestamp("removed_date") );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("      ");

          }
          con.close();
        } catch (Exception e) {
          out.println("<tr><td colspan='5' class='text-center text-danger'>Error loading history</td></tr>");
        }
      
      out.write("\n");
      out.write("    </tbody>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
