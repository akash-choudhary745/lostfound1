package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar1.jsp");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("            <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("                <link href=\"styles.css\" rel=\"stylesheet\">\r\n");
      out.write("                \r\n");
      out.write("                <style>\r\n");
      out.write("                     body {\r\n");
      out.write("      font-family: 'Poppins', sans-serif;\r\n");
      out.write("      background-color: #f8f9fa;\r\n");
      out.write("    }\r\n");
      out.write("    .navbar {\r\n");
      out.write("      background-color: #0d6efd;\r\n");
      out.write("    }\r\n");
      out.write("    .navbar-brand, .nav-link {\r\n");
      out.write("      color: #fff !important;\r\n");
      out.write("      font-weight: 500;\r\n");
      out.write("    }\r\n");
      out.write("    .nav-link:hover {\r\n");
      out.write("      color: #ffc107 !important;\r\n");
      out.write("    }\r\n");
      out.write("                    </style>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">Lost & Found</a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link active\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("          <li class=\"nav-item\"><a class=\"nav-link\" href=\"register.jsp\">Register</a></li>\r\n");
      out.write("          <li class=\"nav-item\"><a class=\"nav-link\" href=\"login.jsp\">Login</a></li>\r\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"department_register.jsp\">department_staf</a></li>\r\n");
      out.write("                    \r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("      \r\n");
      out.write("      <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Lost and Found - Home</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("      <link href=\"css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <style>\r\n");
      out.write("    .btn-custom {\r\n");
      out.write("      background-color: #ffc107;\r\n");
      out.write("      color: #000;\r\n");
      out.write("      border: none;\r\n");
      out.write("      font-weight: 600;\r\n");
      out.write("      padding: 10px 30px;\r\n");
      out.write("      border-radius: 50px;\r\n");
      out.write("      transition: 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <!-- Hero Section -->\r\n");
      out.write("  <section class=\"hero-section d-flex align-items-center justify-content-center flex-column min-vh-100\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <h1>Welcome to the Lost & Found Portal</h1>\r\n");
      out.write("      <p>Report lost or found items easily and help others reclaim their belongings.</p>\r\n");
      out.write("      <a href=\"login.jsp\" class=\"btn btn-custom mt-4\">Get Started</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </section>\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer -->\r\n");
      out.write("  <footer>\r\n");
      out.write("    <p>&copy; 2025 Lost & Found System | <a href=\"Team_Member.jsp\" style=\"color: #ffc107\">Developed by Team</a></p>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
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
