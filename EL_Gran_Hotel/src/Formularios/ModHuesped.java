/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.huesped;
import Entidades.reserva;
import accesoAdatos.huespedData;
import accesoAdatos.reservaData;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author perey
 */
public class ModHuesped extends javax.swing.JInternalFrame {
        huespedData mod = new huespedData ();
        huesped aux= new huesped ();
        int id ;
        boolean estados;
         int est;
    /**
     * Creates new form ModHuesped
     */
    public ModHuesped() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTapeynom = new javax.swing.JTextField();
        jTdire = new javax.swing.JTextField();
        jTmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTcelu = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTestado = new javax.swing.JToggleButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Apellido y Nombre :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Domicilio :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Correo :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Celular :");

        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });

        jTapeynom.setEnabled(false);

        jTdire.setEnabled(false);

        jTmail.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Dni :");

        jTcelu.setEnabled(false);
        jTcelu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTceluKeyTyped(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Estado :");

        jTestado.setEnabled(false);
        jTestado.setHideActionText(true);
        jTestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTestadoActionPerformed(evt);
            }
        });

        jBguardar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBguardar.setText("Guardar Cambios");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Formulario de Carga de Huéspedes");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setText("Complete los datos del formulario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBguardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTmail)
                            .addComponent(jTcelu)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTapeynom)
                            .addComponent(jTdire))
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(86, 86, 86)
                                .addComponent(jTestado))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTapeynom, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdire, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTcelu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTestado)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBsalir))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
     if(!jTdni.getText().isEmpty()){
        jTapeynom.setEnabled(true);
        jTdire.setEnabled(true);
        jTmail.setEnabled(true);
        jTcelu.setEnabled(true);
        jTestado.setEnabled(true);
        int dni=Integer.parseInt(jTdni.getText());
        aux= mod.buscarporDni(dni);
       
        if(aux.isEstado()==true){
            jTestado.setText("ACTIVO");
            jTestado.setBackground(Color.GREEN);
            jTestado.setForeground(Color.BLACK);
            est =1;
        }else{
            jTestado.setText("INACTIVO");
            jTestado.setBackground(Color.RED);
            jTestado.setForeground(Color.WHITE);
            est=0;
        }

       id=aux.getIdHuesped();
        //aux.getDni();
        jTapeynom.setText(aux.getApellidoynom());
        jTdire.setText(aux.getDireccion());
        jTmail.setText(aux.getCorreo());
        jTcelu.setText(aux.getCelular());
     }else{
         JOptionPane.showMessageDialog(null,"Ingrese un Dni para comenzar la busqueda por favor");
     }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTestadoActionPerformed
    if (jTestado.getText()=="ACTIVO"){
                jTestado.setText("INACTIVO");
                jTestado.setBackground(Color.RED);
                jTestado.setForeground(Color.WHITE);
                estados=false;
                
                
            }else {
                jTestado.setText("ACTIVO");
                jTestado.setBackground(Color.GREEN);
                jTestado.setForeground(Color.BLACK);
                estados=true;
    } 
        // TODO add your handling code here:
    }//GEN-LAST:event_jTestadoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        reservaData res= new reservaData();
        if(jTdni.getText().isEmpty()||jTapeynom.getText().isEmpty()||jTdire.getText().isEmpty()||jTmail.getText().isEmpty()||jTcelu.getText().isEmpty()){
             JOptionPane.showMessageDialog(null,"No debe dejar campos vacios");
            return;
        }
         int i=0;
           ArrayList<reserva> reser= res.buscarreservaxhuesped(aux);
          for (reserva item:reser){
             
                      i ++;
          }
          
        if (i>0){
            
           JOptionPane.showMessageDialog(null,"Este Huesped tiene reservas ACTIVAS no puede cambiar su estado");
           jTdni.setText("");
            jTapeynom.setText("");
            jTdire.setText("");
            jTmail.setText("");
            jTcelu.setText("");
            jTestado.setText(""); 
            
             jTapeynom.setEnabled(false);
        jTdire.setEnabled(false);
        jTmail.setEnabled(false);
        jTcelu.setEnabled(false);
        jTestado.setEnabled(false);
        } else{
            mod.modificarhuesped(id,Integer.parseInt(jTdni.getText()), jTapeynom.getText(),jTmail.getText(),jTdire.getText(),jTcelu.getText(), estados);
             jTdni.setText("");
            jTapeynom.setText("");
            jTdire.setText("");
            jTmail.setText("");
            jTcelu.setText("");
            jTestado.setText(""); 
        jTapeynom.setEnabled(false);
        jTdire.setEnabled(false);
        jTmail.setEnabled(false);
        jTcelu.setEnabled(false);
        jTestado.setEnabled(false);

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped
 int tecla =evt.getKeyChar();
        
        boolean numeros = tecla >=48 && tecla <=57;
        if(!numeros){
            evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniKeyTyped

    private void jTceluKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTceluKeyTyped


 int tecla =evt.getKeyChar();
        
        boolean numeros = tecla >=48 && tecla <=57;
        if(!numeros){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTceluKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTapeynom;
    private javax.swing.JTextField jTcelu;
    private javax.swing.JTextField jTdire;
    private javax.swing.JTextField jTdni;
    private javax.swing.JToggleButton jTestado;
    private javax.swing.JTextField jTmail;
    // End of variables declaration//GEN-END:variables
}
