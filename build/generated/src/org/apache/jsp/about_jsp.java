package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar2.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("                <link href=\"styles.css\" rel=\"stylesheet\">\n");
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
      out.write("      <!-- Navbar -->\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">Lost & Found</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"about.jsp\">About</a></li>\n");
      out.write("               <li class=\"nav-item\"><a class=\"nav-link active\" href=\"search.jsp\">Search_Items</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link \" href=\"post_item.jsp\">Report_Item</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link \" href=\"list_items.jsp\">List_Items</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"user_chat.jsp\">User_chat</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("             <a href=\"LogoutServlet\" class=\"btn btn-outline-light ms-3 btn-sm\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <title>About - Lost & Found</title>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("      <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("      \n");
      out.write("      <style>\n");
      out.write("           .section-title {\n");
      out.write("      font-size: 2rem;\n");
      out.write("      font-weight: 700;\n");
      out.write("      color: #0d6efd;\n");
      out.write("      margin-bottom: 20px;\n");
      out.write("    }\n");
      out.write("    .info-section {\n");
      out.write("      padding: 60px 0;\n");
      out.write("    }\n");
      out.write("    .icon-circle {\n");
      out.write("      width: 70px;\n");
      out.write("      height: 70px;\n");
      out.write("      background-color: #0d6efd;\n");
      out.write("      color: #fff;\n");
      out.write("      display: flex;\n");
      out.write("      align-items: center;\n");
      out.write("      justify-content: center;\n");
      out.write("      border-radius: 50%;\n");
      out.write("      font-size: 30px;\n");
      out.write("      margin: 0 auto 15px auto;\n");
      out.write("    }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- About Section -->\n");
      out.write("<section class=\"info-section text-center\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h2 class=\"section-title\">How the Lost & Found System Works</h2>\n");
      out.write("    <p class=\"text-muted mb-5\">\n");
      out.write("      The Lost & Found web application is designed to help students and staff easily report, find, and return lost belongings within the campus.\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <div class=\"row g-4\">\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"icon-circle\"><i class=\"bi bi-search\"></i></div>\n");
      out.write("        <h5>1. Report Lost or Found Items</h5>\n");
      out.write("        <p>Users can report an item they?ve lost or found by submitting details like title, description, date, and location.</p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"icon-circle\"><i class=\"bi bi-card-list\"></i></div>\n");
      out.write("        <h5>2. Department Verification</h5>\n");
      out.write("        <p>The Lost & Found department verifies each report to ensure authenticity and helps match owners with their belongings.</p>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"col-md-4\">\n");
      out.write("        <div class=\"icon-circle\"><i class=\"bi bi-chat-dots\"></i></div>\n");
      out.write("        <h5>3. Reclaim and Communicate</h5>\n");
      out.write("        <p>Users can chat with the department team to claim items, and once confirmed, the item is removed from the system.</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer>\n");
      out.write("  <p>&copy; 2025 Lost & Found System | <a href=\"Team_Member.jsp\" style=\"color: #ffc107\">Developed by Team</a></p>\n");
      out.write("  <a href=\"department_login.jsp\" class=\"btn btn-outline-primary btn-sm\" style=\"color: #ffc107\">Chat with Department</a>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<!-- Bootstrap icons -->\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
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
