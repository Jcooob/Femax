/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author j-aco
 */
public class TipoAlquiler {
    
    public int id_tipo_alquiler;
    public String nombre;
    
    //Metodos set

    public void setId_tipo_alquiler(int id_tipo_alquiler) {
        this.id_tipo_alquiler = id_tipo_alquiler;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos get

    public int getId_tipo_alquiler() {
        return id_tipo_alquiler;
    }

    public String getNombre() {
        return nombre;
    }
}
