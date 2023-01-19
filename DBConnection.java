/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFrame;

import java.sql.DriverManager;

/**
 *
 * @author ANIK ADRISH MAJHI
 
public class DBConnection {
    static Connection con = null;
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_ms","root","Anik@123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}*/
