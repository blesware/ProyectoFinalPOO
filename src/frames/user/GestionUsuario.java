package frames.user;

import clases.Frames;
import frames.main.PrincipalAdministrador;

/**
 *
 * @author juanf
 */
public class GestionUsuario extends javax.swing.JFrame {

    //Constructor
    public GestionUsuario() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Gestion de Usuarios");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelVerUsuario = new javax.swing.JLabel();
        jLabelAgregarUsuario = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelModificarUsuario = new javax.swing.JLabel();
        jButtonVerUsuario = new javax.swing.JButton();
        jButtonAgregarUsuario = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonModificarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVerUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelVerUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVerUsuario.setText("Ver Usuarios");
        jPanelFondo.add(jLabelVerUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabelAgregarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarUsuario.setText("Agregar Usuarios");
        jPanelFondo.add(jLabelAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Gestion de Usuarios");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarUsuario.setText("Modificar Usuarios");
        jPanelFondo.add(jLabelModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 210, -1, -1));

        jButtonVerUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVerUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        jButtonVerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonVerUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

        jButtonAgregarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar_usuario.png"))); // NOI18N
        jButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

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

        jButtonModificarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        jButtonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 140));

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

    //Boton ver usuarios
    private void jButtonVerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerUsuarioActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.VER_USUARIO);
        
    }//GEN-LAST:event_jButtonVerUsuarioActionPerformed

    //Boton agregar usuarios
    private void jButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarUsuarioActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.AGREGAR_USUARIO);
        
    }//GEN-LAST:event_jButtonAgregarUsuarioActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.PRINCIPAL_ADMIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton modificar usuarios
    private void jButtonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarUsuarioActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.MODIFICAR_USUARIO);
        
    }//GEN-LAST:event_jButtonModificarUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarUsuario;
    private javax.swing.JButton jButtonModificarUsuario;
    private javax.swing.JButton jButtonVerUsuario;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAgregarUsuario;
    private javax.swing.JLabel jLabelModificarUsuario;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVerUsuario;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
