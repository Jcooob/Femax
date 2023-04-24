/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author j-aco
 */
public class ViviendaImagenes {
    
    public int id_vivienda_imagenes;
    public int id_vivienda;
    public String imagen;

    public void setId_vivienda_imagenes(int id_vivienda_imagenes) {
        this.id_vivienda_imagenes = id_vivienda_imagenes;
    }

    public void setId_vivienda(int id_vivienda) {
        this.id_vivienda = id_vivienda;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId_vivienda_imagenes() {
        return id_vivienda_imagenes;
    }

    public int getId_vivienda() {
        return id_vivienda;
    }

    public String getImagen() {
        return imagen;
    }
    
    
}
