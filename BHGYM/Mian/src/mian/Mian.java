/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mian;

import Views.Inicio;
import static java.awt.Frame.MAXIMIZED_BOTH;

/**
 *
 * @author frano
 */
public class Mian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inicio inicio = new Inicio();
        inicio.setExtendedState(MAXIMIZED_BOTH);
        inicio.setVisible(true);

    }
    
}
