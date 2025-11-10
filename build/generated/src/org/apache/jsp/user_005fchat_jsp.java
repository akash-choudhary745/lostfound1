package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import dao.MessageDAO;
import model.Message;

public final class user_005fchat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    // ? Validate user session
    String userEmail = (String) session.getAttribute("email");
    String userName = (String) session.getAttribute("username");

    if (userEmail == null) {
        response.sendRedirect("login.jsp");
        return;
    }

    String itemId = request.getParameter("itemId");
    String itemTitle = request.getParameter("itemTitle");

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>User Chat - Lost & Found</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <meta http-equiv=\"refresh\" content=\"5\">\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("    body {font-family: 'Poppins', sans-serif; background: #f8f9fa;}\n");
      out.write("    .chat-box {\n");
      out.write("      height: 380px;\n");
      out.write("      overflow-y: auto;\n");
      out.write("      padding: 15px;\n");
      out.write("      background: #fff;\n");
      out.write("      border-radius: 12px;\n");
      out.write("      border: 1px solid #e9ecef;\n");
      out.write("    }\n");
      out.write("    .bubble {\n");
      out.write("      padding: 10px 14px;\n");
      out.write("      border-radius: 16px;\n");
      out.write("      display: inline-block;\n");
      out.write("      max-width: 75%;\n");
      out.write("      word-wrap: break-word;\n");
      out.write("    }\n");
      out.write("    .bubble-user { background: #0d6efd; color: #fff; }\n");
      out.write("    .bubble-dept { background: #e9ecef; color: #000; }\n");
      out.write("    .meta { font-size: 11px; color: #6c757d; margin-top: 6px; }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container mt-4\">\n");
      out.write("  <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("    <h4>User Chat</h4>\n");
      out.write("    <a href=\"home.jsp\" class=\"btn btn-outline-secondary btn-sm\">? Back to Home</a>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  ");
 if (itemTitle != null) { 
      out.write("\n");
      out.write("    <p class=\"text-muted\">Chat regarding item: <strong>");
      out.print( itemTitle );
      out.write("</strong></p>\n");
      out.write("  ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("  <!-- Chat Display -->\n");
      out.write("  <div class=\"chat-box mb-3\">\n");
      out.write("    ");

        MessageDAO mdao = new MessageDAO();
        List<Message> msgs = mdao.getAllMessages();

        if (msgs != null && !msgs.isEmpty()) {
            for (Message m : msgs) {
                boolean fromUser = userEmail.equalsIgnoreCase(m.getSender());
                String bubbleClass = fromUser ? "bubble-user" : "bubble-dept";
                String align = fromUser ? "text-end" : "text-start";
    
      out.write("\n");
      out.write("                <div class=\"");
      out.print( align );
      out.write(" mb-3\">\n");
      out.write("                  <div class=\"bubble ");
      out.print( bubbleClass );
      out.write("\">\n");
      out.write("                    <strong>");
      out.print( m.getSender() );
      out.write("</strong><br/>\n");
      out.write("                    ");
      out.print( m.getMessage() );
      out.write("\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"meta\">");
      out.print( m.getTimestamp() );
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("    ");

            }
        } else {
    
      out.write("\n");
      out.write("        <p class=\"text-muted text-center\">No messages yet.</p>\n");
      out.write("    ");

        }
    
      out.write("\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <!-- Message Sending Form -->\n");
      out.write("  <form action=\"MessageServlet\" method=\"post\" class=\"mt-3\">\n");
      out.write("    <input type=\"hidden\" name=\"sender\" value=\"");
      out.print( userEmail );
      out.write("\" />\n");
      out.write("    <input type=\"hidden\" name=\"receiver\" value=\"Department\" />\n");
      out.write("    ");
 if (itemId != null) { 
      out.write("\n");
      out.write("      <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print( itemId );
      out.write("\" />\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"input-group\">\n");
      out.write("      <input name=\"message\" class=\"form-control\" placeholder=\"Type your message...\" required>\n");
      out.write("      <button class=\"btn btn-primary\" type=\"submit\">Send</button>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
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
