/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;

import Entidades.habitacion;
import Entidades.huesped;
import Entidades.reserva;
import Entidades.tipodehabitacion;
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
    tipohabitaciondata tipohData=new tipohabitaciondata();
    habitacionData habData=new habitacionData();
    huespedData huesData=new huespedData();        
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

public ArrayList<reserva> buscarresevaxfecha(LocalDate fecha){
   ArrayList<reserva> listaxfecha=new ArrayList<>();
   
        try {
            String sql="SELECT * FROM reserva WHERE  ? BETWEEN FechaEntrada AND FechaSalida";
            
            PreparedStatement ps=con.prepareStatement(sql);
            Date Fecha=Date.valueOf(fecha);
            ps.setDate(1, Fecha);
            ResultSet rs=ps.executeQuery();
            
      while(rs.next()){
          reserva reserva= new reserva();
            huesped auxhuesped=new huesped();
            habitacion auxnhab= new habitacion();
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
             listaxfecha.add(reserva);
           ps.close();
           
       
       }
            return listaxfecha;
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Error buscando Reservas");
       return null;
        }
        
}
    public ArrayList<reserva> buscarreservaxhuesped(huesped huesped){
        ArrayList<reserva> listadorev=new ArrayList<>();

        
        try {
            
            
            String sql="SELECT * FROM reserva WHERE  idHuesped = ?";
            
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, huesped.getIdHuesped());
            ResultSet rs=ps.executeQuery();
             while (rs.next()){
//           reserva.getIdHuesped();
//           reserva.getNrohabitacion();
//           reserva.getFechaEntrada();
//           reserva.getFechaSalida();
//           reserva.getImporteTotal();
//           listadorev.add(reserva);
            reserva reserva= new reserva();
            huesped auxhuesped=new huesped();
            habitacion auxnhab= new habitacion();
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
             listadorev.add(reserva);
           ps.close();
          
             }
             
             return listadorev;
            
        } catch (SQLException ex) {
            Logger.getLogger(reservaData.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return null;
     
}
     public ArrayList<reserva> reservasActivasHoy(){
         //este metodo en mi pc, devuelve siempre un array con el ultimo resultado, por eso, movi el codigo dentro del formulario
         //y en lugar de crear un arraylist, directamente completa la tabla
         //dejo el codigo aunque esta sin uso
        LocalDate fechaActual=LocalDate.now();
        Date fechaSql=Date.valueOf(fechaActual);
        ArrayList<reserva> listadoReservas;
        listadoReservas = new ArrayList<>();
        reserva reservaParaLista= new reserva();
        //huesped auxhuesped=new huesped();
        //habitacion auxnhab= new habitacion();
        String sql="SELECT * FROM reserva WHERE Estado=true AND ? BETWEEN FechaEntrada AND FechaSalida ";
        huesped auxhuesped=new huesped();
        habitacion auxnhab= new habitacion();
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDate(1, fechaSql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                 int auxnum;
                 int auxhuespedId;
                 int auxIdreserva;
                 double auxImporte;
                 auxhuesped=null;
                 auxnhab=null;
                 auxIdreserva=rs.getInt(1);
                 System.out.println("auxIdReserva "+auxIdreserva);
                 auxImporte=rs.getDouble(6);
                 auxnum=rs.getInt(2);
                 auxnhab=habData.buscarHabitacion(auxnum);
                 auxhuespedId=rs.getInt(3);
                 auxhuesped=huesData.buscarporId(auxhuespedId);
                 LocalDate entrada=rs.getDate("FechaEntrada").toLocalDate();//.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                 LocalDate salida=rs.getDate("FechaSalida").toLocalDate();//.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                
                 reservaParaLista.setIdReserva(auxIdreserva);
                 reservaParaLista.setNrohabitacion(auxnhab);
                 reservaParaLista.setIdHuesped(auxhuesped);
                 reservaParaLista.setFechaEntrada(entrada);
                 reservaParaLista.setFechaSalida(salida);
                 reservaParaLista.setImporteTotal(auxImporte);
                 
                System.out.println("idReserva antes:" + reservaParaLista.getIdReserva());
                listadoReservas.add(reservaParaLista);
                System.out.println("idReserva despues:" + reservaParaLista.getIdReserva());
                 
             
             }
            System.out.println("recorro el array...");
                 for(reserva res:listadoReservas){
                     System.out.println("id reserva del array..."+res.getIdReserva());
                 }
        return listadoReservas;
        } catch (SQLException ex) {
            Logger.getLogger(reservaData.class.getName()).log(Level.SEVERE, null, ex);
            return listadoReservas;
        }
     
     
     
}
     public ArrayList<reserva> listarreserva(){
        
        
        ArrayList<reserva> actuales=new ArrayList<>();
        
        try {
            
            
            String sql="SELECT * FROM reserva ";
            
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
           
             while(rs.next()){
                 reserva reserva= new reserva();
        huesped auxhuesped=new huesped();
        habitacion auxnhab= new habitacion();
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
    public void modificarReserva(reserva modificaReserva){
 
    String sql="UPDATE reserva SET nrohabitacion=?, idHuesped=?, fechaEntrada=?, fechaSalida=?, ImporteTotal=?,Estado=? WHERE idReserva=?";
    
    try {
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1, modificaReserva.getNrohabitacion().getNumero());
    ps.setInt(2, modificaReserva.getIdHuesped().getIdHuesped());
    Date fechaEntrada=Date.valueOf(modificaReserva.getFechaEntrada());
    Date fechaSalida=Date.valueOf(modificaReserva.getFechaSalida());
    ps.setDate(3,fechaEntrada);
    ps.setDate(4, fechaSalida);
    ps.setDouble(5,modificaReserva.getImporteTotal());
    ps.setBoolean(6, modificaReserva.isEstado());
    ps.setInt(7, modificaReserva.getIdReserva());
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Se han guardado los cambios");
    
}catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al intentar guardar los cambios" + ex);
        }
    
    
    
    
    
}
     public void cancelarReserva(int idReserva){
 
    String sql="UPDATE reserva SET Estado=false WHERE idReserva=?";
    
    try {
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setInt(1, idReserva);
    ps.executeUpdate();
    JOptionPane.showMessageDialog(null, "Se ha cancelado la reserva");
    
}catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al intentar cancelar la resertva" );
        }
    
}
     
     
     

}
