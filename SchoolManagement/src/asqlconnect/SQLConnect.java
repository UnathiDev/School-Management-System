/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asqlconnect;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Java class to enable database connection
 * @author Unathi Okhue
 */
public class SQLConnect {
    public static Connection connect(){
        try {
            //Class.forName("com.jdbc.JDBC.Driver");
            Class.forName("org.apache.derby.client.ClientAutoloadedDriver");
            Connection connect = DriverManager.getConnection("jdbc:derby://localhost:1527/dbSkye", "skye", "skye");
            return connect;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
