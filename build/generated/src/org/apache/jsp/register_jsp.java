package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import model.Item;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"index.jsp\">Lost & Found</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link active\" href=\"index.jsp\">Home</a></li>\n");
      out.write("          <li class=\"nav-item\"><a class=\"nav-link\" href=\"register.jsp\">Register</a></li>\n");
      out.write("          <li class=\"nav-item\"><a class=\"nav-link\" href=\"login.jsp\">Login</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"department_panel.jsp\">department_staf</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
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
      out.write("  <title>Register - Lost & Found</title>\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("      <link href=\"css/styles.css\" rel=\"stylesheet\">\r\n");
      out.write("      <style>\r\n");
      out.write("          .register-container {\r\n");
      out.write("      min-height: vh;\r\n");
      out.write("      display: flex;\r\n");
      out.write("      align-items: center;\r\n");
      out.write("      justify-content: center;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("       .btn-custom {\r\n");
      out.write("      background-color: #ffc107;\r\n");
      out.write("      color: black;\r\n");
      out.write("      font-weight: 600;\r\n");
      out.write("      border: none;\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      transition: 0.3s;\r\n");
      out.write("    }\r\n");
      out.write("      </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"register-container\">\r\n");
      out.write("  <div class=\"card p-4 col-12 col-md-6 col-lg-4\">\r\n");
      out.write("    <h3 class=\"text-center mb-4\">Create Account</h3>\r\n");
      out.write("    <form action=\"register\" method=\"post\">\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Full Name</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"name\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Email</label>\r\n");
      out.write("        <input type=\"email\" class=\"form-control\" name=\"email\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">Password</label>\r\n");
      out.write("        <input type=\"password\" class=\"form-control\" name=\"password\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"mb-3\">\r\n");
      out.write("        <label class=\"form-label\">role</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"role\" required>\r\n");
      out.write("      </div>\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-custom\">Register</button>\r\n");
      out.write("      <p class=\"text-center mt-3\">Already have an account? <a href=\"login.jsp\">Login here</a></p>\r\n");
      out.write("    </form>\r\n");
      out.write("    ");
 String message = (String) request.getAttribute("message");
       if (message != null) { 
      out.write("\r\n");
      out.write("       <div class=\"alert alert-success mt-3 text-center\">");
      out.print( message );
      out.write("</div>\r\n");
      out.write("    ");
 } 
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<footer class=\"text-center text-white mt-5 py-3\" style=\"background-color:#0d6efd;\">\r\n");
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
