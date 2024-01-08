/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author frano
 */
public class TMiembros {
    private int miembro_id;
    private String miembro_rut;
    private String miembro_nombre;
    private String miembro_apaterno;
    private String miembro_amaterno;
    private String nombre_taller;
    private int cant_dias;
    private int cant_cuotas;

    public TMiembros() {
    }

    public int getMiembro_id() {
        return miembro_id;
    }

    public void setMiembro_id(int miembro_id) {
        this.miembro_id = miembro_id;
    }

    public String getMiembro_rut() {
        return miembro_rut;
    }

    public void setMiembro_rut(String miembro_rut) {
        this.miembro_rut = miembro_rut;
    }

    public String getMiembro_nombre() {
        return miembro_nombre;
    }

    public void setMiembro_nombre(String miembro_nombre) {
        this.miembro_nombre = miembro_nombre;
    }

    public String getMiembro_apaterno() {
        return miembro_apaterno;
    }

    public void setMiembro_apaterno(String miembro_apaterno) {
        this.miembro_apaterno = miembro_apaterno;
    }

    public String getMiembro_amaterno() {
        return miembro_amaterno;
    }

    public void setMiembro_amaterno(String miembro_amaterno) {
        this.miembro_amaterno = miembro_amaterno;
    }

    public String getNombre_taller() {
        return nombre_taller;
    }

    public void setNombre_taller(String nombre_taller) {
        this.nombre_taller = nombre_taller;
    }

    public int getCant_dias() {
        return cant_dias;
    }

    public void setCant_dias(int cant_dias) {
        this.cant_dias = cant_dias;
    }

    public int getCant_cuotas() {
        return cant_cuotas;
    }

    public void setCant_cuotas(int cant_cuotas) {
        this.cant_cuotas = cant_cuotas;
    }
    
}
