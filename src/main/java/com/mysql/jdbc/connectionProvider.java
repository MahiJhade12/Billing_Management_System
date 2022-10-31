/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mysql.jdbc;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author devendra jhade
 */
public class connectionProvider {
   /*  public static Connection getCon()
    {
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql//localhost:3306/mysql","root","0000");
            return con;
        }
        catch(Exception e){
            return null;   
        }
       /* try {
       Class.forName("com.mysql.jdbc.Driver");
       java.sql.Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/mysql", "root", "0000");
       return con;

        }        catch (ClassNotFoundException | SQLException e) {
         System.out.println("Exception " + e);
          return null;
            }*/
          public static Connection connectmysqldb() {
        
        try{
            String username = "root"; 
            String pass = "0000";
            String sql = "jdbc:mysql://localhost:3306/connectdb";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sql,username,pass);
            return conn;
            
            
    
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
    }
    
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Connection Established");
	}
       
    
}
