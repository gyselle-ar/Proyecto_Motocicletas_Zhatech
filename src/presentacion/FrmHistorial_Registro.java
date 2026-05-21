
package presentacion;
 
public class FrmHistorial_Registro extends javax.swing.JInternalFrame {
 
    
    private final javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(
        getClass().getResource("/presentacion/imagenes/fondo_Historial&Reporte.png"));
 
    
    public FrmHistorial_Registro() {
        initComponents();
 
        try {
            setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
 
        setFrameIcon(new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/icono_Ventana.png")
        ));
 
        
        getContentPane().removeAll();
 
        
        javax.swing.JPanel pnlFondo = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconoOriginal.getImage(),
                    0, 0, getWidth(), getHeight(), this);
            }
        };
        pnlFondo.setLayout(null);
 
        
        pnlFondo.add(jScrollPane1);
        pnlFondo.add(btnBuscarReporte);
        pnlFondo.add(btnEliminarMoto);
        pnlFondo.add(txtBuscar);
        pnlFondo.add(lbMotosCreadas);
        pnlFondo.add(btnVolver);
 
        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);
 
        pnlFondo.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ajustarComponentes(pnlFondo);
            }
        });
 
        hacerBotonesInvisibles();
 
        
        jTable1.setOpaque(false);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
 
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        
        txtBuscar.setBorder(new javax.swing.border.LineBorder(
        java.awt.Color.GRAY,  
        2,                     
        true                   
));
 
        
    }
 
    
    private void ajustarComponentes(javax.swing.JPanel panel) {
        int ancho = panel.getWidth();
        int alto  = panel.getHeight();
        if (ancho == 0 || alto == 0) return;
 
        
        btnVolver.setBounds(
            (int)(ancho * 0.04),
            (int)(alto  * 0.04),
            (int)(ancho * 0.06),
            (int)(alto  * 0.08)
        );
 
        
        txtBuscar.setBounds(
            (int)(ancho * 0.06),
            (int)(alto  * 0.31),
            (int)(ancho * 0.43),
            (int)(alto  * 0.06)
        );
 
        
        btnBuscarReporte.setBounds(
            (int)(ancho * 0.51),
            (int)(alto  * 0.30),
            (int)(ancho * 0.20),
            (int)(alto  * 0.06)
        );
 
        
        btnEliminarMoto.setBounds(
            (int)(ancho * 0.75),
            (int)(alto  * 0.30),
            (int)(ancho * 0.20),
            (int)(alto  * 0.06)
        );
 
        
        jScrollPane1.setBounds(
            (int)(ancho * 0.05),
            (int)(alto  * 0.48),
            (int)(ancho * 0.90),
            (int)(alto  * 0.30)
        );
 
        
        lbMotosCreadas.setBounds(
            (int)(ancho * 0.15),
            (int)(alto  * 0.83),
            (int)(ancho * 0.30),
            (int)(alto  * 0.05)
                
             
        );
        
        jScrollPane1.revalidate();
        jScrollPane1.repaint();
        jTable1.repaint();
    }
 
    
    private void hacerBotonesInvisibles() {
        javax.swing.JButton[] botones = {btnBuscarReporte, btnEliminarMoto, btnVolver};
        for (javax.swing.JButton btn : botones) {
            btn.setOpaque(false);
            btn.setContentAreaFilled(false);
            btn.setBorderPainted(false);
            btn.setFocusPainted(false);
            btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBuscarReporte = new javax.swing.JButton();
        btnEliminarMoto = new javax.swing.JButton();
        lbMotosCreadas = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_Historial&Reporte.png"))); // NOI18N
        pnlFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        txtBuscar.setBackground(new java.awt.Color(43, 47, 54));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setBorder(null);
        txtBuscar.addActionListener(this::txtBuscarActionPerformed);
        pnlFondo.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 430, 40));

        jTable1.setBackground(new java.awt.Color(31, 39, 68));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 900, 220));

        btnBuscarReporte.addActionListener(this::btnBuscarReporteActionPerformed);
        pnlFondo.add(btnBuscarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 200, 50));

        btnEliminarMoto.addActionListener(this::btnEliminarMotoActionPerformed);
        pnlFondo.add(btnEliminarMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 200, 50));
        pnlFondo.add(lbMotosCreadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 656, 50, 30));

        btnVolver.addActionListener(this::btnVolverActionPerformed);
        pnlFondo.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 33, -1, 60));

        getContentPane().add(pnlFondo);
        pnlFondo.setBounds(6, 0, 1000, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReporteActionPerformed
       
    }//GEN-LAST:event_btnBuscarReporteActionPerformed

    private void btnEliminarMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMotoActionPerformed
         
    }//GEN-LAST:event_btnEliminarMotoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmPrincipal frm = new FrmPrincipal();
        this.getDesktopPane().add(frm);
        frm.setVisible(true);
        frm.toFront();
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarReporte;
    private javax.swing.JButton btnEliminarMoto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbMotosCreadas;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
