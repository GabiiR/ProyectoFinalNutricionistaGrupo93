package proyectofinalnutricionistagrupo93.Vistas;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyectofinalnutricionistagrupo93.AccesoADatos.Data_Comidas;
import proyectofinalnutricionistagrupo93.Entidades.Comida;
import proyectofinalnutricionistagrupo93.Entidades.DietaComida;
import proyectofinalnutricionistagrupo93.Entidades.Paciente;

public class Lista_De_Comidas extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla = new DefaultTableModel();

    protected Comida comida = new Comida();
    protected Data_Comidas Data_Com = new Data_Comidas();
    protected ArrayList<Comida> listacomidas = new ArrayList<>();

    /**
     * Creates new form Listado_De_Comidas
     */
    public Lista_De_Comidas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaComida = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMayorA = new javax.swing.JTextField();
        jMenorA = new javax.swing.JTextField();
        jBuscar = new javax.swing.JButton();
        jLimpiar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lista de comidas");

        jtTablaComida.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaComida.setEnabled(false);
        jtTablaComida.setName(""); // NOI18N
        jtTablaComida.setPreferredSize(new java.awt.Dimension(350, 64));
        jScrollPane1.setViewportView(jtTablaComida);

        jLabel12.setText("Cantidad de Calorias");

        jLabel1.setText("Mayor A");

        jLabel2.setText("Menor A");

        jMayorA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMayorAActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jLimpiar.setText("Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
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
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jMayorA, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jMenorA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jMayorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMenorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLimpiar)
                    .addComponent(jSalir))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMayorAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMayorAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMayorAActionPerformed
    private void cargaComidas() {
        Integer mayor = Integer.parseInt(jMayorA.getText());
        Integer menor = Integer.parseInt(jMenorA.getText());
        
        listacomidas = (ArrayList) Data_Com.listaComidaXfiltro(mayor,menor);
        for (Comida c : listacomidas) {
            modeloTabla.addRow(new Object[]{c.getIdComida(),c.getNombre(),c.getDetalle(),c.getCantCalorias()});
        }
    }

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        List<Comida> listacomidas = Data_Com.listaComida();
        crearTabla();
        cargaComidas();
    }//GEN-LAST:event_jBuscarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSalirActionPerformed
    private void crearTabla() {
        modeloTabla.addColumn("");
        modeloTabla.addColumn("");
        modeloTabla.addColumn("");
        modeloTabla.addColumn("");
        jtTablaComida.setModel(modeloTabla);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JTextField jMayorA;
    private javax.swing.JTextField jMenorA;
    private javax.swing.JButton jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTablaComida;
    // End of variables declaration//GEN-END:variables
}
