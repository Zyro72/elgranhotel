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
                System.out.println("Celular"+rs.getString(6));
                System.out.println("Estado:"+rs.getBoolean(7));
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error consultando BD");
        }
        
    }
    

    
    
    public void modificarhuesped(int idHuesped,int dni,String apeynom,String correo,String direccion,String celular,boolean estado){
        String sql="UPDATE huesped SET Dni=?, Apellidoynom=?, Direccion=?, Correo=?, Celular=?, Estado=? WHERE idHuesped=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setString(2, apeynom);
            ps.setString(3, direccion);
            ps.setString(4, correo);
            ps.setString(5, celular);
            ps.setBoolean(6, estado);
            ps.setInt(7, idHuesped);
            ps.executeUpdate();
            listarhuespedes();
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error modificando huesped");
        }
        
         
        
    }
    

    public void eliminarhuesped(int idHuesped){
        String sql="UPDATE huesped SET estado=0 Where idHuesped=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.executeQuery();
            listarhuespedes();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error eliminando el huesped");
            
        }
    }

       public void guardarhuesped(int Dni,String Apellidoynom , String Direccion, String Correo , String Celular , boolean Estado){
        huesped nuevo= new huesped() ;
        nuevo.setDni(Dni);
        nuevo.setApellidoynom(Apellidoynom);
        nuevo.setDireccion(Direccion);
        nuevo.setCorreo(Correo);
        nuevo.setCelular(Celular);
        nuevo.setEstado(Estado);
        System.out.println("nuevo huesped"+nuevo.toString());
        
//        try {
//            String sql ="INSERT  INTO `huesped` ( `Dni`, `Apellidoynom`, `Direccion`, `Correo`, `Celular`, `Estado`) VALUES(?,?,?,?,?,?)" ;
//            PreparedStatement ps= con.prepareStatement(sql);
//            ps.setInt(1, Dni);
//            ps.setString(2, Apellidoynom);
//            ps.setString(3, Direccion);
//            ps.setString(4, Correo);
//            ps.setString(5, Celular);
//            ps.setBoolean(6, Estado);
//            ps.executeUpdate();
//            ResultSet rs=ps.getGeneratedKeys();
//            if (rs.next()){
//               nuevo.setIdHuesped(rs.getInt(1));
//                JOptionPane.showMessageDialog(null,"Huesped Guardado correctamente");
//            
//            }
//        } 
//            catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Error conectando a base de Datos en huesped ");
//
//        }

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
        

