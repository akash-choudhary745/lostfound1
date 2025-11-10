package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import model.Item;

public final class department_005fpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Department Panel</title>\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <style>\n");
      out.write("    .card {\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 12px;\n");
      out.write("      box-shadow: 0 4px 10px rgba(0,0,0,0.1);\n");
      out.write("      transition: transform 0.2s ease-in-out;\n");
      out.write("    }\n");
      out.write("    .card:hover { transform: scale(1.03); }\n");
      out.write("    .card img {\n");
      out.write("      height: 200px;\n");
      out.write("      object-fit: cover;\n");
      out.write("      border-radius: 12px 12px 0 0;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("  <h3 class=\"text-center text-primary mb-4\">Department Panel ? Active Items</h3>\n");
      out.write("  <div class=\"row\">\n");
      out.write("    ");

      List<Item> items = (List<Item>) request.getAttribute("items");
      if (items != null && !items.isEmpty()) {
        for (Item it : items) {
    
      out.write("\n");
      out.write("      <div class=\"col-md-4 mb-4\">\n");
      out.write("        <div class=\"card h-100\">\n");
      out.write("          ");
 if (it.getImagePath() != null && !it.getImagePath().isEmpty()) { 
      out.write("\n");
      out.write("            <img src=\"");
      out.print(request.getContextPath());
      out.write('/');
      out.print(it.getImagePath());
      out.write("\" class=\"card-img-top\">\n");
      out.write("          ");
 } else { 
      out.write("\n");
      out.write("            <img src=\"images/no-image.jpg\" class=\"card-img-top\">\n");
      out.write("          ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h5 class=\"card-title\">");
      out.print( it.getTitle() );
      out.write("</h5>\n");
      out.write("            <p class=\"text-muted\"><strong>Location:</strong> ");
      out.print( it.getLocation() );
      out.write("</p>\n");
      out.write("            <p class=\"text-muted\"><strong>Category:</strong> ");
      out.print( it.getCategory() );
      out.write("</p>\n");
      out.write("            <p><strong>Contact:</strong> ");
      out.print( it.getContactInfo() );
      out.write("</p>\n");
      out.write("\n");
      out.write("            <form action=\"remove_item\" method=\"post\" onsubmit=\"return confirm('Mark this item as claimed?');\">\n");
      out.write("              <input type=\"hidden\" name=\"id\" value=\"");
      out.print( it.getId() );
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"name\" value=\"");
      out.print( it.getTitle() );
      out.write("\">\n");
      out.write("              <input type=\"hidden\" name=\"user\" value=\"");
      out.print( it.getContactInfo() );
      out.write("\">\n");
      out.write("              <button type=\"submit\" class=\"btn btn-danger btn-sm mt-2\">Mark as Claimed</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    ");

        }
      } else {
    
      out.write("\n");
      out.write("      <div class=\"col-12 text-center text-muted\">No active items found.</div>\n");
      out.write("    ");

      }
    
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <div class=\"text-center mt-4\">\n");
      out.write("    <a href=\"department_history.jsp\" class=\"btn btn-outline-primary\">View History</a>\n");
      out.write("  </div>\n");
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
