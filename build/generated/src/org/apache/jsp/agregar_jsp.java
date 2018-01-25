package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
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

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=UTF-8\" />\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" type=\"text/css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\" />\n");
      out.write("<script  type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/funciones.js\"></script>");
      out.write("\n");
      out.write("        <title>Add</title>\n");
      out.write("        \n");
      out.write("          <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/estilos2.css\">\n");
      out.write("          \n");
      out.write("            \n");
      out.write("               <link href=\"https://fonts.googleapis.com/css?family=Raleway:200,400\" rel=\"stylesheet\">\n");
      out.write("            <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script> \n");
      out.write("            \n");
      out.write("      <style>\n");
      out.write("                     \n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Malvinas2';\n");
      out.write("  src:  url('icons/Malvinas.eot?7sljcu');\n");
      out.write("  src:  url('icons/Malvinas.eot?7sljcu#iefix') format('embedded-opentype'),\n");
      out.write("    url('icons/Malvinas.ttf?7sljcu') format('truetype'),\n");
      out.write("    url('icons/Malvinas.woff?7sljcu') format('woff'),\n");
      out.write("    url('icons/Malvinas.svg?7sljcu#Malvinas') format('svg');\n");
      out.write("  font-weight: normal;\n");
      out.write("  font-style: normal;\n");
      out.write("}\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Malvinas';\n");
      out.write("  src:  url('icons/2/Malvinas.eot?e6wxb0');\n");
      out.write("  src:  url('icons/2/Malvinas.eot?e6wxb0#iefix') format('embedded-opentype'),\n");
      out.write("    url('icons/2/Malvinas.ttf?e6wxb0') format('truetype'),\n");
      out.write("    url('icons/2/Malvinas.woff?e6wxb0') format('woff'),\n");
      out.write("    url('icons/2/Malvinas.svg?e6wxb0#Malvinas') format('svg');\n");
      out.write("  font-weight: normal;\n");
      out.write("  font-style: normal;\n");
      out.write("}\n");
      out.write("@font-face {\n");
      out.write("  font-family: 'Malvinas';\n");
      out.write("  src:  url('icons/3/Malvinas.eot?ezmj9n');\n");
      out.write("  src:  url('icons/3/Malvinas.eot?ezmj9n#iefix') format('embedded-opentype'),\n");
      out.write("    url('icons/3/Malvinas.ttf?ezmj9n') format('truetype'),\n");
      out.write("    url('icons/3/Malvinas.woff?ezmj9n') format('woff'),\n");
      out.write("    url('icons/3/Malvinas.svg?ezmj9n#Malvinas') format('svg');\n");
      out.write("  font-weight: normal;\n");
      out.write("  font-style: normal;\n");
      out.write("}\n");
      out.write("     \n");
      out.write("                 body{\n");
      out.write("                     background: #bcdff1;\n");
      out.write("                 }\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write(".icon-add:before {\n");
      out.write("  content: \"\\e900\";\n");
      out.write("    font-family: 'Malvinas2';\n");
      out.write("   padding-right: 1em;\n");
      out.write("} \n");
      out.write(".update:before {\n");
      out.write("  content: \"\\ea2e\";\n");
      out.write("    font-family: 'Malvinas2';\n");
      out.write("    padding-right: 1em;\n");
      out.write("}\n");
      out.write(" \n");
      out.write(".books:before {\n");
      out.write("  content: \"\\e920\";\n");
      out.write("    font-family: 'Malvinas';\n");
      out.write("    padding-right: 1em;\n");
      out.write("}\n");
      out.write(".add-user:before {\n");
      out.write("  content: \"\\e957\";\n");
      out.write("  font-family: 'Malvinas';\n");
      out.write("    padding-right: 1em;\n");
      out.write("}\n");
      out.write(".listuser:before {\n");
      out.write("  content: \"\\e9bb\";\n");
      out.write("   font-family: 'Malvinas';\n");
      out.write("    padding-right: 1em;\n");
      out.write("}\n");
      out.write("             </style>\n");
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("          <!--Menu-->\n");
      out.write("          <div id=\"mostrar-nav\"></div> <!--va afuera del nav xqsi el nav va a estar ocultar, se ocultaria este tmbn, get it?-->\n");
      out.write(" \n");
      out.write("          <nav class=\"menu-nav\">\n");
      out.write("    <ul class=\"menu\">\n");
      out.write("      <li><a href=\"bookSections/addbook.jsp\" class=\"icon-add\"> Add Book</a></li>\n");
      out.write("        <li><a href=\"bookSections/updatebook.jsp\" class=\"update\">   Edit book</a></li>\n");
      out.write("        <li><a href=\"MOSTRAR.jsp\" class=\"books\">  Display book list</a></li>\n");
      out.write("        <li><a href=\"agregar.jsp\" class=\"add-user\" >  Add User</a></li>\n");
      out.write("        <li><a href=\"editar.jsp\" class=\"blog\" >  Edit User</a></li>\n");
      out.write("        <li><a href=\"user.jsp\" class=\"listuser\">  Display user list</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </nav> \n");
      out.write("        \n");
      out.write("          <!--FIN   MENUUUUUU-->\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("  <li class=\"breadcrumb-item\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/user\">Home</a></li>\n");
      out.write("  <li class=\"breadcrumb-item\"><a href=\"#\">Library</a></li>\n");
      out.write(" </ol>\n");
      out.write("  <h2 class=\"tit-edit\">Add user</h2>\n");
      out.write("        \n");
      out.write("        <form name=\"form\" action=\"");
      out.print(request.getContextPath());
      out.write("/agregar_post\" method=\"post\">\n");
      out.write("            \n");
      out.write("             <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Nombre</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Nombre\" name=\"nom\">\n");
      out.write("    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("  </div>\n");
      out.write("            \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">E-mail</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Ingrese el e-mail\" name=\"correo\">\n");
      out.write("    <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary pointer\">Enviar</button>\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <script src=\"js/mostrarnav.js\"></script>\n");
      out.write("     </body>\n");
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
