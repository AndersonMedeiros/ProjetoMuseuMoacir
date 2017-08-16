/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ANDERSON MEDEIROS
 */
public class ObrasDao {
    private final String INSERT = "INSERT INTO OBRASS(ANO,COD,IMG,TITULO,DESCRICAO) "
                                + "VALUES(?,?,?,?,?)";
    private final String GETOBRAS = "SELECT * FROM OBRASS";    
    Connection conn;
    PreparedStatement pstm;
    
    public void inserir(Obras ob) {
        if (ob != null) {
            Connection conn = null;
            try {
                conn = ConnectionFactory.getConnection();
                
                pstm = conn.prepareStatement(INSERT);
                
                pstm.setString(1, ob.getAno());
                pstm.setString(2, ob.getCod());
                pstm.setString(3, ob.getImg());
                pstm.setString(4, ob.getTitulo());
                pstm.setString(5, ob.getDescricao());
                
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
    
    public ArrayList<Obras> listaObras(){
        conn = null;
        pstm = null;
        ResultSet rs = null;
        ArrayList<Obras> obras = new ArrayList<Obras>();
        try {
            conn = ConnectionFactory.getConnection();
            pstm = conn.prepareStatement(GETOBRAS);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Obras ob = new Obras();
                ob.setCod(rs.getString("COD"));
                ob.setAno(rs.getString("ANO"));
                ob.setTitulo(rs.getString("TITULO"));
                ob.setDescricao(rs.getString("DESCRICAO"));
                ob.setImg(rs.getString("IMG"));
                obras.add(ob);
            }
            ConnectionFactory.fechaConexao(conn, pstm, rs);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
            
        }
        return obras;
    }
}