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
import models.ViviendaDetalles;

/**
 *
 * @author j-aco
 */
public class ViviendaDetalleRepositorio {
    ConexionBD con = new ConexionBD();
    
    public ViviendaDetalles crearViviendaDetalles(ViviendaDetalles viviendaDetalles) throws SQLException{
        
        try{
            String SQL = "INSERT INTO vivienda_detalle"+
                "(tipo, valor, id_vivienda)"+
                " VALUES "+
                "('"+viviendaDetalles.tipo+"','"+viviendaDetalles.valor+"','"+viviendaDetalles.id_vivienda+"')";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
        System.out.println(e);
        }
        return viviendaDetalles;
    }
    
    public ViviendaDetalles actualizarVivienda(ViviendaDetalles viviendaDetalles) throws SQLException{
        
        try{
            String SQL = "UPDATE vivienda_detalle"+
                "(SET tipo = ? , valor = ? WHERE id_vivienda_detalle = ?)";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setString(1,viviendaDetalles.tipo);
                stmt.setString(2, viviendaDetalles.valor);
                stmt.setInt(3, viviendaDetalles.id_vivienda);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return viviendaDetalles;
    }
    
    public boolean eliminarViviendaDetalle(int id_vivienda_detalle) throws SQLException{
        
        try{
            String SQL = "DELETE FROM vivienda_detalle WHERE id_vivienda_detalle "+id_vivienda_detalle+"";
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
        }
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public List<ViviendaDetalles> List(){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM vivienda_detalle");
            
            ResultSet result = ps.executeQuery();
            List<ViviendaDetalles> viviendaDetalles = new ArrayList<ViviendaDetalles>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                ViviendaDetalles vide = new ViviendaDetalles();
                vide.id_vivienda_detalles = result.getInt("id_vivienda_detalle");
                vide.tipo= result.getString("tipo");
                vide.valor = result.getString("valor");
                vide.id_vivienda = result.getInt("id_vivienda");
                viviendaDetalles.add(vide);
        }
            return viviendaDetalles;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
    public ViviendaDetalles Get(int id){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM vivienda_detalle where id_vivienda_detalle = "+id);
            
            ResultSet result = ps.executeQuery();
            List<ViviendaDetalles> viviendaDetalles = new ArrayList<ViviendaDetalles>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                ViviendaDetalles vide = new ViviendaDetalles();
                vide.id_vivienda_detalles = result.getInt("id_vivienda_detalle");
                vide.tipo= result.getString("tipo");
                vide.valor = result.getString("valor");
                vide.id_vivienda = result.getInt("id_vivienda");
                viviendaDetalles.add(vide);
        }
            return viviendaDetalles.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
}
