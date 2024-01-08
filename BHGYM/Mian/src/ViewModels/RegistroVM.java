/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import Conexion.Consult;
import Models.TMiembros;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author frano
 */
public class RegistroVM extends Consult {

    private String _accion = "insert";
    private final ArrayList<JLabel> _label;
    private final ArrayList<JTextField> _textField;
    private final ArrayList<JComboBox> _comboBox;
    private final ArrayList<JRadioButton> _radioButton;

    public RegistroVM(ArrayList<JLabel> label, ArrayList<JTextField> textField, ArrayList<JComboBox> comboBox, ArrayList<JRadioButton> radioButton) {
        _label = label;
        _textField = textField;
        _comboBox = comboBox;
        _radioButton = radioButton;
    }

    public void RegistrarUsuario() {
        if (_textField.get(0).getText().equals("")) {
            _label.get(0).setText("INGRESE EL RUT");
            _label.get(0).setForeground(Color.RED);
            _textField.get(0).requestFocus();
        } else {
            if (_textField.get(1).getText().equals("")) {
                _label.get(1).setText("INGRESE EL NOMBRE");
                _label.get(1).setForeground(Color.RED);
                _textField.get(1).requestFocus();
            } else {
                if (_textField.get(2).getText().equals("")) {
                    _label.get(2).setText("INGRESE EL APELLIDO PATERNO");
                    _label.get(2).setForeground(Color.RED);
                    _textField.get(2).requestFocus();
                } else {
                    if (_comboBox.get(0).getSelectedItem().toString().equals("SELECCIONA UNA OPCIÓN")) {
                        _label.get(3).setText("SELECCIONE UN TALLER");
                        _label.get(3).setForeground(Color.RED);
                    } else {
                        if (!_radioButton.get(0).isSelected() && !_radioButton.get(1).isSelected() && !_radioButton.get(2).isSelected()) {
                            _label.get(4).setText("SELECCIONE LOS DIAS");
                            _label.get(4).setForeground(Color.RED);
                        } else {
                            if (_comboBox.get(1).getSelectedItem().toString().equals("SELECCIONA UNA OPCIÓN")) {
                                _label.get(5).setText("SELECCIONA UNA CUOTA MENSUAL");
                                _label.get(5).setForeground(Color.RED);
                            } else {
                                int count;

                                List<TMiembros> listRut = miembros().stream()
                                        .filter(u -> u.getMiembro_rut().equals(_textField.get(0).getText())).collect(Collectors.toList());
                                count = listRut.size();

                                System.out.println(listRut);

                                switch (_accion) {
                                    case "insert":
                                            try {
                                        if (count == 0) {
                                            Insert();
                                        } else {
                                            if (!listRut.isEmpty()) {
                                                _label.get(0).setText("EL RUT YA ESTA REGISTRADO");
                                                _label.get(0).setForeground(Color.RED);
                                                _textField.get(0).requestFocus();
                                            }
                                        }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null, ex);
                                    }
                                    break;
                                    default:
                                        throw new AssertionError();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void Insert() throws SQLException {
        try {
            final QueryRunner qr = new QueryRunner(true);
            getConn().setAutoCommit(false);

            String sqlMiembro = "INSERT INTO miembro(miembro_rut, miembro_nombre, miembro_apaterno," + " miembro_amaterno, miembro_tallerId, miembro_dias, miembro_cuotas) VALUES (?,?,?,?,?,?,?)";

            int taller = 0;
            int dias = 0;
            int cuotas = 0;

            if (_comboBox.get(0).getSelectedIndex() == 1) {
                taller = 1;
            } else if (_comboBox.get(0).getSelectedIndex() == 2) {
                taller = 2;
            } else if (_comboBox.get(0).getSelectedIndex() == 3) {
                taller = 3;
            } else if (_comboBox.get(0).getSelectedIndex() == 4) {
                taller = 4;
            } else if (_comboBox.get(0).getSelectedIndex() == 5) {
                taller = 5;
            }

            if (_radioButton.get(0).isSelected()) {
                dias = 1;
            } else if (_radioButton.get(1).isSelected()) {
                dias = 2;
            } else if (_radioButton.get(2).isSelected()) {
                dias = 3;
            }

            if (_comboBox.get(1).getSelectedIndex() == 1) {
                cuotas = 1;
            } else if (_comboBox.get(1).getSelectedIndex() == 2) {
                cuotas = 2;
            } else if (_comboBox.get(1).getSelectedIndex() == 3) {
                cuotas = 3;
            } else if (_comboBox.get(1).getSelectedIndex() == 4) {
                cuotas = 4;
            } else if (_comboBox.get(1).getSelectedIndex() == 5) {
                cuotas = 5;
            }

            Object[] dataMiembro = {
                _textField.get(0).getText(),
                _textField.get(1).getText(),
                _textField.get(2).getText(),
                _textField.get(3).getText(),
                taller,
                dias,
                cuotas
            };

            qr.insert(getConn(), sqlMiembro, new ColumnListHandler(), dataMiembro);

            getConn().commit();
            restablecer();
            JOptionPane.showMessageDialog(null, "Nuevo miembro registrado");
        } catch (SQLException ex) {
            getConn().rollback();
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public final void restablecer() {
        _accion = "insert";
        
        // TXT
        _textField.get(0).setText("");
        _textField.get(1).setText("");
        _textField.get(2).setText("");
        _textField.get(3).setText("");
        
        // TXT Request Focus
        _textField.get(0).requestFocus(true);
        
        // CMB
        _comboBox.get(0).setSelectedIndex(0);
        
        // RDB
        _radioButton.get(0).setSelected(false);
        _radioButton.get(1).setSelected(false);
        _radioButton.get(2).setSelected(false);
   
        // CMB 2
        _comboBox.get(1).setSelectedIndex(0);
        
        // LBL Foregorund
        _label.get(0).setForeground(new Color(255,255,255));
        _label.get(1).setForeground(new Color(255,255,255));
        _label.get(2).setForeground(new Color(255,255,255));
        _label.get(3).setForeground(new Color(255,255,255));
        _label.get(4).setForeground(new Color(255,255,255));
        _label.get(5).setForeground(new Color(255,255,255));
        
        // LBL SetText
        _label.get(0).setText("RUT");
        _label.get(1).setText("Nombre");
        _label.get(2).setText("Apellido");
        _label.get(3).setText("Taller");
        _label.get(4).setText("DIAS DE INSCRIPCION");
        _label.get(5).setText("Cuota Mensual");
    }

}
