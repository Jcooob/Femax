/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author j-aco
 */
public class Persona {
    
    public int id_persona;
    public String nombres;
    public String apellido_paterno;
    public String apellido_materno;
    public String correo;
    public String telefono;
    public String tipo_documento;
    public String numero_documento;
    public String tipo_persona;
    
    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }
    
    public int getId_persona() {
        return id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }
}