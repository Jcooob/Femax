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
import models.Servicio;

/**
 *
 * @author j-aco
 */
public class ServicioRepositorio {
    ConexionBD con = new ConexionBD();
    
    public Servicio crearServicio(Servicio servicio) throws SQLException{
        
        try{
            String SQL = "INSERT INTO servicio"+
                "(fecha_acuerdo, fecha_deposito, fecha_entrega)"+
                " VALUES "+
                "('"+servicio.fecha_acuerdo+"','"+servicio.fecha_deposito+"','"+servicio.fecha_entrega+"')";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
        System.out.println(e);
        }
        return servicio;
    }
    
    public Servicio actualizarServicio(Servicio servicio) throws SQLException{
        
        try{
            String SQL = "UPDATE servicio "+
                "SET arrendatario = ? , cliente = ? , fecha_acuerdo = ? , fecha_deposito = ? , fecha_entrega = ? , id_vivienda = ? WHERE id_servicio = ?";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setInt(1,servicio.arrendatario);
                stmt.setInt(2,servicio.cliente);
                stmt.setString(3, servicio.fecha_acuerdo);
                stmt.setString(4, servicio.fecha_deposito);
                stmt.setString(5, servicio.fecha_entrega);
                stmt.setInt(6, servicio.id_vivienda);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return servicio;
    }
    
    public boolean eliminarServicio(int id_servicio) throws SQLException{
        
        try{
            String SQL = "DELETE FROM servicio WHERE id_servicio = "+id_servicio+"";
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
        } 
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
     public List<Servicio> List(){
        
        try{ 
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM servicio");
            
            ResultSet result = ps.executeQuery();
            List<Servicio> servicios = new ArrayList<Servicio>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Servicio s = new Servicio();
                s.id_servicio = result.getInt("id_servicio");
                s.arrendatario = result.getInt("arrendatario");
                s.cliente = result.getInt("cliente");
                s.fecha_acuerdo = result.getString("fecha_acuerdo");
                s.fecha_deposito = result.getString("fecha_deposito");
                s.fecha_entrega = result.getString("fecha_entrega");              
                s.id_vivienda = result.getInt("id_vivienda");
                servicios.add(s);
        }
            return servicios;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
     
     public Servicio Get(int id){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM servicio WHERE id_servicio = "+id);
            
            ResultSet result = ps.executeQuery();
            List<Servicio> servicios = new ArrayList<Servicio>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Servicio s = new Servicio();
                s.id_servicio = result.getInt("id_servicio");
                s.arrendatario = result.getInt("arrendatario");
                s.cliente = result.getInt("cliente");
                s.fecha_acuerdo = result.getString("fecha_acuerdo");
                s.fecha_deposito = result.getString("fecha_deposito");
                s.fecha_entrega = result.getString("fecha_entrega");              
                s.id_vivienda = result.getInt("id_vivienda");
                servicios.add(s);
        }
            return servicios.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
}
