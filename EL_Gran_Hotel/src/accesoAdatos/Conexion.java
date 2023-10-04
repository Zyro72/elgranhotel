/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author perey
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String BD ="elgranhotel";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection con;
    
    private Conexion(){}
    
    public static Connection getConection(){
        if (con==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con=DriverManager.getConnection(URL+BD,USER,PASS);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error cargando drivers" );
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error conectando a la base de datos");
            }
                      
        }
        return con;
    }
}

    /**
     * @param args the command line arguments
     */
