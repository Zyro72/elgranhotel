/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Entidades.habitacion;
import Entidades.huesped;
import Entidades.reserva;
import Entidades.tipodehabitacion;
import accesoAdatos.habitacionData;
import accesoAdatos.huespedData;
import accesoAdatos.reservaData;
import accesoAdatos.tipohabitaciondata;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
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
    DefaultTableModel formatoTablaHuesped=new DefaultTableModel();
    LocalDate fechaIng;
    LocalDate fechaSal;
    huespedData huesData=new huespedData();
    tipohabitaciondata tipohData=new tipohabitaciondata();
    habitacionData habData=new habitacionData();
    reservaData resData=new reservaData();
    tipodehabitacion tipoHreserva=new tipodehabitacion();
    habitacion habitReserva=new habitacion();
    huesped huespedReserva=new huesped();
    reserva nuevaReserva=new reserva();
    int idHues;
    double importe;
    boolean estadoHuesped;
    /**
     * Creates new form HacerReserva
     */
    public HacerReserva() {
        this.formatoTablaTipos=new DefaultTableModel(){
            public boolean isCellEditable(int fila,int columna){
                return false;
            }
        };
        this.formatoTablaHabs=new DefaultTableModel(){
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
        jBvalidar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTdniHuesped = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaHuesped = new javax.swing.JTable();
        jBverificarHuesped = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Fecha de Entrada:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("/");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("/");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("/");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("/");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Salida");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setText("Ingrese Cantidad de Huéspedes");

        jTcantPas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTcantPasKeyReleased(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel8.setText("Elija el tipo de habitacion deseada");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel9.setText("Elija la habtacion deseada y haga click en confimar Reserva");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Cantidad de Noches:");

        jTcantNoches.setEditable(false);

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
        jThabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jThabitacionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jThabitaciones);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Importe total de la estadía: $");

        jTimporte.setEditable(false);

        jBconfirmarReserva.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBconfirmarReserva.setText("Confirmar Reserva");
        jBconfirmarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconfirmarReservaActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBbuscar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBvalidar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBvalidar.setText("Valida Fechas");
        jBvalidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvalidarActionPerformed(evt);
            }
        });

        jLabel12.setText("  dd        mm          aaaa");

        jLabel13.setText("  dd        mm          aaaa");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel15.setText("DNI del Huesped:");

        jTdniHuesped.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdniHuespedKeyReleased(evt);
            }
        });

        jTablaHuesped.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaHuesped.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane3.setViewportView(jTablaHuesped);

        jBverificarHuesped.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jBverificarHuesped.setText("Verificar Huesped");
        jBverificarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverificarHuespedActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel16.setText("Datos del Huesped");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTdiaE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTmesE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTanoE, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTdiaS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTmesS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTanoS, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBvalidar)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTcantNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 122, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBconfirmarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                                .addGap(412, 412, 412)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTdniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBverificarHuesped))
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jTcantPas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBbuscar))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTcantNoches, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTdiaE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTmesE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTanoE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTdiaS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTmesS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTanoS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jBvalidar)
                        .addComponent(jLabel10)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jBverificarHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jTdniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTcantPas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTimporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBconfirmarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
   tiposdeH=tipohData.todoslostipos();
   
      for(tipodehabitacion tipo:tiposdeH){
       if(tipo.getCapacidad()>=cantPas){
            formatoTablaTipos.addRow(new Object[]{tipo.getCodigo(),tipo.getTipo(),tipo.getCapacidad(),tipo.getCantcamas(),tipo.getTipocamas(),tipo.getPrecio()});           
                  
       }
        
   }
   
   
   
   
   
   
        
        
        
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTtiposHabitacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTtiposHabitacionMouseClicked
    formatoTablaHabs.setNumRows(0);
    
    boolean verifico;
    int filaSeleccionada=jTtiposHabitacion.getSelectedRow();
    int codigo=(Integer) formatoTablaTipos.getValueAt(filaSeleccionada,0);
        
    
    importe=(Double) formatoTablaTipos.getValueAt(filaSeleccionada,5);
    try{
    importe=importe*Integer.parseInt(jTcantNoches.getText());
    jTimporte.setText(String.valueOf(importe));
    
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Debe completar las fechas primnero");
        return;
    }
    
    ArrayList<habitacion> habitacionesTipo=new ArrayList<>();
    habitacionesTipo=habData.listarHabitacionesTipo(codigo);
    
    for(habitacion hab:habitacionesTipo){
        //Busco las habitaciones en la BD de reserva para ver si estan ocupada en esa fecha
        verifico=resData.verificarDisponible(hab.getNumero(),fechaIng);
        if(verifico==false){
            //verifico el estado de la habitacion y no agrego si esta en False
            boolean estadoHabit=hab.isEstado();
            if(estadoHabit==true){
        formatoTablaHabs.addRow(new Object[]{hab.getNumero(),hab.getTipohabitacion().getTipo(),hab.getPiso()});
        }
       
    }
    
    }//GEN-LAST:event_jTtiposHabitacionMouseClicked
    }
    private void jBvalidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvalidarActionPerformed
   
    
    LocalDate fechaActual=LocalDate.now();
    try{
        int diaE=Integer.parseInt(jTdiaE.getText());
        int mesE=Integer.parseInt(jTmesE.getText());
        int anoE=Integer.parseInt(jTanoE.getText());
        
        int diaS=Integer.parseInt(jTdiaS.getText());
        int mesS=Integer.parseInt(jTmesS.getText());
        int anoS=Integer.parseInt(jTanoS.getText());
        fechaIng= LocalDate.of(anoE, mesE, diaE);
        fechaSal= LocalDate.of(anoS,mesS, diaS);
        int validoInicio=(int) ChronoUnit.DAYS.between(fechaActual, fechaIng);
        if (validoInicio<0){
            JOptionPane.showMessageDialog(this,"La fecha de inicio no puede ser anterior a la fecha actual");
            return;
                    
            
        }
        
        int diasEstadia=(int) ChronoUnit.DAYS.between(fechaIng, fechaSal);
        if (diasEstadia<=0){
            JOptionPane.showMessageDialog(this,"La fecha de salida no puede ser anterior o igual a la fecha de entrada");
            return;
        }
        
        
        jTcantNoches.setText(String.valueOf(diasEstadia));
        
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this, "Por favor, ingrese numeros validos para Dia, Mes, y Año");
    }
     catch(DateTimeParseException e){
         JOptionPane.showMessageDialog(this,"Por favor, ingrese valores válidos para Dia, Mes y Año");
     }
     catch(DateTimeException x){
         JOptionPane.showMessageDialog(this,"Por favor, ingrese valores válidos para Dia, Mes y Año");
     }
    
        
    
    
        
        
    }//GEN-LAST:event_jBvalidarActionPerformed

    private void jThabitacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jThabitacionesMouseClicked
        int filaSeleccionada=jThabitaciones.getSelectedRow();
        int numeroBuscar=(Integer) formatoTablaHabs.getValueAt(filaSeleccionada,0);
        habitReserva=habData.buscarHabitacion(numeroBuscar);
        
        
        
        
        
    }//GEN-LAST:event_jThabitacionesMouseClicked

    private void jBconfirmarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconfirmarReservaActionPerformed
    
    //Validaciones Varias    
    String cnoches=jTcantNoches.getText();
    String cpasajeros=jTcantPas.getText();
    String dniHuesped=jTdniHuesped.getText();
    
    if (cnoches.isEmpty()){
        JOptionPane.showMessageDialog(this,"Por favor, complete y verifique las fechas");
        return;
    }
    if (dniHuesped.isEmpty()){
        JOptionPane.showMessageDialog(this,"Por favor, complete el formulario (Introducir el DNI del huésped)");
        return;
    }
    if (cpasajeros.isEmpty()){
        JOptionPane.showMessageDialog(this,"Por favor, complete el formulario (Introducir cantidad de huéspedes");
        return;
    }
    int filaSeleccionadaThab=jTtiposHabitacion.getSelectedRow();
    if(filaSeleccionadaThab<0){
        JOptionPane.showMessageDialog(this,"Por favor, complete el formulario (Elegir Tipo de habitacion y habitacion)");
        return;
    }
    int filaSeleccionadaHabs=jThabitaciones.getSelectedRow();
    if(filaSeleccionadaHabs<0){
        JOptionPane.showMessageDialog(this,"Por favor, complete el formulario (Elegir la habitacion deseada");
    }
    
    
    
    
    if(estadoHuesped==false){
        int respuesta=JOptionPane.showConfirmDialog(this,"RECUERDE...El Huesped elegido esta INACTIVO, desea reactivarlo? ", "ADVERTENCIA",JOptionPane.YES_NO_OPTION );
            if (respuesta==JOptionPane.YES_OPTION){
                huesData.reactivarHuesped(huespedReserva.getIdHuesped());
                formatoTablaHuesped.setRowCount(0);
                formatoTablaHuesped.addRow(new Object[]{huespedReserva.getApellidoynom(),huespedReserva.getDireccion(),huespedReserva.getCorreo(),huespedReserva.getCelular(),"REACTIVADO"});
                
            }else {
                JOptionPane.showMessageDialog(this,"El huesped continuará inactivo, no se puede guardar la reserva...");
                return;
            }
   }
    
    nuevaReserva.setNrohabitacion(habitReserva);
    nuevaReserva.setIdHuesped(huespedReserva);
    nuevaReserva.setFechaEntrada(fechaIng);
    nuevaReserva.setFechaSalida(fechaSal);
    nuevaReserva.setImporteTotal(importe);
    nuevaReserva.setEstado(true);
    
   resData.guardarReserva(nuevaReserva);
   limpioform();
   
         
   
     
        
    }//GEN-LAST:event_jBconfirmarReservaActionPerformed

    private void jBverificarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverificarHuespedActionPerformed
    String huesped=jTdniHuesped.getText();
    if(huesped.isEmpty()){
        JOptionPane.showMessageDialog(this,"Por favor, ingrese un DNI....");
        return;
    }
    int dniHuesped=0;
    String palabraEstadoHuesped;
        try{
        dniHuesped=Integer.parseInt(jTdniHuesped.getText());
           
    }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"Ingrese un Dni Válido");
    }
   try{
        huespedReserva=huesData.buscarporDni(dniHuesped);
        estadoHuesped=huespedReserva.isEstado();
        idHues=huespedReserva.getIdHuesped();
        if(estadoHuesped==false){
        int respuesta=JOptionPane.showConfirmDialog(this,"El Huesped elegido esta INACTIVO, desea reactivarlo? ", "ADVERTENCIA",JOptionPane.YES_NO_OPTION );
            if (respuesta==JOptionPane.YES_OPTION){
                huesData.reactivarHuesped(idHues);
                palabraEstadoHuesped="ACTIVO";
                estadoHuesped=true;
                
            }else {
                JOptionPane.showMessageDialog(this,"No se han realizado cambios, podrá continuar pero no podrá guardar la reserva");
                palabraEstadoHuesped="INACTIVO";
                //return;
            }
            
            
            
                   
        }else {
        palabraEstadoHuesped="ACTIVO";
        }
   }catch(NullPointerException ex){
       return;
   }
    
    
    formatoTablaHuesped.addRow(new Object[]{huespedReserva.getApellidoynom(),huespedReserva.getDireccion(),huespedReserva.getCorreo(),huespedReserva.getCelular(),palabraEstadoHuesped});
    
        
        
        
    }//GEN-LAST:event_jBverificarHuespedActionPerformed

    private void jTdniHuespedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniHuespedKeyReleased
