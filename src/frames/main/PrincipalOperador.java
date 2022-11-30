package frames.main;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class PrincipalOperador extends javax.swing.JFrame {

    //Constructor
    public PrincipalOperador() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Bienvenido Operador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelGestionUsuario = new javax.swing.JLabel();
        jLabelTiquete = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonGestionarUsuario = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonGestionarTiquet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelGestionUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelGestionUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGestionUsuario.setText("Gestion de Usuario");
        jPanelFondo.add(jLabelGestionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 210, -1, -1));

        jLabelTiquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTiquete.setText("Gestion de Tiquete");
        jPanelFondo.add(jLabelTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Opciones de Operador");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

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
        jPanelFondo.add(jButtonGestionarTiquet, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.LOGIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton gestion de usuario
    private void jButtonGestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarUsuarioActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_USUARIO);
        
    }//GEN-LAST:event_jButtonGestionarUsuarioActionPerformed

    //Boton gestion de tiquet
    private void jButtonGestionarTiquetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarTiquetActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TIQUETE);
        
    }//GEN-LAST:event_jButtonGestionarTiquetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionarTiquet;
    private javax.swing.JButton jButtonGestionarUsuario;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelGestionUsuario;
    private javax.swing.JLabel jLabelTiquete;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
