package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class post_005fitem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            </ul>\n");
      out.write("             <a href=\"logout\" class=\"btn btn-outline-light ms-3 btn-sm\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("      \n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Post Item - Lost & Found</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("        \r\n");
      out.write("<style>\r\n");
      out.write("    .post-section {\r\n");
      out.write("      background-color: #fff;\r\n");
      out.write("      padding: 40px;\r\n");
      out.write("      border-radius: 10px;\r\n");
      out.write("      box-shadow: 0 0 10px rgba(0,0,0,0.1);\r\n");
      out.write("      margin-top: 40px;\r\n");
      out.write("      margin-bottom: 60px;\r\n");
      out.write("    }\r\n");
      out.write("    footer {\r\n");
      out.write("      background-color: #0d6efd;\r\n");
      out.write("      color: white;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      padding: 15px 0;\r\n");
      out.write("      position: relative;\r\n");
      out.write("      bottom: 0;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!-- Post Item Form -->\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <div class=\"post-section\">\r\n");
      out.write("    <h2 class=\"text-center text-primary mb-4\">Post Lost / Found Item</h2>\r\n");
      out.write("\r\n");
      out.write("    <form method=\"post\" action=\"post_item\" enctype=\"multipart/form-data\">\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Title</label>\r\n");
      out.write("        <input name=\"title\" class=\"form-control\" placeholder=\"Enter item title\" required />\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Description</label>\r\n");
      out.write("        <textarea name=\"description\" class=\"form-control\" rows=\"3\" placeholder=\"Describe the item\"></textarea>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Category</label>\r\n");
      out.write("        <select name=\"category\" class=\"form-select\" required>\r\n");
      out.write("          <option value=\"lost\">Lost</option>\r\n");
      out.write("          <option value=\"found\">Found</option>\r\n");
      out.write("        </select>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"mb-3 row\">\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("          <label class=\"form-label\">Location</label>\r\n");
      out.write("          <input name=\"location\" class=\"form-control\" placeholder=\"Where it was lost or found\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("          <label class=\"form-label\">Date</label>\r\n");
      out.write("          <input type=\"date\" name=\"date_found_lost\" class=\"form-control\" required />\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Contact Info</label>\r\n");
      out.write("        <input name=\"contact_info\" class=\"form-control\" placeholder=\"Enter your phone or email\" required />\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Upload Image</label>\r\n");
      out.write("        <input type=\"file\" name=\"image\" class=\"form-control\" accept=\"image/*\" />\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"text-center\">\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-custom px-4 py-2\">Post Item</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer>\r\n");
      out.write("  <p>&copy; 2025 Lost & Found System | Developed by Team</p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
