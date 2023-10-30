/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalnutricionistagrupo93.Vistas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Dieta;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Pacientes;
import proyectofinalnutricionistagrupo93.Entidades.Dieta;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

/**
 *
 * @author aldio
 */
public class Registro_De_Dietas extends javax.swing.JInternalFrame {

    protected Data_Dieta DatDiet = new Data_Dieta();
    protected Dieta Diet = new Dieta();
    protected Data_Pacientes dataPac = new Data_Pacientes();
    protected Paciente pacienteActual = new Paciente();
    private DefaultTableModel modeloTabla = new DefaultTableModel();

    /**
     * Creates new form Registro_De_Dietas
     */
    public Registro_De_Dietas() {
        initComponents();
        ArrayList<Paciente> listaPaci = dataPac.listarPacientesRegistrados();
        cargarDatosPaciente(listaPaci);

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
        jtNombreDieta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcbPacientes = new javax.swing.JComboBox<>();
        jbAgregar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de Dietas");

        jLabel1.setText("Nombre de Dieta:");

        jLabel2.setText("Paciente:");

        jcbPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPacientesActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jbAgregar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbLimpiar)
                                .addGap(195, 195, 195)
                                .addComponent(jbSalir))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jcbPacientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar))
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        jbAgregar.setEnabled(false);
        jbLimpiar.setEnabled(true);
        String nombre = jtNombreDieta.getText();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de Dieta...");
            return;
    }//GEN-LAST:event_jbBuscarActionPerformed
        if (Diet == null) {

            Dieta Diet = DatDiet.buscarDietaxNombre(nombre);
            jbLimpiar.setEnabled(true);
            //jtNombreDieta.setText(Diet.getNombre());
            JOptionPane.showMessageDialog(this, "Dieta encontrada y cargada.");
        } else {
            JOptionPane.showMessageDialog(this, "Dieta no encontrada en la base de datos. Proceda a agregarla!");
            jbAgregar.setEnabled(true);
        }
    }
    private void jcbPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPacientesActionPerformed
        // TODO add your handling code here:
        jbAgregar.setEnabled(true);
        jbLimpiar.setEnabled(false);
        int filaseleccionada = jcbPacientes.getSelectedIndex();
        if (filaseleccionada != -1) {
            Paciente p = (Paciente) jcbPacientes.getSelectedItem();
            //int idPaciente = p.getIdPaciente();
        }
    }//GEN-LAST:event_jcbPacientesActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        // TODO add your handling code here:
        String nombre = jtNombreDieta.getText();
        int pacienteIndex = jcbPacientes.getSelectedIndex();
        pacienteActual = (Paciente) jcbPacientes.getItemAt(pacienteIndex);
        int idPaciente = pacienteActual.getIdPaciente();

        DatDiet.agregarDietaNueva(nombre, idPaciente);
        //Diet.setNombre(nombre);
        //Diet.setIdPaciente(idPaciente);


    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        jtNombreDieta.setText("");

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void cargarDatosPaciente(ArrayList<Paciente> listaPaci) {

        listaPaci.stream().map((Paciente p) -> {
            jcbPacientes.addItem(p);
            return p;
        }).forEachOrdered((Paciente pac) -> {
            modeloTabla.addRow(new Object[]{pac.getNombre(), pac.getPesoActual(), pac.getPesoDeseado(), pac.getFechaFin()});
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Paciente> jcbPacientes;
    private javax.swing.JTextField jtNombreDieta;
    // End of variables declaration//GEN-END:variables
}