/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ANDERSON MEDEIROS
 */
public class VisitaDao {
    private final String INSERT = "INSERT INTO VISITAS(CPFUSU,PROFISSAO,TIPO,DATAVIS,HORAVIS,QTDEPESSOAS,ID) "
                                + "VALUES(?,?,?,?,?,?,?)";
        
    Connection conn;
    PreparedStatement pstm;
    
    public void inserir(Visita vst) {
        if (vst != null) {
            Connection conn = null;
            try {
                conn = ConnectionFactory.getConnection();
                
                pstm = conn.prepareStatement(INSERT);
                
                pstm.setString(1, vst.getCpfUsuario());
                pstm.setString(2, vst.getProfissao());
                pstm.setString(3, vst.getTipo());
                pstm.setString(4, vst.getData());
                pstm.setString(5, vst.getHora());
                pstm.setInt(6, vst.getQtdePessoas());
                pstm.setInt(7, vst.getId());
                
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
}
