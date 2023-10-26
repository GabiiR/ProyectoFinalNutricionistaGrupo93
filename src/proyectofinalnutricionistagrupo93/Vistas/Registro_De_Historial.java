package proyectofinalnutricionistagrupo93.Vistas;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Historial;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Pacientes;
import proyectofinalnutricionistagrupo93.Entidades.Historial;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

public class Registro_De_Historial extends javax.swing.JInternalFrame {

    protected Data_Pacientes Data_Pac = new Data_Pacientes();
    protected ArrayList<Paciente> listaPaci = new ArrayList<>();
    protected Paciente pacienteActual = null;
    protected Data_Historial Data_Historial = new Data_Historial();
    protected Historial historialactual = null;
    
    public Registro_De_Historial() {
        initComponents();
        List<Paciente> listaPaci = Data_Pac.listarPacientes();
        cargarDatosPaciente((ArrayList<Paciente>) listaPaci);
        jFechaInicial.setDate(new Date());        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jcbPacientes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtPesoObjetivo = new javax.swing.JTextField();
        jFechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JButton();
        jGuardar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de Historial");

        jLabel2.setText("Paciente:");

        jcbPacientes.setFocusTraversalPolicyProvider(true);
        jcbPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPacientesActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha:");

        jLabel4.setText("Peso Actual:");

        jLabel8.setText("KG");

        jLimpiar.setText("Nuevo");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jGuardar.setText("Guardar");
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSalir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtPesoObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(jFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(jcbPacientes, 0, 284, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jcbPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtPesoObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGuardar)
                    .addComponent(jLimpiar)
                    .addComponent(jSalir))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPacientesActionPerformed

    }//GEN-LAST:event_jcbPacientesActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        try {
            Double peso = Double.parseDouble(jtPesoObjetivo.getText());
            if(peso !=null){
            int pacienteIndex = jcbPacientes.getSelectedIndex();
            Paciente pacienteSeleccionado = (Paciente) jcbPacientes.getItemAt(pacienteIndex);
            java.util.Date fechaRE = jFechaInicial.getDate();
            LocalDate fecha = fechaRE.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            
            historialactual = new Historial(pacienteSeleccionado.getIdPaciente(),peso,fecha,true);
            Data_Historial.cargarVisita(historialactual);
            Data_Pac.modificarPesoPaciente(peso, pacienteSeleccionado.getIdPaciente());
            }else{
                JOptionPane.showMessageDialog(null, "Debe ingresar un peso");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no se pudo guardar el Registro");
        }
    }//GEN-LAST:event_jGuardarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed
    private void limpiarCampos() {
        jFechaInicial.setDate(new Date());
        jtPesoObjetivo.setText("");
    }

    private void cargarDatosPaciente(ArrayList<Paciente> listaPaci) {

        listaPaci.forEach((p) -> {
            jcbPacientes.addItem(p);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jFechaInicial;
    private javax.swing.JButton jGuardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JButton jSalir;
    private javax.swing.JComboBox<Paciente> jcbPacientes;
    private javax.swing.JTextField jtPesoObjetivo;
    // End of variables declaration//GEN-END:variables
}
