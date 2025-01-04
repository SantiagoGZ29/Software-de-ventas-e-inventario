package com.pgy.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBContext {
    private Connection conexion;
            public DBContext() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/sistema_ventas";
            String user = "root";
            String pass = "Sql97012910120#";
            conexion = (Connection)  DriverManager.getConnection(url, user, pass);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error! " + ex.getMessage());
        }
    }
    public Connection getConexion() {
        return conexion;
    }  
}
