package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import services.VerzamelingService;
import java.util.ArrayList;
import dal.Categorie;

public final class ToonCategorieen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    ArrayList<Categorie> categorieën = (ArrayList<Categorie>)session.getAttribute("c");
    
    
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Verzamelingen</title>     \n");
      out.write("<!-- Latest compiled and minified CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <div class=\"leftside\">\n");
      out.write("                <h2>Verzamelingenbeheer</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rightside\">\n");
      out.write("             <ul class=\"nav nav-tabs\">\n");
      out.write("                 <li><a href=\"index.html\">Startpagina</a></li>\n");
      out.write("                 <li><a href=\"VerzamelingOpvragen\">Verzamelingen weergeven</a></li>\n");
      out.write("                 <li><a href=\"TypeOpvragen\">Types weergeven</a></li>\n");
      out.write("                 <li class=\"active\"><a href=\"CategorieOpvragen\">Categorieën weergeven</a></li>\n");
      out.write("             </ul>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <article>\n");
      out.write("        <h2>Jouw categorieën:</h2><hr/>\n");
      out.write("        <table class=\"table table-bordered table-hover\">\n");
      out.write("            \n");
      out.write("            <div><tr class=\"toptable\"><th>Naam</th></tr></div>\n");
      out.write("            \n");
      out.write("        ");

    for(Categorie categorie : categorieën)
    {
    
      out.write("\n");
      out.write("    <tr class=\"midtable\">\n");
      out.write("        <th>");
      out.print( categorie.getNaam() );
      out.write("</th>\n");
      out.write("    </tr>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        </article>\n");
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
