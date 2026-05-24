package presentacion;

import javax.swing.JTextArea;

public class FrmPestañaReporte extends javax.swing.JInternalFrame {

    private final javax.swing.ImageIcon iconoOriginal =
            new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_Reporte.png"));

    public FrmPestañaReporte(String reporte) {
        javax.swing.JPanel pnlFondo = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                g.drawImage(
                        iconoOriginal.getImage(),
                        0, 0,
                        getWidth(),
                        getHeight(),
                        this
                );
            }
        };
        
        initComponents();
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/icono_Ventana.png")));

        txtReporte.setText(reporte);
        txtReporte.setEditable(false);
        txtReporte.setLineWrap(true);
        txtReporte.setWrapStyleWord(true);
        
        pnlFondo.setLayout(null);
        jScrollPane1.setBounds(400, 188, 560, 330);
        pnlFondo.add(jScrollPane1);
        getContentPane().setLayout(new java.awt.BorderLayout()); 
        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);
        
        addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent e) {
                try {
                    setMaximum(true);
                } catch (java.beans.PropertyVetoException ex) {
                    ex.printStackTrace();
                }
            }
        });
         
    }

    public JTextArea getTxtReporte() {
        return txtReporte;
    }

    public void setTxtReporte(JTextArea txtReporte) {
        this.txtReporte = txtReporte;
    }

    public FrmPestañaReporte() {
        this("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReporte = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        txtReporte.setBackground(new java.awt.Color(43, 47, 54));
        txtReporte.setColumns(20);
        txtReporte.setForeground(new java.awt.Color(255, 255, 255));
        txtReporte.setRows(5);
        txtReporte.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(txtReporte);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 420, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_Reporte.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtReporte;
    // End of variables declaration//GEN-END:variables
}
