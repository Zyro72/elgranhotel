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
            JOptionPane.showMessageDialog(null,"Se han guardado los cambios con éxito");
           // listarhuespedes();
            
            
            
            
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
        public huesped buscarporDni(int Dni){
            
        try {
            huesped buscado= new huesped();
            String sql="SELECT * FROM huesped WHERE Dni =?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, Dni);
            ResultSet rs=ps.executeQuery();
             if (rs.next()) {
               
                buscado.setIdHuesped(rs.getInt("idHuesped"));
                buscado.setDni(rs.getInt("Dni"));
                buscado.setApellidoynom(rs.getString("Apellidoynom"));
                buscado.setDireccion(rs.getString("Direccion"));
                buscado.setCorreo(rs.getString("Correo"));
                buscado.setCelular(rs.getString("Celular"));
                buscado.setEstado(rs.getBoolean("Estado"));
                 ps.close();
                return buscado;
                 
                // ESTE SOUT ES SOLO A MODO DE PRUEBA
                // System.out.println("id: "+rs.getInt("idHuesped")+" - "+"Apellido y Nombre: "+rs.getString("Apellidoynom"));
            }else {
            JOptionPane.showMessageDialog(null, "No existe ese huesped ");
            ps.close();
             buscado.setIdHuesped(0);
                buscado.setDni(0);
                buscado.setApellidoynom("");
                buscado.setDireccion("");
                buscado.setCorreo("");
                buscado.setCelular("");
                
                 ps.close();
            return buscado;
             
            }
             
           
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error buscando el huesped");
        }
         
        return null;
          
          
           
       }  
    
    
    
       public void guardarhuesped(huesped a){
        huesped nuevo= new huesped() ;
//        nuevo.setDni(Dni);
//        nuevo.setApellidoynom(Apellidoynom);
//        nuevo.setDireccion(Direccion);
//        nuevo.setCorreo(Correo);
//        nuevo.setCelular(Celular);
//        nuevo.setEstado(Estado);
//        System.out.println("nuevo huesped"+nuevo.toString());
//       }
        try {
            String sql ="INSERT  INTO `huesped` ( `Dni`, `Apellidoynom`, `Direccion`, `Correo`, `Celular`, `Estado`) VALUES(?,?,?,?,?,?)" ;
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, a.getDni());
            ps.setString(2, a.getApellidoynom());
            ps.setString(3, a.getDireccion());
            ps.setString(4, a.getCorreo());
            ps.setString(5, a.getCelular());
            ps.setBoolean(6, a.isEstado());

            ResultSet rs=ps.executeQuery();
          
            
             
//            nuevo.setIdHuesped(rs.getInt(1));
                JOptionPane.showMessageDialog(null,"Huesped Guardado correctamente");
            
            
        } 
            catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error conectando a base de Datos en huesped "+ex);

        }
       }

    public ArrayList<huesped>listarhuesped(){
            ArrayList<huesped>registrados =new ArrayList<>();
            String sql ="SELECT * FROM huesped";
           
             
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                huesped huesped=new huesped();
//                huesped.setIdHuesped(rs.getInt("idHuesped"));
                huesped.setDni(rs.getInt("Dni"));
                huesped.setApellidoynom(rs.getString("Apellidoynom"));
                huesped.setDireccion(rs.getString("Direccion"));
                huesped.setCorreo(rs.getString("Correo"));
                huesped.setCelular(rs.getString("Celular"));
//                huesped.setEstado(rs.getBoolean("Estado"));
                registrados.add(huesped);
                //SOUT DE PRUEBA
                  
            }
//             System.out.println(""+registrados);
             
           
            return registrados;
            
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en conexion a Base de Datos al listar huesped");
          
          return registrados;
        }
            
        } 

         public huesped buscarporId(int iDhuesped){
            
        try {
            huesped buscado= new huesped();
            String sql="SELECT * FROM huesped WHERE idHuesped =?";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, iDhuesped);
            ResultSet rs=ps.executeQuery();
             if (rs.next()) {
               
                buscado.setIdHuesped(rs.getInt("idHuesped"));
                buscado.setDni(rs.getInt("Dni"));
                buscado.setApellidoynom(rs.getString("Apellidoynom"));
                buscado.setDireccion(rs.getString("Direccion"));
                buscado.setCorreo(rs.getString("Correo"));
                buscado.setCelular(rs.getString("Celular"));
                buscado.setEstado(rs.getBoolean("Estado"));
                 ps.close();
                return buscado;
                 
                // ESTE SOUT ES SOLO A MODO DE PRUEBA
                // System.out.println("id: "+rs.getInt("idHuesped")+" - "+"Apellido y Nombre: "+rs.getString("Apellidoynom"));
            }else {
            JOptionPane.showMessageDialog(null, "No existe ese huesped ");
            ps.close();
            return null;
             
            }
             
           
            
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error buscando el huesped");
        }
         
        return null;
          
          
           
       }
         public void reactivarHuesped(int idHuesped){
        String sql="UPDATE huesped SET estado=1 Where idHuesped=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idHuesped);
            ps.executeQuery();
            JOptionPane.showMessageDialog(null,"Se ha reactivado el huesped");
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error reactivando el huesped");
            
        }
    }
 
 
        
}
               
        

