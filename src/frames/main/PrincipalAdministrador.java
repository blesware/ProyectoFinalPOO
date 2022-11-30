package frames.main;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class PrincipalAdministrador extends javax.swing.JFrame {

    //Constructor
    public PrincipalAdministrador() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Bienvenido Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTransporte = new javax.swing.JLabel();
        jLabelGestionUsuario = new javax.swing.JLabel();
        jLabelGestionarTiquete = new javax.swing.JLabel();
        jLabelGestionTrayecto = new javax.swing.JLabel();
        jLabelGestionTransporte = new javax.swing.JLabel();
        jLabelGestionOperador = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelGestionAdministrador = new javax.swing.JLabel();
        jButtonGestionarUsuario = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonGestionarTiquet = new javax.swing.JButton();
        jButtonGestionarAdministrador = new javax.swing.JButton();
        jButtonGestionarTransporte = new javax.swing.JButton();
        jButtonGestionarTrayecto = new javax.swing.JButton();
        jButtonGestionarOperador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTransporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTransporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTransporte.setText("de Transporte");
        jPanelFondo.add(jLabelTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabelGestionUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGestionUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGestionUsuario.setText("Gestion de Usuario");
        jPanelFondo.add(jLabelGestionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 210, -1, -1));

        jLabelGestionarTiquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGestionarTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGestionarTiquete.setText("Gestion de Tiquete");
        jPanelFondo.add(jLabelGestionarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 390, -1, -1));

        jLabelGestionTrayecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGestionTrayecto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGestionTrayecto.setText("Gestion de Trayecto");
        jPanelFondo.add(jLabelGestionTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 390, -1, -1));

        jLabelGestionTransporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGestionTransporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGestionTransporte.setText("Gestion de Empresas");
        jPanelFondo.add(jLabelGestionTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        jLabelGestionOperador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGestionOperador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGestionOperador.setText("Gestion de Operador");
        jPanelFondo.add(jLabelGestionOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Opciones de Administrador");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelGestionAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabelGestionAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGestionAdministrador.setText("Gestion de Administrador");
        jPanelFondo.add(jLabelGestionAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 212, -1, -1));

        jButtonGestionarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGestionarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_usuarios.png"))); // NOI18N
        jButtonGestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGestionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

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

        jButtonGestionarTiquet.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGestionarTiquet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_tiquete.png"))); // NOI18N
        jButtonGestionarTiquet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarTiquetActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGestionarTiquet, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 140, 140));

        jButtonGestionarAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGestionarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_administracion.png"))); // NOI18N
        jButtonGestionarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarAdministradorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGestionarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 140));

        jButtonGestionarTransporte.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGestionarTransporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_transporte.png"))); // NOI18N
        jButtonGestionarTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarTransporteActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGestionarTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 140));

        jButtonGestionarTrayecto.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGestionarTrayecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_trayecto.png"))); // NOI18N
        jButtonGestionarTrayecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarTrayectoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGestionarTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 140, 140));

        jButtonGestionarOperador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonGestionarOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_operador.png"))); // NOI18N
        jButtonGestionarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarOperadorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonGestionarOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton gestionar usuario
    private void jButtonGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarUsuarioActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_USUARIO);
        
    }//GEN-LAST:event_jButtonGestionarUsuarioActionPerformed

    //Boton gestionar tiquete
    private void jButtonGestionarTiquetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarTiquetActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TIQUETE);
        
    }//GEN-LAST:event_jButtonGestionarTiquetActionPerformed

    //Boton volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.LOGIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton gestionar administrador
    private void jButtonGestionarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarAdministradorActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_ADMIN);
        
    }//GEN-LAST:event_jButtonGestionarAdministradorActionPerformed

    //Boton gestionar transporte
    private void jButtonGestionarTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarTransporteActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TRANSPORTE);
        
    }//GEN-LAST:event_jButtonGestionarTransporteActionPerformed

    //Boton gestionar trayecto
    private void jButtonGestionarTrayectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarTrayectoActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TRAYECTO);
        
    }//GEN-LAST:event_jButtonGestionarTrayectoActionPerformed

    //Boton gestionar operador
    private void jButtonGestionarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarOperadorActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_OPERADOR);
        
    }//GEN-LAST:event_jButtonGestionarOperadorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionarAdministrador;
    private javax.swing.JButton jButtonGestionarOperador;
    private javax.swing.JButton jButtonGestionarTiquet;
    private javax.swing.JButton jButtonGestionarTransporte;
    private javax.swing.JButton jButtonGestionarTrayecto;
    private javax.swing.JButton jButtonGestionarUsuario;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelGestionAdministrador;
    private javax.swing.JLabel jLabelGestionOperador;
    private javax.swing.JLabel jLabelGestionTransporte;
    private javax.swing.JLabel jLabelGestionTrayecto;
    private javax.swing.JLabel jLabelGestionUsuario;
    private javax.swing.JLabel jLabelGestionarTiquete;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTransporte;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
