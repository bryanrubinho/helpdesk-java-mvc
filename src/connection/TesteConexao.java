/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
import java.sql.Connection;


/**
 *
 * @author Bryan
 */
public class TesteConexao {
 
        
        public static void main (String[] args){
            Connection con = Conexao.getConnection();
        
            if (con != null){
                System.out.println("Conectado com Sucesso!!!");
            }else{
                 System.out.println("Falha de conexao!!!");
            }
        }
    }

