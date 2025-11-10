package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import model.Department;
import servlet.DepartmentRegisterServlet;

public final class department_005fregister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"department_register.jsp\">department_staf</a></li>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("            </ul>\n");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Department Registration - Lost & Found</title>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("       .btn-custom {\n");
      out.write("      background-color: #ffc107;\n");
      out.write("      color: black;\n");
      out.write("      font-weight: 600;\n");
      out.write("      border: none;\n");
      out.write("      width: 100%;\n");
      out.write("      transition: 0.3s;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"register-container\">\n");
      out.write("  <div class=\"row justif\n");
      out.write("y-content-center\">\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("      <div class=\"card shadow-lg border-0 rounded-4\">\n");
      out.write("        <div class=\"card-header text-center bg-primary text-white py-3\">\n");
      out.write("          <h4 class=\"mb-0\">Department Registration</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body p-4\">\n");
      out.write("          <form action=\"department_register\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label class=\"form-label\">Full Name</label>\n");
      out.write("              <input type=\"text\" name=\"fullname\" class=\"form-control\" placeholder=\"Enter full name\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label class=\"form-label\">Username</label>\n");
      out.write("              <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Choose a username\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("              <label class=\"form-label\">Password</label>\n");
      out.write("              <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Enter password\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"d-grid mt-4\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-custom\">Register</button>\n");
      out.write("            </div>\n");
      out.write("              <p class=\"text-center mt-3\">Already have an account? <a href=\"department_login.jsp\">Login here</a></p>\n");
      out.write("              \n");
      out.write("          </form>\n");
      out.write("             ");
 String message = (String) request.getAttribute("message");
       if (message != null) { 
      out.write("\n");
      out.write("       <div class=\"alert alert-success mt-3 text-center\">");
      out.print( message );
      out.write("</div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("  <footer>\n");
      out.write("    <p>&copy; 2025 Lost & Found System | <a href=\"Team_Member.jsp\" style=\"color: #ffc107\">Developed by Team</a></p>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("\n");
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
