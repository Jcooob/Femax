/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author j-aco
 */
public class ViviendaDetalles {
    
    public int id_vivienda_detalles;
    public String tipo;
    public String valor;
    public int id_vivienda;
    
    //Metodos set

    public void setId_vivienda_detalles(int id_vivienda_detalles) {
        this.id_vivienda_detalles = id_vivienda_detalles;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setId_vivienda(int id_vivienda) {
        this.id_vivienda = id_vivienda;
    }
    
    //Metodos get

    public int getId_vivienda_detalles() {
        return id_vivienda_detalles;
    }

    public String getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public int getId_vivienda() {
        return id_vivienda;
    }
    
    
}
