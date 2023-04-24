/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author j-aco
 */
public class TipoVivienda {
    
    public int id_tipo_vivienda;
    public String nombre;

    public void setId_tipo_vivienda(int id_tipo_vivienda) {
        this.id_tipo_vivienda = id_tipo_vivienda;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_tipo_vivienda() {
        return id_tipo_vivienda;
    }

    public String getNombre() {
        return nombre;
    }
}
