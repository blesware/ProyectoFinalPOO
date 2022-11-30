package frames.ticket;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class BuscarTiquete extends javax.swing.JFrame {

    //Constructor
    public BuscarTiquete() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Buscar Tiquetes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelBuscarTiquete = new javax.swing.JLabel();
        jLabelTiquete = new javax.swing.JLabel();
        jLabelDigiteBusqueda = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTiquetesCedula = new javax.swing.JLabel();
        jLabelPago = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabelTrayecto = new javax.swing.JLabel();
        jLabelBuscarPor = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jButtonBuscarTiquetes = new javax.swing.JButton();
        jComboBoxDestino = new javax.swing.JComboBox<>();
        jComboBoxTiquetesCedula = new javax.swing.JComboBox<>();
        jComboBoxBuscarPor = new javax.swing.JComboBox<>();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldPago = new javax.swing.JTextField();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldTrayecto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(562, 292));
        setMinimumSize(new java.awt.Dimension(562, 292));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 292));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 292));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 292));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBuscarTiquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBuscarTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarTiquete.setText("Buscar Tiquete");
        jPanelFondo.add(jLabelBuscarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 220, -1, -1));

        jLabelTiquete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTiquete.setText("Buscar Tiquetes");
        jPanelFondo.add(jLabelTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelDigiteBusqueda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDigiteBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDigiteBusqueda.setText("Digite la busqueda:");
        jPanelFondo.add(jLabelDigiteBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("Cedula:");
        jPanelFondo.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario (Nombre):");
        jPanelFondo.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabelTiquetesCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTiquetesCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTiquetesCedula.setText("Tiquetes de la Cedula:");
        jPanelFondo.add(jLabelTiquetesCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabelPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPago.setText("Pago:");
        jPanelFondo.add(jLabelPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, -1));

        jLabelDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDestino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDestino.setText("Destino:");
        jPanelFondo.add(jLabelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jLabelTrayecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTrayecto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTrayecto.setText("Trayecto:");
        jPanelFondo.add(jLabelTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabelBuscarPor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBuscarPor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarPor.setText("Buscar por:");
        jPanelFondo.add(jLabelBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButtonVolver.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVolver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setText("Volver");
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButtonBuscarTiquetes.setBackground(new java.awt.Color(102, 102, 102));
        jButtonBuscarTiquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar_tiquete.png"))); // NOI18N
        jButtonBuscarTiquetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTiquetesActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonBuscarTiquetes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 140, 140));

        jPanelFondo.add(jComboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, -1));

        jPanelFondo.add(jComboBoxTiquetesCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));

        jComboBoxBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "ID Tiquete" }));
        jPanelFondo.add(jComboBoxBuscarPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, -1));
        jPanelFondo.add(jTextFieldPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, -1));
        jPanelFondo.add(jTextFieldBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));
        jPanelFondo.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 180, -1));
        jPanelFondo.add(jTextFieldTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TIQUETE);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton buscar tiquete
    private void jButtonBuscarTiquetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTiquetesActionPerformed

    }//GEN-LAST:event_jButtonBuscarTiquetesActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTiquetes;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxBuscarPor;
    private javax.swing.JComboBox<String> jComboBoxDestino;
    private javax.swing.JComboBox<String> jComboBoxTiquetesCedula;
    private javax.swing.JLabel jLabelBuscarPor;
    private javax.swing.JLabel jLabelBuscarTiquete;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelDigiteBusqueda;
    private javax.swing.JLabel jLabelPago;
    private javax.swing.JLabel jLabelTiquete;
    private javax.swing.JLabel jLabelTiquetesCedula;
    private javax.swing.JLabel jLabelTrayecto;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldBusqueda;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldPago;
    private javax.swing.JTextField jTextFieldTrayecto;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
