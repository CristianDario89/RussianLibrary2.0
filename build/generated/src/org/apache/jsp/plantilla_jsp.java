package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class plantilla_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"logotipo\">\n");
      out.write("                <img src=\"imagenes/bart.png\" width=\"100\" alt=\"\">\n");
      out.write("            </div>\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Inicio</a></li>\n");
      out.write("                     <li><a href=\"#\">Acerca de</a></li>\n");
      out.write("                      <li><a href=\"#\">servicios</a></li>\n");
      out.write("                       <li><a href=\"#\">Contacto/a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <section class=\"main\">\n");
      out.write("            <section class=\"articles\">\n");
      out.write("                <article>\n");
      out.write("                    <h2>ESte es Titulo de mo web</h2>\n");
      out.write("                    <p>It is a long established fact that a reader will be distracted\n");
      out.write("                        by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it </p>\n");
      out.write("                </article>\n");
      out.write("                <article>\n");
      out.write("                    <h2>ESte es Titulo de mo web</h2>\n");
      out.write("                    <p>It is a long established fact that a reader will be distracted\n");
      out.write("                        by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it </p>\n");
      out.write("                </article>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("            <aside>\n");
      out.write("                <h3>ESte es Titulo de mo web</h3>\n");
      out.write("                    <p>It is a long established fact that a reader will be distracted\n");
      out.write("                        by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it </p>\n");
      out.write("            </aside>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <footer>\n");
      out.write("            <p>Malvinas - Luisano is back</p>\n");
      out.write("        </footer>\n");
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
