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
import models.ViviendaImagenes;

/**
 *
 * @author j-aco
 */
public class ViviendaImagenesRepositorio {
    ConexionBD con = new ConexionBD();
    
    public ViviendaImagenes crearViviendaImagenes(ViviendaImagenes viviendaImagenes) throws SQLException{
        
        try{
            String SQL = "INSERT INTO vivienda_imagen"+
                "(id_vivienda, imagen)"+
                " VALUES "+
                "('"+viviendaImagenes.id_vivienda+"','"+viviendaImagenes.imagen+"')";
            System.out.println(SQL);
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return viviendaImagenes;
    }
    
    public ViviendaImagenes actualizarVivienda(ViviendaImagenes viviendaImagenes) throws SQLException{
        
        try{
            String SQL = "UPDATE vivienda_imagen"+
                "(SET id_vivienda = ? , imagen = ? WHERE id_vivienda_imagen = ?)";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setInt(1,viviendaImagenes.id_vivienda);
                stmt.setString(2, viviendaImagenes.imagen);
                stmt.setInt(3, viviendaImagenes.id_vivienda_imagenes);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return viviendaImagenes;
    }
    
    public boolean eliminarImagenesRepositorio(int id_vivienda_imagen) throws SQLException{
        
        try{
            String SQL = "DELETE FROM vivienda_imagen WHERE id_vivienda_imagen = "+id_vivienda_imagen+"";
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
        } 
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public List<ViviendaImagenes> List(int idVivienda){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM vivienda_imagen WHERE id_vivienda ="+idVivienda);
            
            ResultSet result = ps.executeQuery();
            List<ViviendaImagenes> viviendaImagen = new ArrayList<ViviendaImagenes>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                ViviendaImagenes vima = new ViviendaImagenes();
                vima.id_vivienda_imagenes = result.getInt("id_vivienda_imagen");
                vima.id_vivienda = result.getInt("id_vivienda");
                vima.imagen = result.getString("imagen");
                viviendaImagen.add(vima);
        }
            return viviendaImagen;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
    public ViviendaImagenes Get(int id){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM vivienda_imagen WHERE id_vivienda ="+id);
            
            ResultSet result = ps.executeQuery();
            List<ViviendaImagenes> viviendaImagen = new ArrayList<ViviendaImagenes>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                ViviendaImagenes vima = new ViviendaImagenes();
                vima.id_vivienda_imagenes = result.getInt("id_vivienda_imagen");
                vima.id_vivienda = result.getInt("id_vivienda");
                vima.imagen = result.getString("imagen");
                viviendaImagen.add(vima);
        }
            return viviendaImagen.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
}
