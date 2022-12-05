/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.List;

/**
 *
 * @author j-aco
 */
public class Vivienda {
    
    public int id_vivienda;
    public String ciudad;
    public String distrito;
    public String direccion;
    public String referencia;
    public int id_tipo_vivienda;
    public String tipo_vivienda;
    public int id_tipo_alquiler;
    public String tipo_alquiler;
    public int id_persona;
    public String persona;
    public String estado;
    public List<ViviendaImagenes> imagenes;
    
    //Metodos set

    public void setId_vivienda(int id_vivienda) {
        this.id_vivienda = id_vivienda;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setId_tipo_vivienda(int id_tipo_vivienda) {
        this.id_tipo_vivienda = id_tipo_vivienda;
    }

    public void setId_tipo_alquiler(int id_tipo_alquiler) {
        this.id_tipo_alquiler = id_tipo_alquiler;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Metodos get

    public int getId_vivienda() {
        return id_vivienda;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getId_tipo_vivienda() {
        return id_tipo_vivienda;
    }

    public int getId_tipo_alquiler() {
        return id_tipo_alquiler;
    }

    public int getId_persona() {
        return id_persona;
    }

    public String getEstado() {
        return estado;
    }
}
