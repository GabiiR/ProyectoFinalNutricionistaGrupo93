package proyectofinalnutricionistagrupo93.Vistas;

import proyectofinalnutricionistagrupo93.AccesoADatos.Conexion;

public class Nutricionista_GUI extends javax.swing.JFrame {

    public Nutricionista_GUI() {
        Conexion.getConexion(); //
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmbPacientes = new javax.swing.JMenu();
        jmiPacientesOpc1 = new javax.swing.JMenuItem();
        jmiPacientesOpc2 = new javax.swing.JMenuItem();
        jmbComidas = new javax.swing.JMenu();
        jmiComidasOpc1 = new javax.swing.JMenuItem();
        jmListaComidas = new javax.swing.JMenuItem();
        jmbDietas = new javax.swing.JMenu();
        jmiDietasPacientes = new javax.swing.JMenuItem();
        jMListaDietas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMPlandeNutricion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de nutricionista");
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        jmbPacientes.setText("Pacientes");
        jmbPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbPacientesActionPerformed(evt);
            }
        });

        jmiPacientesOpc1.setText("Registro de pacientes");
        jmiPacientesOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPacientesOpc1ActionPerformed(evt);
            }
        });
        jmbPacientes.add(jmiPacientesOpc1);

        jmiPacientesOpc2.setText("Historial de pacientes");
        jmiPacientesOpc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPacientesOpc2ActionPerformed(evt);
            }
        });
        jmbPacientes.add(jmiPacientesOpc2);

        jMenuBar1.add(jmbPacientes);

        jmbComidas.setText("Comidas");

        jmiComidasOpc1.setText("Registro de comidas");
        jmiComidasOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComidasOpc1ActionPerformed(evt);
            }
        });
        jmbComidas.add(jmiComidasOpc1);

        jmListaComidas.setText("Lista de Comidas");
        jmListaComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaComidasActionPerformed(evt);
            }
        });
        jmbComidas.add(jmListaComidas);

        jMenuBar1.add(jmbComidas);

        jmbDietas.setText("Dietas");
        jmbDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbDietasActionPerformed(evt);
            }
        });

        jmiDietasPacientes.setText("Dietas de pacientes");
        jmiDietasPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDietasPacientesActionPerformed(evt);
            }
        });
        jmbDietas.add(jmiDietasPacientes);

        jMListaDietas.setText("Comidas Por Dieta");
        jMListaDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMListaDietasActionPerformed(evt);
            }
        });
        jmbDietas.add(jMListaDietas);

        jMenuBar1.add(jmbDietas);

        jMenu1.setText("Planes de Nutricion");

        jMPlandeNutricion.setText("Plan de Nutricion");
        jMPlandeNutricion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPlandeNutricionActionPerformed(evt);
            }
        });
        jMenu1.add(jMPlandeNutricion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPacientesOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPacientesOpc1ActionPerformed
        Registro_De_Pacientes RDP = new Registro_De_Pacientes();
        jDesktopPane1.add(RDP);
        RDP.show();
    }//GEN-LAST:event_jmiPacientesOpc1ActionPerformed

    private void jmbPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmbPacientesActionPerformed

    private void jmiPacientesOpc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPacientesOpc2ActionPerformed
        Historial_De_Pacientes HDP = new Historial_De_Pacientes();
        jDesktopPane1.add(HDP);
        HDP.show();
    }//GEN-LAST:event_jmiPacientesOpc2ActionPerformed

    private void jmiComidasOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComidasOpc1ActionPerformed
       Registro_De_Comidas RDC = new Registro_De_Comidas();
       jDesktopPane1.add(RDC);
       RDC.show();
    }//GEN-LAST:event_jmiComidasOpc1ActionPerformed

    private void jmListaComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaComidasActionPerformed
        // TODO add your handling code here:
        Lista_De_Comidas LDC = new Lista_De_Comidas();
        jDesktopPane1.add(LDC);
        LDC.show();
    }//GEN-LAST:event_jmListaComidasActionPerformed

    private void jmbDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbDietasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jmbDietasActionPerformed

    private void jMListaDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMListaDietasActionPerformed
        // TODO add your handling code here:
         Lista_De_ComidasxDieta LDD = new Lista_De_ComidasxDieta();
        jDesktopPane1.add(LDD);
        LDD.show();
    }//GEN-LAST:event_jMListaDietasActionPerformed

    private void jMPlandeNutricionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPlandeNutricionActionPerformed
        // TODO add your handling code here:
        Plan_De_Nutricion PDN = new Plan_De_Nutricion();
        jDesktopPane1.add(PDN);
        PDN.show();
    }//GEN-LAST:event_jMPlandeNutricionActionPerformed

    private void jmiDietasPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDietasPacientesActionPerformed
        // TODO add your handling code here:
        Registro_De_ComidasDieta RDD = new Registro_De_ComidasDieta();
        jDesktopPane1.add(RDD);
        RDD.show();
    }//GEN-LAST:event_jmiDietasPacientesActionPerformed

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
            java.util.logging.Logger.getLogger(Nutricionista_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nutricionista_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nutricionista_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nutricionista_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nutricionista_GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMListaDietas;
    private javax.swing.JMenuItem jMPlandeNutricion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmListaComidas;
    private javax.swing.JMenu jmbComidas;
    private javax.swing.JMenu jmbDietas;
    private javax.swing.JMenu jmbPacientes;
    private javax.swing.JMenuItem jmiComidasOpc1;
    private javax.swing.JMenuItem jmiDietasPacientes;
    private javax.swing.JMenuItem jmiPacientesOpc1;
    private javax.swing.JMenuItem jmiPacientesOpc2;
    // End of variables declaration//GEN-END:variables
}
