 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SLibrary;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author yani
 */
public class DBCConnect {
    
    public static void main(String[] args){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
            System.out.println(con);
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBCConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
