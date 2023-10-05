/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import accesoAdatos.Conexion;
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

        // hd.listarhuespedes();
         
         //PRUEBA DE MODIFICAR HUESPED
        // hd.modificarhuesped(1, 28126572, "Rodrigo Juan Irusta", "rirusta@guerrero.com.ar", "San Martin 98", "3476-155662211", true);
         
         //PRUEBA DE ELIMINAR HUESPED
         //hd.eliminarhuesped(1);
         
         
         

        //  PRUEBA DE GUARDAR HUESPED
//         hd.guardarhuesped(17224173, "Pereyra Miguel", "Bulevard 1047 depto 2","cheche@gmail.com" ,"1121977690" , true);
         // hd.listarhuespedes();
         
          //PRUEBA BUSCAR POR DNI
        // hd.buscarporDni(36608818); 
        
        //PRUBA DE LISTAR HUSPEDES
       // hd.listarhuesped();
    }
}
