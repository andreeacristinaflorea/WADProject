/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DBConnection {
    private static final String DATABASE_DRIVER = "com.mysql.jdbc.Driver"; 
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/wadproject";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    
public static Connection getConnection() throws SQLException {
if (connection == null) {
try {
    Class.forName(DATABASE_DRIVER);
    connection = DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD);
} catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
}
}
return connection;
}
}
