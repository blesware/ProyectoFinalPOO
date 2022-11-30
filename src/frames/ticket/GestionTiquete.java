package frames.ticket;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class GestionTiquete extends javax.swing.JFrame {

    //Constructor
    public GestionTiquete() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Gestion de Tiquetes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelCompraTiquete = new javax.swing.JLabel();
        jLabelCancelarTiquete = new javax.swing.JLabel();
        jLabelBuscarTiquete = new javax.swing.JLabel();
        jButtonComprarTiquete = new javax.swing.JButton();
        jButtonCancelarTiquete = new javax.swing.JButton();
        jButtonBuscarTiquete = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Gestion de Tiquetes");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelCompraTiquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCompraTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCompraTiquete.setText("Comprar Tiquete");
        jPanelFondo.add(jLabelCompraTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 210, -1, -1));

        jLabelCancelarTiquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCancelarTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCancelarTiquete.setText("Cancelar Tiquete");
        jPanelFondo.add(jLabelCancelarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 210, -1, -1));

        jLabelBuscarTiquete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelBuscarTiquete.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBuscarTiquete.setText("Buscar Tiquete");
        jPanelFondo.add(jLabelBuscarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jButtonComprarTiquete.setBackground(new java.awt.Color(102, 102, 102));
        jButtonComprarTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gestion_tiquete.png"))); // NOI18N
        jButtonComprarTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarTiqueteActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonComprarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

        jButtonCancelarTiquete.setBackground(new java.awt.Color(102, 102, 102));
        jButtonCancelarTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        jButtonCancelarTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarTiqueteActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonCancelarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

        jButtonBuscarTiquete.setBackground(new java.awt.Color(102, 102, 102));
        jButtonBuscarTiquete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buscar_tiquete.png"))); // NOI18N
        jButtonBuscarTiquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTiqueteActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonBuscarTiquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 140));

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

    //Boton de comprar tiquete
    private void jButtonComprarTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarTiqueteActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.COMPRAR_TIQUETE);
        
    }//GEN-LAST:event_jButtonComprarTiqueteActionPerformed

    //Boton de cancelar tiquete
    private void jButtonCancelarTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarTiqueteActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.CANCELAR_TIQUETE);
        
    }//GEN-LAST:event_jButtonCancelarTiqueteActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.PRINCIPAL_ADMIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton buscar tiquete    
    private void jButtonBuscarTiqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTiqueteActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.BUSCAR_TIQUETE);
        
    }//GEN-LAST:event_jButtonBuscarTiqueteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarTiquete;
    private javax.swing.JButton jButtonCancelarTiquete;
    private javax.swing.JButton jButtonComprarTiquete;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelBuscarTiquete;
    private javax.swing.JLabel jLabelCancelarTiquete;
    private javax.swing.JLabel jLabelCompraTiquete;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
