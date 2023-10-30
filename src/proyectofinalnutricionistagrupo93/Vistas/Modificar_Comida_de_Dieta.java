package proyectofinalnutricionistagrupo93.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Comidas;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Dieta;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_DietaComida;
import proyectofinalnutricionistagrupo93.Entidades.Comida;
import proyectofinalnutricionistagrupo93.Entidades.Dieta;
import proyectofinalnutricionistagrupo93.Entidades.DietaComida;
import proyectofinalnutricionistagrupo93.Entidades.Horario;

public class Modificar_Comida_de_Dieta extends javax.swing.JInternalFrame {

    protected Data_Dieta Data_Dieta = new Data_Dieta();
    protected ArrayList<Dieta> listaDieta = new ArrayList<>();
    protected Dieta dietaActual = null;
    protected Data_Comidas Data_Comida = new Data_Comidas();
    protected ArrayList<Comida> listaComida = new ArrayList<>();
    protected Comida comidaActual = null;
    protected Data_DietaComida Data_DietaComida = new Data_DietaComida();
    protected ArrayList<DietaComida> listaDietaComida = new ArrayList();
    protected DietaComida dietaComidaActual = null;
    protected ArrayList<Horario> listaHorarios = new ArrayList<>();

    public Modificar_Comida_de_Dieta() {
        initComponents();
        List<Dieta> listaDieta = Data_Dieta.listaDietasActivas();
        List<Comida> listaComida = Data_Comida.listaComida();
        cargarDatosComida((ArrayList<Comida>) listaComida);
        cargarDatosDieta((ArrayList< Dieta>) listaDieta);
        cargarDatosHorario();
        Dieta d = (Dieta) jcbDieta.getSelectedItem();
        List<DietaComida> listaDietaComida = Data_DietaComida.listaComidaxdieta(d.getIdDieta());
        cargarDatosDietaComida((ArrayList<DietaComida>) listaDietaComida);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbDieta = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jcbRegistrosdeComida = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbHorario = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbNuevaComida = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPorcion = new javax.swing.JTextField();
        jModificar = new javax.swing.JButton();
        jSalir1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Registro de Dietas");

        jLabel1.setText("Seleccione una dieta :");

        jcbDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDietaActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un registro :");

        jcbRegistrosdeComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRegistrosdeComidaActionPerformed(evt);
            }
        });

        jLabel3.setText("Seleccione un Horario :");

        jcbHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHorarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Seleccione una nueva comida:");

        jcbNuevaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNuevaComidaActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione una nueva porcion:");

        jPorcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPorcionActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jSalir1.setText("Salir");
        jSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcbRegistrosdeComida, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbDieta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jcbNuevaComida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(jSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jcbDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcbRegistrosdeComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jcbNuevaComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPorcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSalir1)
                    .addComponent(jModificar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDietaActionPerformed

    }//GEN-LAST:event_jcbDietaActionPerformed

    private void jcbRegistrosdeComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRegistrosdeComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbRegistrosdeComidaActionPerformed

    private void jcbHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHorarioActionPerformed

    private void jcbNuevaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNuevaComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbNuevaComidaActionPerformed

    private void jPorcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPorcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPorcionActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        try {
            int dietaIndex = jcbDieta.getSelectedIndex();
            Dieta dietaSeleccionado = (Dieta) jcbDieta.getItemAt(dietaIndex);
            int registroIndex = jcbRegistrosdeComida.getSelectedIndex();
            DietaComida dietaComidaSeleccionada = (DietaComida) jcbRegistrosdeComida.getItemAt(registroIndex);
            int comidandex = jcbNuevaComida.getSelectedIndex();
            Comida ComidaSeleccionado = (Comida) jcbNuevaComida.getItemAt(comidandex);
            int horarioIndex = jcbHorario.getSelectedIndex();
            Horario horarioSeleccionado = (Horario) jcbHorario.getItemAt(horarioIndex);

            Integer porcion = Integer.parseInt(jPorcion.getText());

            Boolean estado = true;

            if (porcion == null) {
                JOptionPane.showMessageDialog(null, "No puede haber campos de porcion vacios.");
                return;
            }else{                
            dietaComidaActual = new DietaComida(dietaComidaSeleccionada.getIdDietaComida(),ComidaSeleccionado.getIdComida(), dietaSeleccionado.getIdDieta(), horarioSeleccionado, porcion, estado);
            dietaComidaActual.setIdDietaComida(dietaComidaSeleccionada.getIdDietaComida());
            dietaComidaActual.setIdComida(ComidaSeleccionado.getIdComida());
            dietaComidaActual.setIdDieta(dietaSeleccionado.getIdDieta());
            dietaComidaActual.setHorario(horarioSeleccionado);
            dietaComidaActual.setPorcion(porcion);
            dietaComidaActual.setEstado(estado);
            
            Data_DietaComida.modificarDietaComida(dietaComidaActual);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se Modifico el registro");
        }
    }//GEN-LAST:event_jModificarActionPerformed

    private void jSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalir1ActionPerformed
        dispose();
    }//GEN-LAST:event_jSalir1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jModificar;
    private javax.swing.JTextField jPorcion;
    private javax.swing.JButton jSalir1;
    private javax.swing.JComboBox<Dieta> jcbDieta;
    private javax.swing.JComboBox<Horario> jcbHorario;
    private javax.swing.JComboBox<Comida> jcbNuevaComida;
    private javax.swing.JComboBox<DietaComida> jcbRegistrosdeComida;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosDieta(ArrayList<Dieta> listaDieta) {
        listaDieta.forEach((d) -> {
            jcbDieta.addItem(d);
        });
    }

    private void cargarDatosComida(ArrayList<Comida> listaComida) {
        listaComida.forEach((d) -> {
            jcbNuevaComida.addItem(d);
        });

    }

    private void cargarDatosDietaComida(ArrayList<DietaComida> listaDietaComida) {
        listaDietaComida.forEach((d) -> {
            jcbRegistrosdeComida.addItem(d);
        });
    }

    private void cargarDatosHorario() {
        for (Horario aux : Horario.values()) {
            jcbHorario.addItem(aux);
        }
    }

    private void limpiarCampos() {
        jPorcion.setText("");
    }

}
