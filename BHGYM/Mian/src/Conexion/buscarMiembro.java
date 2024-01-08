/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author cetecom
 */
public class BuscarMiembro extends Conexion {

    private Connection conn = getConn();
    private Statement st;
    
    public boolean verificarRut(String rut) {
        boolean existe = false;
        
        try {
            st = conn.createStatement();
            
            String sql = "SELECT COUNT(*) AS total FROM miembro WHERE miembro_rut = '" + rut + "'";
            ResultSet existeRes = st.executeQuery(sql);
            
            if(existeRes.next()) {
                int total = existeRes.getInt("total");
                existe = (total > 0);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return existe;
    }

    public void buscar(String rut, JTextField txtRut, JTextField txtNombre, JTextField txtApaterno,
            JTextField txtAmaterno, JComboBox cmbTaller,
            JRadioButton rdb30, JRadioButton rdb90, JRadioButton rdb180,
            JComboBox cmbCuotas) {
        
        if (!verificarRut(rut)) {
            JOptionPane.showMessageDialog(null, "El rut ingresado no ha sido registrado en la Base de Datos");
            return;
        }

        String sql = "SELECT * FROM miembro WHERE miembro_rut = " + rut;

        try {
            st = conn.createStatement();

            ResultSet res = st.executeQuery(sql);

            while (res.next()) {
                txtRut.setText(res.getString("miembro_rut"));
                txtNombre.setText(res.getString("miembro_nombre"));
                txtApaterno.setText(res.getString("miembro_apaterno"));
                txtAmaterno.setText(res.getString("miembro_amaterno"));

                cmbTaller.setSelectedIndex(res.getInt("miembro_tallerId"));

                switch (res.getInt("miembro_dias")) {
                    case 1:
                        rdb30.setSelected(true);
                        rdb90.setSelected(false);
                        rdb180.setSelected(false);
                        break;
                    case 2:
                        rdb90.setSelected(true);
                        rdb30.setSelected(false);
                        rdb180.setSelected(false);
                        break;
                    case 3:
                        rdb180.setSelected(true);
                        rdb30.setSelected(false);
                        rdb90.setSelected(false);
                        break;
                }

                cmbCuotas.setSelectedIndex(res.getInt("miembro_cuotas"));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editarMiembro(String rut, JTextField txtRut, JTextField txtNombre, JTextField txtApaterno,
            JTextField txtAmaterno, JComboBox cmbTaller,
            JRadioButton rdb30, JRadioButton rdb90, JRadioButton rdb180,
            JComboBox cmbCuotas) {

        int dias = 0;

        if (rdb30.isSelected()) {
            dias = 1;
        } else if (rdb90.isSelected()) {
            dias = 2;
        } else if (rdb180.isSelected()) {
            dias = 3;
        }

        try {
            st = conn.createStatement();

            String sql = "UPDATE miembro SET miembro_rut = '" + txtRut.getText() + "',"
                    + " miembro_nombre = '" + txtNombre.getText() + "',"
                    + " miembro_apaterno = '" + txtApaterno.getText() + "',"
                    + " miembro_amaterno = '" + txtAmaterno.getText() + "',"
                    + " miembro_tallerId = " + cmbTaller.getSelectedIndex() + ","
                    + " miembro_dias = " + dias + ","
                    + " miembro_cuotas = " + cmbCuotas.getSelectedIndex()
                    + " WHERE miembro_rut = " + rut;

            st.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Miembro actualizado con exito");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
