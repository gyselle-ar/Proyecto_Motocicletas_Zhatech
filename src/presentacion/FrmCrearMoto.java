
package presentacion;

public class FrmCrearMoto extends javax.swing.JInternalFrame {

    private final javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(
        getClass().getResource("/presentacion/imagenes/fondo_CrearMoto.png"));

    public FrmCrearMoto() {
        initComponents();

        try {
            setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }

        setFrameIcon(new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/icono_Ventana.png")));

        
        javax.swing.JPanel fondoPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconoOriginal.getImage(),
                    0, 0, getWidth(), getHeight(), this);
            }
        };
        fondoPanel.setLayout(null); 

        fondoPanel.add(btnMotoDeportiva);
        fondoPanel.add(btnMotoTrabajo);
        fondoPanel.add(btnMotoCruiser);

        
        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(fondoPanel, java.awt.BorderLayout.CENTER);

        
        fondoPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ajustarBotones(fondoPanel);
                hacerBotonesInvisibles();
            }
        });
    }

    private void ajustarBotones(javax.swing.JPanel panel) {
    int ancho = panel.getWidth();
    int alto  = panel.getHeight();
    if (ancho == 0 || alto == 0) return;

    int btnAncho = (int)(ancho * 0.24);
    int btnAlto  = (int)(alto  * 0.14);
    int btnY     = (int)(alto  * 0.30); 

    
    btnMotoCruiser.setBounds((int)(ancho * 0.08), btnY, btnAncho, btnAlto);
    btnMotoTrabajo.setBounds((int)(ancho * 0.39), btnY, btnAncho, btnAlto);
    btnMotoDeportiva.setBounds((int)(ancho * 0.67), btnY, btnAncho, btnAlto);
}

    private void hacerBotonesInvisibles() {
        javax.swing.JButton[] botones = {btnMotoDeportiva, btnMotoTrabajo, btnMotoCruiser};
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

        pnlCrearMoto = new javax.swing.JPanel();
        lbFondo = new javax.swing.JLabel();
        btnMotoCruiser = new javax.swing.JButton();
        btnMotoTrabajo = new javax.swing.JButton();
        btnMotoDeportiva = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear Moto");

        pnlCrearMoto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_CrearMoto.png"))); // NOI18N
        pnlCrearMoto.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        btnMotoCruiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoCruiserActionPerformed(evt);
            }
        });
        pnlCrearMoto.add(btnMotoCruiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 240, 70));

        btnMotoTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoTrabajoActionPerformed(evt);
            }
        });
        pnlCrearMoto.add(btnMotoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 230, 70));

        btnMotoDeportiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotoDeportivaActionPerformed(evt);
            }
        });
        pnlCrearMoto.add(btnMotoDeportiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 240, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCrearMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCrearMoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMotoCruiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotoCruiserActionPerformed
         FrmMotoCruiser frm = new FrmMotoCruiser();
    this.getDesktopPane().add(frm);
    frm.setVisible(true);
    frm.toFront();
    }//GEN-LAST:event_btnMotoCruiserActionPerformed

    private void btnMotoTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotoTrabajoActionPerformed
         FrmMotoTrabajo frm = new FrmMotoTrabajo();
    this.getDesktopPane().add(frm);
    frm.setVisible(true);
    frm.toFront();
    }//GEN-LAST:event_btnMotoTrabajoActionPerformed

    private void btnMotoDeportivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotoDeportivaActionPerformed
        FrmMotoDeportiva frm = new FrmMotoDeportiva();
    this.getDesktopPane().add(frm);
    frm.setVisible(true);
    frm.toFront();
    }//GEN-LAST:event_btnMotoDeportivaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMotoCruiser;
    private javax.swing.JButton btnMotoDeportiva;
    private javax.swing.JButton btnMotoTrabajo;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JPanel pnlCrearMoto;
    // End of variables declaration//GEN-END:variables
}
