package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Team_005fMember_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Project_Developer</title>\n");
      out.write("            <link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <style>\n");
      out.write("    .btn-custom {\n");
      out.write("      background-color: #ffc107;\n");
      out.write("      color: #000;\n");
      out.write("      border: none;\n");
      out.write("      font-weight: 600;\n");
      out.write("      padding: 10px 30px;\n");
      out.write("      border-radius: 50px;\n");
      out.write("      transition: 0.3s;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <section class=\"hero-section d-flex align-items-center justify-content-center flex-column min-vh-100\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("      <table align=\"center\" cellpadding=\"20\">\n");
      out.write("      <th colspan=\"2\" align=\"center\"><h1>Lost & Found Portal</h1></th>\n");
      out.write("      <tr><td><h4>Akash Choudhary</h4></td> <td><h5>Role:- Backend Developer(Java, servlet, jdbc)</h5></td></tr>\n");
      out.write("      <tr><td><h4>Akash Choudhary</h4></td> <td><h5>Role:- Backend Developer(Java, servlet, jdbc)</h5></td></tr>\n");
      out.write("      <tr><td><h4>Akash Choudhary</h4></td> <td><h5>Role:- Backend Developer(Java, servlet, jdbc)</h5></td></tr>\n");
      out.write("      <tr><td><h4>Akash Choudhary</h4></td> <td><h5>Role:- Backend Developer(Java, servlet, jdbc)</h5></td></tr>\n");
      out.write("\n");
      out.write("<tr><td colspan=\"2\">Report lost or found items easily and help others reclaim their belongings.</td></tr>\n");
      out.write("      </table>\n");
      out.write("      <a href=\"index.jsp\" class=\"btn btn-custom mt-4\">Back to home</a>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("    </body>\n");
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
