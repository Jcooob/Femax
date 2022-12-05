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
import models.TipoVivienda;

/**
 *
 * @author j-aco
 */
public class TipoViviendaRepositorio {
    ConexionBD con = new ConexionBD();
    
    public TipoVivienda crearTipoVivienda(TipoVivienda tipoVivienda) throws SQLException{
        
        try{
            String SQL = "INSERT INTO tipo_vivienda"+
                "(nombre) "+
                " VALUES "+
                "('"+tipoVivienda.nombre+"')";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
        System.out.println(e);
        }
        return tipoVivienda;
    }
    
    public TipoVivienda actualizarTipoVivienda(TipoVivienda tipoVivienda) throws SQLException{
        
        try{
            String SQL = "UPDATE tipo_vivienda "+
                "SET nombre = ? WHERE id_tipo_vivienda = ?";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setString(1,tipoVivienda.nombre);
                stmt.setInt(2, tipoVivienda.id_tipo_vivienda);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return tipoVivienda;
    }
    
    public boolean eliminarTipoVivienda(int id_tipo_vivienda) throws SQLException{
        
        try{
            String SQL = "DELETE FROM tipo_vivienda WHERE id_tipo_vivienda = "+id_tipo_vivienda+"";
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
        } 
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public List<TipoVivienda> List(){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM tipo_vivienda");
            
            ResultSet result = ps.executeQuery();
            List<TipoVivienda> tipoVivienda = new ArrayList<TipoVivienda>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                TipoVivienda tivi = new TipoVivienda();
                tivi.id_tipo_vivienda = result.getInt("id_tipo_vivienda");
                tivi.nombre = result.getString("nombre");
                tipoVivienda.add(tivi);
        }
            return tipoVivienda;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
    public TipoVivienda Get(int id){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM tipo_vivienda WHERE id_tipo_vivienda = "+id);
            
            ResultSet result = ps.executeQuery();
            List<TipoVivienda> tipoVivienda = new ArrayList<TipoVivienda>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                TipoVivienda tivi = new TipoVivienda();
                tivi.id_tipo_vivienda = result.getInt("id_tipo_vivienda");
                tivi.nombre = result.getString("nombre");
                tipoVivienda.add(tivi);
        }
            return tipoVivienda.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
}
