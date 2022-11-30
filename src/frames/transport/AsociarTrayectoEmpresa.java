package frames.transport;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class AsociarTrayectoEmpresa extends javax.swing.JFrame {

    //Constructor
    public AsociarTrayectoEmpresa() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Asociar Trayectos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelAsociarTrayecto = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDestino = new javax.swing.JLabel();
        jLabelEmpresaTransporte = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        jButtonAsociarTrayecto = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jComboBoxDestino = new javax.swing.JComboBox<>();
        jComboBoxEmpresaTransporte = new javax.swing.JComboBox<>();
        jComboBoxCosto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAsociarTrayecto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAsociarTrayecto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAsociarTrayecto.setText("Asociar Trayecto");
        jPanelFondo.add(jLabelAsociarTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Asociar Trayectos");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelDestino.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDestino.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDestino.setText("Destino:");
        jPanelFondo.add(jLabelDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabelEmpresaTransporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmpresaTransporte.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpresaTransporte.setText("Empresa de transporte:");
        jPanelFondo.add(jLabelEmpresaTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelCosto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCosto.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCosto.setText("Costo:");
        jPanelFondo.add(jLabelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jButtonAsociarTrayecto.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAsociarTrayecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registrar_empresa.png"))); // NOI18N
        jButtonAsociarTrayecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsociarTrayectoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAsociarTrayecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 140, 140));

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

        jComboBoxDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Playa Bocana", "Playa Pianguita", "Playa Juanchaco", "Playa Ladriller", "Rio San Cipriano", "Rio Escalerete" }));
        jPanelFondo.add(jComboBoxDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));

        jPanelFondo.add(jComboBoxEmpresaTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));

        jComboBoxCosto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "$150.000,00", "$200.000,00", "$300.000,00" }));
        jPanelFondo.add(jComboBoxCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));

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

    //Boton asociar trayecto
    private void jButtonAsociarTrayectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsociarTrayectoActionPerformed

    }//GEN-LAST:event_jButtonAsociarTrayectoActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_TRANSPORTE);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsociarTrayecto;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JComboBox<String> jComboBoxCosto;
    private javax.swing.JComboBox<String> jComboBoxDestino;
    private javax.swing.JComboBox<String> jComboBoxEmpresaTransporte;
    private javax.swing.JLabel jLabelAsociarTrayecto;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelDestino;
    private javax.swing.JLabel jLabelEmpresaTransporte;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
