/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.habitacion;
import Entidades.tipodehabitacion;
import accesoAdatos.Conexion;
import accesoAdatos.habitacionData;
import accesoAdatos.huespedData;
import java.sql.*;
        

/**
 *
 * @author RodrigoI
 */ 
//clase para hacer pruebas

public class Principal {
     public static void main(String[] args) {
         Connection con=Conexion.getConection();
         huespedData hd=new huespedData();


         //hd.listarhuespedes();
         
         //PRUEBA DE MODIFICAR HUESPED
         //hd.modificarhuesped(1, 28126572, "Rodrigo Juan Irusta", "rirusta@guerrero.com.ar", "San Martin 98", "3476-155662211", true);
         
         //PRUEBA DE ELIMINAR HUESPED
        // hd.eliminarhuesped(1);

        // hd.listarhuespedes();
         
         //PRUEBA DE MODIFICAR HUESPED
        // hd.modificarhuesped(1, 28126572, "Rodrigo Juan Irusta", "rirusta@guerrero.com.ar", "San Martin 98", "3476-155662211", true);
         
         //PRUEBA DE ELIMINAR HUESPED
         //hd.eliminarhuesped(1);

         
         
         

        //  PRUEBA DE GUARDAR HUESPED
         //hd.guardarhuesped(28924567, "Gomez Pedro", "Sgto Cabral 2312","gomezpe@gmail.com" ,"34521577690" , true);
         // hd.listarhuespedes();


        //PRUEBA DE GUARDAR HABITACION
        //1RO CREO UN TIPO DE HABITACION
        tipodehabitacion tipo2=new tipodehabitacion();
        tipo2.setCodigo(2);
        tipo2.setTipo("DOBLE");
        tipo2.setCapacidad(2);
        tipo2.setCantcamas(1);
        tipo2.setTipocamas("QUEEN");
        tipo2.setPrecio(25000);
        
        //2DO CREO UNA HABITACION
        habitacion hab=new habitacion();
        hab.setNumero(101);
        hab.setPiso(1);
        hab.setTipohabitacion(tipo2);
        hab.setEstado(true);
        
        //3ro llamo al metodo guardarhabitacion
        habitacionData habdata=new habitacionData();
        //habdata.guardarHabitacion(hab);
        
 // PRUEBA DE MODIFICAR UNA HABITACION
       //habdata.modificarHabitacion(hab);
 
//PRUEBA DE ELIMINAR HABITACION (INACTIVAR)
    habdata.eliminarHabitacion(hab);
    
       
 
 
          //PRUEBA BUSCAR POR DNI
        // hd.buscarporDni(36608818); 
        
        //PRUBA DE LISTAR HUSPEDES
       // hd.listarhuesped();

    }
}

