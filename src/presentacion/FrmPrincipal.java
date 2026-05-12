package presentacion;

import java.awt.Color;
import java.awt.Graphics;


public class FrmPrincipal extends javax.swing.JFrame {


    public FrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        Escritorio = new javax.swing.JDesktopPane(){

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.cyan);
                g.fillRect(0, 0, getWidth(), getHeight());

            }

        }
        ;
        btnCrearMoto = new javax.swing.JButton();
        btnVerMotosCreadas = new javax.swing.JButton();
        btnVerReportes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ZhaTech : Simulador de Motocicletas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Escritorio.setName(""); // NOI18N

        btnCrearMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/crear_moto.png"))); // NOI18N
        btnCrearMoto.setText("Crear Moto");
        btnCrearMoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMotoActionPerformed(evt);
            }
        });
        Escritorio.add(btnCrearMoto);
        btnCrearMoto.setBounds(10, 60, 140, 50);

        btnVerMotosCreadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/historial_motos.png"))); // NOI18N
        btnVerMotosCreadas.setText("Motos Creadas");
        btnVerMotosCreadas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerMotosCreadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMotosCreadasActionPerformed(evt);
            }
        });
        Escritorio.add(btnVerMotosCreadas);
        btnVerMotosCreadas.setBounds(10, 220, 170, 50);

        btnVerReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/repotes_moto.png"))); // NOI18N
        btnVerReportes.setText("Ver Reportes");
        btnVerReportes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Escritorio.add(btnVerReportes);
        btnVerReportes.setBounds(10, 140, 160, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/salida.png"))); // NOI18N
        jButton2.setText("Salida");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Escritorio.add(jButton2);
        jButton2.setBounds(10, 300, 150, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMotoActionPerformed
        FrmCrearMoto frm = new FrmCrearMoto ();
        Escritorio.add(frm);
        frm.setVisible(true);

    }//GEN-LAST:event_btnCrearMotoActionPerformed

    private void btnVerMotosCreadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMotosCreadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerMotosCreadasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton btnCrearMoto;
    private javax.swing.JButton btnVerMotosCreadas;
    private javax.swing.JButton btnVerReportes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}

