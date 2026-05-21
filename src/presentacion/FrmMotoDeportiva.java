
package presentacion;

import entidades.Componente;
import entidades.Marca;
import entidades.MotoDeportiva;
import entidades.TipoMoto;
import entidades.ValidadorCompatibilidad;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.ComponenteControl;
import negocio.MarcaControl;
import negocio.MotocicletaControl;


public class FrmMotoDeportiva extends javax.swing.JInternalFrame {

   private final javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(
        getClass().getResource("/presentacion/imagenes/fondo_CrearDeportiva.png"));
 
    private final MarcaControl CONTROLMARCA;
    private final ComponenteControl CONTROLCOMPONENTE;
    private final MotocicletaControl CONTROLMOTO;
    private MotoDeportiva moto;
   
    public FrmMotoDeportiva() {
        initComponents();
       
        CONTROLMARCA = new MarcaControl();
        CONTROLCOMPONENTE = new ComponenteControl();
        CONTROLMOTO = new MotocicletaControl();
        moto = new MotoDeportiva();
        
        cargarMarcas();
        cargarComponentes();
        
        try {
            setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
 
        setFrameIcon(new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/icon_MotoDeportiva.png")));
 
        getContentPane().removeAll();
 
        javax.swing.JPanel pnlFondo = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconoOriginal.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        pnlFondo.setLayout(null);
 
        pnlFondo.add(btnActivarTurbo);
        pnlFondo.add(btnModoPista);
        pnlFondo.add(btnCrearMoto_Reporte);
        pnlFondo.add(btnValidarCom);
        pnlFondo.add(cmbMarca);
        pnlFondo.add(cmbMotor);
        pnlFondo.add(cmbManillar);
        pnlFondo.add(cmbRueda);
        pnlFondo.add(cmbCarenaje);
 
        getContentPane().setLayout(new java.awt.BorderLayout());
        getContentPane().add(pnlFondo, java.awt.BorderLayout.CENTER);
 
        pnlFondo.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                ajustarComponentes(pnlFondo);
            }
        });
 
