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
import models.Usuario;

/**
 *
 * @author j-aco
 */
public class UsuarioRepositorio {
    
    ConexionBD con = new ConexionBD();
    
    public Usuario crearUsuario(Usuario usuario) throws SQLException{
        
        try{
            String SQL = "INSERT INTO usuario "+
                "(usuario, contrasenia, nombres, apellidos, correo, telefono, rol) "+
                " VALUES "+
                "('"+usuario.usuario+"','"+usuario.contrasenia+"','"+usuario.nombres+"','"+usuario.apellidos+"','"+usuario.correo+"','"+usuario.telefono+"','"+usuario.rol+"')";
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.execute();
        }
        catch(SQLException e){
        
        System.out.println(e);
        }
        return usuario;
    }
    
    public Usuario actualizarUsuario(Usuario usuario) throws SQLException{
        
        try{
            String SQL = "UPDATE usuario "+
                "SET usuario = ? , contrasenia = ? , nombres = ? , apellidos = ? , correo = ? , telefono = ? , rol = ? WHERE id_usuario = ?";
    
                PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
                stmt.setString(1,usuario.usuario);
                stmt.setString(2, usuario.contrasenia);
                stmt.setString(3,usuario.nombres);
                stmt.setString(4,usuario.apellidos);
                stmt.setString(5,usuario.correo);
                stmt.setString(6,usuario.telefono);
                stmt.setString(7,usuario.rol);
                stmt.setInt(8,usuario.id_usuario);
                
                stmt.execute();
        }
        catch(SQLException e){
        
            System.out.println(e);
            return null;
        }
        return usuario;
    }
    
    public boolean eliminarUsuario(int id_usuario) throws SQLException{
        
        try{
            String SQL = "DELETE FROM usuario WHERE id_usuario = "+id_usuario+"";
            
            PreparedStatement stmt = (PreparedStatement) con.getConexion().prepareStatement(SQL);
            stmt.execute();
        } 
        catch(SQLException e){
            
            System.out.println(e);
            return false;
        }
        return true;
    }
    
    public List<Usuario> List(){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM usuario");
            
            ResultSet result = ps.executeQuery();
            List<Usuario> usuarios = new ArrayList<Usuario>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Usuario usu = new Usuario();
                usu.id_usuario = result.getInt("id_usuario");
                usu.usuario = result.getString("usuario");
                usu.contrasenia = result.getString("contrasenia");
                usu.nombres = result.getString("nombres");
                usu.apellidos = result.getString("apellidos");
                usu.correo = result.getString("correo");
                usu.telefono = result.getString("telefono");
                usu.rol = result.getString("rol");
                
                usuarios.add(usu);
        }
            return usuarios;
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
    public Usuario Get(int id){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM usuario where id_usuario = "+id);
            
            ResultSet result = ps.executeQuery();
            List<Usuario> usuarios = new ArrayList<Usuario>();
            
            ResultSetMetaData RSMD = result.getMetaData();
            //int CC = RSMD.getColumnCount();
            while (result.next()) {
                Usuario usu = new Usuario();
                usu.id_usuario = result.getInt("id_usuario");
                usu.usuario = result.getString("usuario");
                usu.contrasenia = result.getString("contrasenia");
                usu.nombres = result.getString("nombres");
                usu.apellidos = result.getString("apellidos");
                usu.correo = result.getString("correo");
                usu.telefono = result.getString("telefono");
                usu.rol = result.getString("rol");
                
                usuarios.add(usu);
        }
            return usuarios.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
    
    public Usuario ValidateUser(String usuario, String contrasenia){
        
        try{
            PreparedStatement ps = con.getConexion().prepareStatement("SELECT * FROM usuario WHERE usuario = '"+usuario+"' and contrasenia = '"+contrasenia+"'");
            ResultSet result = ps.executeQuery();
            List<Usuario> usuarios = new ArrayList<Usuario>();
            ResultSetMetaData RSMD = result.getMetaData();
            int CC = RSMD.getColumnCount();
            if(CC ==0 ){
                return null;
            }
            while (result.next()) {
                Usuario usu = new Usuario();
                usu.id_usuario = result.getInt("id_usuario");
                usu.usuario = result.getString("usuario");
                usu.contrasenia = result.getString("id_usuario");
                usu.nombres = result.getString("nombres");
                usu.apellidos = result.getString("apellidos");
                usu.correo = result.getString("id_usuario");
                usu.telefono = result.getString("id_usuario");
                usu.rol = result.getString("rol");
                
                usuarios.add(usu);
        }      
            return usuarios.get(0);
         
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        } 
    }
}