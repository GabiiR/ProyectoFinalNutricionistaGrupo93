/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalnutricionistagrupo93.Vistas;

/**
 *
 * @author Gabi
 */
public class Nutricionista_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Nutricionista_GUI
     */
    public Nutricionista_GUI() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmbPacientes = new javax.swing.JMenu();
        jmiPacientesOpc1 = new javax.swing.JMenuItem();
        jmiPacientesOpc2 = new javax.swing.JMenuItem();
        jmbComidas = new javax.swing.JMenu();
        jmiComidasOpc1 = new javax.swing.JMenuItem();
        jmbDietas = new javax.swing.JMenu();
        jmiDietasOpc1 = new javax.swing.JMenuItem();

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

        jmiPacientesOpc2.setText("Consulta de pacientes");
        jmbPacientes.add(jmiPacientesOpc2);

        jMenuBar1.add(jmbPacientes);

        jmbComidas.setText("Comidas");

        jmiComidasOpc1.setText("Registro de comidas");
        jmbComidas.add(jmiComidasOpc1);

        jMenuBar1.add(jmbComidas);

        jmbDietas.setText("Dietas");

        jmiDietasOpc1.setText("Dietas de pacientes");
        jmbDietas.add(jmiDietasOpc1);

        jMenuBar1.add(jmbDietas);

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmbComidas;
    private javax.swing.JMenu jmbDietas;
    private javax.swing.JMenu jmbPacientes;
    private javax.swing.JMenuItem jmiComidasOpc1;
    private javax.swing.JMenuItem jmiDietasOpc1;
    private javax.swing.JMenuItem jmiPacientesOpc1;
    private javax.swing.JMenuItem jmiPacientesOpc2;
    // End of variables declaration//GEN-END:variables
}
