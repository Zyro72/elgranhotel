/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Entidades.huesped;
import java.util.List;
/**
 *
 * @author perey
 */
public class huespedData {
    private Connection con =null;

    public huespedData (){
        
        con=Conexion.getConection();
        
        System.out.println("conexion creada");
         }

    public void listarhuespedes(){
        String sql="SELECT * FROM huesped";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                System.out.println("id:"+rs.getInt(1));
                System.out.println("DNI:"+rs.getInt(2));
                System.out.println("Apellido y nombre:"+rs.getString(3));
                System.out.println("Domicilio:"+rs.getString(4));
                System.out.println("Correo:"+rs.getString(5));
                System.out.println("Estado:"+rs.getBoolean(6));
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error consultando BD");
        }
        
    }
    
    /*public ArrayList<huesped>listarhuespedes(){
            ArrayList<huesped>registrados =new ArrayList<>();
            String sql ="SELECT * FROM huesped";
            System.out.println("sql creado");
             
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                huesped huesped=new huesped();
                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("Dni"));
                huesped.setApellidoynom(rs.getString("Apellidoynom"));
                huesped.setDireccion(rs.getString("Direccion"));
                huesped.setCorreo(rs.getString("Correo"));
                huesped.setCelular(rs.getString("Celular"));
                huesped.setEstado(rs.getBoolean("Estado"));
                registrados.add(huesped);
                System.out.println("Resultset");          
            }
            return registrados;
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en conexion a Base de Datos al listar huesped");
          return null;
        }
    
        } 
*/
 
 
 
        
        
        
}
