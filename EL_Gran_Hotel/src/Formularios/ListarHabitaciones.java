/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.habitacion;
import accesoAdatos.habitacionData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author perey
 */
public class ListarHabitaciones extends javax.swing.JInternalFrame {
    DefaultTableModel formatoHabitacionesComp=new DefaultTableModel();
    habitacionData habData=new habitacionData();
    String estadoPalabra;
    String ocupadaPalabra;
    boolean estadoH;
    boolean ocupadaH;
        /**
     * Creates new form ListarHabitaciones
     */
    public ListarHabitaciones() {
        this.formatoHabitacionesComp=new DefaultTableModel(){
            public boolean isCellEditable(int fila,int columna){
                return false;
            }
        };
        
        initComponents();
        inicializoTabla();
        cargoDatos();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jBsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaHabitaciones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTnumeroH = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado completo de Habitaciones");

        jBsalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jTablaHabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablaHabitaciones);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese número de habitacion:");

        jTnumeroH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTnumeroHKeyReleased(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTnumeroH, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTnumeroH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
    this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String textoHab=jTnumeroH.getText();
    if (textoHab.isEmpty()){
        cargoDatos();
        return;
    }
        
    int numeroHabitacion;
    try{
        numeroHabitacion=Integer.parseInt(jTnumeroH.getText());
        
    }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"Por favor, ingrese un numero válido");
        return;
    }
    if(numeroHabitacion<=0){
        JOptionPane.showMessageDialog(this,"Por favor, ingrese un número de habitación válido");
        return;
    }
    try{
        buscoHab(numeroHabitacion);
    }catch (NullPointerException ex){
        return;
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTnumeroHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnumeroHKeyReleased
try{
    int nro=Integer.parseInt(jTnumeroH.getText());
}
catch (NumberFormatException ex){
    JOptionPane.showMessageDialog(this,"Solo puede ingresar números");
    jTnumeroH.setText("");
    return;
}


    }//GEN-LAST:event_jTnumeroHKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaHabitaciones;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTnumeroH;
    // End of variables declaration//GEN-END:variables

public void inicializoTabla(){
    formatoHabitacionesComp.addColumn("Activa (SI/NO)");
    formatoHabitacionesComp.addColumn("Ocupada(SI/NO)");
    formatoHabitacionesComp.addColumn("Numero");
    formatoHabitacionesComp.addColumn("Piso");
    formatoHabitacionesComp.addColumn("Tipo");
    formatoHabitacionesComp.addColumn("Capacidad");
    formatoHabitacionesComp.addColumn("Cantidad Camas");
    formatoHabitacionesComp.addColumn("Tipo de camas");
    formatoHabitacionesComp.addColumn("Precio");
    jTablaHabitaciones.setModel(formatoHabitacionesComp);
    
}
public void cargoDatos(){
    formatoHabitacionesComp.setRowCount(0);
    ArrayList<habitacion> ListadoCompleto=new ArrayList<>();
    ListadoCompleto=habData.listarHabitacion();
    for(habitacion hab:ListadoCompleto){
        estadoH=hab.isEstado();
        ocupadaH=hab.isOcupada();
        if(estadoH==true){
            estadoPalabra="SI";
            
        }else {
            estadoPalabra="NO";
        }
        if(ocupadaH==true){
            ocupadaPalabra="SI";
        }else {
            ocupadaPalabra="NO";
        }
        formatoHabitacionesComp.addRow(new Object[]{estadoPalabra,ocupadaPalabra,hab.getNumero(),hab.getPiso(),hab.getTipohabitacion().getTipo(),hab.getTipohabitacion().getCapacidad(),hab.getTipohabitacion().getCantcamas(),hab.getTipohabitacion().getTipocamas(),hab.getTipohabitacion().getPrecio()});
        
        
        
    }
}
public void buscoHab(int numeroHab){
    habitacion habi=new habitacion();
    habi=habData.buscarHabitacion(numeroHab);
    if(habi==null){
       return;
    }
    
    formatoHabitacionesComp.setRowCount(0);
    estadoH=habi.isEstado();
    ocupadaH=habi.isOcupada();
    if(estadoH==true){
        estadoPalabra="SI";
    }
    else {
        estadoPalabra="NO";
    }
    if(ocupadaH==true){
        ocupadaPalabra="SI";
    }else { 
        ocupadaPalabra="NO";
        
    }
        
    formatoHabitacionesComp.addRow(new Object[]{estadoPalabra,ocupadaPalabra,habi.getNumero(),habi.getPiso(),habi.getTipohabitacion().getTipo(),habi.getTipohabitacion().getCapacidad(),habi.getTipohabitacion().getCantcamas(),habi.getTipohabitacion().getTipocamas(),habi.getTipohabitacion().getPrecio()});
    
    
}    
    
}




