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
public class Consult extends Conexion {
    private QueryRunner QR = new QueryRunner();
    
    public List<TMiembros> miembros() {
        List<TMiembros> miembro = new ArrayList();
        try {
            miembro = (List<TMiembros>) QR.query(getConn(), "SELECT * FROM miembro",
                    new BeanListHandler(TMiembros.class));
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error : " + ex);
        }
        return miembro;
    }
}
