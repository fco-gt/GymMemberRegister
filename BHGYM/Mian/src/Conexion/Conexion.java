/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cetecom
 */
public class Conexion {
    private String url = "jdbc:mysql://localhost:3306/bh_gym";
    private String user = "root";
    private String pass = "";
    private Connection conn = null;
    
    public Conexion() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
            if (conn != null) {
                System.out.println("Conexión a la base de datos " + this.url + "...... Listo ");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public Connection getConn() {
        return conn;
    }
    
}
