package presentacion;

import entidades.Componente;
import entidades.MotoCruiser;
import entidades.MotoDeportiva;
import entidades.MotoTrabajo;
import entidades.Motocicleta;
import entidades.Reporte;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import entidades.ValidadorCompatibilidad;
import javax.swing.JComboBox;

public class FrmCrearMoto extends javax.swing.JFrame {

    private ValidadorCompatibilidad validador;
    private Motocicleta moto;

    public FrmCrearMoto() {

        initComponents();

        validador = new ValidadorCompatibilidad();

        cargarTiposMoto();
        cargarComponentes();
    }

    public void cargarTiposMoto(){

        cbTipoMoto.addItem("Deportiva");
        cbTipoMoto.addItem("Trabajo");
        cbTipoMoto.addItem("Cruiser");
    }

    public void cargarComponentes(){

        cbMotor.addItem("Ninja H2");
        cbMotor.addItem("Panigale");
        cbMotor.addItem("Milwaukee");

        cbRuedas.addItem("Pirelli");
        cbRuedas.addItem("Michelin");
        cbRuedas.addItem("Bridgestone");

        cbCarenaje.addItem("Fibra de Carbono");
        cbCarenaje.addItem("Racing");
        cbCarenaje.addItem("Touring");

        cbManillar.addItem("Deportivo");
        cbManillar.addItem("Básico");
        cbManillar.addItem("Ergonómico");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        cbTipoMoto = new javax.swing.JComboBox<>();
        btnValidar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();
        btnCrear = new javax.swing.JButton();
        cbMarca = new javax.swing.JComboBox<>();
        cbMotor = new javax.swing.JComboBox<>();
        cbRuedas = new javax.swing.JComboBox<>();
        cbCarenaje = new javax.swing.JComboBox<>();
        cbManillar = new javax.swing.JComboBox<>();

        setTitle("Crear Motocicleta");
        setBackground(new java.awt.Color(153, 204, 255));

        cbTipoMoto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorias" }));
        cbTipoMoto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbTipoMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoMotoActionPerformed(evt);
            }
        });

        btnValidar.setText("Validar");
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtReporte.setColumns(20);
        txtReporte.setRows(5);
        txtReporte.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(txtReporte);

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Marca", " " }));
        cbMarca.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMarcaActionPerformed(evt);
            }
        });

        cbMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Motor" }));
        cbMotor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotorActionPerformed(evt);
            }
        });

        cbRuedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruedas" }));
        cbRuedas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbRuedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRuedasActionPerformed(evt);
            }
        });

        cbCarenaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carenaje" }));
        cbCarenaje.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbCarenaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCarenajeActionPerformed(evt);
            }
        });

        cbManillar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manillar" }));
        cbManillar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbManillar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbManillarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTipoMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnValidar)
                        .addGap(38, 38, 38)
                        .addComponent(btnCrear))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCarenaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbManillar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cbTipoMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCarenaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbManillar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnValidar)
                            .addComponent(btnCrear)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoMotoActionPerformed
         JComboBox<String> cbTipoMoto = new JComboBox<>();
        

    }//GEN-LAST:event_cbTipoMotoActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
       String motor =
        cbMotor.getSelectedItem().toString();

        String ruedas =
        cbRuedas.getSelectedItem().toString();

        String carenaje =
        cbCarenaje.getSelectedItem().toString();

        String manillar =
        cbManillar.getSelectedItem().toString();

        List<String> mensajes = new ArrayList<>();

        mensajes.add(
        validador.validarCompatibilidad(
        motor,
        ruedas
        ));

        mensajes.add(
        validador.validarCompatibilidad(
        motor,
        manillar
        ));

        mensajes.add(
        validador.validarCompatibilidad(
        carenaje,
        ruedas
        ));

        boolean incompatible = false;

        for(String mensaje : mensajes){

            if(!mensaje.equals("Componentes Compatibles")){

                JOptionPane.showMessageDialog(
                null,
                mensaje
                );

                incompatible = true;
            }
        }

        if(!incompatible){

            JOptionPane.showMessageDialog(
            null,
            "Configuración válida."
            );
        }
    
    }//GEN-LAST:event_btnValidarActionPerformed

    private void cbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarcaActionPerformed

    }//GEN-LAST:event_cbMarcaActionPerformed

    private void cbMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotorActionPerformed

    private void cbRuedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRuedasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRuedasActionPerformed

    private void cbCarenajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCarenajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCarenajeActionPerformed

    private void cbManillarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbManillarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbManillarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String tipoMoto =
        cbTipoMoto.getSelectedItem().toString();

        if(tipoMoto.equals("Deportiva")){

            moto = new MotoDeportiva();

        }else if(tipoMoto.equals("Trabajo")){

            moto = new MotoTrabajo();

        }else{

            moto = new MotoCruiser();
        }

        Componente motor = new Componente();
        motor.setNombre(
        cbMotor.getSelectedItem().toString()
        );
        motor.setCategoria("Motor");

        Componente ruedas = new Componente();
        ruedas.setNombre(
        cbRuedas.getSelectedItem().toString()
        );
        ruedas.setCategoria("Ruedas");

        Componente carenaje = new Componente();
        carenaje.setNombre(
        cbCarenaje.getSelectedItem().toString()
        );
        carenaje.setCategoria("Carenaje");

        Componente manillar = new Componente();
        manillar.setNombre(
        cbManillar.getSelectedItem().toString()
        );
        manillar.setCategoria("Manillar");

        Reporte reporte =
        moto.generarReporte();

        txtReporte.setText(
        reporte.getDescripcion()
        );

        JOptionPane.showMessageDialog(
        null,
        "Motocicleta creada correctamente."
        );
    

    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnValidar;
    private javax.swing.JComboBox<String> cbCarenaje;
    private javax.swing.JComboBox<String> cbManillar;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbMotor;
    private javax.swing.JComboBox<String> cbRuedas;
    private javax.swing.JComboBox<String> cbTipoMoto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtReporte;
    // End of variables declaration//GEN-END:variables
}
