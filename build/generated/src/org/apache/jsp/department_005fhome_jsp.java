package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpSession;

public final class department_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">Lost & Found</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNav\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Department_Home</a></li>\n");
      out.write("               <li class=\"nav-item\"><a class=\"nav-link active\" href=\"department_panel.jsp\">Active_Items</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link \" href=\"chat.jsp\">Chat</a></li>\n");
      out.write("                <li class=\"nav-item\"><a class=\"nav-link \" href=\"#\">Note</a></li>\n");
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

    // ? Check session for department login
    HttpSession sessionDept = request.getSession(false);
    if (sessionDept == null || sessionDept.getAttribute("departmentId") == null) {
        response.sendRedirect("department_login.jsp");
        return;
    }

    String deptName = (String) sessionDept.getAttribute("departmentName");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Department Home - Lost & Found</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap + Common CSS -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <style>\n");
      out.write("        body { \n");
      out.write("            background: #f8f9fa; \n");
      out.write("            font-family: 'Poppins', sans-serif;\n");
      out.write("        }\n");
      out.write("        .hero {\n");
      out.write("            background: linear-gradient(135deg, #0d6efd, #6610f2);\n");
      out.write("            color: white;\n");
      out.write("            padding: 60px 0;\n");
      out.write("            text-align: center;\n");
      out.write("            border-radius: 12px;\n");
      out.write("        }\n");
      out.write("        .hero h1 {\n");
      out.write("            font-weight: 600;\n");
      out.write("        }\n");
      out.write("        .hero p {\n");
      out.write("            font-size: 18px;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .features {\n");
      out.write("            margin-top: 50px;\n");
      out.write("        }\n");
      out.write("        .card {\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 12px;\n");
      out.write("            box-shadow: 0 2px 6px rgba(0,0,0,0.1);\n");
      out.write("            transition: transform 0.3s;\n");
      out.write("        }\n");
      out.write("        .card:hover {\n");
      out.write("            transform: translateY(-5px);\n");
      out.write("        }\n");
      out.write("        .btn-main {\n");
      out.write("            background: #0d6efd;\n");
      out.write("            color: white;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container mt-4\">\n");
      out.write("    <div class=\"hero mb-5\">\n");
      out.write("        <h1>Welcome, ");
      out.print( deptName );
      out.write(" Department!</h1>\n");
      out.write("        <p>Manage lost and found items, communicate with users, and keep the campus organized.</p>\n");
      out.write("        <div class=\"mt-3\">\n");
      out.write("            <a href=\"DepartmentPanelServlet\" class=\"btn btn-light btn-lg me-2\">Go to Panel</a>\n");
      out.write("            <a href=\"chat.jsp\" class=\"btn btn-outline-light btn-lg me-2\">Open Chat</a>\n");
      out.write("            <a href=\"LogoutServlet\" class=\"btn btn-danger btn-lg\">Logout</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"features row text-center\">\n");
      out.write("        <div class=\"col-md-4 mb-4\">\n");
      out.write("            <div class=\"card p-4\">\n");
      out.write("                <h4 class=\"mb-2 text-primary\">? Manage Lost Items</h4>\n");
      out.write("                <p>View and update the list of all lost items submitted by users. Mark them as claimed when resolved.</p>\n");
      out.write("                <a href=\"DepartmentPanelServlet\" class=\"btn btn-main btn-sm\">Open Panel</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-4 mb-4\">\n");
      out.write("            <div class=\"card p-4\">\n");
      out.write("                <h4 class=\"mb-2 text-success\">? Department Chat</h4>\n");
      out.write("                <p>Chat with users about their lost or found items to coordinate collection or verification.</p>\n");
      out.write("                <a href=\"chat.jsp\" class=\"btn btn-main btn-sm\">Open Chat</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-4 mb-4\">\n");
      out.write("            <div class=\"card p-4\">\n");
      out.write("                <h4 class=\"mb-2 text-warning\">? Department Info</h4>\n");
      out.write("                <p>Review and update department details or assigned contact information.</p>\n");
      out.write("                <a href=\"department_profile.jsp\" class=\"btn btn-main btn-sm\">View Profile</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
