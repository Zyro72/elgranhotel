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
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author perey
 */
public class Precios extends javax.swing.JInternalFrame {
    DefaultTableModel formatoTabla=new DefaultTableModel();
    boolean estadoh;
          
    /**
     * Creates new form AltaHab
     */
    public Precios() {
        this.formatoTabla = new DefaultTableModel(){
            public boolean isCellEditable(int fila, int columna){
                return false;
         }
        
        };
        
        
        
        initComponents();
        inicializarTabla();
                              
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablatiposh = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("Tipo de Habitacion");

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
        jTablatiposh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablatiposhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablatiposh);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel1.setText("Haga *Click sobre el tipo de habitación que desee para cambiar su precio");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(160, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(237, 237, 237))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jTablatiposhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablatiposhMouseClicked
        int filaSeleccionada=jTablatiposh.getSelectedRow();
        double nuevoPrecio=0;
        String pregunta=JOptionPane.showInputDialog("Ingrese el nuevo precio de este tipo de habitacion");
        if (pregunta==null){
            JOptionPane.showMessageDialog(this,"No se han realizado cambios");
            return;
        }
        try{
            nuevoPrecio=Double.parseDouble(pregunta);
            
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this,"No se han realizado cambios");
            return;
        }
        catch(NumberFormatException er){
            JOptionPane.showMessageDialog(this,"Debe ingresar un precio válido");
            return;
        }
        tipohabitaciondata tipohData=new tipohabitaciondata();
        tipodehabitacion tipoH=new tipodehabitacion();
        int codigoThab=(Integer) jTablatiposh.getValueAt(filaSeleccionada, 0);
        String tipoThab=(String) jTablatiposh.getValueAt(filaSeleccionada,1);
        int capaThab=(Integer) jTablatiposh.getValueAt(filaSeleccionada,2);
        int cantCamaThab=(Integer) jTablatiposh.getValueAt(filaSeleccionada,3);
        String tipoCamaThab=(String) jTablatiposh.getValueAt(filaSeleccionada,4);
        double precioThab=nuevoPrecio;
        tipoH.setCodigo(codigoThab);
        tipoH.setTipo(tipoThab);
        tipoH.setCapacidad(capaThab);
        tipoH.setCantcamas(cantCamaThab);
        tipoH.setTipocamas(tipoCamaThab);
        tipoH.setPrecio(precioThab);
        tipohData.modificarPrecios(tipoH);
        formatoTabla.setValueAt(nuevoPrecio,filaSeleccionada ,5);
        
        
        
        
    }//GEN-LAST:event_jTablatiposhMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablatiposh;
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