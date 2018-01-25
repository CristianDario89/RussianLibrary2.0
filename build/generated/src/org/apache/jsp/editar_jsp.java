package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/scripts.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" type=\"text/css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\" />\n");
      out.write("<script  type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/funciones.js\"></script>");
      out.write("\n");
      out.write("        <title>Editar un usuario</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/estilos2.css\">\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <link href=\"https://fonts.googleapis.com/css?family=Raleway:200,400\" rel=\"stylesheet\">\n");
      out.write("             <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script> \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             <style>\n");
      out.write("                 *{\n");
      out.write("                 background: #252528;\n");
      out.write("                 \n");
      out.write("                 }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!--Menu-->\n");
      out.write("          <div id=\"mostrar-nav\"></div> <!--va afuera del nav xqsi el nav va a estar ocultar, se ocultaria este tmbn, get it?-->\n");
      out.write(" \n");
      out.write("  <nav>\n");
      out.write("    <ul class=\"menu\">\n");
      out.write("        <li><a href=\"#\" class=\"nosotros\">  Nosotros</a></li>\n");
      out.write("        <li><a href=\"#\" class=\"menus\">   La carta</a></li>\n");
      out.write("        <li><a href=\"#\" class=\"barra\">  La barra</a></li>\n");
      out.write("        <li><a href=\"#\" class=\"reservas\" >  Reservas</a></li>\n");
      out.write("        <li><a href=\"#\" class=\"blog\" >  El Blog</a></li>\n");
      out.write("        <li><a href=\"#\" class=\"contacto\">  Contactos</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </nav> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!---->\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/user\">Usuarios</a></li>\n");
      out.write("            <li class=\"active\">Editar Usuarios</li>\n");
      out.write("        </ol>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div> \n");
      out.write("            <div class=\" row page-header justify-content-md-center\">\n");
      out.write("                <div class=\"col-md-4 \">\n");
      out.write("                    <h2 class=\"tit-edit\">Editar usuario</h2>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div class=\"col-lg-6 \">\n");
      out.write("\n");
      out.write("                    <form action=\"");
      out.print(request.getContextPath());
      out.write("/Update\" method=\"post\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" name=\"usuario\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"nombres\">Nombres</label>\n");
      out.write("                            <input type=\"text\" name=\"nombres\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" id=\"nombres\" class=\"form-control\" placeholder=\"Por favor digite sus nombres\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"correo\">Correo Electronico</label>\n");
      out.write("                            <input type=\"email\" name=\"correo\" value=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\" id=\"correo\" class=\"form-control\" placeholder=\"Por favor digite su correo electronico\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <p>\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-success pointer\" value=\"Editar Usuario\">\n");
      out.write("                        </p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>           \n");
      out.write("\n");
      out.write("                        \n");
      out.write("        ");
      out.write("<script src=\"public/js/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"public/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("        \n");
      out.write("         \n");
      out.write("      <script src=\"js/mostrarnav.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nombre}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${correo}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }
}
