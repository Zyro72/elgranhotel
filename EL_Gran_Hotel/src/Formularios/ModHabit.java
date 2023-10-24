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
public class ModHabit extends javax.swing.JInternalFrame {
    DefaultTableModel formatoTabla=new DefaultTableModel();
    boolean estadoh;
          
    /**
     * Creates new form AltaHab
     */
    public ModHabit() {
        initComponents();
        inicializarTabla();
        jTBestadoh.setEnabled(false);
                       
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
        jBGuardarCambios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablatiposh = new javax.swing.JTable();
        jBbuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTBestadoh = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Numero de Habitacion");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Tipo de Habitacion");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Piso:");

        jBGuardarCambios.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBGuardarCambios.setText("Guardar Cambios");
        jBGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarCambiosActionPerformed(evt);
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

        jBbuscar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jTBestadoh.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTBestadoh.setText("ACTIVA");
        jTBestadoh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBestadohActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Formulario Modificacion de Habitaciones");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setText("Complete los datos del formulario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(127, 127, 127)
                                                .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTnumeroh, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jBGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 15, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTBestadoh, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTnumeroh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTpiso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTBestadoh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarCambiosActionPerformed
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
        if(estadoh==false){
            int respuesta=JOptionPane.showConfirmDialog(this,"Se dará de baja la habitacion "+habi.getNumero() + " esta seguro?", "ADVERTENCIA",JOptionPane.YES_NO_OPTION );
            if (respuesta==JOptionPane.YES_OPTION){
                habData.modificarHabitacion(habi);
                
            }else {
                JOptionPane.showMessageDialog(this,"No se han realizado cambios");
            }
                       
        }else {
            habData.modificarHabitacion(habi);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jBGuardarCambiosActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
    jTBestadoh.setEnabled(true);
    int numeroBuscar= Integer.parseInt(jTnumeroh.getText());
    habitacionData habdata=new habitacionData();
    habitacion habit=new habitacion();
    habit=habdata.buscarHabitacion(numeroBuscar);
    estadoh=habit.isEstado();
    if (estadoh==true){
        jTBestadoh.setBackground(Color.GREEN);
        jTBestadoh.setForeground(Color.BLACK);
        jTBestadoh.setText("ACTIVA");
        
        
    }else {
        jTBestadoh.setBackground(Color.RED);
        jTBestadoh.setForeground(Color.WHITE);
        jTBestadoh.setText("INACTIVA");
        
    }
    jTpiso.setText(Integer.toString(habit.getPiso()));
    tipodehabitacion tipoH=new tipodehabitacion();
    tipoH=habit.getTipohabitacion();
    int filaTipo=(tipoH.getCodigo()-1);
    jTablatiposh.setRowSelectionInterval(filaTipo,filaTipo);
    
    
    
    
    
    
    
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTBestadohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBestadohActionPerformed
        
        if (estadoh==true){
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
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardarCambios;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
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
        
        
        
        
        
    }





}
