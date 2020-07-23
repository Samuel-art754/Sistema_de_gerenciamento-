  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver_Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ModuloConexao {
     
    PreparedStatement pst = null;
    Connection conexao = null;
    ResultSet rs = null;
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        
        // CHAMAR O DRIVER
        
        String driver = "com.mysql.jdbc.Driver";
        
        // INFO´S DO BANCO
        
        String url = "jdbc:mysql://localhost:3306/corporativaBD?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        // ESTABELECENDO CONEXAO COM O BANCO
    
        try{
            //Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver (new com.mysql.jdbc.Driver());
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e+ " Conexão não estabelecida");
            return null;
            }
        
    }
}
   