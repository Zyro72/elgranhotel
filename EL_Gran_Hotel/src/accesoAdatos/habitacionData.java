/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;

import Entidades.habitacion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RodrigoI
 */
public class habitacionData {
    private Connection con=null;
    
    public habitacionData(){
        con=Conexion.getConection();
        
    }
    
    public void guardarHabitacion(habitacion habit){
       
        String sql="INSERT INTO habitacion (Numero, TipoHabitacion, Piso, Estado) VALUES(?,?,?,?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,habit.getNumero());
            ps.setInt(2,habit.getTipohabitacion().getCodigo());
            ps.setInt(3,habit.getPiso());
            ps.setBoolean(4,habit.isEstado());
            ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Se ha guardado la habitacion nro "+habit.getNumero());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al insertar habitacion en la BD");
            
            
        }
    }  
    public void modificarHabitacion(habitacion habit){
               
        String sql="UPDATE habitacion SET TipoHabitacion=? , Estado=? WHERE Numero=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, habit.getTipohabitacion().getCodigo());
            ps.setBoolean(2, habit.isEstado());
            ps.setInt(3, habit.getNumero());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se ha modificado la habitacion nro "+habit.getNumero());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error modificando habitacion");
        }
    }
    public void eliminarHabitacion(habitacion habit){
        String sql="UPDATE habitacion SET Estado=false WHERE Numero=?";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, habit.getNumero());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha inactivado la habitacion nro"+habit.getNumero());
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al intentar inactivar la habitacion");
            
        }
        
        
        
        
        
    }
        
        
        
        
        
        
    }
    
    
    
    
    

