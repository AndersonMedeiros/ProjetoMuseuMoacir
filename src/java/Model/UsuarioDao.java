/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ANDERSON MEDEIROS
 */
public class UsuarioDao {
    private final String INSERT = "INSERT INTO USUARIO(CPF,NOME,EMAIL,DATANASC,SEXO,FONE,LOGIN,SENHA,CEP,RUA,BAIRRO,ESTADO,CIDADE) "
                                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String PESQUSUCPF = "SELECT * FROM USUARIO WHERE CPF = ?";
    private final String UPDATE = "UPDATE VISITANTE SET NOME=?,CPF=?,RG=?,RESIDENCIAL=?,CELULAR=?,EMAIL=?,CPFREC=? WHERE CODIGO = ?";
    private final String DELETE = "DELETE FROM VISITANTE WHERE CODIGO = ?";
    private final String GETUSUARIOBYLOGIN = "SELECT * FROM USUARIO WHERE LOGIN=?";
    private final String GETLOGINSENHA = "SELECT LOGIN, SENHA FROM USUARIO WHERE LOGIN=? AND SENHA=?";
    
    
    Connection conn;
    PreparedStatement pstm;
    
    public void inserir(Usuario usu) {
        if (usu != null) {
            Connection conn = null;
            try {
                conn = ConnectionFactory.getConnection();
                
                pstm = conn.prepareStatement(INSERT);
                
                pstm.setString(1, usu.getCpf());
                pstm.setString(2, usu.getNome());
                pstm.setString(3, usu.getEmail());
                pstm.setString(4, usu.getDataNasc());
                pstm.setString(5, usu.getSexo());
                pstm.setString(6, usu.getFone());
                pstm.setString(7, usu.getLogin());
                pstm.setString(8, usu.getSenha());
                pstm.setString(9, usu.getCep());
                pstm.setString(10, usu.getRua());
                pstm.setString(11, usu.getBairro());
                pstm.setString(12, usu.getEstado());
                pstm.setString(13, usu.getCidade());
                
                pstm.execute();
                ConnectionFactory.fechaConexao(conn, pstm);

            } catch (Exception e) {
                e.printStackTrace();
                
                throw new RuntimeException(e.getMessage());
                
            }
        } else {
            
            throw new RuntimeException();
        }
    }
    /*
    public void atualizar(Visitante vis) {
        if (vis != null) {
            conn = null;
            try {
                conn = ConnectionFactory.getConnection();
                pstm = conn.prepareStatement(UPDATE);
                                
                pstm.setString(1, vis.getNome());
                pstm.setString(2, vis.getCpf());
                pstm.setString(3, vis.getRg());
                pstm.setString(4, vis.getResidencial());
                pstm.setString(5, vis.getCelular());
                pstm.setString(6, vis.getEmail());
                pstm.setString(7, vis.getCpfRec());
                pstm.setString(8, vis.getCodigo());
                
                pstm.execute();
                ConnectionFactory.fechaConexao(conn);

            } catch (Exception e) {
                e.printStackTrace();
                Util.errodeUpdate();
                throw new RuntimeException(e.getMessage());

            }
        } else {
            Util.errodeParamVazio();
            throw new RuntimeException();
        }
    }
    
    public void remover(String cod) {
        try {
            conn = ConnectionFactory.getConnection();
            pstm = conn.prepareStatement(DELETE);
         
            pstm.setString(1, cod);
            
            pstm.execute();
            ConnectionFactory.fechaConexao(conn, pstm);

        } catch (Exception e) {
            e.printStackTrace();
            Util.errodeDelete();
            throw new RuntimeException(e.getMessage());
            
        }
    }
    
    public Visitante getVisitanteByCodigo(String cod) {
        conn = null;
        pstm = null;
        ResultSet rs = null;
        Visitante vis = new Visitante();
        try {
            conn = ConnectionFactory.getConnection();
            pstm = conn.prepareStatement(PESQVISCOD);
            pstm.setString(1, cod);
            rs = pstm.executeQuery();
            while (rs.next()) {
                vis.setCodigo(rs.getString("CODIGO"));
                vis.setNome(rs.getString("NOME"));
                vis.setCpf(rs.getString("CPF"));
                vis.setRg(rs.getString("RG"));
                vis.setResidencial(rs.getString("RESIDENCIAL"));
                vis.setCelular(rs.getString("CELULAR"));
                vis.setEmail(rs.getString("EMAIL"));
                vis.setCpfRec(rs.getString("CPFREC"));

            }
            ConnectionFactory.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            e.printStackTrace();
            Util.errodePesqRec();
            throw new RuntimeException(e.getMessage());
            
        }
        return vis;
    }
    
    public String getNomeByCodigo(String cod) {
        conn = null;
        pstm = null;
        ResultSet rs = null;
        String nome = null;
        try {
            conn = ConnectionFactory.getConnection();
            pstm = conn.prepareStatement(PESQNOMECOD);
            pstm.setString(1, cod);
            rs = pstm.executeQuery();
            while (rs.next()) {
                nome = rs.getString("NOME");

            }
            ConnectionFactory.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            e.printStackTrace();
            Util.errodePesqRec();
            throw new RuntimeException(e.getMessage());
            
        }
        return nome;
    }
    */
    public boolean validarLoginSenha(String login, String senha) {
        conn = null;
        pstm = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            pstm = conn.prepareStatement(GETLOGINSENHA);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
            ConnectionFactory.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
            
        }
        return false;
    }
    
    public Usuario getUsuario(String login){
        conn = null;
        pstm = null;
        ResultSet rs = null;
        Usuario usu = new Usuario();
        try {
            conn = ConnectionFactory.getConnection();
            pstm = conn.prepareStatement(GETUSUARIOBYLOGIN);
            pstm.setString(1, login);
            rs = pstm.executeQuery();
            while (rs.next()) {
                usu.setCpf(rs.getString("CPF"));
                usu.setNome(rs.getString("NOME"));
                usu.setSexo(rs.getString("SEXO"));
                usu.setEmail(rs.getString("EMAIL"));
                usu.setDataNasc(rs.getString("DATANASC"));
                usu.setFone(rs.getString("FONE"));
                usu.setLogin(rs.getString("LOGIN"));
                usu.setSenha(rs.getString("SENHA"));
                usu.setCep(rs.getString("CEP"));
                usu.setRua(rs.getString("RUA"));
                usu.setBairro(rs.getString("BAIRRO"));
                usu.setEstado(rs.getString("ESTADO"));
                usu.setCidade(rs.getString("CIDADE"));
            }
            ConnectionFactory.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());           
        }
        return usu;
    }
}
