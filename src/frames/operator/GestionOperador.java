package frames.operator;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class GestionOperador extends javax.swing.JFrame {

    //Constructor
    public GestionOperador() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Gestion de Operadores");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelVerOperador = new javax.swing.JLabel();
        jLabelAgregarOperador = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelModificarOperador = new javax.swing.JLabel();
        jButtonVerOperador = new javax.swing.JButton();
        jButtonAgregarOperador = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonModificarOperador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVerOperador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelVerOperador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVerOperador.setText("Ver Operadores");
        jPanelFondo.add(jLabelVerOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabelAgregarOperador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAgregarOperador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarOperador.setText("Agregar Operadores");
        jPanelFondo.add(jLabelAgregarOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Gestion de Operadores");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelModificarOperador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModificarOperador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarOperador.setText("Modificar Operadores");
        jPanelFondo.add(jLabelModificarOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 210, -1, -1));

        jButtonVerOperador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVerOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        jButtonVerOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerOperadorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonVerOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

        jButtonAgregarOperador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAgregarOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar_usuario.png"))); // NOI18N
        jButtonAgregarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarOperadorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAgregarOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

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

        jButtonModificarOperador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarOperador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        jButtonModificarOperador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarOperadorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonModificarOperador, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 140));

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

    //Boton ver operador
    private void jButtonVerOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerOperadorActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.VER_OPERADOR);
        
    }//GEN-LAST:event_jButtonVerOperadorActionPerformed

    //Boton agregar operador
    private void jButtonAgregarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarOperadorActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.AGREGAR_OPERADOR);
        
    }//GEN-LAST:event_jButtonAgregarOperadorActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.PRINCIPAL_ADMIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton modificar operador
    private void jButtonModificarOperadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarOperadorActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.MODIFICAR_OPERADOR);
        
    }//GEN-LAST:event_jButtonModificarOperadorActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarOperador;
    private javax.swing.JButton jButtonModificarOperador;
    private javax.swing.JButton jButtonVerOperador;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAgregarOperador;
    private javax.swing.JLabel jLabelModificarOperador;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelVerOperador;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
