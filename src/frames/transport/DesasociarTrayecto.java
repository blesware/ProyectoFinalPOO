package frames.transport;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class DesasociarTrayecto extends javax.swing.JFrame {

    //Constructor
    public DesasociarTrayecto() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Desasociar Trayecto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelRegistrarEmpresa = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jButtonDesasociarTrayecto = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jComboBoxNombreEmpresa = new javax.swing.JComboBox<>();
        jComboBoxTrayecto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegistrarEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRegistrarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrarEmpresa.setText("Desociar trayecto");
        jPanelFondo.add(jLabelRegistrarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Desasociar Trayecto");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre de la Empresa:");
        jPanelFondo.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabelDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccion.setText("Trayecto:");
        jPanelFondo.add(jLabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jButtonDesasociarTrayecto.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDesasociarTrayecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar_ruta.png"))); // NOI18N
        jButtonDesasociarTrayecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesasociarTrayectoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonDesasociarTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 140, 140));

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

        jPanelFondo.add(jComboBoxNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        jPanelFondo.add(jComboBoxTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TRANSPORTE);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton desasociar trayecto
    private void jButtonDesasociarTrayectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesasociarTrayectoActionPerformed
        
    }//GEN-LAST:event_jButtonDesasociarTrayectoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDesasociarTrayecto;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxNombreEmpresa;
    private javax.swing.JComboBox<String> jComboBoxTrayecto;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRegistrarEmpresa;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
