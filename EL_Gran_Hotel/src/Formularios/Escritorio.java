/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author perey
 */
public class Escritorio extends javax.swing.JFrame {

    /**
     * Creates new form Escritorio
     */
    public Escritorio() {
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMaltahuesped = new javax.swing.JMenuItem();
        jMbajahuesped = new javax.swing.JMenuItem();
        jMmodhuesped = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMaltahab = new javax.swing.JMenuItem();
        jMmodhab = new javax.swing.JMenuItem();
        jMpreciohab = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMcrearreserva = new javax.swing.JMenuItem();
        jMbuscarres = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMLhuesped = new javax.swing.JMenuItem();
        jMListarH = new javax.swing.JMenuItem();
        jMenuListarOcu = new javax.swing.JMenuItem();
        jMListarReservas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        jMenu2.setText("Huespedes");

        jMaltahuesped.setText("Alta");
        jMaltahuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaltahuespedActionPerformed(evt);
            }
        });
        jMenu2.add(jMaltahuesped);

        jMbajahuesped.setText("Baja");
        jMbajahuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbajahuespedActionPerformed(evt);
            }
        });
        jMenu2.add(jMbajahuesped);

        jMmodhuesped.setText("Modificacion");
        jMmodhuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmodhuespedActionPerformed(evt);
            }
        });
        jMenu2.add(jMmodhuesped);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Habitaciones");

        jMaltahab.setText("Alta");
        jMaltahab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaltahabActionPerformed(evt);
            }
        });
        jMenu1.add(jMaltahab);

        jMmodhab.setText("Modificar/Baja");
        jMmodhab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmodhabActionPerformed(evt);
            }
        });
        jMenu1.add(jMmodhab);

        jMpreciohab.setText("Ver/Cambiar Precios");
        jMpreciohab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMpreciohabActionPerformed(evt);
            }
        });
        jMenu1.add(jMpreciohab);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Reservas");

        jMcrearreserva.setText("Cargar Reserva");
        jMcrearreserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMcrearreservaActionPerformed(evt);
            }
        });
        jMenu3.add(jMcrearreserva);

        jMbuscarres.setText("Buscar Reserva");
        jMbuscarres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbuscarresActionPerformed(evt);
            }
        });
        jMenu3.add(jMbuscarres);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jMLhuesped.setText("Listar Huesped");
        jMLhuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMLhuespedActionPerformed(evt);
            }
        });
        jMenu4.add(jMLhuesped);

        jMListarH.setText("Listar Habitaciones");
        jMListarH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarHActionPerformed(evt);
            }
        });
        jMenu4.add(jMListarH);

        jMenuListarOcu.setText("Listar Habitaciones Ocupadas");
        jMenuListarOcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarOcuActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuListarOcu);

        jMListarReservas.setText("Listar Reservas");
        jMListarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListarReservasActionPerformed(evt);
            }
        });
        jMenu4.add(jMListarReservas);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMbajahuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbajahuespedActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BajaHuesped bajahuesped = new BajaHuesped();
        bajahuesped.setVisible(true);
        escritorio.add(bajahuesped);
        escritorio.moveToFront(bajahuesped);  
        // TODO add your handling code here:
    }//GEN-LAST:event_jMbajahuespedActionPerformed

    private void jMmodhuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmodhuespedActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModHuesped modhuesped = new ModHuesped();
        modhuesped.setVisible(true);
        escritorio.add(modhuesped);
        escritorio.moveToFront(modhuesped);  

        // TODO add your handling code here:
    }//GEN-LAST:event_jMmodhuespedActionPerformed

    private void jMaltahuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaltahuespedActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AltaHuesped altahuesped = new AltaHuesped();
        altahuesped.setVisible(true);
        escritorio.add(altahuesped);
        escritorio.moveToFront(altahuesped);  

        // TODO add your handling code here:
    }//GEN-LAST:event_jMaltahuespedActionPerformed

    private void jMaltahabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaltahabActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        AltaHab altaHabitaciones = new AltaHab();
        altaHabitaciones.setVisible(true);
        escritorio.add(altaHabitaciones);
        escritorio.moveToFront(altaHabitaciones);
        // TODO add your handling code here: // TODO add your handling code here:
    }//GEN-LAST:event_jMaltahabActionPerformed

    private void jMmodhabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmodhabActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ModHabit modificarHabitaciones=new ModHabit();
        modificarHabitaciones.setVisible(true);
        escritorio.add(modificarHabitaciones);
        escritorio.moveToFront(modificarHabitaciones);
        
    }//GEN-LAST:event_jMmodhabActionPerformed

    private void jMpreciohabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMpreciohabActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        Precios modificarPrecios=new Precios();
        modificarPrecios.setVisible(true);
        escritorio.add(modificarPrecios);
        escritorio.moveToFront(modificarPrecios);
    }//GEN-LAST:event_jMpreciohabActionPerformed

    private void jMLhuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMLhuespedActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListarHuesped Lhuesped=new ListarHuesped();
        Lhuesped.setVisible(true);
        escritorio.add(Lhuesped);
        escritorio.moveToFront(Lhuesped);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMLhuespedActionPerformed

    private void jMcrearreservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMcrearreservaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        HacerReserva HacerReservas=new HacerReserva();
        HacerReservas.setVisible(true);
        escritorio.add(HacerReservas);
        escritorio.moveToFront(HacerReservas);
    }//GEN-LAST:event_jMcrearreservaActionPerformed


    private void jMListarHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarHActionPerformed
       escritorio.removeAll();
       escritorio.repaint();
       ListarHabitaciones listarHabs=new ListarHabitaciones();
        listarHabs.setVisible(true);
        escritorio.add(listarHabs);
        escritorio.moveToFront(listarHabs);
    }//GEN-LAST:event_jMListarHActionPerformed

    private void jMbuscarresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbuscarresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        BuscarReserva br=new BuscarReserva();
        br.setVisible(true);
        escritorio.add(br);
        escritorio.moveToFront(br);

    // TODO add your handling code here:
    }//GEN-LAST:event_jMbuscarresActionPerformed

    private void jMenuListarOcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarOcuActionPerformed
  escritorio.removeAll();
       escritorio.repaint();
       ListarHabitacionesOcupadas listarHabsOcu=new ListarHabitacionesOcupadas();
        listarHabsOcu.setVisible(true);
        escritorio.add(listarHabsOcu);
        escritorio.moveToFront(listarHabsOcu);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuListarOcuActionPerformed

    private void jMListarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListarReservasActionPerformed

        escritorio.removeAll();
       escritorio.repaint();
      ListarReserva listar=new ListarReserva();
        listar.setVisible(true);
        escritorio.add(listar);
        escritorio.moveToFront(listar);  

        // TODO add your handling code here:
    }//GEN-LAST:event_jMListarReservasActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMLhuesped;
    private javax.swing.JMenuItem jMListarH;
    private javax.swing.JMenuItem jMListarReservas;
    private javax.swing.JMenuItem jMaltahab;
    private javax.swing.JMenuItem jMaltahuesped;
    private javax.swing.JMenuItem jMbajahuesped;
    private javax.swing.JMenuItem jMbuscarres;
    private javax.swing.JMenuItem jMcrearreserva;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuListarOcu;
    private javax.swing.JMenuItem jMmodhab;
    private javax.swing.JMenuItem jMmodhuesped;
    private javax.swing.JMenuItem jMpreciohab;
    // End of variables declaration//GEN-END:variables
}
