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

        jLabel1.setText("Numero de Habitacion");

        jLabel2.setText("Tipo de Habitacion");

        jLabel3.setText("Piso:");

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

        jTBestadoh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTBestadoh.setText("ACTIVA");
        jTBestadoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBestadohActionPerformed(evt);
            }
        });

        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTpiso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(jTnumeroh, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTBestadoh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnumeroh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBestadoh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jBsalir))
                .addGap(174, 174, 174))
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
        int numH=Integer.parseInt(jTnumeroh.getText());
        tipodehabitacion tipoH=new tipodehabitacion();
        habitacion habi=new habitacion();
        habitacionData habData=new habitacionData();
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
        int pisoH=Integer.parseInt(jTpiso.getText());
        habi.setNumero(numH);
        habi.setTipohabitacion(tipoH);
        habi.setPiso(pisoH);
        habi.setEstado(estadoh);
        System.out.println("Estado habitacion "+estadoh);
        habData.guardarHabitacion(habi);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
     this.dispose();
    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
        
        
        
        
        
    }





}
