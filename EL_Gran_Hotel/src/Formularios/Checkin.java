/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.huesped;
import Entidades.reserva;
import accesoAdatos.Conexion;
import accesoAdatos.huespedData;
import accesoAdatos.reservaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author perey
 */
public class Checkin extends javax.swing.JInternalFrame {
     private Connection con =null;
    reservaData listar = new reservaData();
    DefaultTableModel formatoTabla = new DefaultTableModel();
    ArrayList<reserva> res= new ArrayList<> ();
    huespedData hcheck= new huespedData();
    huesped h = new huesped();
    /**
     * Creates new form Checkin
     */
    public Checkin() {
         con=Conexion.getConection();
        initComponents();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBsalir = new javax.swing.JButton();
        jTid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBok = new javax.swing.JButton();

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese IdHuesped :");

        jLabel2.setText("CheckIn");

        jBok.setText("Confirmar");
        jBok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jBok)))
                .addGap(91, 91, 91))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBok))
                .addGap(28, 28, 28)
                .addComponent(jBsalir)
                .addGap(136, 136, 136))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBokActionPerformed
        
        checkin();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBokActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBok;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTid;
    // End of variables declaration//GEN-END:variables
 
//    public void cargarTabla() {
//        ArrayList<reserva> lista = new ArrayList<>();
//        lista = (ArrayList) listar.listarreserva();
//        for (reserva item : lista) {
//            formatoTabla.addRow(new Object[]{ item.getIdHuesped().getApellidoynom(), item.getNrohabitacion().getNumero(), item.getFechaEntrada(), item.getFechaSalida(),item.getNrohabitacion() });
//        }
//
//    }

  
    private void checkin(){
        int aux = Integer.parseInt(jTid.getText());
        h=hcheck.buscarporId(aux);
        
        LocalDate fechaActual=LocalDate.now();
         ArrayList<reserva> listaux = new ArrayList<>();
        listaux=listar.buscarreservaxhuesped2(h);
        for (reserva item:listaux){
//             System.out.println(""+item.getNrohabitacion().isOcupada());
           if (item.getFechaEntrada().isEqual(fechaActual)){
               try {
                   
                    item.getNrohabitacion().setOcupada(true);
                   System.out.println(""+item.getNrohabitacion().isOcupada());
                   String sql="UPDATE habitacion SET Ocupada =? WHERE Numero=?";
                   PreparedStatement ps=con.prepareStatement(sql);
                   
                   ps.setBoolean(1,item.getNrohabitacion().isOcupada());
                   ps.setInt(2,item.getNrohabitacion().getNumero());
                   ps.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Reserva de la habitacion "+item.getNrohabitacion().getNumero()+"CheckIn Exitoso");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al realizar el Check In");
               }
           }
           
            
        }
        
        
        
    }
}
