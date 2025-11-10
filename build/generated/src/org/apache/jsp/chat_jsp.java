package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import dao.MessageDAO;
import model.Message;

public final class chat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");

    // ✅ Session validation for department
    String deptUser = (String) session.getAttribute("departmentUsername");
    String deptName = (String) session.getAttribute("departmentName");

    if (deptUser == null) {
        response.sendRedirect("department_login.jsp");
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
      out.write("  <title>Department Chat - Lost & Found</title>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <meta http-equiv=\"refresh\" content=\"5\">\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("    body {\n");
      out.write("      font-family: 'Poppins', sans-serif;\n");
      out.write("      background: #f8f9fa;\n");
      out.write("    }\n");
      out.write("    .chat-box {\n");
      out.write("      height: 400px;\n");
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
      out.write("    .bubble-dept { background: #0d6efd; color: #fff; }\n");
      out.write("    .bubble-user { background: #e9ecef; color: #000; }\n");
      out.write("    .meta { font-size: 11px; color: #6c757d; margin-top: 4px; }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div class=\"container mt-4\">\n");
      out.write("  <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("    <h4>Department Chat</h4>\n");
      out.write("    <div>\n");
      out.write("      <span class=\"me-3 text-muted\">Logged in as: <strong>");
      out.print( deptName );
      out.write("</strong></span>\n");
      out.write("      <a href=\"DepartmentLogoutServlet\" class=\"btn btn-outline-danger btn-sm\">Logout</a>\n");
      out.write("      <a href=\"department_panel.jsp\" class=\"btn btn-outline-secondary btn-sm\">← Back</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  ");
 if (itemTitle != null) { 
      out.write("\n");
      out.write("    <p class=\"text-muted\">Chat about item: <strong>");
      out.print( itemTitle );
      out.write("</strong></p>\n");
      out.write("  ");
 } 
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"chat-box mb-3\">\n");
      out.write("    ");

        MessageDAO mdao = new MessageDAO();
        List<Message> msgs = mdao.getAllMessages();

        if (msgs != null && !msgs.isEmpty()) {
            for (Message m : msgs) {
                boolean fromDept = deptUser.equalsIgnoreCase(m.getSender());
                String bubbleClass = fromDept ? "bubble-dept" : "bubble-user";
                String align = fromDept ? "text-end" : "text-start";
    
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
      out.write("  <!-- Send Message -->\n");
      out.write("  <form action=\"MessageServlet\" method=\"post\" class=\"mt-3\">\n");
      out.write("    <input type=\"hidden\" name=\"sender\" value=\"");
      out.print( deptUser );
      out.write("\">\n");
      out.write("    <input type=\"hidden\" name=\"receiver\" value=\"User\">\n");
      out.write("    ");
 if (itemId != null) { 
      out.write("\n");
      out.write("      <input type=\"hidden\" name=\"itemId\" value=\"");
      out.print( itemId );
      out.write("\">\n");
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
