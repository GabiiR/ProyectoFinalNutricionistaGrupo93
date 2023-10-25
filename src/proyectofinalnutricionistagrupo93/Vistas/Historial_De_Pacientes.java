/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalnutricionistagrupo93.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Historial;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Pacientes;
import proyectofinalnutricionistagrupo93.Entidades.Dieta;
import proyectofinalnutricionistagrupo93.Entidades.Historial;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

public class Historial_De_Pacientes extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla = new DefaultTableModel();

    protected Paciente paciente = new Paciente(); //Datos del paciente.
    protected Data_Pacientes Data_Pac = new Data_Pacientes(); //Metodos del paciente.
    protected ArrayList<Paciente> listaPaci = new ArrayList<>();

    /**
     * Creates new form Consulta_De_Pacientes
     */
    public Historial_De_Pacientes() {
        initComponents();
        List<Paciente> listaPaci = Data_Pac.listarPacientes();
        crearTabla();
        cargarDatos((ArrayList<Paciente>) listaPaci);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSeleccionarPaciente = new javax.swing.JLabel();
        jcbSeleccionarPaciente = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaPac = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Historial de pacientes");

        jlSeleccionarPaciente.setText("Seleccione un paciente :");

        jcbSeleccionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSeleccionarPacienteActionPerformed(evt);
            }
        });

        jtTablaPac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jtTablaPac.setEnabled(false);
        jtTablaPac.setName(""); // NOI18N
        jtTablaPac.setPreferredSize(new java.awt.Dimension(350, 64));
        jScrollPane1.setViewportView(jtTablaPac);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlSeleccionarPaciente)
                        .addGap(18, 18, 18)
                        .addComponent(jcbSeleccionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSeleccionarPaciente)
                    .addComponent(jcbSeleccionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbSeleccionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSeleccionarPacienteActionPerformed

        int filaseleccionada = jcbSeleccionarPaciente.getSelectedIndex();// Selecciona la 
        if (filaseleccionada != -1) {
            Paciente p = (Paciente) jcbSeleccionarPaciente.getSelectedItem();
            int idPaciente = p.getIdPaciente();
            cargarHistorial(idPaciente);
        }
    }

    public void cargarHistorial(int idPaciente) {
        borrarFila();
        Data_Historial vdata = new Data_Historial();
        List<Historial> historial = vdata.buscarHistorialXPacientes(idPaciente);
        for (Historial visita : historial) {
            modeloTabla.addRow(new Object[]{visita.getIdHistorial(), visita.getIdPaciente(), visita.getPesoControl(), visita.getFechaRegistro()});
        }
    }//GEN-LAST:event_jcbSeleccionarPacienteActionPerformed

    private void crearTabla() {
        modeloTabla.addColumn("idHistorial");
        modeloTabla.addColumn("idPaciente");

        //modeloTabla.addColumn("Domicilio");
        //modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Peso actual");
        modeloTabla.addColumn("fecha Registro");
        jtTablaPac.setModel(modeloTabla);
    }

    private void cargarDatos(ArrayList<Paciente> listaPaci) {

        listaPaci.forEach((p) -> {
            jcbSeleccionarPaciente.addItem(p);
        });
        modeloTabla.addRow(new Object[]{paciente.getNombre(), paciente.getDni(), paciente.getDomicilio(), paciente.getTelefono(), paciente.getPesoActual(), paciente.getPesoDeseado()});
    }

    private void borrarFila() {
        int indice = modeloTabla.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
    }

    //modeloTabla.removeRow(i);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Paciente> jcbSeleccionarPaciente;
    private javax.swing.JLabel jlSeleccionarPaciente;
    private javax.swing.JTable jtTablaPac;
    // End of variables declaration//GEN-END:variables
}
