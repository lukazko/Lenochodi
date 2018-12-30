/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika;
import java.sql.*;

/**
 *
 * @author Simona
 * 
 * Třída sloužící k navázání spojení s databází.
 * 
 */
public class Databaze {
    private static String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7271745?useUnicode=yes&characterEncoding=UTF-8";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "sql7271745";   
    private static String password = "149hkIfzAR";
    private static Connection con;
//    private static String urlstring;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
    
}
