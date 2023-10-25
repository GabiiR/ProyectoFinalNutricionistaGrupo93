/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalnutricionistagrupo93.Vistas;

import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Comidas;
import proyectofinalnutricionistagrupo93.Entidades.Comida;

public class Registro_De_Comidas extends javax.swing.JInternalFrame {

    protected Data_Comidas Data_Comi = new Data_Comidas();
    protected Comida comidaActual = null;

    /**
     * Creates new form Registro_De_Comidas
     */
    public Registro_De_Comidas() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtCantCalorias = new javax.swing.JTextField();
        jtIDcomida = new javax.swing.JTextField();
        jtDetalle = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbAgregar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbLimpiarCampos = new javax.swing.JButton();
        jbBuscarComida = new javax.swing.JButton();
        jbSalir1 = new javax.swing.JButton();

        jLabel1.setText("Registro de Comidas:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Detalle:");

        jLabel4.setText("Cantidad de Calorias:");

        jLabel5.setText("idComida:");

        jLabel6.setText("Estado:");

        jtIDcomida.setEditable(false);

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Eliminar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbLimpiarCampos.setText("Limpiar");
        jbLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarCamposActionPerformed(evt);
            }
        });

        jbBuscarComida.setText("Buscar Por Nombre");
        jbBuscarComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarComidaActionPerformed(evt);
            }
        });

        jbSalir1.setText("Salir");
        jbSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrbEstado)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jbAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(jtDetalle, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtIDcomida, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtCantCalorias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscarComida, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbLimpiarCampos)
                                        .addGap(69, 69, 69)))))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(544, Short.MAX_VALUE)
                    .addComponent(jbSalir1)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jrbEstado)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbBuscarComida)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jtCantCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtIDcomida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbModificar)
                    .addComponent(jbBorrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbLimpiarCampos)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(276, Short.MAX_VALUE)
                    .addComponent(jbSalir1)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        try {
            String nombre = jtNombre.getText(); 
            comidaActual = Data_Comi.buscarComida(nombre);

            if (comidaActual != null) {
                
                String detalle = jtDetalle.getText();
                Integer cantCalorias = Integer.parseInt(jtCantCalorias.getText());
                Boolean estado = jrbEstado.isSelected();

                if (detalle.isEmpty() || cantCalorias == null || nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Error, no puede haber campos vacios.");
                    return;
                } else {
                    comidaActual = new Comida(nombre, detalle, cantCalorias, estado);
                    comidaActual.setNombre(nombre);
                    //comidaActual.setIdComida(id);
                    comidaActual.setCantCalorias(cantCalorias);
                    comidaActual.setDetalle(detalle);
                    comidaActual.setEstado(estado);
                    Data_Comi.eliminarComida(comidaActual.getIdComida());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error , vuelva a ingresar de vuelta el ID de comida que desee modificar.");
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarComidaActionPerformed
        try {
            if (jtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una Comida");
                return;
            }
            String nombre = jtNombre.getText();
            comidaActual = Data_Comi.buscarComida(nombre);
            if (comidaActual != null) {
                jtNombre.setText(comidaActual.getNombre());
                jtIDcomida.setText(String.valueOf(comidaActual.getIdComida()));
                jtDetalle.setText(comidaActual.getDetalle());
                jtCantCalorias.setText(String.valueOf(comidaActual.getCantCalorias()));
                jrbEstado.setSelected(true);
                jrbEstado.setEnabled(true);
                
                jbModificar.setEnabled(true);
                jbBorrar.setEnabled(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El Nombre no fue ingresado correctamente\n o esta escrito en un formato incorrecto.\n Por favor, vuelva a ingresarlo de vuelta.");

        }
    }//GEN-LAST:event_jbBuscarComidaActionPerformed

    private void jbLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jbLimpiarCamposActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        try {
            String nombre = jtNombre.getText();
            comidaActual = Data_Comi.buscarComida(nombre);
            try {
                if (comidaActual != null) {
                    Integer idComida = Integer.parseInt(jtIDcomida.getText());
                    String detalle = jtDetalle.getText();
                    Integer cantCalorias = Integer.parseInt(jtCantCalorias.getText());
                    Boolean estado = jrbEstado.isSelected();

                    if (detalle.isEmpty() || cantCalorias == null || idComida == null) {
                        JOptionPane.showMessageDialog(this, "Error, no puede haber campos vacios.");
                        return;
                    } else {
                        comidaActual = new Comida(nombre, detalle, cantCalorias, estado);
                        comidaActual.setNombre(nombre);
                        comidaActual.setCantCalorias(cantCalorias);
                        comidaActual.setDetalle(detalle);
                        comidaActual.setEstado(true);
                        Data_Comi.modificarComida(comidaActual);
                        JOptionPane.showMessageDialog(this, comidaActual);
                        JOptionPane.showMessageDialog(this, "Se modifico la comida correctamente.");
                        limpiarCampos();

                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Los datos no fueron ingresados correctamente\n o esta escrito en un formato incorrecto.\n Por favor, vuelva a ingresar sus datos.");
            }
        } catch (StringIndexOutOfBoundsException e) { //poner la excepcion correspondiente para que unicamente se puedan ingresar letras
            JOptionPane.showMessageDialog(this, "Error , vuelva a ingresar de vuelta el Nombre de la comida que desee modificar.");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            String nombre = jtNombre.getText();
            //Integer idComida = Integer.parseInt(jtIDcomida.getText());
            String detalle = jtDetalle.getText();
            Integer cantCalorias = Integer.parseInt(jtCantCalorias.getText());
            Boolean estado = jrbEstado.isSelected();
            if (detalle.isEmpty() || cantCalorias == null || nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Error, no puede haber campos vacios.");
                return;
            }

            if (comidaActual == null) {
                estado = true;
                comidaActual = new Comida(nombre, detalle, cantCalorias, estado);
                Data_Comi.agregarComida(comidaActual);
                JOptionPane.showMessageDialog(this, "Se agrego la comida correctamente.");
                limpiarCampos();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Algunos datos no fueron ingresados correctamente\n o esta escrito en un formato incorrecto.n Por favor, vuelva a ingresar sus datos.");
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalir1ActionPerformed
        dispose(); //Cierra la ventana.
    }//GEN-LAST:event_jbSalir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarComida;
    private javax.swing.JButton jbLimpiarCampos;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir1;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtCantCalorias;
    private javax.swing.JTextField jtDetalle;
    private javax.swing.JTextField jtIDcomida;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtNombre.setText("");
        jtCantCalorias.setText("");
        jtDetalle.setText("");
        jtIDcomida.setText("");
        jrbEstado.setSelected(false);
    }
}