        hacerBotonesInvisibles();
    }
 
    private void cargarMarcas() {
        cmbMarca.removeAllItems();
        List<Marca> lista = CONTROLMARCA.listarPorTipoMoto(1);

        for(Marca item : lista){
            cmbMarca.addItem(item);
        }
    }
    
    private void cargarComponentes() {

        cmbMotor.removeAllItems();
        cmbRueda.removeAllItems();
        cmbManillar.removeAllItems();
        cmbCarenaje.removeAllItems();

        List<Componente> lista = CONTROLCOMPONENTE.listarPorTipoMoto(1);

        for(Componente item : lista){

            switch(item.getCategoria()){

            case "Motor":
                cmbMotor.addItem(item);
                break;

            case "Rueda":
                cmbRueda.addItem(item);
                break;

            case "Manillar":
                cmbManillar.addItem(item);
                break;

            case "Carenaje":
                cmbCarenaje.addItem(item);
                break;
        }
    }
}
    
    private void ajustarComponentes(javax.swing.JPanel panel) {
        int ancho = panel.getWidth();
        int alto  = panel.getHeight();
        if (ancho == 0 || alto == 0) return;
 
        
        cmbMarca.setBounds(
            (int)(ancho * 0.04),
            (int)(alto  * 0.25),
            (int)(ancho * 0.24),
            (int)(alto  * 0.06)
        ); 
        cmbMotor.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.21),
            (int)(ancho * 0.19),
            (int)(alto  * 0.06)
        );
        cmbManillar.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.29),
            (int)(ancho * 0.19),
            (int)(alto  * 0.06)
        );
        cmbRueda.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.37),
            (int)(ancho * 0.19),
            (int)(alto  * 0.06)
        );
        cmbCarenaje.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.45),
            (int)(ancho * 0.19),
            (int)(alto  * 0.06)
        );
        btnValidarCom.setBounds(
            (int)(ancho * 0.65),
            (int)(alto  * 0.48),
            (int)(ancho * 0.30),
            (int)(alto  * 0.07)
        );
        btnActivarTurbo.setBounds(
            (int)(ancho * 0.31),
            (int)(alto  * 0.64),
            (int)(ancho * 0.33),
            (int)(alto  * 0.07)
        );
        btnModoPista.setBounds(
            (int)(ancho * 0.31),
            (int)(alto  * 0.73),
            (int)(ancho * 0.33),
            (int)(alto  * 0.07)
        );
        btnCrearMoto_Reporte.setBounds(
            (int)(ancho * 0.69),
            (int)(alto  * 0.82),
            (int)(ancho * 0.25),
            (int)(alto  * 0.09)
        );
    }
 
    private void hacerBotonesInvisibles() {
        javax.swing.JButton[] botones = {
            btnActivarTurbo, btnModoPista, btnCrearMoto_Reporte, btnValidarCom
        };
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

        jPanel1 = new javax.swing.JPanel();
        txtValidacionCom = new javax.swing.JLabel();
        btnActivarTurbo = new javax.swing.JButton();
        btnModoPista = new javax.swing.JButton();
        btnCrearMoto_Reporte = new javax.swing.JButton();
        btnValidarCom = new javax.swing.JButton();
        cmbMotor = new javax.swing.JComboBox<>();
        cmbManillar = new javax.swing.JComboBox<>();
        cmbRueda = new javax.swing.JComboBox<>();
        cmbCarenaje = new javax.swing.JComboBox<>();
        cmbMarca = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtValidacionCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 300, 120));

        btnActivarTurbo.addActionListener(this::btnActivarTurboActionPerformed);
        jPanel1.add(btnActivarTurbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 330, 50));

        btnModoPista.addActionListener(this::btnModoPistaActionPerformed);
        jPanel1.add(btnModoPista, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 490, 330, 50));

        btnCrearMoto_Reporte.addActionListener(this::btnCrearMoto_ReporteActionPerformed);
        jPanel1.add(btnCrearMoto_Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 250, 60));

        btnValidarCom.addActionListener(this::btnValidarComActionPerformed);
        jPanel1.add(btnValidarCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 300, 50));

        cmbMotor.setBackground(new java.awt.Color(43, 47, 54));
        cmbMotor.setForeground(new java.awt.Color(255, 255, 255));
        cmbMotor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmbMotor.addActionListener(this::cmbMotorActionPerformed);
        jPanel1.add(cmbMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 180, 40));

        cmbManillar.setBackground(new java.awt.Color(43, 47, 54));
        cmbManillar.setForeground(new java.awt.Color(255, 255, 255));
        cmbManillar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmbManillar.addActionListener(this::cmbManillarActionPerformed);
        jPanel1.add(cmbManillar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 180, 41));
        cmbManillar.getAccessibleContext().setAccessibleName("");

        cmbRueda.setBackground(new java.awt.Color(43, 47, 54));
        cmbRueda.setForeground(new java.awt.Color(255, 255, 255));
        cmbRueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbRueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 243, 180, 41));

        cmbCarenaje.setBackground(new java.awt.Color(43, 47, 54));
        cmbCarenaje.setForeground(new java.awt.Color(255, 255, 255));
        cmbCarenaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbCarenaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 180, 40));

        cmbMarca.setBackground(new java.awt.Color(43, 47, 54));
        cmbMarca.setForeground(new java.awt.Color(255, 255, 255));
        cmbMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cmbMarca.addActionListener(this::cmbMarcaActionPerformed);
        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_CrearDeportiva.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearMoto_ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMoto_ReporteActionPerformed
        Marca marca = (Marca) cmbMarca.getSelectedItem();

        TipoMoto tipoMoto = new TipoMoto();
        tipoMoto.setIdTipoMoto(1);
        tipoMoto.setNombre("Deportiva");

        LocalDate fecha = LocalDate.now();

        Componente motor = (Componente) cmbMotor.getSelectedItem();
        Componente rueda = (Componente) cmbRueda.getSelectedItem();
        Componente manillar = (Componente) cmbManillar.getSelectedItem();
        Componente carenaje = (Componente) cmbCarenaje.getSelectedItem();

        List<Componente> componentes = new ArrayList<>();

        componentes.add(motor);
        componentes.add(rueda);
        componentes.add(manillar);
        componentes.add(carenaje);

        String resultado = CONTROLMOTO.crearMotoDeportiva(marca, tipoMoto, fecha, componentes, moto.isTurboActivado(), moto.isModoPista());

    JOptionPane.showMessageDialog(this, resultado);
    }//GEN-LAST:event_btnCrearMoto_ReporteActionPerformed

    private void cmbMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMotorActionPerformed

    private void cmbManillarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbManillarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbManillarActionPerformed

    private void btnValidarComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarComActionPerformed
        Componente motor = (Componente) cmbMotor.getSelectedItem();
        Componente rueda = (Componente) cmbRueda.getSelectedItem();
        Componente manillar = (Componente) cmbManillar.getSelectedItem();
        Componente carenaje = (Componente) cmbCarenaje.getSelectedItem();

        List<Componente> componentes = new ArrayList<>();

        componentes.add(motor);
        componentes.add(rueda);
        componentes.add(manillar);
        componentes.add(carenaje);

        ValidadorCompatibilidad validador = new ValidadorCompatibilidad();

        for (int i = 0; i < componentes.size(); i++) {
            for (int j = i + 1; j < componentes.size(); j++) {

            String resultado = validador.validarCompatibilidad(
                    componentes.get(i).getNombre(),
                    componentes.get(j).getNombre()
            );

            if (!resultado.equals("Componentes Compatibles")) {
                JOptionPane.showMessageDialog(this, resultado);
                return;
            }
        }
    }

    JOptionPane.showMessageDialog(this, "Todos los componentes son compatibles");
    }//GEN-LAST:event_btnValidarComActionPerformed

    private void btnActivarTurboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarTurboActionPerformed
        moto.setTurboActivado(true);
        JOptionPane.showMessageDialog(null, "Turbo activado");
    }//GEN-LAST:event_btnActivarTurboActionPerformed

    private void btnModoPistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoPistaActionPerformed
        moto.setModoPista(true);
        JOptionPane.showMessageDialog(null, "Modo Pista activado");
    }//GEN-LAST:event_btnModoPistaActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarTurbo;
    private javax.swing.JButton btnCrearMoto_Reporte;
    private javax.swing.JButton btnModoPista;
    private javax.swing.JButton btnValidarCom;
    private javax.swing.JComboBox<Componente> cmbCarenaje;
    private javax.swing.JComboBox<Componente> cmbManillar;
    private javax.swing.JComboBox<Marca> cmbMarca;
    private javax.swing.JComboBox<Componente> cmbMotor;
    private javax.swing.JComboBox<Componente> cmbRueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtValidacionCom;
    // End of variables declaration//GEN-END:variables
}
