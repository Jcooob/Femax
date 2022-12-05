/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.repositorios;

import clases.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.Persona;

/**
 *
 * @author j-aco
 */
public class PersonaRepositorio {
    ConexionBD con = new ConexionBD();
    
    public Persona crearPersona(Persona persona) throws SQLException{
        
        try{
            String SQL = "INSERT INTO persona"+
                "(nombres, apellido_paterno, apellido_materno, correo, telefono, tipo_documento, numero_documento, tipo_persona)"+
                " VALUES "+
                "('"+persona.nombres+"','"+persona.apellido_paterno+"','"+persona.apellido_materno+"','"+persona.correo+"','"+persona.telefono+"','"+persona.tipo_documento+"','"+persona.numero_documento+"','"+persona.tipo_persona+"')";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return persona;
    }
    
    public Persona actualizarPersona(Persona persona) throws SQLException{
        
        try{ 
            String SQL = "UPDATE persona "+
                "SET nombres = ? , apellido_paterno = ? , apellido_materno = ? , correo = ? , telefono = ? , tipo_documento = ? , numero_documento = ? , tipo_persona = ? WHERE id_persona = ?";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setString(1,persona.nombres);
                stmt.setString(2,persona.apellido_paterno);
                stmt.setString(3, persona.apellido_materno);
                stmt.setString(4, persona.correo);
                stmt.setString(5, persona.telefono);
                stmt.setString(6, persona.tipo_documento);
                stmt.setString(7, persona.numero_documento);
                stmt.setString(8, persona.tipo_persona);
                stmt.setInt(9, persona.id_persona);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return persona;
    }
    
    public boolean eliminarPersona(int id_persona) throws SQLException{
        
        try{ 
            String SQL = "DELETE FROM persona WHERE id_persona = "+id_persona+"";
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
        } 
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public List<Persona> List(){
        
        try{ 
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM persona");
            
            ResultSet result = ps.executeQuery();
            List<Persona> personas = new ArrayList<Persona>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Persona p = new Persona();
                p.id_persona = result.getInt("id_persona");
                p.nombres = result.getString("nombres");
                p.apellido_paterno = result.getString("apellido_paterno");
                p.apellido_materno = result.getString("apellido_materno");
                p.correo = result.getString("correo");
                p.telefono = result.getString("telefono");              
                p.tipo_documento = result.getString("tipo_documento");
                p.numero_documento = result.getString("numero_documento");
                p.tipo_persona = result.getString("tipo_persona");
                personas.add(p);
        }
            return personas;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
     public Persona Get(int id){
         
        try{   
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM persona WHERE id_persona = "+id);
            
            ResultSet result = ps.executeQuery();
            List<Persona> personas = new ArrayList<Persona>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Persona p = new Persona();
                p.id_persona = result.getInt("id_persona");
                p.nombres = result.getString("nombres");
                p.apellido_paterno = result.getString("apellido_paterno");
                p.apellido_materno = result.getString("apellido_materno");
                p.correo = result.getString("correo");
                p.telefono = result.getString("telefono");              
                p.tipo_documento = result.getString("tipo_documento");
                p.numero_documento = result.getString("numero_documento");
                p.tipo_persona = result.getString("tipo_persona");
                personas.add(p);
        }
            return personas.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
     public Persona GetTipo(String tipo){
         
        try{   
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM persona WHERE tipo = " + tipo);
            
            ResultSet result = ps.executeQuery();
            List<Persona> personas = new ArrayList<Persona>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Persona p = new Persona();
                p.id_persona = result.getInt("id_persona");
                p.nombres = result.getString("nombres");
                p.apellido_paterno = result.getString("apellido_paterno");
                p.apellido_materno = result.getString("apellido_materno");
                p.correo = result.getString("correo");
                p.telefono = result.getString("telefono");              
                p.tipo_documento = result.getString("tipo_documento");
                p.numero_documento = result.getString("numero_documento");
                p.tipo_persona = result.getString("tipo_persona");
                personas.add(p);
        }
            return personas.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
     public List<Persona> ListTipo(String tipo){
        
        try{ 
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM persona WHERE tipo_persona = " + tipo);
            System.out.print("SELECT * FROM persona WHERE tipo_persona = " + tipo);
            ResultSet result = ps.executeQuery();
            List<Persona> personas = new ArrayList<Persona>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Persona p = new Persona();
                p.id_persona = result.getInt("id_persona");
                p.nombres = result.getString("nombres");
                p.apellido_paterno = result.getString("apellido_paterno");
                p.apellido_materno = result.getString("apellido_materno");
                p.correo = result.getString("correo");
                p.telefono = result.getString("telefono");              
                p.tipo_documento = result.getString("tipo_documento");
                p.numero_documento = result.getString("numero_documento");
                p.tipo_persona = result.getString("tipo_persona");
                personas.add(p);
        }
            return personas;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
     
}