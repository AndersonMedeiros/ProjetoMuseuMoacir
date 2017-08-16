package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>   \n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Home</title>\n");
      out.write("    <link href=\"_css/estilo-principal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"_jquery/transicao-descricao.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header class=\"col-12\">\n");
      out.write("    <h1 id=\"t\">Museu Moacir Andrade</h1>\n");
      out.write("    <label for=\"icon-menu\">&#9776;</label>\n");
      out.write("    <input type=\"checkbox\" id=\"icon-menu\">\n");
      out.write("    <nav id=\"menu\">\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("            <li><a href=\"Obras.jsp\">Obras</a></li>\n");
      out.write("            <li>Explore</li>\n");
      out.write("            <li><a href=\"Agenda.jsp\">Agenda</a></li>\n");
      out.write("            <li>Fale Conosco</li>\n");
      out.write("        </ul>\n");
      out.write("    </nav>\n");
      out.write("    <a href=\"Entrar_Cadastro.jsp\">Entrar</a>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <img src=\"_imagens/img01.jpg\" alt=\"img01\" title=\"img\" align=\"center\">\n");
      out.write("</section>\n");
      out.write("<section class=\"area-texto\">\n");
      out.write("    <h2>Bem-Vindo ao Museu Moacir Andrade!</h2>\n");
      out.write("    <hr>\n");
      out.write("    <p>Através do site vamos disponibilizar todas as obras presentes no Museu Físico, além de objetos histórico presentes no museu e também no Campus Manaus Centro.</p>\n");
      out.write("</section>\n");
      out.write("<section class=\"col-12\">\n");
      out.write("    <div class=\"linha\">\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            <img class=\"op01\" src=\"_imagens/col1.jpg\" alt=\"col1\" title=\"col\" width=\"400px\" height=\"400px\">\n");
      out.write("            <div class=\"descricao01\">\n");
      out.write("                <h3>Opção1</h3>\n");
      out.write("                <p>Através do site vamos disponibilizar todas as obras presentes no Museu Físico, além de objetos histórico presentes no museu e também no Campus Manaus Centro.</p>\n");
      out.write("                <a href=\"#ha\">Veja Mais</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            <img class=\"op02\" src=\"_imagens/col2.jpg\" alt=\"col2\" title=\"col\" width=\"400px\" height=\"400px\"/>\n");
      out.write("            <div class=\"descricao02\">\n");
      out.write("                <h3>Opção1</h3>\n");
      out.write("                <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn djfndjsfnjdnfjkdfn fdsjfndjsnfjdnfjsdnf sjdfbjsdfbjdf sdkfbjsdfkjbdf jsfbjsdfkjsbfjsf dsjfkbdskjfbksjfb sjfbsjkfkjsbfs fksbfkjsbdjfbdjfbjksfbjkdbsf kfsbdjkfbskjbfjsbfjs</p>\n");
      out.write("                <a href=\"#ha\">Veja Mais</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            <img class=\"op03\" src=\"_imagens/col3.jpg\" alt=\"col3\" title=\"col\" width=\"400px\" height=\"400px\">\n");
      out.write("            <div class=\"descricao03\">\n");
      out.write("                <h3>Opção1</h3>\n");
      out.write("                <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn djfndjsfnjdnfjkdfn fdsjfndjsnfjdnfjsdnf sjdfbjsdfbjdf sdkfbjsdfkjbdf jsfbjsdfkjsbfjsf dsjfkbdskjfbksjfb sjfbsjkfkjsbfs fksbfkjsbdjfbdjfbjksfbjkdbsf kfsbdjkfbskjbfjsbfjs</p>\n");
      out.write("                <a href=\"#ha\">Veja Mais</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<footer class=\"col-12 \">\n");
      out.write("    <div class=\"area-rodape\">\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            <h3>Instituto Federal de Educação, Ciência e Tecnologia do Amazonas</h3>\n");
      out.write("            <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn sidjsj xjxjdsi dfj kfjdsfndfsdhhfi dfd f sdf sfd d df sf sd fsfsdfdfs s dfsdsdfs sfdsfdsfds sfsdf</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            <h3>Opção1</h3>\n");
      out.write("            <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn sidjsj xjxjdsi dfj kfjdsfndfsdhhfi dfd f sdf sfd d df sf sd fsfsdfdfs s dfsdsdfs sfdsfdsfds sfsdf</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("            <a href=\"http://www2.ifam.edu.br/\">\n");
      out.write("                <img src=\"_imagens/ifam-logo.png\" alt=\"IFAM\" title=\"Logo IFAM\"/>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-12 final-rodape\">\n");
      out.write("            Desenvolvido por Anderson Medeiros e Ariel Nery\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
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
