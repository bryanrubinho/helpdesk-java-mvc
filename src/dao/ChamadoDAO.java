/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import static connection.Conexao.getConnection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import model.Chamado;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;




/**
 *
 * @author Bryan
 */
public class ChamadoDAO {
    
    
    public void salvar(Chamado chamado) throws SQLException, ClassNotFoundException{
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement
        ("INSERT INTO chamados(titulo, descricao, prioridade, status) values(?,?,?,?)");
                
        stmt.setString(1, chamado.getTitulo());
        stmt.setString(2, chamado.getDescricao());
        stmt.setString(3, chamado.getPrioridade());
        stmt.setString(4, chamado.getStatus());
        
        stmt.executeUpdate();
                
        stmt.close();
        conn.close();
        
    }
    
    public List<Chamado> listar() throws SQLException, ClassNotFoundException{
        
        Connection conn = getConnection();
        String sql = "Select * From chamados";
        PreparedStatement stmt = conn.prepareStatement(sql);
        
        ResultSet res =stmt.executeQuery();
        
        List<Chamado> listachamados = new ArrayList<Chamado>();
        
        while (res.next()){
            Chamado c = new Chamado();
            
            c.setId(res.getInt("id"));
            c.setTitulo(res.getString("titulo"));
            c.setDescricao(res.getString("descricao"));
            c.setPrioridade(res.getString("prioridade"));
            c.setStatus(res.getString("status"));
            listachamados.add(c); 
        }
        stmt.close();
        conn.close();
        
        return listachamados;
        
    }
    /**
     * busca por id 
     * @param chamado
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public Chamado consultarById(int id) throws SQLException, ClassNotFoundException{
        Connection conn = getConnection();
        String sql = "select * from chamados where id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        
        ResultSet res = stmt.executeQuery();
        Chamado c = new Chamado();
        
        if (res.next()){
            c.setId(res.getInt("id"));
            c.setTitulo(res.getString("titulo"));
            c.setDescricao(res.getString("descricao"));
            c.setPrioridade(res.getString("prioridade"));
            c.setStatus(res.getString("status"));
        }
        stmt.close();
        conn.close();
        
        return c;
        
    }
    
    
    
    public void atualizar(Chamado chamado) throws SQLException, ClassNotFoundException{
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement
        ("update chamados set titulo = ?, descricao = ?, prioridade = ?, status = ? where id = ?");
        
        stmt.setString(1, chamado.getTitulo());
        stmt.setString(2, chamado.getDescricao());
        stmt.setString(3, chamado.getPrioridade());
        stmt.setString(4, chamado.getStatus());
        stmt.setInt(5, chamado.getId());
        
        stmt.executeUpdate();
        
        stmt.close();
        conn.close();
        
        
        
    }
    
    public void deletar(int id) throws SQLException, ClassNotFoundException{
        Connection conn = getConnection();
        PreparedStatement stmt = conn.prepareStatement("delete from chamados where id = ? ");
        stmt.setInt(1, id);
        stmt.executeUpdate();
        
        stmt.close();
        conn.close();
        
        
    }  
    
    
}
