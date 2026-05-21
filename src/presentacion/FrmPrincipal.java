package presentacion;

import java.awt.Color;
import java.awt.Graphics;

public class FrmPrincipal extends javax.swing.JFrame {

    private final javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/fondo_Inicio.png"));

    public FrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(Escritorio, java.awt.BorderLayout.CENTER);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            
            public void windowOpened(java.awt.event.WindowEvent e) {
                ajustarFondo();
                ajustarBotones();

               
                for (java.awt.Component c : Escritorio.getComponents()) {
                    if (c instanceof javax.swing.JButton) {
                        javax.swing.JButton btn = (javax.swing.JButton) c;
                        btn.setOpaque(false);
                        btn.setContentAreaFilled(false);
                        btn.setBorderPainted(false);
                        btn.setFocusPainted(false);
                        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                    }
                }

            }

        });

        Escritorio.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ajustarFondo();
                ajustarBotones();

            }
        });

        setIconImage(new javax.swing.ImageIcon(
        getClass().getResource("/presentacion/imagenes/icono_Ventana.png")
        ).getImage());
            
    }

    private void ajustarFondo() {

        int ancho = Escritorio.getWidth();
        int alto = Escritorio.getHeight();
        if (ancho == 0 || alto == 0) {
            return;
        }

        java.awt.Image img = iconoOriginal.getImage()
                .getScaledInstance(ancho, alto, java.awt.Image.SCALE_SMOOTH);

        lbFondo.setIcon(new javax.swing.ImageIcon(img));
        lbFondo.setBounds(0, 0, ancho, alto);
        Escritorio.moveToBack(lbFondo);

    }

    private void ajustarBotones() {

        int ancho = Escritorio.getWidth();
        int alto = Escritorio.getHeight();
        if (ancho == 0 || alto == 0) {
            return;
        }

        int btnAncho = (int) (ancho * 0.22);
        int btnAlto = (int) (alto * 0.10);
        int btnX = (int) (ancho * 0.04);

        btnCrearMoto.setBounds(btnX, (int) (alto * 0.52), btnAncho, btnAlto);
        btnHistorial_Reporte.setBounds(btnX, (int) (alto * 0.64), btnAncho, btnAlto);
        btnSalir.setBounds(btnX, (int) (alto * 0.76), btnAncho, btnAlto);
        btnEasterEgg.setBounds((int) (ancho * 0.48), (int) (alto * 0.16), 30, 30);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Escritorio = new javax.swing.JDesktopPane(){

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.white);
                g.fillRect(0, 0, getWidth(), getHeight());

            }

        }
        ;
        lbFondo = new javax.swing.JLabel();
        btnCrearMoto = new javax.swing.JButton();
        btnHistorial_Reporte = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEasterEgg = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZhaTech : Simulador de Motocicletas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Escritorio.setName(""); // NOI18N

        lbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_Inicio.png"))); // NOI18N
        Escritorio.add(lbFondo);
        lbFondo.setBounds(0, 0, 1000, 550);

        btnCrearMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMotoActionPerformed(evt);
            }
        });
        Escritorio.add(btnCrearMoto);
        btnCrearMoto.setBounds(40, 280, 220, 60);

        btnHistorial_Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorial_ReporteActionPerformed(evt);
            }
        });
        Escritorio.add(btnHistorial_Reporte);
        btnHistorial_Reporte.setBounds(40, 350, 220, 60);

        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Escritorio.add(btnSalir);
        btnSalir.setBounds(40, 420, 220, 60);

        btnEasterEgg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEasterEggActionPerformed(evt);
            }
        });
        Escritorio.add(btnEasterEgg);
        btnEasterEgg.setBounds(490, 100, 30, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMotoActionPerformed
        FrmCrearMoto frm = new FrmCrearMoto();
        Escritorio.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_btnCrearMotoActionPerformed

    private void btnHistorial_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorial_ReporteActionPerformed
        FrmHistorial_Registro frm = new FrmHistorial_Registro();
        Escritorio.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_btnHistorial_ReporteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    
    int respuesta = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "¿Estás seguro que deseas salir?",
        "Cerrar aplicación",
        javax.swing.JOptionPane.YES_NO_OPTION,
        javax.swing.JOptionPane.QUESTION_MESSAGE
    );
    
    if (respuesta == javax.swing.JOptionPane.YES_OPTION) {
        System.exit(0);
    }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEasterEggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEasterEggActionPerformed
        FrmUsuario frm = new FrmUsuario();
        Escritorio.add(frm);
        frm.setVisible(true);
    }//GEN-LAST:event_btnEasterEggActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton btnCrearMoto;
    private javax.swing.JButton btnEasterEgg;
    private javax.swing.JButton btnHistorial_Reporte;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables

}
