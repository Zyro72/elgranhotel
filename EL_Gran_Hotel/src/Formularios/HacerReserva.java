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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author perey
 */
public class HacerReserva extends javax.swing.JInternalFrame {
    DefaultTableModel formatoTablaTipos =new DefaultTableModel();
    DefaultTableModel formatoTablaHabs=new DefaultTableModel();
    /**
     * Creates new form HacerReserva
     */
    public HacerReserva() {
        this.formatoTablaTipos=new DefaultTableModel(){
            public boolean isCellEditable(int fila,int columna){
                return false;
            }
        };
        
        
        
        initComponents();
        inicializarTablas();
    
                
         
         
        
        
        
        
        
        
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
        jTdiaE = new javax.swing.JTextField();
        jTmesE = new javax.swing.JTextField();
        jTanoE = new javax.swing.JTextField();
        jTdiaS = new javax.swing.JTextField();
        jTmesS = new javax.swing.JTextField();
        jTanoS = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTcantPas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTtiposHabitacion = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTcantNoches = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jThabitaciones = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTimporte = new javax.swing.JTextField();
        jBconfirmarReserva = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();

        jLabel1.setText("Fecha de Entrada:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("/");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("/");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("/");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("/");

        jLabel6.setText("Fecha de Salida");

        jLabel7.setText("Ingrese Cantidad de Pasajeros");

        jTtiposHabitacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jTtiposHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTtiposHabitacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTtiposHabitacion);

        jLabel8.setText("Tipos de Habitaciones Disponibles");

        jLabel9.setText("Habitaciones disponibles");

        jLabel10.setText("Cantidad de Noches:");

        jThabitaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jThabitaciones);

        jLabel11.setText("Importe total de la estadía: $");

        jBconfirmarReserva.setText("Confirmar Reserva");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTdiaE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTmesE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTanoE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTdiaS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTmesS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTanoS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTcantNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTcantPas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBbuscar))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jBconfirmarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTdiaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTmesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTanoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTdiaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTmesS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTanoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jTcantNoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTcantPas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTimporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBconfirmarReserva)
                    .addComponent(jBSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
    int cantPas=0;
    //VALIDACION DE CANTIDAD DE PASAJEROS, MAYOR A 0, ADVERTENCIA DE MAS DE 3 Y VALIDACION DE QUE SEA NUMERO
    try{
        cantPas=Integer.parseInt(jTcantPas.getText());
        if(cantPas>3){
            JOptionPane.showMessageDialog(this,"El maximo por habitacion es 3 personas. Ingrese 3 y reserve mas habitaciones");
            jTcantPas.setText("");
            return;
        }
        if(cantPas<1){
            JOptionPane.showMessageDialog(this,"Debe ingresar un valor mayor a 0");
            jTcantPas.setText("");
            return;
        }
        
    }catch(NumberFormatException ex)   {
        JOptionPane.showMessageDialog(this,"Debe ingresar una cantidad valida");
        return;
    }
   //-----------------------------------------------------------------------------------------------
   
    //limpio la tabla
    formatoTablaTipos.setNumRows(0);
    //inicializarTablas();
    


//Relleno la tabla con los tipos de habitaciones que cumplan la condicion
      
   ArrayList<tipodehabitacion> tiposdeH=new ArrayList<>();
   tipohabitaciondata tipohData=new tipohabitaciondata();
   tiposdeH=tipohData.todoslostipos();
   
      for(tipodehabitacion tipo:tiposdeH){
       if(tipo.getCapacidad()>=cantPas){
            formatoTablaTipos.addRow(new Object[]{tipo.getCodigo(),tipo.getTipo(),tipo.getCapacidad(),tipo.getCantcamas(),tipo.getTipocamas(),tipo.getPrecio()});           
                  
       }
        
   }
   
   
   
   
   
   
        
        
        
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTtiposHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtiposHabitacionMouseClicked
    habitacionData habData=new habitacionData();
    int filaSeleccionada=jTtiposHabitacion.getSelectedRow();
    int codigo=(Integer) formatoTablaTipos.getValueAt(filaSeleccionada,0);
    ArrayList<habitacion> habitacionesTipo=new ArrayList<>();
    habitacionesTipo=habData.listarHabitacionesTipo(codigo);
    for(habitacion hab:habitacionesTipo){
        formatoTablaHabs.addRow(new Object[]{hab.getNumero(),hab.getTipohabitacion().getTipo(),hab.getPiso(),hab.isEstado()});
        
        
        
        
    }
    
    
    
    
    
            
    
    
    }//GEN-LAST:event_jTtiposHabitacionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBconfirmarReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTanoE;
    private javax.swing.JTextField jTanoS;
    private javax.swing.JTextField jTcantNoches;
    private javax.swing.JTextField jTcantPas;
    private javax.swing.JTextField jTdiaE;
    private javax.swing.JTextField jTdiaS;
    private javax.swing.JTable jThabitaciones;
    private javax.swing.JTextField jTimporte;
    private javax.swing.JTextField jTmesE;
    private javax.swing.JTextField jTmesS;
    private javax.swing.JTable jTtiposHabitacion;
    // End of variables declaration//GEN-END:variables

 public void inicializarTablas(){
        //Tabla de tipos de habitaciones
        formatoTablaTipos.addColumn("Codigo");
        formatoTablaTipos.addColumn("Tipo de Habitacion");
        formatoTablaTipos.addColumn("Capacidad");
        formatoTablaTipos.addColumn("Cantidad de Camas");
        formatoTablaTipos.addColumn("Tipo de camas");
        formatoTablaTipos.addColumn("Precio por noche");
        
        
        
        //Tabla que va a mostrar las habitaciones disponibles
        
        formatoTablaHabs.addColumn("Numero");
        formatoTablaHabs.addColumn("Tipo");
        formatoTablaHabs.addColumn("Piso");
        formatoTablaHabs.addColumn("Estado");
        
        jTtiposHabitacion.setModel(formatoTablaTipos);
        jThabitaciones.setModel(formatoTablaHabs);
        
        
     /*   ArrayList<tipodehabitacion> tiposH=new ArrayList<>();
        tipohabitaciondata tipohdata=new tipohabitaciondata();
        tiposH=tipohdata.todoslostipos();
        for (tipodehabitacion tipo:tiposH){
            formatoTabla.addRow(new Object[]{tipo.getCodigo(),tipo.getTipo(),tipo.getCapacidad(),tipo.getCantcamas(),tipo.getTipocamas(),tipo.getPrecio()});
            

    */




}
}