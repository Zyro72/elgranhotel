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

         hd.listarhuespedes();
         
         //PRUEBA DE MODIFICAR HUESPED
         hd.modificarhuesped(1, 28126572, "Rodrigo Juan Irusta", "rirusta@guerrero.com.ar", "San Martin 98", "3476-155662211", true);
         
         //PRUEBA DE ELIMINAR HUESPED
         hd.eliminarhuesped(1);
         
         
         

        //  PRUEBA DE GUARDAR HUESPED (HUESPED YA CARGADO EL QUE FIGURA ABAJO)
//         hd.guardarhuesped(17625173, "Aponte Alda", "Bulevard 1047","aponte.ale@gmail.com" ,"1165432109" , true);
          hd.listarhuespedes();

    }
}
