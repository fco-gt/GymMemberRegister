/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import Conexion.BuscarMiembro;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author cetecom
 */
public class BuscarVM extends BuscarMiembro {

    private final ArrayList<JLabel> _label;
    private final ArrayList<JTextField> _textField;
    private final ArrayList<JComboBox> _comboBox;
    private final ArrayList<JRadioButton> _radioButton;

    public BuscarVM(ArrayList<JLabel> label, ArrayList<JTextField> textField, ArrayList<JComboBox> comboBox, ArrayList<JRadioButton> radioButton) {
        _label = label;
        _textField = textField;
        _comboBox = comboBox;
        _radioButton = radioButton;
    }

    public void updateMiembro() {
        if (_textField.get(1).getText().equals("")) {
            _label.get(1).setText("INGRESE EL RUT");
            _label.get(1).setForeground(Color.RED);
            _textField.get(1).requestFocus();
        } else {
            if (_textField.get(2).getText().equals("")) {
                _label.get(2).setText("INGRESE EL NOMBRE");
                _label.get(2).setForeground(Color.RED);
                _textField.get(2).requestFocus();
            } else {
                if (_textField.get(3).getText().equals("")) {
                    _label.get(3).setText("INGRESE EL APELLIDO PATERNO");
                    _label.get(3).setForeground(Color.RED);
                    _textField.get(3).requestFocus();
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
                                editMiembro();
                            }
                        }
                    }
                }
            }
        }
    }

    public void searchMiembro() {
        BuscarMiembro bmiembro = new BuscarMiembro();

        String rutString = _textField.get(0).getText();
        
        JTextField rut = _textField.get(1);
        JTextField nombre = _textField.get(2);
        JTextField apaterno = _textField.get(3);
        JTextField amaterno = _textField.get(4);

        JComboBox taller = _comboBox.get(0);

        JRadioButton rdb30 = _radioButton.get(0);
        JRadioButton rdb90 = _radioButton.get(1);
        JRadioButton rdb180 = _radioButton.get(2);

        JComboBox cuotas = _comboBox.get(1);

        bmiembro.buscar(rutString, rut, nombre, apaterno, amaterno, taller, rdb30, rdb90, rdb180, cuotas);
    }
    
    public void editMiembro() {
        BuscarMiembro bmiembro = new BuscarMiembro();
        
        String rutString = _textField.get(0).getText();
        
        JTextField rut = _textField.get(1);
        JTextField nombre = _textField.get(2);
        JTextField apaterno = _textField.get(3);
        JTextField amaterno = _textField.get(4);

        JComboBox taller = _comboBox.get(0);

        JRadioButton rdb30 = _radioButton.get(0);
        JRadioButton rdb90 = _radioButton.get(1);
        JRadioButton rdb180 = _radioButton.get(2);

        JComboBox cuotas = _comboBox.get(1);
        
        bmiembro.editarMiembro(rutString, rut, nombre, apaterno, amaterno, taller, rdb30, rdb90, rdb180, cuotas);
    }
}
