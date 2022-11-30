package frames.ticket;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class ComprarTiquete extends javax.swing.JFrame {

    //Constructor
    public ComprarTiquete() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Comprar Tiquetes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelTrayecto = new javax.swing.JLabel();
        jLabelPago = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabelCompraTiquete = new javax.swing.JLabel();
        jButtonComprarTiquete = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jComboBoxTrayecto = new javax.swing.JComboBox<>();
        jComboBoxDestino = new javax.swing.JComboBox<>();
        jComboBoxPago = new javax.swing.JComboBox<>();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(385, 318));
        setMinimumSize(new java.awt.Dimension(385, 318));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(385, 318));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(385, 318));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(385, 318));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Comprar Tiquetes");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario(Nombre):");
        jPanelFondo.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelTrayecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTrayecto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTrayecto.setText("Trayecto:");
        jPanelFondo.add(jLabelTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabelPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPago.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPago.setText("Pago:");
        jPanelFondo.add(jLabelPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("Cedula:");
        jPanelFondo.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabelDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDestino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDestino.setText("Destino:");
        jPanelFondo.add(jLabelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabelCompraTiquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCompraTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCompraTiquete.setText("Comprar Tiquete");
        jPanelFondo.add(jLabelCompraTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jButtonComprarTiquete.setBackground(new java.awt.Color(102, 102, 102));
        jButtonComprarTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_tiquete.png"))); // NOI18N
        jButtonComprarTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarTiqueteActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonComprarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 140, 140));

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

        jComboBoxTrayecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ida", "Ida y Vuelta" }));
        jPanelFondo.add(jComboBoxTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, -1));

        jPanelFondo.add(jComboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, -1));

        jComboBoxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarjeta de Credito", "PSE", "Transferencia" }));
        jPanelFondo.add(jComboBoxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, -1));
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, -1));
        jPanelFondo.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton comprar tiquete
    private void jButtonComprarTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarTiqueteActionPerformed

    }//GEN-LAST:event_jButtonComprarTiqueteActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TIQUETE);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprarTiquete;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxDestino;
    private javax.swing.JComboBox<String> jComboBoxPago;
    private javax.swing.JComboBox<String> jComboBoxTrayecto;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCompraTiquete;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelPago;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTrayecto;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
