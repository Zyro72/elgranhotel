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
import java.time.LocalDate;
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
    reservaNueva.getIdHuesped().getIdHuesped();
    
    
    
    ps.executeUpdate();
    
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


}
