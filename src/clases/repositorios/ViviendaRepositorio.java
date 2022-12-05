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
import models.Vivienda;

/**
 *
 * @author j-aco
 */
public class ViviendaRepositorio {
    
    ConexionBD con = new ConexionBD();
    
    public Vivienda crearVivienda(Vivienda vivienda) throws SQLException{
        
        try{
            String SQL = "INSERT INTO vivienda"+
                "(ciudad, distrito, direccion, referencia, estado, id_tipo_vivienda, id_tipo_alquiler, id_persona)"+
                " VALUES "+
                "('"+vivienda.ciudad+"','"+vivienda.distrito+"','"+vivienda.direccion+"','"+vivienda.referencia+"','"+vivienda.estado+"','"+vivienda.id_tipo_vivienda+"','"+vivienda.id_tipo_alquiler+"','"+vivienda.id_persona+"')";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
        System.out.println(e);
        }
        return vivienda;
    }
    
    public Vivienda actualizarVivienda(Vivienda vivienda) throws SQLException{
        
        try{
            String SQL = "UPDATE vivienda "+
                "SET ciudad = ? , distrito = ? , direccion = ? , referencia = ? , id_tipo_vivienda = ? , id_tipo_alquiler = ? , id_persona = ? , estado = ? WHERE id_vivienda = ?";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setString(1,vivienda.ciudad);
                stmt.setString(2,vivienda.distrito);
                stmt.setString(3,vivienda.direccion);
                stmt.setString(4,vivienda.referencia);
                stmt.setInt(5,vivienda.id_tipo_vivienda);
                stmt.setInt(6,vivienda.id_tipo_alquiler);
                stmt.setInt(7,vivienda.id_persona);
                stmt.setString(8,vivienda.estado);
                stmt.setInt(9,vivienda.id_vivienda);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return vivienda;
    }
    
    public boolean eliminarVivienda(int id_vivienda) throws SQLException{
        
        try{         
            String SQL = "DELETE FROM vivienda WHERE id_vivienda = "+id_vivienda;
            String SQL2 = "DELETE FROM vivienda_imagen WHERE id_vivienda = "+id_vivienda;
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL2);
            stmt.execute();
            
            stmt  = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
            
            
        } 
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public List<Vivienda> List(){
        
        try{ 
            PreparedStatement ps = con.getConexion().prepareStatement(""
                    + "SELECT v.*, tv.nombre as tipo_vivienda, ta.nombre as tipo_alquiler, p.nombres as persona FROM vivienda v "
                    + "LEFT JOIN tipo_vivienda tv ON v.id_tipo_vivienda = tv.id_tipo_vivienda "
                    + "LEFT JOIN tipo_alquiler ta ON v.id_tipo_alquiler = ta.id_tipo_alquiler "
                    + "LEFT JOIN persona p ON v.id_persona = p.id_persona");
            
            ResultSet result = ps.executeQuery();
            List<Vivienda> vivienda = new ArrayList<Vivienda>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Vivienda vi = new Vivienda();
                vi.id_vivienda = result.getInt("id_vivienda");
                vi.ciudad = result.getString("ciudad");
                vi.distrito = result.getString("distrito");
                vi.direccion = result.getString("direccion");
                vi.referencia = result.getString("referencia");
                vi.id_tipo_vivienda = result.getInt("id_tipo_vivienda");
                vi.tipo_vivienda = result.getString("tipo_vivienda");
                vi.id_tipo_alquiler = result.getInt("id_tipo_alquiler");
                vi.tipo_alquiler = result.getString("tipo_alquiler");
                vi.id_persona = result.getInt("id_persona");
                vi.persona = result.getString("persona");
                vi.estado = result.getString("estado");
                vivienda.add(vi);
        }
            return vivienda;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
    public Vivienda Get(int id ){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM vivienda WHERE id_vivienda = "+id);
            
            ResultSet result = ps.executeQuery();
            List<Vivienda> vivienda = new ArrayList<Vivienda>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Vivienda vi = new Vivienda();
                vi.id_vivienda = result.getInt("id_vivienda");
                vi.ciudad = result.getString("ciudad");
                vi.distrito = result.getString("distrito");
                vi.direccion = result.getString("direccion");
                vi.referencia = result.getString("referencia");
                vi.id_tipo_vivienda = result.getInt("id_tipo_vivienda");
                vi.id_tipo_alquiler = result.getInt("id_tipo_alquiler");
                vi.id_persona = result.getInt("id_persona");
                vi.estado = result.getString("estado");
                vivienda.add(vi);
        }
            return vivienda.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
}