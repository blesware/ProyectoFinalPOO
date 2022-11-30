package frames.journey;

import clases.Frames;

/**
 *
 * @author juanf
 */
public class GestionTrayecto extends javax.swing.JFrame {

    //Constructor
    public GestionTrayecto() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Gestion de Trayectos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelRegistrarSitio = new javax.swing.JLabel();
        jLabelModificarSitio = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelVerSitiosTuristicos = new javax.swing.JLabel();
        jLabelTuristico = new javax.swing.JLabel();
        jLabelTuristico2 = new javax.swing.JLabel();
        jButtonRegistrarSitioTuristico = new javax.swing.JButton();
        jButtonModificarSitioTuristico = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonVerSitiosTuristicos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegistrarSitio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRegistrarSitio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrarSitio.setText("Registrar un sitio");
        jPanelFondo.add(jLabelRegistrarSitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabelModificarSitio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModificarSitio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarSitio.setText("Modificar sitio");
        jPanelFondo.add(jLabelModificarSitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Gestion de Trayectos Turisticos");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelVerSitiosTuristicos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelVerSitiosTuristicos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVerSitiosTuristicos.setText("Ver sitios turisticos");
        jPanelFondo.add(jLabelVerSitiosTuristicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(377, 210, -1, -1));

        jLabelTuristico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTuristico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTuristico.setText("turistico");
        jPanelFondo.add(jLabelTuristico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 224, -1, -1));

        jLabelTuristico2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTuristico2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTuristico2.setText("turistico");
        jPanelFondo.add(jLabelTuristico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 224, -1, -1));

        jButtonRegistrarSitioTuristico.setBackground(new java.awt.Color(102, 102, 102));
        jButtonRegistrarSitioTuristico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registrar_datos.png"))); // NOI18N
        jButtonRegistrarSitioTuristico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarSitioTuristicoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonRegistrarSitioTuristico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

        jButtonModificarSitioTuristico.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarSitioTuristico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        jButtonModificarSitioTuristico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarSitioTuristicoActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonModificarSitioTuristico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

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

        jButtonVerSitiosTuristicos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonVerSitiosTuristicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventario.png"))); // NOI18N
        jButtonVerSitiosTuristicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerSitiosTuristicosActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonVerSitiosTuristicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 140));

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

    //Boton registrar sitio turistico
    private void jButtonRegistrarSitioTuristicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarSitioTuristicoActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.REGISTRAR_SITIO_TURISTICO);
        
    }//GEN-LAST:event_jButtonRegistrarSitioTuristicoActionPerformed

    //Boton modificar sitio turistico
    private void jButtonModificarSitioTuristicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarSitioTuristicoActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.MODIFICAR_SITIO_TURISTICO);
        
    }//GEN-LAST:event_jButtonModificarSitioTuristicoActionPerformed

    //Boton Volver 
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.PRINCIPAL_ADMIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton ver sitios turisticos
    private void jButtonVerSitiosTuristicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerSitiosTuristicosActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.VER_SITIO_TURISTICO);
        
    }//GEN-LAST:event_jButtonVerSitiosTuristicosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModificarSitioTuristico;
    private javax.swing.JButton jButtonRegistrarSitioTuristico;
    private javax.swing.JButton jButtonVerSitiosTuristicos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelModificarSitio;
    private javax.swing.JLabel jLabelRegistrarSitio;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTuristico;
    private javax.swing.JLabel jLabelTuristico2;
    private javax.swing.JLabel jLabelVerSitiosTuristicos;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
