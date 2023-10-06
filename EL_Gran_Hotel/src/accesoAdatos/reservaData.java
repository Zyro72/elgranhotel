/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;

import java.sql.*;

/**
 *
 * @author RodrigoI
 */
public class reservaData {
    private Connection con=null;
            
public reservaData(){
    con=Conexion.getConection();
}
    
    
}
