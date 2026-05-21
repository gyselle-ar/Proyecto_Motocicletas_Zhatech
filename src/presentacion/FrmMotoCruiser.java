
package presentacion;


public class FrmMotoCruiser extends javax.swing.JInternalFrame {

    public FrmMotoCruiser() {
        initComponents();
        
        try {
        setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
        
        setFrameIcon(new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/icon_MotoCruiser.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTestConfort = new javax.swing.JButton();
        btnCrearYGenerar = new javax.swing.JButton();
        btnValidarCompatibilidad = new javax.swing.JButton();
        cmbMotor = new javax.swing.JComboBox<>();
        cmbManillar = new javax.swing.JComboBox<>();
        cmbRueda = new javax.swing.JComboBox<>();
        cmbCarenaje = new javax.swing.JComboBox<>();
        cmbMarca = new javax.swing.JComboBox<>();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_CrearCruiser.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnTestConfort.setText("jButton2");
        btnTestConfort.addActionListener(this::btnTestConfortActionPerformed);
        jPanel1.add(btnTestConfort, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 350, 70));

        btnCrearYGenerar.setText("jButton1");
        jPanel1.add(btnCrearYGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 260, 60));

        btnValidarCompatibilidad.setText("jButton1");
        jPanel1.add(btnValidarCompatibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 310, 50));

        cmbMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 40));

        cmbManillar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbManillar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 170, 40));

        cmbRueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbRueda.addActionListener(this::cmbRuedaActionPerformed);
        jPanel1.add(cmbRueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 170, 30));

        cmbCarenaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbCarenaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 170, 30));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestConfortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestConfortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTestConfortActionPerformed

    private void cmbRuedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRuedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRuedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearYGenerar;
    private javax.swing.JButton btnTestConfort;
    private javax.swing.JButton btnValidarCompatibilidad;
    private javax.swing.JComboBox<String> cmbCarenaje;
    private javax.swing.JComboBox<String> cmbManillar;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbMotor;
    private javax.swing.JComboBox<String> cmbRueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
