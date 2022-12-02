package frames.admin;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class GestionAdministrador extends javax.swing.JFrame {

    //Constructor
    public GestionAdministrador() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Gestion de Administradores");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelModificarAdministrador1 = new javax.swing.JLabel();
        jLabelAgregarAdministrador1 = new javax.swing.JLabel();
        jLabelTitulo1 = new javax.swing.JLabel();
        jLabelVerAdministrador1 = new javax.swing.JLabel();
        jLabelVerAdministrador = new javax.swing.JLabel();
        jLabelAgregarAdministrador = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelModificarAdministrador = new javax.swing.JLabel();
        jButtonVerAdministrador = new javax.swing.JButton();
        jButtonAgregarAdministrador = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonModificarAdministrador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelModificarAdministrador1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModificarAdministrador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarAdministrador1.setText("Modificar Admins");
        jPanelFondo.add(jLabelModificarAdministrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabelAgregarAdministrador1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAgregarAdministrador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarAdministrador1.setText("Agregar Admins");
        jPanelFondo.add(jLabelAgregarAdministrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 210, -1, -1));

        jLabelTitulo1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo1.setText("Gestion de Administradores");
        jPanelFondo.add(jLabelTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelVerAdministrador1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelVerAdministrador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVerAdministrador1.setText("Ver Admins");
        jPanelFondo.add(jLabelVerAdministrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabelVerAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelVerAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVerAdministrador.setText("Ver Admins");
        jPanelFondo.add(jLabelVerAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabelAgregarAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAgregarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarAdministrador.setText("Agregar Admins");
        jPanelFondo.add(jLabelAgregarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Gestion de Administradores");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelModificarAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModificarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarAdministrador.setText("Modificar Admins");
        jPanelFondo.add(jLabelModificarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jButtonVerAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVerAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        jButtonVerAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerAdministradorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonVerAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

        jButtonAgregarAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAgregarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar_usuario.png"))); // NOI18N
        jButtonAgregarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAdministradorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAgregarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

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

        jButtonModificarAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        jButtonModificarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAdministradorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonModificarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton ver administradores
    private void jButtonVerAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerAdministradorActionPerformed
        
        this.setVisible(false);
        VerAdministrador.llenarTable();
        Frames.verFrame(Frames.VER_ADMIN);
        
    }//GEN-LAST:event_jButtonVerAdministradorActionPerformed

    //Boton agregar administradores
    private void jButtonAgregarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAdministradorActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.AGREGAR_ADMIN);
        
    }//GEN-LAST:event_jButtonAgregarAdministradorActionPerformed

    //Boton Volver    
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.PRINCIPAL_ADMIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton modificar administradores
    private void jButtonModificarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAdministradorActionPerformed

        this.setVisible(false);
        ModificarAdmin.llenarComboBox();
        Frames.verFrame(Frames.MODIFICAR_ADMIN);
        
    }//GEN-LAST:event_jButtonModificarAdministradorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarAdministrador;
    private javax.swing.JButton jButtonModificarAdministrador;
    private javax.swing.JButton jButtonVerAdministrador;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAgregarAdministrador;
    private javax.swing.JLabel jLabelAgregarAdministrador1;
    private javax.swing.JLabel jLabelModificarAdministrador;
    private javax.swing.JLabel jLabelModificarAdministrador1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelVerAdministrador;
    private javax.swing.JLabel jLabelVerAdministrador1;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
