

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saqib khan
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    Connection conn;
    
    public static  Connection  ConnectDb(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/Library","root","");
            return conn;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
        
    }
}