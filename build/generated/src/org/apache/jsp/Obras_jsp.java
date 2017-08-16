package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import Model.ObrasDao;
import Model.Obras;

public final class Obras_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Obras</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"_css/estilo-principal.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"_css/obras.css\" type=\"text/css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"_jquery/transicao-descricao.js\"></script>\n");
      out.write("    <script src=\"_jquery/manipulacao-galeria.js\"></script>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("    <div class=\"col-12 grade-fotos\" id=\"grade-fotos1\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img1.jpg\" alt=\"img01\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img2.jpg\" alt=\"img02\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img3.jpg\" alt=\"img03\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img4.jpg\" alt=\"img04\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img5.jpg\" alt=\"img05\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img6.jpg\" alt=\"img06\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img7.jpg\" alt=\"img07\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img8.jpg\" alt=\"img08\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img9.jpg\" alt=\"img09\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img10.jpg\" alt=\"img10\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img11.jpg\" alt=\"img11\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img12.jpg\" alt=\"img12\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 grade-fotos esconder-grade\" id=\"grade-fotos2\">\n");
      out.write("        Dois\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img1.jpg\" alt=\"img01\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img2.jpg\" alt=\"img02\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img3.jpg\" alt=\"img03\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img4.jpg\" alt=\"img04\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img5.jpg\" alt=\"img05\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img6.jpg\" alt=\"img06\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img7.jpg\" alt=\"img07\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img8.jpg\" alt=\"img08\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img9.jpg\" alt=\"img09\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img10.jpg\" alt=\"img10\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img11.jpg\" alt=\"img11\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img12.jpg\" alt=\"img12\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 grade-fotos esconder-grade\" id=\"grade-fotos3\">\n");
      out.write("        Tres\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img1.jpg\" alt=\"img01\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img2.jpg\" alt=\"img02\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img3.jpg\" alt=\"img03\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img4.jpg\" alt=\"img04\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img5.jpg\" alt=\"img05\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img6.jpg\" alt=\"img06\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img7.jpg\" alt=\"img07\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img8.jpg\" alt=\"img08\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img9.jpg\" alt=\"img09\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-3\">\n");
      out.write("            <img src=\"_imagens/_obras/img10.jpg\" alt=\"img10\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img11.jpg\" alt=\"img11\" class=\"img-galeria\">\n");
      out.write("            <img src=\"_imagens/_obras/img12.jpg\" alt=\"img12\" class=\"img-galeria\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-12 paginacao\">\n");
      out.write("        <a>&laquo;</a>\n");
      out.write("        <a onclick=\"exibePaginaGaleria('1')\";>1</a>\n");
      out.write("        <a onclick=\"exibePaginaGaleria('2')\";>2</a>\n");
      out.write("        <a onclick=\"exibePaginaGaleria('3')\";>3</a>\n");
      out.write("        <a>4</a>\n");
      out.write("        <a>5</a>\n");
      out.write("        <a>&raquo;</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"col-12 \">\n");
      out.write("    <div class=\"area-rodape\">\n");
      out.write("        <div class=\"col-4\">\n");
      out.write("\n");
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
      out.write("            Desenvolvido por Anderson Medeiros,Ariel Nery e Arlison Batista\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<script src=\"_jquery/modelo.js\"></script>\n");
      out.write("</body>\n");
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
}
