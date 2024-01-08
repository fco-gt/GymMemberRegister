/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author frano
 */
public class EliminarMiembro extends Conexion {
    private Connection conn = getConn();
    private Statement st;

    public void eliminarMimebro(String rut) {
        try {
            st = conn.createStatement();

            String sql = "DELETE FROM miembro" + 
                    " WHERE miembro_rut = " + rut;

            st.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Miembro eliminado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
