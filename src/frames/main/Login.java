package frames.main;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class Login extends javax.swing.JFrame {

    //Constructor
    public Login() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Bienvenido");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(260, 400));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(260, 400));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(260, 400));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(260, 400));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanelFondo.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 40, 150, 150));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        jPanelFondo.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña:");
        jPanelFondo.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 180, -1));
        jPanelFondo.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 180, -1));

        jButtonLogin.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Login
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.PRINCIPAL_ADMIN);
        
    }//GEN-LAST:event_jButtonLoginActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
