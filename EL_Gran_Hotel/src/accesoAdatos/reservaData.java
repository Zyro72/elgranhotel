/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;

import Entidades.habitacion;
import Entidades.huesped;
import Entidades.reserva;
import java.sql.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RodrigoI
 */
public class reservaData {
    private Connection con=null;
            
public reservaData(){
    con=Conexion.getConection();
    
}
    
 
//metodo para hacer una reserva
public void guardarReserva(reserva reservaNueva){
 
    String sql="INSERT INTO reserva SET nrohabitacion=?, idHuesped=?, FechaEntrada=?, FechaSalida=?, ImporteTotal=?, Estado=true ";
    
    try {
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1, reservaNueva.getNrohabitacion().getNumero());
    ps.setInt(2, reservaNueva.getIdHuesped().getIdHuesped());
    Date fechaEntrada=Date.valueOf(reservaNueva.getFechaEntrada());
    Date fechaSalida=Date.valueOf(reservaNueva.getFechaSalida());
    ps.setDate(3,fechaEntrada);
    ps.setDate(4, fechaSalida);
    ps.setDouble(5,reservaNueva.getImporteTotal());
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Se ha registrado la reserva");
    
}catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al intentar guardar la reserva");
        }
    
    
    
    
    
}

public boolean verificarDisponible(int numeroHab, LocalDate fechaIng){
   String sql="SELECT * FROM reserva WHERE nrohabitacion=? AND Estado=true AND ? BETWEEN FechaEntrada AND FechaSalida";
   boolean resultado=true;
   try{
       PreparedStatement ps=con.prepareStatement(sql);
       Date Fecha=Date.valueOf(fechaIng);
       ps.setInt(1, numeroHab);
       ps.setDate(2, Fecha);
       ResultSet rs=ps.executeQuery();
       if(rs.next()){
           resultado=true;
       }else {resultado=false;}
       
   }catch(SQLException ex){
       JOptionPane.showMessageDialog(null,"Error buscando habitacion en Reservas");
   }
    
    
    
   return resultado; 
    
    
}

public reserva buscarresevaxfecha(LocalDate fecha){
    reserva reserva= new reserva();
        try {
            String sql="SELECT * FROM reserva WHERE  ? BETWEEN FechaEntrada AND FechaSalida";
            
            PreparedStatement ps=con.prepareStatement(sql);
            Date Fecha=Date.valueOf(fecha);
            ps.setDate(1, Fecha);
            ResultSet rs=ps.executeQuery();
       if(rs.next()){
           reserva.getIdHuesped();
           reserva.getNrohabitacion();
           reserva.getFechaEntrada();
           reserva.getFechaSalida();
           reserva.getImporteTotal();
           ps.close();
           return reserva;
       }else {
            JOptionPane.showMessageDialog(null, "Reserva inexistente ");
            ps.close();
            return null;
       }
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error buscando Reservas");
       return null;
        }
        
}
    public reserva buscarreservaxhuesped(huesped huesped){
        reserva reserva= new reserva();
        
        try {
            
            
            String sql="SELECT * FROM reserva WHERE  idHuesped = ?";
            
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, huesped.getIdHuesped());
            ResultSet rs=ps.executeQuery();
             if(rs.next()){
           reserva.getIdHuesped();
           reserva.getNrohabitacion();
           reserva.getFechaEntrada();
           reserva.getFechaSalida();
           reserva.getImporteTotal();
           ps.close();
           return reserva;
             }else{
                 JOptionPane.showMessageDialog(null, "Reserva inexistente ");
            ps.close();
            return null;
             }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(reservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return reserva;
     
}
     public ArrayList<reserva> reservasActivasHoy(){
        LocalDate fechaActual=LocalDate.now();
        Date fechaSql=Date.valueOf(fechaActual);
        ArrayList<reserva> reservasAct=new ArrayList<>();
        reserva reserva= new reserva();
        huesped auxhuesped=new huesped();
        habitacion auxnhab= new habitacion();
        try {
            
            
            String sql="SELECT * FROM reserva WHERE Estado=true AND ? BETWEEN FechaEntrada AND FechaSalida ";
            
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDate(1, fechaSql);
            
            ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 auxnhab.setNumero(rs.getInt("nrohabitacion"));
                 auxhuesped.setIdHuesped(rs.getInt("idHuesped"));
                 
                 LocalDate entrada=rs.getDate("FechaEntrada").toLocalDate();//.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                 LocalDate salida=rs.getDate("FechaSalida").toLocalDate();//.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
             reserva.setIdReserva(rs.getInt("idReserva"));
             reserva.setIdHuesped(auxhuesped);
             reserva.setNrohabitacion(auxnhab);
//                 System.out.println("nrohabitacion"+reserva.getNrohabitacion());
             reserva.setFechaEntrada(entrada);
             reserva.setFechaSalida(salida);
             reserva.setImporteTotal(rs.getDouble("ImporteTotal"));
//             reserva.setEstado(rs.getBoolean("Estado"));
           
           reservasAct.add(reserva);
           
           ps.close();
           }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(reservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return reservasAct;
     
}
     public ArrayList<reserva> listarreserva(){
        
        
        ArrayList<reserva> actuales=new ArrayList<>();
        reserva reserva= new reserva();
        huesped auxhuesped=new huesped();
        habitacion auxnhab= new habitacion();
        try {
            
            
            String sql="SELECT * FROM reserva ";
            
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
           
             while(rs.next()){
                 auxnhab.setNumero(rs.getInt("nrohabitacion"));
                 auxhuesped.setIdHuesped(rs.getInt("idHuesped"));
                 
                 LocalDate entrada=rs.getDate("FechaEntrada").toLocalDate();//.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                 LocalDate salida=rs.getDate("FechaSalida").toLocalDate();//.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
             reserva.setIdReserva(rs.getInt("idReserva"));
             reserva.setIdHuesped(auxhuesped);
             reserva.setNrohabitacion(auxnhab);
//                 System.out.println("nrohabitacion"+reserva.getNrohabitacion());
             reserva.setFechaEntrada(entrada);
             reserva.setFechaSalida(salida);
             reserva.setImporteTotal(rs.getDouble("ImporteTotal"));
             reserva.setEstado(rs.getBoolean("Estado"));
           
           actuales.add(reserva);
           
           ps.close();
           }
//             System.out.println(""+actuales.toString());
             return actuales;
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar las reservas "+ex);
        }
     
     return null;
     
}

}
