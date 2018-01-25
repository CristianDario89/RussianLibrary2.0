package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <meta charset=UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" type=\"text/css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\" />\n");
      out.write("<script  type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/funciones.js\"></script>");
      out.write("\n");
      out.write("        <title>Usuarios</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,700,900\" rel=\"stylesheet\"> \n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/menu.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <!--Navbar-->\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid navbar-inverse fondo-nav fixed-top\">\n");
      out.write(" \n");
      out.write("               <!--Menu-->\n");
      out.write("          <div id=\"mostrar-nav\"></div> <!--va afuera del nav xqsi el nav va a estar ocultar, se ocultaria este tmbn, get it?-->\n");
      out.write(" \n");
      out.write("          <nav class=\"menu-nav\">\n");
      out.write("    <ul class=\"menu\">\n");
      out.write("        <li><a href=\"agregar.jsp\" class=\"nosotros\"> Add Book</a></li>\n");
      out.write("        <li><a href=\"editar.jsp\" class=\"menus\">   Edit book</a></li>\n");
      out.write("        <li><a href=\"user.jsp\" class=\"barra\">  Display book list</a></li>\n");
      out.write("        <li><a href=\"index.html\" class=\"reservas\" >  Index</a></li>\n");
      out.write("        <li><a href=\"kidgalery.html\" class=\"blog\" >  Kid Books</a></li>\n");
      out.write("        <li><a href=\"galeria.html\" class=\"contacto\">  Book galery</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </nav> \n");
      out.write("        \n");
      out.write("          <!--FIN   MENUUUUUU-->\n");
      out.write("            \n");
      out.write("            <nav class=\"navbar navbar-toggleable-md  container\">\n");
      out.write("                <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand text-muted\" href=\"#\">LogoCorporativo</a>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto \">\n");
      out.write("                        <li class=\"nav-item active\">\n");
      out.write("                            <a class=\"nav-link text-muted\" href=\"#\">Catalogo</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-muted\" href=\"#\">Galeria</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-muted\" href=\"#\">Servicios</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-muted\" href=\"#\">Nosotros</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link text-muted\" href=\"#\">Contacto</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--fin nav-->\n");
      out.write("\n");
      out.write("        <!--Slider-->\n");
      out.write("        <div class=\"fondo\">\n");
      out.write("            <div class=\"container-fluid fondo-2\">\n");
      out.write("                <div class=\"container d-flex flex-column justify-content-center h-100 text-white align-items-center\">\n");
      out.write("                    <h1 class=\"pb-25\"><a href=\"index.html\" class=\"link-ppal\">Bienvenido a the Ljuba's library</a></h1>\n");
      out.write("                    <p class=\"pb-25 text-center\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ab est quaerat porro atque illum facilis amet, nostrum a magnam possimus em ipsum dolor sit amet, consectetur adipisicing elit. Ab est quaerat porro atque illum facilis amet, nostrum a magnam po!</p>\n");
      out.write("                    <div>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-danger px-5\">Leer más</a>\n");
      out.write("                    </div>    \n");
      out.write("                </div> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!--fin Slider-->\n");
      out.write("\n");
      out.write("        <!--Main-->\n");
      out.write("        <main>\n");
      out.write("            <article>\n");
      out.write("\n");
      out.write("                <div class=\"container my-3\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"d-flex justify-content-end mt-5\">\n");
      out.write("                        <h1 class=\"mr-auto\">Usuarios</h1>\n");
      out.write("                  \n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/agregar\" class=\"btn btn-success mr-2 mb-3\">Agregar</a>\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/user\" class=\"btn btn-info mr-2 mb-3\">Mostrar Tabla</a>\n");
      out.write("                         <a href=\"MOSTRAR.jsp\" class=\"btn btn-danger mb-3\">Mostrar Libros</a>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                   \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead class=\"thead-inverse\">\n");
      out.write("                        <th>Usuario</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Correo</th>\n");
      out.write("                        <th>Acciones</th>\n");
      out.write("                        </thead>\n");
      out.write("\n");
      out.write("                        <tbody>\n");
      out.write("                            ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${datos}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("dato");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                                <tr>\n");
            out.write("                                    <td>");
            if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                                    <td>");
            if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                                    <td>");
            if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("</td>\n");
            out.write("                                    <td>\n");
            out.write("                                        <a href=\"");
            out.print(request.getContextPath());
            out.write("/editar?usuario=");
            if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("\" class=\"btn btn-success\">Editar</a>\n");
            out.write("                                        <a href=\"javascript:void(0);\" onclick=\"eliminar('");
            out.print(request.getContextPath());
            out.write("/eliminar?usuario=");
            if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
              return;
            out.write("')\">Borrar</a>\n");
            out.write("                                    </td>\n");
            out.write("                                </tr> \n");
            out.write("                            ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("            </article>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!--FIIN MAIIN--> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--Banner-->\n");
      out.write("    <div class=\"container-fluid py-5 bg-danger text-center text-white\">\n");
      out.write("        <div class=\"py-4\">\n");
      out.write("            <h2>Mira q facil es usar fon AWESOME</h2>\n");
      out.write("            <div class=\"iconos pt-4\">\n");
      out.write("                <i class=\"fa fa-meetup  pr-3\" aria-hidden=\"true\"></i>\n");
      out.write("                <i class=\"fa fa-user-o pr-3\" aria-hidden=\"true\"></i>\n");
      out.write("                <i class=\"fa fa-taxi pr-3\" aria-hidden=\"true\"></i>\n");
      out.write("                <i class=\"fa fa-bomb pr-3\" aria-hidden=\"true\"></i>\n");
      out.write("                <i class=\"fa fa-bullhorn pr-3\" aria-hidden=\"true\"></i>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!--FIIIIIIIIIN  Banner-->\n");
      out.write("\n");
      out.write("    <!--Form-->\n");
      out.write("\n");
      out.write("    <div class=\"container py-5 bg-fondo-claro\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("            <h2 >Contáctanos</h2>\n");
      out.write("            <h5 class=\"py-4\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dese e, tenetur aliquid et sed sequi magni.</h5>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"#\" class=\"row justify-content-center\">\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <input type=\"text\" placeholder=\"Nombre\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <input type=\"email\" placeholder=\"E-mail\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group col-md-3\">\n");
      out.write("                <input type=\"text\" placeholder=\"Teléfono\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12 py-4\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <button class=\"btn btn-primary col-md-2\">Enviar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--FIIIIIIIIIN  form-->\n");
      out.write("\n");
      out.write("    <!--footer-->\n");
      out.write("    <footer class=\"container-fluid bg-inverse text-center text-white py-5\">\n");
      out.write("        <p>Sitio web desarrolado por Luisano Berrako Gallardo</p>\n");
      out.write("    </footer>\n");
      out.write("    <!--fib footer-->\n");
      out.write("\n");
      out.write("    <!-- jQuery first, then Tether, then Bootstrap JS. -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.slim.min.js\" integrity=\"sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js\" integrity=\"sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/mostrarnav.js\"></script>\n");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getUsuario()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getNombre()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getCorreo()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getUsuario()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getUsuario()}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
