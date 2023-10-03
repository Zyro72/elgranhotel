/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;
import com.mysql.jdbc.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author perey
 */
public class Conexion {
    public static final String URL = "jdbc:mariadb://localhost/elgranhotel";
    public static final String USER = "root";
    public static final String PASS = "";
    /**
     * @param args the command line arguments
     */
    private static Conexion conexion;
     PreparedStatement ps;
        ResultSet rs;
    
    public static Conexion getConnection(){
        Conexion conexion=null;
       try{
            
            Class.forName("org.mariadb.jdbc.Driver"); //"org.mariadb.jdbc.Driver"
            conexion = (Conexion)DriverManager.getConnection(URL, USER, PASS);
            //JOptionPane.showMessageDialog(null, "Conexión Exitosa");
        
        }catch(Exception ex){
            System.err.println("Error: "+ex);
        }
        
        return conexion;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
