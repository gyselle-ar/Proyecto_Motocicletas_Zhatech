
package presentacion;

/**
 *
 * @author carlo
 */
public class FrmMotoTrabajo extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmMotoTrabajo
     */
    public FrmMotoTrabajo() {
        initComponents();
        
        try {
        setMaximum(true);
    } catch (java.beans.PropertyVetoException e) {
        e.printStackTrace();
    }
        
        setFrameIcon(new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/icon_MotoTrabajo.png")));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTestResistencia = new javax.swing.JButton();
        btnValidarCom = new javax.swing.JButton();
        btnCrearMoto = new javax.swing.JButton();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_CrearTrabajo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));
        jPanel1.add(btnTestResistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 350, 70));
        jPanel1.add(btnValidarCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 310, 50));
        jPanel1.add(btnCrearMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 260, 60));

        cmbMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 170, 30));

        cmbManillar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbManillar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 170, 40));

        cmbRueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbRueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 170, 30));

        cmbCarenaje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbCarenaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 170, 30));

        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 230, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 990, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMoto;
    private javax.swing.JButton btnTestResistencia;
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
