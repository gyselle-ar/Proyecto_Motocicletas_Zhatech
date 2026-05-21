
package presentacion;

import entidades.Componente;
import entidades.Marca;
import entidades.MotoTrabajo;
import entidades.TipoMoto;
import entidades.ValidadorCompatibilidad;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.ComponenteControl;
import negocio.MarcaControl;
import negocio.MotocicletaControl;


public class FrmMotoTrabajo extends javax.swing.JInternalFrame {

    private final javax.swing.ImageIcon iconoOriginal = new javax.swing.ImageIcon(
        getClass().getResource("/presentacion/imagenes/fondo_CrearTrabajo.png"));
    
    private final MarcaControl CONTROLMARCA;
    private final ComponenteControl CONTROLCOMPONENTE;
    private final MotocicletaControl CONTROLMOTO;
    private MotoTrabajo moto;
 
    public FrmMotoTrabajo() {
        initComponents();
 
        CONTROLMARCA = new MarcaControl();
        CONTROLCOMPONENTE = new ComponenteControl();
        CONTROLMOTO = new MotocicletaControl();
        moto = new MotoTrabajo();
                
        cargarMarcas();
        cargarComponentes();
        
        try {
            setMaximum(true);
        } catch (java.beans.PropertyVetoException e) {
            e.printStackTrace();
        }
 
        setFrameIcon(new javax.swing.ImageIcon(
            getClass().getResource("/presentacion/imagenes/icon_MotoTrabajo.png")));
 
        getContentPane().removeAll();
 
        javax.swing.JPanel pnlFondo = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(java.awt.Graphics g) {
                super.paintComponent(g);
                g.drawImage(iconoOriginal.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        pnlFondo.setLayout(null);
 
        pnlFondo.add(btnTestResistencia);
        pnlFondo.add(btnValidarCom);
        pnlFondo.add(btnCrearMoto);
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
        List<Marca> lista = CONTROLMARCA.listarPorTipoMoto(2);

        for(Marca item : lista){
            cmbMarca.addItem(item);
        }
    }
    
    private void cargarComponentes() {

        cmbMotor.removeAllItems();
        cmbRueda.removeAllItems();
        cmbManillar.removeAllItems();
        cmbCarenaje.removeAllItems();

        List<Componente> lista = CONTROLCOMPONENTE.listarPorTipoMoto(2);

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
            (int)(alto  * 0.28),
            (int)(ancho * 0.23),
            (int)(alto  * 0.06)
        );
 
        
        cmbMotor.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.22),
            (int)(ancho * 0.17),
            (int)(alto  * 0.06)
        );
        cmbManillar.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.30),
            (int)(ancho * 0.17),
            (int)(alto  * 0.06)
        );
        cmbRueda.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.38),
            (int)(ancho * 0.17),
            (int)(alto  * 0.06)
        );
        cmbCarenaje.setBounds(
            (int)(ancho * 0.43),
            (int)(alto  * 0.46),
            (int)(ancho * 0.17),
            (int)(alto  * 0.06)
        );
 
        
        btnValidarCom.setBounds(
            (int)(ancho * 0.64),
            (int)(alto  * 0.46),
            (int)(ancho * 0.31),
            (int)(alto  * 0.07)
        );
 
        
        btnTestResistencia.setBounds(
            (int)(ancho * 0.26),
            (int)(alto  * 0.70),
            (int)(ancho * 0.35),
            (int)(alto  * 0.10)
        );
 
        
        btnCrearMoto.setBounds(
            (int)(ancho * 0.68),
            (int)(alto  * 0.82),
            (int)(ancho * 0.26),
            (int)(alto  * 0.09)
        );
    }
 
    private void hacerBotonesInvisibles() {
        javax.swing.JButton[] botones = {
            btnTestResistencia, btnValidarCom, btnCrearMoto
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
        btnTestResistencia = new javax.swing.JButton();
        btnValidarCom = new javax.swing.JButton();
        btnCrearMoto = new javax.swing.JButton();
        cmbMotor = new javax.swing.JComboBox<>();
        cmbManillar = new javax.swing.JComboBox<>();
        cmbRueda = new javax.swing.JComboBox<>();
        cmbCarenaje = new javax.swing.JComboBox<>();
        cmbMarca = new javax.swing.JComboBox<>();
        txtValidacionCom = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTestResistencia.addActionListener(this::btnTestResistenciaActionPerformed);
        jPanel1.add(btnTestResistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 350, 70));

        btnValidarCom.addActionListener(this::btnValidarComActionPerformed);
        jPanel1.add(btnValidarCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 310, 50));

        btnCrearMoto.addActionListener(this::btnCrearMotoActionPerformed);
        jPanel1.add(btnCrearMoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 260, 60));

        cmbMotor.setBackground(new java.awt.Color(43, 47, 54));
        cmbMotor.setForeground(new java.awt.Color(255, 255, 255));
        cmbMotor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbMotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 144, 170, 40));

        cmbManillar.setBackground(new java.awt.Color(43, 47, 54));
        cmbManillar.setForeground(new java.awt.Color(255, 255, 255));
        cmbManillar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbManillar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 170, 40));

        cmbRueda.setBackground(new java.awt.Color(43, 47, 54));
        cmbRueda.setForeground(new java.awt.Color(255, 255, 255));
        cmbRueda.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbRueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 252, 170, 40));

        cmbCarenaje.setBackground(new java.awt.Color(43, 47, 54));
        cmbCarenaje.setForeground(new java.awt.Color(255, 255, 255));
        cmbCarenaje.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbCarenaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 305, 170, 40));

        cmbMarca.setBackground(new java.awt.Color(43, 47, 54));
        cmbMarca.setForeground(new java.awt.Color(255, 255, 255));
        cmbMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(cmbMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 182, 230, 40));
        jPanel1.add(txtValidacionCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 310, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fondo_CrearTrabajo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 990, 667);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnCrearMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMotoActionPerformed
        Marca marca = (Marca) cmbMarca.getSelectedItem();

        TipoMoto tipoMoto = new TipoMoto();
        tipoMoto.setIdTipoMoto(2);
        tipoMoto.setNombre("Trabajo");

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

        String resultado = CONTROLMOTO.crearMotoTrabajo(marca, tipoMoto, fecha, componentes, moto.isTestResistenciaActivado());
        

    JOptionPane.showMessageDialog(this, resultado);
    }//GEN-LAST:event_btnCrearMotoActionPerformed

    private void btnTestResistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestResistenciaActionPerformed
        moto.setTestResistenciaActivado(true);
        JOptionPane.showMessageDialog(null, "Test de Resistencia Activado");
    }//GEN-LAST:event_btnTestResistenciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearMoto;
    private javax.swing.JButton btnTestResistencia;
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

