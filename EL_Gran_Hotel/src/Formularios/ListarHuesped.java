/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.huesped;
import accesoAdatos.huespedData;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author perey
 */
public class ListarHuesped extends javax.swing.JInternalFrame {
    huespedData lista= new huespedData();
    DefaultTableModel formatoTabla=new DefaultTableModel();
    huesped listado= new huesped();
    
    /**
     * Creates new form ListarHuesped
     */
    public ListarHuesped() {
        initComponents();
        
        this.formatoTabla=new DefaultTableModel(){
            public boolean isCellEditable(int fila,int columna){
                return false;
            }
        };
        
        inicializarTabla();
         cargarTabla();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTLHuesped = new javax.swing.JTable();
        jBsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTLHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTLHuesped);

        jBsalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese DNI para buscar:");

        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTdniKeyTyped(evt);
            }
        });

        jBuscar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Listado de Huéspedes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed

            this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTdniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyPressed
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniKeyPressed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed

    limpiarT();
    String aux= jTdni.getText();
    if (aux.isEmpty()){
        cargarTabla();
    } else {
        
        listado=lista.buscarporDni(Integer.parseInt(jTdni.getText()));
        if(listado.getApellidoynom()==""){
            cargarTabla();
                jTdni.setText("");  
            
        }else{
          formatoTabla.addRow(new Object[]{listado.getDni(),listado.getApellidoynom(),listado.getDireccion(),listado.getCorreo(),listado.getCelular()});
        
        jTdni.setText("");
        }
        
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jTdniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyTyped

 int tecla =evt.getKeyChar();
        
        boolean numeros = tecla >=48 && tecla <=57;
        if(!numeros){
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdniKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTLHuesped;
    private javax.swing.JTextField jTdni;
    // End of variables declaration//GEN-END:variables

    public void inicializarTabla(){
       
        formatoTabla.addColumn("Dni");
        formatoTabla.addColumn("Apellido y Nombre");
        formatoTabla.addColumn("Domicilio");
        formatoTabla.addColumn("Correo");
        formatoTabla.addColumn("Celular");
        
        jTLHuesped.setModel(formatoTabla);
}
    
    public void cargarTabla(){
      ArrayList<huesped> listar=new ArrayList<>();
      listar=(ArrayList)lista.listarhuesped();
      for (huesped item:listar){
          formatoTabla.addRow(new Object[]{item.getDni(),item.getApellidoynom(),item.getDireccion(),item.getCorreo(),item.getCelular()});
      }
        
        
    }
    private void limpiarT(){
          int ind= formatoTabla.getRowCount()-1;
          for (int x=ind ;x>=0;x--){
             formatoTabla.removeRow(x);
          }
    }
}
