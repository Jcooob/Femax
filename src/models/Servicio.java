/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author j-aco
 */
public class Servicio {
    
    public int id_servicio;
    public String arrendador;
    public String cliente;
    public String fecha_acuerdo;
    public String fecha_deposito;
    public String fecha_entrega;
    public int id_vivienda;

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public void setArrendatario(String arrendatario) {
        this.arrendador = arrendatario;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setFecha_acuerdo(String fecha_acuerdo) {
        this.fecha_acuerdo = fecha_acuerdo;
    }

    public void setFecha_deposito(String fecha_deposito) {
        this.fecha_deposito = fecha_deposito;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public void setId_vivienda(int id_vivienda) {
        this.id_vivienda = id_vivienda;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public String getArrendatario() {
        return arrendador;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha_acuerdo() {
        return fecha_acuerdo;
    }

    public String getFecha_deposito() {
        return fecha_deposito;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public int getId_vivienda() {
        return id_vivienda;
    }
    
    
}
