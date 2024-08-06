/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dbms;

/**
 *
 * @author Moideen Aadil Shan
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author DELL
 */
public class Connect {
    private static final String URL = "jdbc:mysql://localhost:3306/projectdbms";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        // Load and register the JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Could not load JDBC driver!");
            e.printStackTrace();
        }

        // Establish a connection
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
