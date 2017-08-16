package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Entrar_005fCadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Entrar_Cadastro</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"_css/estilo-principal.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"_css/obras.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"_css/estilo-cadastro.css\" type=\"text/css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"col-12\">\n");
      out.write("            <h1 id=\"t\">Museu Moacir Andrade</h1>\n");
      out.write("            <label for=\"icon-menu\">&#9776;</label>\n");
      out.write("            <input type=\"checkbox\" id=\"icon-menu\">\n");
      out.write("            <nav id=\"menu\">\n");
      out.write("        \n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"obras.html\">Obras</a></li>\n");
      out.write("                    <li>Explore</li>\n");
      out.write("                    <li><a href=\"agenda.html\">Agenda</a></li>\n");
      out.write("                    <li>Fale Conosco</li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"col-12 area-cadastro\">\n");
      out.write("                <div class=\"col-6 formEntrar\">\n");
      out.write("                    <form name=\"formCadUsuario\" method=\"post\" action=\"\">\n");
      out.write("                        <h1>Já possui cadastro:</h1>\n");
      out.write("                        <label>Login: </label><input type=\"text\" name=\"txtLogin\">\n");
      out.write("                        <label>Senha: </label><input type=\"password\" name=\"txtSenha\">\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" name=\"btnEnviar\" id=\"btnEnviar\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6 formCadastrar\">\n");
      out.write("                    <form name=\"formCadUsuario\" method=\"post\" action=\"Pre_Cadastro_Usuario\">\n");
      out.write("                        <h1>Cadastre-se:</h1>\n");
      out.write("                        <label>CPF: </label><input type=\"text\" name=\"txtCPF\">\n");
      out.write("                        <label>Email: </label><input type=\"text\" name=\"txtEmail\">\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" name=\"btnEnviar\" id=\"btnEnviar\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <footer class=\"col-12 \">\n");
      out.write("            <div class=\"area-rodape\">\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <h3>Instituto Federal de Educação, Ciência e Tecnologia do Amazonas</h3>\n");
      out.write("                    <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn sidjsj xjxjdsi dfj kfjdsfndfsdhhfi dfd f sdf sfd d df sf sd fsfsdfdfs s dfsdsdfs sfdsfdsfds sfsdf</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <h3>Opção1</h3>\n");
      out.write("                    <p>ksdjiajdi sdjkfhjs dkhfjkshfdjk snkdjsadkdn sidjsj xjxjdsi dfj kfjdsfndfsdhhfi dfd f sdf sfd d df sf sd fsfsdfdfs s dfsdsdfs sfdsfdsfds sfsdf</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-4\">\n");
      out.write("                    <a href=\"http://www2.ifam.edu.br/\">\n");
      out.write("                        <img src=\"_imagens/ifam-logo.png\" alt=\"IFAM\" title=\"Logo IFAM\"/>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 final-rodape\">\n");
      out.write("                    Desenvolvido por Anderson Medeiros e Ariel Nery\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
