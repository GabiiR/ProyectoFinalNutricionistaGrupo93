/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalnutricionistagrupo93.Vistas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.accessibility.AccessibleContext;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Pacientes;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

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
        jtNombrePaciente = new javax.swing.JTextField();
        jtDniPaciente = new javax.swing.JTextField();
        jtDomicilioPaciente = new javax.swing.JTextField();
        jtTelefonoPaciente = new javax.swing.JTextField();
        jbAgregarPaciente = new javax.swing.JButton();
        jbModificarPaciente = new javax.swing.JButton();
        jbEliminarPaciente = new javax.swing.JButton();
        jbSalirRegistroPacientes = new javax.swing.JButton();
        jbBuscarPaciente = new javax.swing.JButton();
        jlPesoActual = new javax.swing.JLabel();
        jtPesoActual = new javax.swing.JTextField();
        jlPesoDeseado = new javax.swing.JLabel();
        jtPesoDeseado = new javax.swing.JTextField();
        jlPesoActual_kg = new javax.swing.JLabel();
        jlPesoDeseado_kg = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jlEstado = new javax.swing.JLabel();
        jbLimpiarRegistro = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registro de pacientes");

        jlNombreCompleto.setText("Nombre Completo :");

        jlDni.setText("Ingresar DNI :");

        jlDomicilio.setText("Domicilio :");

        jlTelefono.setText(" Telefono :");

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
        jbModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarPacienteActionPerformed(evt);
            }
        });

        jbEliminarPaciente.setText("Eliminar");
        jbEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarPacienteActionPerformed(evt);
            }
        });

        jbSalirRegistroPacientes.setText("Salir");
        jbSalirRegistroPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirRegistroPacientesActionPerformed(evt);
            }
        });

        jbBuscarPaciente.setText("Buscar Paciente por DNI");
        jbBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPacienteActionPerformed(evt);
            }
        });

        jlPesoActual.setText("Peso Actual :");

        jlPesoDeseado.setText("Peso Deseado :");

        jlPesoActual_kg.setText("KG");

        jlPesoDeseado_kg.setText("KG");

        jrbEstado.setSelected(true);
        jrbEstado.setEnabled(false);
        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });

        jlEstado.setText("Estado :");

        jbLimpiarRegistro.setText("Limpiar");
        jbLimpiarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarRegistroActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNombreCompleto)
                                    .addComponent(jlDni)
                                    .addComponent(jlDomicilio)
                                    .addComponent(jlTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtDniPaciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(jtDomicilioPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtTelefonoPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombrePaciente)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPesoDeseado)
                                    .addComponent(jlPesoActual))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtPesoDeseado, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jtPesoActual))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPesoActual_kg)
                                    .addComponent(jlPesoDeseado_kg))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAgregarPaciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbModificarPaciente))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlEstado)
                                .addGap(69, 69, 69)
                                .addComponent(jrbEstado)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminarPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbLimpiarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(jbSalirRegistroPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jtDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarPaciente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDomicilio)
                    .addComponent(jtDomicilioPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jtTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesoActual)
                    .addComponent(jtPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesoActual_kg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesoDeseado)
                    .addComponent(jtPesoDeseado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesoDeseado_kg))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbEstado)
                    .addComponent(jlEstado))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregarPaciente)
                    .addComponent(jbModificarPaciente)
                    .addComponent(jbEliminarPaciente)
                    .addComponent(jbLimpiarRegistro)
                    .addComponent(jbSalirRegistroPacientes))
                .addGap(10, 10, 10))
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
            
            Double pesoActual = Double.parseDouble(jtPesoActual.getText());
            Double pesoDeseado = Double.parseDouble(jtPesoActual.getText());
            
            if (pacienteActual == null) {
                boolean estado = true; //Paciente se transforma en activo.
                pacienteActual = new Paciente(nombre, dni, domicilio, telefono, pesoActual, pesoDeseado, estado);
                Dat_Pac.agregarPaciente(pacienteActual);
            }
            
            //Si llega con exito hasta acá, agrega al paciente con exito a la DB.
            /*----------------------------------------------------------------*/
            
            JOptionPane.showMessageDialog(this, "Se agrego al paciente correctamente.");
            limpiarCampos();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Su DNI, telefono o peso no fue ingresado correctamente\n o esta escrito en un formato incorrecto.n Por favor, vuelva a ingresar sus datos.");}
    }//GEN-LAST:event_jbAgregarPacienteActionPerformed

    private void jtNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombrePacienteActionPerformed

    }//GEN-LAST:event_jtNombrePacienteActionPerformed

    private void jbBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPacienteActionPerformed
        try {
            if (jtDniPaciente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI.");
                return;
            }
            boolean activo = jrbEstado.isEnabled();
            Boolean estado = true;
            Integer dni = Integer.parseInt(jtDniPaciente.getText()); //Captura solo enteros.
            if (dni < 1000000 && estado == true|| dni > 99999999 && estado == true) {
                JOptionPane.showMessageDialog(this, "Ingrese un DNI correcto.");
            }
   
            pacienteActual = Dat_Pac.buscarPaciente(dni);
            if (pacienteActual != null) {
                jtNombrePaciente.setText(pacienteActual.getNombre());
                jtDomicilioPaciente.setText(pacienteActual.getDomicilio());
                jtTelefonoPaciente.setText(String.valueOf(pacienteActual.getTelefono()));
                jtPesoActual.setText(String.valueOf(pacienteActual.getPesoActual()));
                jtPesoDeseado.setText(String.valueOf(pacienteActual.getPesoDeseado()));
                jrbEstado.setSelected(true);
                jrbEstado.setEnabled(true);
                jbAgregarPaciente.setEnabled(false);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Su DNI no fue ingresado correctamente\n o esta escrito en un formato incorrecto.\n Por favor, vuelva a ingresarlo de vuelta.");
        }
        
    }//GEN-LAST:event_jbBuscarPacienteActionPerformed

    private void jbModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarPacienteActionPerformed
        try {
            Integer dni = Integer.parseInt(jtDniPaciente.getText()); //Captura solo enteros.
            pacienteActual = Dat_Pac.buscarPaciente(dni);

            if (pacienteActual != null) {

                try {
                    String nombre = jtNombrePaciente.getText(); //Obtiene un nombre (String).

                    String domicilio = jtDomicilioPaciente.getText(); //Obtiene un domicilio (String).

                    Integer telefono = Integer.parseInt(jtTelefonoPaciente.getText()); //Obtiene un telefono (int).
                    
                    Double pesoActual = Double.parseDouble(jtPesoActual.getText());
                    Double pesoDeseado = Double.parseDouble(jtPesoDeseado.getText());

                    //Comprueba campos vacios:
                    if (nombre.isEmpty() || domicilio.isEmpty()) { //Verifica si hay espacios vacios en [Nombre] y [Domicilio].
                        JOptionPane.showMessageDialog(this, "Error, no puede haber campos vacios.");
                        return;
                    } else {
                        boolean estado = true;
                        pacienteActual = new Paciente(nombre, dni, domicilio, telefono, pesoActual, pesoDeseado, estado); //Instancia el paciente a modificar.
                        pacienteActual.setNombre(nombre); //Actualiza el nombre del paciente seleccionado.
                        pacienteActual.setDomicilio(domicilio); //Actualiza el domicilio del paciente seleccionado.
                        pacienteActual.setTelefono(telefono); //Actualiza el telefono del paciente seleccionado.
                        pacienteActual.setPesoActual(pesoActual); //Actualiza el peso actual de paciente.
                        pacienteActual.setPesoDeseado(pesoDeseado); //Actualiza el peso deseado del paciente.
                        pacienteActual.setEstado(estado);
                        Dat_Pac.modificarPaciente(pacienteActual); //Devuelve el paciente modificado.
                        jrbEstado.setEnabled(true);
                    }

                    //JOptionPane.showMessageDialog(this, "Se modifico al paciente correctamente.");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Su DNI, telefono o peso no fue ingresado correctamente\n o esta escrito en un formato incorrecto,\n por favor, vuelva a ingresar sus datos.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error , vuelva a ingresar de vuelta el DNI que desee modificar.");
        }
    }//GEN-LAST:event_jbModificarPacienteActionPerformed

    private void jbEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarPacienteActionPerformed
        try {
            Integer dni = Integer.parseInt(jtDniPaciente.getText()); //Captura solo enteros.
            pacienteActual = Dat_Pac.buscarPaciente(dni);
            
            if (pacienteActual != null) {
                
                String nombre = jtNombrePaciente.getText(); //Obtiene un nombre (String).

                String domicilio = jtDomicilioPaciente.getText(); //Obtiene un domicilio (String).

                Integer telefono = Integer.parseInt(jtTelefonoPaciente.getText()); //Obtiene un telefono (int).
                
                Double pesoActual = Double.parseDouble(jtPesoActual.getText());
                Double pesoDeseado = Double.parseDouble(jtPesoDeseado.getText());

                //Comprueba campos vacios:
                if (nombre.isEmpty() || domicilio.isEmpty()) { //Verifica si hay espacios vacios en [Nombre] y [Domicilio].
                    JOptionPane.showMessageDialog(this, "Error, no puede haber campos vacios.");
                    return;
                } else {
                    boolean estado = true;
                    pacienteActual = new Paciente(nombre, dni, domicilio, telefono, pesoActual, pesoDeseado, estado); //Instancia el paciente a modificar.
                    pacienteActual.setNombre(nombre); //Actualiza el nombre del paciente seleccionado.
                    pacienteActual.setDomicilio(domicilio); //Actualiza el domicilio del paciente seleccionado.
                    pacienteActual.setTelefono(telefono); //Actualiza el telefono del paciente seleccionado.
                    pacienteActual.setPesoActual(pesoActual); //Actualiza el peso actual de paciente.
                    pacienteActual.setPesoDeseado(pesoDeseado); //Actualiza el peso deseado del paciente.
                    pacienteActual.setEstado(estado);
                    Dat_Pac.eliminarPaciente(pacienteActual.getDni()); //Elimina al paciente.
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error , vuelva a ingresar de vuelta el DNI que desee modificar.");
        }
    }//GEN-LAST:event_jbEliminarPacienteActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
        //jrbEstado.setEnabled(false);
    }//GEN-LAST:event_jrbEstadoActionPerformed

    private void jbLimpiarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarRegistroActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarRegistroActionPerformed
    //nota: AGREGAR EL FONDO DE "multimedia/bg.png".
    public void limpiarCampos(){
        jtNombrePaciente.setText("");
        jtDniPaciente.setText("");
        jtDomicilioPaciente.setText("");
        jtTelefonoPaciente.setText("");
        jtPesoActual.setText("");
        jtPesoDeseado.setText("");
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAgregarPaciente;
    private javax.swing.JButton jbBuscarPaciente;
    private javax.swing.JButton jbEliminarPaciente;
    private javax.swing.JButton jbLimpiarRegistro;
    private javax.swing.JButton jbModificarPaciente;
    private javax.swing.JButton jbSalirRegistroPacientes;
    private javax.swing.JLabel jlDni;
    private javax.swing.JLabel jlDomicilio;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNombreCompleto;
    private javax.swing.JLabel jlPesoActual;
    private javax.swing.JLabel jlPesoActual_kg;
    private javax.swing.JLabel jlPesoDeseado;
    private javax.swing.JLabel jlPesoDeseado_kg;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtDniPaciente;
    private javax.swing.JTextField jtDomicilioPaciente;
    private javax.swing.JTextField jtNombrePaciente;
    private javax.swing.JTextField jtPesoActual;
    private javax.swing.JTextField jtPesoDeseado;
    private javax.swing.JTextField jtTelefonoPaciente;
    // End of variables declaration//GEN-END:variables
}
