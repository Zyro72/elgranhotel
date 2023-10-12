/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoAdatos;

import Entidades.tipodehabitacion;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author RodrigoI
 */
public class tipohabitaciondata {
    private Connection con=null;
    
    public tipohabitaciondata(){
        con=Conexion.getConection();
    }
    
    
public ArrayList<tipodehabitacion> todoslostipos(){
    
    ArrayList<tipodehabitacion> listado=new ArrayList<>();
    String sql="SELECT * from tipodehabitacion";
    try{
        PreparedStatement ps=con.prepareStatement(sql);
        ResultSet rs=ps.executeQuery();
        while (rs.next()){
            tipodehabitacion tipo=new tipodehabitacion();
            tipo.setCodigo(rs.getInt(1));
            tipo.setTipo(rs.getString(2));
            tipo.setCapacidad(rs.getInt(3));
            tipo.setCantcamas(rs.getInt(4));
            tipo.setTipocamas(rs.getString(5));
            tipo.setPrecio(rs.getDouble(6));
            listado.add(tipo);
            }
                   
        return listado;
    
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, "Error conectando a la BD");
        return null;
    }
}
    public void modificarPrecios(tipodehabitacion tipodeH){
        
        String sql="UPDATE tipodehabitacion SET precio=? WHERE Codigo=?";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setDouble(1,tipodeH.getPrecio());
            ps.setInt(2,tipodeH.getCodigo());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cambios realizados con éxito");
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al intentar modificar precios");
        }
       
    
    
    
    
    
    
    
}
    
    
    
    
    
    
    
    
}

