/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Bryan
 */
public class Conexao {
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String URL = "jdbc:mysql://localhost:3306/helpdesk";
            String USER = "root";
            String PASSWORD = "";
            
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Erro na Conexao com o Banco!!!!" + ex);
            
            return null;
        }
    }
         
}
