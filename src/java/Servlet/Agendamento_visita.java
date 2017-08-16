/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Visita;
import Model.VisitaDao;
import java.io.IOException;
import java.io.PrintWriter;
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
public class Agendamento_visita extends HttpServlet {

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
            out.println("<title>Servlet Agendamento_visita</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Agendamento_visita at " + request.getContextPath() + "</h1>");
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
        
        HttpSession sessao = request.getSession();
        
        if(sessao.getAttribute("login_usuario").equals("true")){
            Visita vst = new Visita();
            VisitaDao vstDao = new VisitaDao();
            if((request.getParameter("txtProfissao")!=null) && (request.getParameter("txtTipoVis")!=null)
                    && (request.getParameter("txtDataVis")!=null) && (request.getParameter("txtHVis")!=null)
                    && (request.getParameter("txtQtdePessoas")!=null)){
                vst.setCpfUsuario(String.valueOf(sessao.getAttribute("cpfUsuario")).replace(".", "").replace("-", ""));
                vst.setProfissao(request.getParameter("txtProfissao"));
                vst.setTipo(request.getParameter("txtTipoVis"));
                vst.setData(request.getParameter("txtDataVis").replace("/",""));
                vst.setHora(request.getParameter("txtHVis").replace(":", ""));
                vst.setQtdePessoas(Integer.parseInt(request.getParameter("txtQtdePessoas")));
                vst.setId(1);
                vstDao.inserir(vst);
                RequestDispatcher despachante = getServletContext().getRequestDispatcher("/Agenda.jsp");
                despachante.forward(request, response);
            }
        }
        else{
            RequestDispatcher despachante = getServletContext().getRequestDispatcher("/Entrar_Cadastro.jsp");
            despachante.forward(request, response);
        }
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
