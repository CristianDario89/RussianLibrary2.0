package org.apache.jsp.bookSections;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class addbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

            
            Connection conn;
            PreparedStatement pstmt;
             String qry;
        
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"estilos/css.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            if (request.getParameter("btnAdd") != null) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection("jdbc:mysql://localhost/producto", "root", "MIfuturama89");
            //  conn = DriverManager.getConnection("jdbc:mysql://mariadb23678-env-0823326.j.facilcloud.com:3306/biblioteca", "root", "QDGlbo19196");
                    qry = "insert into librosrusia(nombre,autor) values(?,?)";
                    pstmt = conn.prepareStatement(qry);
                    
                    pstmt.setString(1, request.getParameter("txtName"));
                    pstmt.setString(2, request.getParameter("txtAuthor"));
                      pstmt.executeUpdate();
                    response.sendRedirect("./../MOSTRAR.jsp");
                } catch (ClassNotFoundException cnfe) {
                    out.println("Class Not Found Exception :- " + cnfe.toString());
                } catch (SQLException sqle) {
                    out.println("SQL Query Exception :- " + sqle);
                }
            }
 
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h1>Add Book</h1>\n");
      out.write("        <form id=\"addLibro\" action=\"\" method=\"POST\">\n");
      out.write("            <table class=\"table table-bordered table-hover\" border=\"0\" cellspacing=\"5\" cellpadding=\"5\">\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Book Name : -</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtName\" id=\"txtName\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                      <tr>\n");
      out.write("                        <td>Book Author : -</td>\n");
      out.write("                        <td><input type=\"text\" name=\"txtAuthor\" id=\"txtAuthor\" /></td>\n");
      out.write("                    </tr>  \n");
      out.write("                      <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"btnAdd\" value=\"Add Book\" id=\"btnAdd\" /></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("    \n");
      out.write(" <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" ></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
