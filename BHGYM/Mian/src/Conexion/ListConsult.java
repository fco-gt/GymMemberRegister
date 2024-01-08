/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import Models.TMiembros;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

/**
 *
 * @author frano
 */
public class ListConsult extends Conexion {

    private QueryRunner QR = new QueryRunner();

    public List<TMiembros> miembros() {
        List<TMiembros> miembro = new ArrayList();
        try {
            miembro = (List<TMiembros>) QR.query(getConn(), "SELECT m.miembro_id, m.miembro_rut, m.miembro_nombre, m.miembro_apaterno, m.miembro_amaterno, t.nombre_taller, d.cant_dias, c.cant_cuotas FROM miembro m JOIN taller t ON m.miembro_tallerId = t.id JOIN dias d ON m.miembro_dias = d.id JOIN cuotas c ON m.miembro_cuotas = c.id",
                    new BeanListHandler(TMiembros.class));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error : " + ex);
        }
        return miembro;
    }
}
