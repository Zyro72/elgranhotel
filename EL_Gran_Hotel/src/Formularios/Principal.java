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
public class Principal {
     public static void main(String[] args) {
         Connection con=Conexion.getConection();
         huespedData hd=new huespedData();
         hd.listarhuespedes();
         
    }
}
