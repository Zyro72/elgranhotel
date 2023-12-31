/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.habitacion;
import Entidades.tipodehabitacion;
import accesoAdatos.habitacionData;
import accesoAdatos.tipohabitaciondata;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author perey
 */
public class AltaHab extends javax.swing.JInternalFrame {
    DefaultTableModel formatoTabla=new DefaultTableModel();
    boolean estadoh;
          
    /**
     * Creates new form AltaHab
     */
    public AltaHab() {
        initComponents();
        inicializarTabla();
        jTBestadoh.setText("ACTIVA");
        estadoh=true;
        jTBestadoh.setBackground(Color.GREEN);
        jTBestadoh.setForeground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTnumeroh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTpiso = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablatiposh = new javax.swing.JTable();
        jTBestadoh = new javax.swing.JToggleButton();
        jBsalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Numero de Habitación:");

        jTnumeroh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnumerohKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Elija el Tipo de Habitación");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Piso:");

        jTpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTpisoKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTablatiposh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablatiposh.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTablatiposh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTablatiposh);

        jTBestadoh.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jTBestadoh.setText("ACTIVA");
        jTBestadoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBestadohActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Formulario de Carga de Habitaciones");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setText("Complete los datos del formulario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTBestadoh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(364, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTnumeroh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTnumeroh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTBestadoh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTBestadohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBestadohActionPerformed
            if (jTBestadoh.isSelected()){
                jTBestadoh.setText("INACTIVA");
                jTBestadoh.setBackground(Color.RED);
                jTBestadoh.setForeground(Color.WHITE);
                estadoh=false;
                
                
            }else {
                jTBestadoh.setText("ACTIVA");
                jTBestadoh.setBackground(Color.GREEN);
                jTBestadoh.setForeground(Color.BLACK);
                estadoh=true;
            }
    }//GEN-LAST:event_jTBestadohActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Guardo en variables todos los datos primero
        boolean verificoNum;
        String hab=jTnumeroh.getText();
        String pis=jTpiso.getText();
        
        
        if(hab.isEmpty()||pis.isEmpty()){
            JOptionPane.showMessageDialog(this,"Por favor complete el formulario");
            return;
        }
        int filaSeleccionada=jTablatiposh.getSelectedRow();
        if (filaSeleccionada<0){
            JOptionPane.showMessageDialog(this,"Por favor, debe elegir el Tipo de Habitación");
            return;
        }
        
        int numH=Integer.parseInt(jTnumeroh.getText());
        tipodehabitacion tipoH=new tipodehabitacion();
        habitacion habi=new habitacion();
        habitacionData habData=new habitacionData();
        verificoNum=habData.verificarNumeroHab(numH);
        if(verificoNum==true){
            JOptionPane.showMessageDialog(this,"Ese número de Habitacion YA EXISTE");
            return;
        }
        int pisoH=Integer.parseInt(jTpiso.getText());
        if(pisoH>10){
            JOptionPane.showMessageDialog(this,"Nuestro Hotel solo tiene 10 Pisos, revise el valor ingresado");
            return;
        }
        int filaseleccionada=jTablatiposh.getSelectedRow();
        int codigoThab=(Integer) jTablatiposh.getValueAt(filaseleccionada, 0);
        String tipoThab=(String) jTablatiposh.getValueAt(filaseleccionada,1);
        int capaThab=(Integer) jTablatiposh.getValueAt(filaseleccionada,2);
        int cantCamaThab=(Integer) jTablatiposh.getValueAt(filaseleccionada,3);
        String tipoCamaThab=(String) jTablatiposh.getValueAt(filaseleccionada,4);
        double precioThab=(Double) jTablatiposh.getValueAt(filaseleccionada,5);
        tipoH.setCodigo(codigoThab);
        tipoH.setTipo(tipoThab);
        tipoH.setCapacidad(capaThab);
        tipoH.setCantcamas(cantCamaThab);
        tipoH.setTipocamas(tipoCamaThab);
        tipoH.setPrecio(precioThab);
        
        habi.setNumero(numH);
        habi.setTipohabitacion(tipoH);
        habi.setPiso(pisoH);
        habi.setEstado(estadoh);
        limpioform();
        habData.guardarHabitacion(habi);
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
     this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jTnumerohKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnumerohKeyReleased
        try{
        int tecla=Integer.parseInt(jTnumeroh.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Sólo puede ingresar números");
            jTnumeroh.setText("");
            return;
        }
    }//GEN-LAST:event_jTnumerohKeyReleased

    private void jTpisoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpisoKeyReleased
try{
        int tecla=Integer.parseInt(jTpiso.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Sólo puede ingresar números");
            jTpiso.setText("");
            return;
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTpisoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBestadoh;
    private javax.swing.JTable jTablatiposh;
    private javax.swing.JTextField jTnumeroh;
    private javax.swing.JTextField jTpiso;
    // End of variables declaration//GEN-END:variables
    
    public void inicializarTabla(){
        formatoTabla.addColumn("Codigo");
        formatoTabla.addColumn("Tipo de Habitacion");
        formatoTabla.addColumn("Capacidad");
        formatoTabla.addColumn("Cantidad de Camas");
        formatoTabla.addColumn("Tipo de camas");
        formatoTabla.addColumn("Precio por noche");
        ArrayList<tipodehabitacion> tiposH=new ArrayList<>();
        tipohabitaciondata tipohdata=new tipohabitaciondata();
        tiposH=tipohdata.todoslostipos();
        for (tipodehabitacion tipo:tiposH){
            formatoTabla.addRow(new Object[]{tipo.getCodigo(),tipo.getTipo(),tipo.getCapacidad(),tipo.getCantcamas(),tipo.getTipocamas(),tipo.getPrecio()});
            
        }
        
        jTablatiposh.setModel(formatoTabla);
         jTablatiposh.setRowSelectionInterval(0,0);
        
        
        
        
        
    }

public void limpioform(){
    jTnumeroh.setText("");
    jTpiso.setText("");
    jTablatiposh.setRowSelectionInterval(0,0);
    
    
    
    
}



}
