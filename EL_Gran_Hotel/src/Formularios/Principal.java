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
//         hd.guardarhuesped(17224173, "Pereyra Miguel", "Bulevard 1047 depto 2","cheche@gmail.com" ,"1121977690" , true);
         // hd.listarhuespedes();


        //PRUEBA DE GUARDAR HABITACION
        //1RO CREO UN TIPO DE HABITACION
        tipodehabitacion tipo1=new tipodehabitacion();
        tipo1.setCodigo(1);
        tipo1.setTipo("STANDAR");
        tipo1.setCapacidad(1);
        tipo1.setCantcamas(1);
        tipo1.setTipocamas("SIMPLE");
        tipo1.setPrecio(18000);
        
        //2DO CREO UNA HABITACION
        habitacion hab=new habitacion();
        hab.setNumero(101);
        hab.setPiso(1);
        hab.setTipohabitacion(tipo1);
        hab.setEstado(true);
        
        //3ro llamo al metodo guardarhabitacion
        habitacionData habdata=new habitacionData();
        habdata.guardarHabitacion(hab);
        
 
          //PRUEBA BUSCAR POR DNI
        // hd.buscarporDni(36608818); 
        
        //PRUBA DE LISTAR HUSPEDES
       // hd.listarhuesped();

    }
}

