/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Usuario;
import Model.UsuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ANDERSON MEDEIROS
 */
public class cadastro_usuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cadastro_usuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cadastro_usuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cpf, nome, email, fone, dataNasc, login, senha, rua, bairro, estado, cidade;
        Usuario usu = new Usuario();
        UsuarioDao usuDao = new UsuarioDao();
        
        if((request.getParameter("txtCPF") != null) && (request.getParameter("txtNome") != null)
                && (request.getParameter("txtEmail") != null) && (request.getParameter("txtFone") != null)
                && (request.getParameter("txtDataNasc") != null) && (request.getParameter("txtLogin") != null)
                && (request.getParameter("txtSenha") != null) && (request.getParameter("txtRua") != null)
                && (request.getParameter("txtBairro") != null) && (request.getParameter("txtEstado") != null)
                && (request.getParameter("txtCidade") != null) && (request.getParameter("txtSexo") != null)
                && (request.getParameter("txtCep") != null)){
            
            usu.setCpf(request.getParameter("txtCPF").replace(".", "").replace("-", ""));
            usu.setNome(request.getParameter("txtNome"));
            usu.setSexo(request.getParameter("txtSexo"));
            usu.setEmail(request.getParameter("txtEmail"));
            usu.setFone(request.getParameter("txtFone").replace("(", "").replace(")", "").replace(" ", "").replace("-", ""));
            usu.setDataNasc(request.getParameter("txtDataNasc").replace("/", ""));
            usu.setLogin(request.getParameter("txtLogin"));
            usu.setSenha(request.getParameter("txtSenha"));
            usu.setCep(request.getParameter("txtCep").replace("-", ""));
            usu.setRua(request.getParameter("txtRua"));
            usu.setBairro(request.getParameter("txtBairro"));
            usu.setEstado(request.getParameter("txtEstado"));
            usu.setCidade(request.getParameter("txtCidade"));
            
            usuDao.inserir(usu); 
        }
        
        HttpSession sessao = request.getSession();
        sessao.setAttribute("login_usuario", "true");
        sessao.setAttribute("cpfUsuario", usu.getCpf());
        sessao.setAttribute("loginUsuario", usu.getLogin());
        sessao.setAttribute("emailUsuario", usu.getEmail());
        
        
        RequestDispatcher despachante = getServletContext().getRequestDispatcher("/Home.jsp");
        despachante.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
