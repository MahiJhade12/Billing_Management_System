package project;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionProvider {
    public static Connection connectmysqldb() {

        try{
            String username = "root";
            String pass = "0000";
            String sql = "jdbc:mysql://localhost:3306/bms";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(sql,username,pass);
            return conn;



        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

    }

}
