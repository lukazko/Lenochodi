/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
/**
 *
 * @author Marko
 */
public class database {
    private static final String USERNAME= "root";
    private static final String PASSWORD= "lenochodi69";
    private static final String CONN_STRING= 
            "jdbc:mysql://localhost:3306/lenochodi";
   
    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected");
        } catch (SQLException e){
            System.err.println(e);
        }
    }
   
}
