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

        jBsalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jTid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTidKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese Dni del Huesped :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Formulario de Check- In de Huéspedes");

        jBok.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBok, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void jTidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTidKeyTyped

 int tecla =evt.getKeyChar();
        
        boolean numeros = tecla >=48 && tecla <=57;
        if(!numeros){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTidKeyTyped


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
        h=hcheck.buscarporDni(aux);
        int i=0;
        LocalDate fechaActual=LocalDate.now();
         ArrayList<reserva> listaux = new ArrayList<>();
        listaux=listar.buscarreservaxhuesped2(h);
        for (reserva item:listaux){
//             System.out.println(""+item.getNrohabitacion().isOcupada());
           if (item.getFechaEntrada().isEqual(fechaActual)){
               try {
                   i++;
                    item.getNrohabitacion().setOcupada(true);
                   
                   String sql="UPDATE habitacion SET Ocupada =? WHERE Numero=?";
                   PreparedStatement ps=con.prepareStatement(sql);
                   
                   ps.setBoolean(1,item.getNrohabitacion().isOcupada());
                   ps.setInt(2,item.getNrohabitacion().getNumero());
                   ps.executeUpdate();
                    
                    JOptionPane.showMessageDialog(null, "Se ha realizado el Check in en la Habitacion: "+item.getNrohabitacion().getNumero()+" exitosamente");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "Error al realizar el Check In");
               }
           }
           
            
        }
        
        if(i==0){
            JOptionPane.showMessageDialog(null, "Este Huesped no tiene reservas activas para esta fecha"); 
              jTid.setText("");
              this.dispose();
        }
    }
}
