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
import models.TipoAlquiler;

/**
 *
 * @author j-aco
 */
public class TipoAlquilerRepositorio {
    ConexionBD con = new ConexionBD();
    
    public TipoAlquiler crearTipoAlquiler(TipoAlquiler tipoAlquiler) throws SQLException{
        
        try{
            String SQL = "INSERT INTO tipo_alquiler"+
                "(nombre)"+
                " VALUES "+
                "('"+tipoAlquiler.nombre+"')";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
        System.out.println(e);
        }
        return tipoAlquiler;
    }
    
    public TipoAlquiler actualizarTipoAlquiler(TipoAlquiler tipoAlquiler) throws SQLException{
        
        try{
            String SQL = "UPDATE tipo_alquiler "+
                "SET nombre = ? WHERE id_tipo_alquiler = ?";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setString(1,tipoAlquiler.nombre);
                stmt.setInt(2,tipoAlquiler.id_tipo_alquiler);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return tipoAlquiler;
    }
    
    public boolean eliminarTipoAlquiler(int id_tipo_alquiler) throws SQLException{
        
        try{
            String SQL = "DELETE FROM tipo_alquiler WHERE id_tipo_alquiler = "+id_tipo_alquiler+"";
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
        } 
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public List<TipoAlquiler> List(){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM tipo_alquiler");
            
            ResultSet result = ps.executeQuery();
            List<TipoAlquiler> tipoAlquiler = new ArrayList<TipoAlquiler>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                TipoAlquiler tial = new TipoAlquiler();
                tial.id_tipo_alquiler = result.getInt("id_tipo_alquiler");
                tial.nombre = result.getString("nombre");
                tipoAlquiler.add(tial);
        }
            return tipoAlquiler;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
    public TipoAlquiler Get(int id){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM tipo_alquiler WHERE id_tipo_alquiler = "+id);
            
            ResultSet result = ps.executeQuery();
            List<TipoAlquiler> tipoAlquiler = new ArrayList<TipoAlquiler>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                TipoAlquiler tial = new TipoAlquiler();
                tial.id_tipo_alquiler = result.getInt("id_tipo_alquiler");
                tial.nombre = result.getString("nombre");
                tipoAlquiler.add(tial);
        }
            return tipoAlquiler.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
}
