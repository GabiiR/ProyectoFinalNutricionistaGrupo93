/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalnutricionistagrupo93.Vistas;

import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Pacientes;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

/**
 *
 * @author Gabi
 */
public class Registro_De_Pacientes extends javax.swing.JInternalFrame {
    protected Data_Pacientes Dat_Pac = new Data_Pacientes();
    protected Paciente pacienteActual = null;

    /**
     * Creates new form Registro_De_Pacientes
     */
    public Registro_De_Pacientes() {
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

        jlNombreCompleto = new javax.swing.JLabel();
        jlDni = new javax.swing.JLabel();
        jlDomicilio = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtNombrePaciente = new javax.swing.JTextField();
        jtDniPaciente = new javax.swing.JTextField();
        jtDomicilioPaciente = new javax.swing.JTextField();
        jtTelefonoPaciente = new javax.swing.JTextField();
        jbAgregarPaciente = new javax.swing.JButton();
        jbModificarPaciente = new javax.swing.JButton();
        jbEliminarPaciente = new javax.swing.JButton();
        jbSalirRegistroPacientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro de pacientes");

        jlNombreCompleto.setText("Ingresar nombre completo :");

        jlDni.setText("Ingresar DNI :");

        jlDomicilio.setText("Ingresar Domicilio :");

        jlTelefono.setText("Ingresar Telefono :");

        jtNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombrePacienteActionPerformed(evt);
            }
        });

        jbAgregarPaciente.setText("Agregar");
        jbAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarPacienteActionPerformed(evt);
            }
        });

        jbModificarPaciente.setText("Modificar");

        jbEliminarPaciente.setText("Eliminar");

        jbSalirRegistroPacientes.setText("Salir");
        jbSalirRegistroPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirRegistroPacientesActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jbAgregarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbModificarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalirRegistroPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombreCompleto)
                            .addComponent(jlDni)
                            .addComponent(jlDomicilio)
                            .addComponent(jlTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtNombrePaciente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDniPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtDomicilioPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtTelefonoPaciente, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombreCompleto)
                    .addComponent(jtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDni)
                    .addComponent(jtDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDomicilio)
                    .addComponent(jtDomicilioPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbAgregarPaciente)
                        .addComponent(jbModificarPaciente)
                        .addComponent(jbEliminarPaciente)
                        .addComponent(jbSalirRegistroPacientes)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirRegistroPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirRegistroPacientesActionPerformed
        dispose(); //Cierra la ventana.
    }//GEN-LAST:event_jbSalirRegistroPacientesActionPerformed

    private void jbAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarPacienteActionPerformed
        try {
            String nombre = jtNombrePaciente.getText();
            Integer dni = Integer.parseInt(jtDniPaciente.getText()); //Captura solo enteros.
            
            //Comprueba digitos del Dni:
            if (dni < 1000000 || dni > 99999999) { //7 u 8 digitos.
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número de DNI correcto.");
                return;
            }
            
            String domicilio = jtDomicilioPaciente.getText();
            Integer telefono = Integer.parseInt(jtTelefonoPaciente.getText());
            
            //Comprueba campos vacios:
            if (nombre.isEmpty() || domicilio.isEmpty()){
                JOptionPane.showMessageDialog(this, "Error, no puede haber campos vacios.");
                return;
            }
            
            if (pacienteActual == null) {
                pacienteActual = new Paciente(nombre, dni, domicilio, telefono);
                Dat_Pac.agregarPaciente(pacienteActual);
            }
            
            //Si llega con exito hasta acá, agrega al paciente con exito a la DB.
            /*----------------------------------------------------------------*/
            
            JOptionPane.showMessageDialog(this, "Se agrego al paciente correctamente.");
            limpiarCampos();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Su DNI o Telefono no fue ingresado correctamente\n o esta escrito en un formato incorrecto,\n por favor, vuelva a ingresar sus datos.");
        }
    }//GEN-LAST:event_jbAgregarPacienteActionPerformed

    private void jtNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombrePacienteActionPerformed

    }//GEN-LAST:event_jtNombrePacienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiarCampos(){
        jtNombrePaciente.setText("");
        jtDniPaciente.setText("");
        jtDomicilioPaciente.setText("");
        jtTelefonoPaciente.setText("");
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAgregarPaciente;
    private javax.swing.JButton jbEliminarPaciente;
    private javax.swing.JButton jbModificarPaciente;
    private javax.swing.JButton jbSalirRegistroPacientes;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlNombreCompleto;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtDniPaciente;
    private javax.swing.JTextField jtDomicilioPaciente;
    private javax.swing.JTextField jtNombrePaciente;
    private javax.swing.JTextField jtTelefonoPaciente;
    // End of variables declaration//GEN-END:variables
}
