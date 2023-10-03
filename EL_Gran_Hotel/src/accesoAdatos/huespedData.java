/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
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
    public Conexion con =null;

    public huespedData (){
        
        con=Conexion.getConnection();
         }
        public List<huesped>listarhuespedes(){
            String sql ="SELECT * FROM huesped";
             
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ArrayList<huesped>registrados =new ArrayList<>();
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
                          
            }
            return registrados;
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en conexion a Base de Datos al listar huesped");
          return null;
        }
    
        }  
}
