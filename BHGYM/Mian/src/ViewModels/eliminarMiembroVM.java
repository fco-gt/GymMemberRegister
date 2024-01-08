/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import Conexion.ListConsult;
import Models.TMiembros;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author frano
 */
public class eliminarMiembroVM extends ListConsult {
    private final JTable _tableMiembro;
    private DefaultTableModel modelo1;
    private int _idMimebro = 0;
    private final int _reg_por_pagina = 10;
    private final int _num_pagina = 1;
    
     public eliminarMiembroVM(Object[] objects) {
        _tableMiembro = (JTable) objects[0];
    }
     
      public void SearchClientes(String campo) {
        List<TMiembros> clienteFilter;
        
        String[] titulos = { "ID", "RUT", "Nombre", "Apellido Paterno", "Apellido Materno", "Taller Inscrito", "Dias Inscrito", "Cuotas de pago" };
        
        modelo1 = new DefaultTableModel(null, titulos);
        
        int inicio = (_num_pagina - 1) * _reg_por_pagina;
        
        if (campo.equals("")) {
            clienteFilter = miembros().stream()
                    .skip(inicio).limit(_reg_por_pagina)
                    .collect(Collectors.toList());
        } else {
            clienteFilter = miembros().stream()
                    .filter(C -> C.getMiembro_rut().startsWith(campo))
                    .skip(inicio).limit(_reg_por_pagina)
                    .collect(Collectors.toList());
        }
        
        if (!clienteFilter.isEmpty()) {
            clienteFilter.forEach(item -> {
                
                Object[] registros = {
                    item.getMiembro_id(),
                    item.getMiembro_rut(),
                    item.getMiembro_nombre(),
                    item.getMiembro_apaterno(),
                    item.getMiembro_amaterno(),
                    item.getNombre_taller(),
                    item.getCant_dias(),
                    item.getCant_cuotas()
                };
                modelo1.addRow(registros);
            });
        }
        _tableMiembro.setModel(modelo1);
        _tableMiembro.setRowHeight(30);
        _tableMiembro.getColumnModel().getColumn(0).setMaxWidth(0);
        _tableMiembro.getColumnModel().getColumn(0).setMinWidth(0);
        _tableMiembro.getColumnModel().getColumn(0).setPreferredWidth(0);
        
    }
}
