/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;

import Entidades.habitacion;
import Entidades.tipodehabitacion;
import java.sql.*;
import java.util.ArrayList;
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
    
        
    public habitacion buscarHabitacion(int numero)    {
        String sql="SELECT * FROM habitacion WHERE numero=?";
        String sqlTh="SELECT * FROM tipodehabitacion WHERE Codigo=?";
        try{
            
            PreparedStatement ps=con.prepareStatement(sql);
            PreparedStatement psTh=con.prepareStatement(sqlTh);
            ps.setInt(1, numero);
            System.out.println(numero);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                int tipoHab=rs.getInt(2);
             psTh.setInt(1, tipoHab);
            }else { JOptionPane.showMessageDialog(null,"Habitación no encontrada");
            }
            
            ResultSet rsTh=psTh.executeQuery();
            if (rsTh.next()){
                tipodehabitacion tipoH=new tipodehabitacion();
                tipoH.setCodigo(rsTh.getInt(1));
                tipoH.setTipo(rsTh.getString(2));
                tipoH.setCapacidad(rsTh.getInt(3));
                tipoH.setCantcamas(rsTh.getInt(4));
                tipoH.setTipocamas(rsTh.getString(5));
                tipoH.setPrecio(rsTh.getDouble(6));
                habitacion hab=new habitacion();
                hab.setNumero(numero);
                hab.setTipohabitacion(tipoH);
                hab.setPiso(rs.getInt(3));
                hab.setEstado(rs.getBoolean(4));
                return hab;
                
            }
                      
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Error buscando habitacion");
            return null;
        }
     return null;
    }
        
    public ArrayList<habitacion> listarHabitacionesTipo(int codigoTipoh){
        String sql="SELECT * FROM habitacion JOIN tipodehabitacion ON (habitacion.Tipohabitacion=tipodehabitacion.Codigo) WHERE habitacion.Tipohabitacion=?";
        tipohabitaciondata tipoHdata=new tipohabitaciondata();
        ArrayList<habitacion> listadoHabitacionesT=new ArrayList<>();
        tipodehabitacion tipodeH=tipoHdata.Tipo(codigoTipoh);
              
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, codigoTipoh);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                habitacion habit=new habitacion();
                habit.setNumero(rs.getInt(1));
                habit.setTipohabitacion(tipodeH);
                habit.setPiso(rs.getInt(3));
                habit.setEstado(rs.getBoolean(4));
                listadoHabitacionesT.add(habit);
            }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error listando las habitaciones");
                    
            
        }
        return listadoHabitacionesT;
        
        
        
        
                
        
        
        
        
        
        
    }
        
        
        
        
    }
    
    
    
    
    