try {
    int dniH=Integer.parseInt(jTdniHuesped.getText());
    }//GEN-LAST:event_jTdniHuespedKeyReleased
catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(this,"Solo puede ingresar números");
    jTdniHuesped.setText("");
    return;
}
    }
    private void jTcantPasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcantPasKeyReleased
     try{
         int pas=Integer.parseInt(jTcantPas.getText());
     }
     catch(NumberFormatException ex){
         JOptionPane.showMessageDialog(this,"Solo puede ingresar números");
         jTcantPas.setText("");
         return;
        
    }//GEN-LAST:event_jTcantPasKeyReleased
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBconfirmarReserva;
    private javax.swing.JButton jBvalidar;
    private javax.swing.JButton jBverificarHuesped;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablaHuesped;
    private javax.swing.JTextField jTanoE;
    private javax.swing.JTextField jTanoS;
    private javax.swing.JTextField jTcantNoches;
    private javax.swing.JTextField jTcantPas;
    private javax.swing.JTextField jTdiaE;
    private javax.swing.JTextField jTdiaS;
    private javax.swing.JTextField jTdniHuesped;
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
        //formatoTablaHabs.addColumn("Estado");
        
        //Tabla que muestra datos del huesped
        formatoTablaHuesped.addColumn("Apellido y Nombre");
        formatoTablaHuesped.addColumn("Direccion");
        formatoTablaHuesped.addColumn("Correo");
        formatoTablaHuesped.addColumn("Celular");
        formatoTablaHuesped.addColumn("Estado");
        
        
        
        jTtiposHabitacion.setModel(formatoTablaTipos);
        jThabitaciones.setModel(formatoTablaHabs);
        jTablaHuesped.setModel(formatoTablaHuesped);
     
}
 public void limpioform(){
 jTdiaE.setText("");
 jTmesE.setText("");
 jTanoE.setText("");
 jTdiaS.setText("");
 jTmesS.setText("");
 jTanoS.setText("");
 jTcantNoches.setText("");
 jTcantPas.setText("");
 jTdniHuesped.setText("");
 jTimporte.setText("");
 formatoTablaHuesped.setRowCount(0);
 formatoTablaTipos.setRowCount(0);
 formatoTablaHabs.setRowCount(0);
 
 
 }
 
}