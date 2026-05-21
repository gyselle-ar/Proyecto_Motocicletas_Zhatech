
package presentacion;


public class FrmMotoDeportiva extends javax.swing.JInternalFrame {

    public FrmMotoDeportiva() {
        initComponents();
        
         try {
        setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
        
         setFrameIcon(new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/icon_MotoDeportiva.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnActivarTurbo = new javax.swing.JButton();
        btnModoPista = new javax.swing.JButton();
        btnCrearMoto_Reporte = new javax.swing.JButton();
        btnValidarCom = new javax.swing.JButton();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_CrearDeportiva.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));
        jPanel1.add(btnActivarTurbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 330, 50));
        jPanel1.add(btnModoPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 330, 50));

        btnCrearMoto_Reporte.addActionListener(this::btnCrearMoto_ReporteActionPerformed);
        jPanel1.add(btnCrearMoto_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 250, 60));
        jPanel1.add(btnValidarCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 300, 50));

        cmbMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 170, 40));

        cmbManillar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbManillar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 170, 30));

        cmbRueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbRueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 170, 40));

        cmbCarenaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbCarenaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 170, 40));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 230, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMoto_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMoto_ReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearMoto_ReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarTurbo;
    private javax.swing.JButton btnCrearMoto_Reporte;
    private javax.swing.JButton btnModoPista;
    private javax.swing.JButton btnValidarCom;
    private javax.swing.JComboBox<String> cmbCarenaje;
    private javax.swing.JComboBox<String> cmbManillar;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JComboBox<String> cmbMotor;
    private javax.swing.JComboBox<String> cmbRueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
