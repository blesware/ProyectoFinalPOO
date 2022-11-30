package frames.transport;

import clases.Frames;
import frames.main.PrincipalAdministrador;

/**
 *
 * @author juanf
 */
public class GestionTransporte extends javax.swing.JFrame {

    //Constructor
    public GestionTransporte() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Gestion de Empresas de Transporte");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelRegistrarEmpresa = new javax.swing.JLabel();
        jLabelAsociarTrayectos = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDesasociarTrayeco = new javax.swing.JLabel();
        jLabelCostosEmpresa = new javax.swing.JLabel();
        jLabelEmpresa = new javax.swing.JLabel();
        jButtonRegistrarEmpresa = new javax.swing.JButton();
        jButtonAsociarTrayectoEmpresa = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonDesasociarTrayectoEmpresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegistrarEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelRegistrarEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistrarEmpresa.setText("Registrar empresa");
        jPanelFondo.add(jLabelRegistrarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabelAsociarTrayectos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAsociarTrayectos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAsociarTrayectos.setText("Asociar Trayectos y");
        jPanelFondo.add(jLabelAsociarTrayectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Gestion de Empresas de Transporte");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelDesasociarTrayeco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelDesasociarTrayeco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDesasociarTrayeco.setText("Desasociar trayectos");
        jPanelFondo.add(jLabelDesasociarTrayeco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabelCostosEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCostosEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCostosEmpresa.setText("costos a la empresa");
        jPanelFondo.add(jLabelCostosEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 224, -1, -1));

        jLabelEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpresa.setText("a la empresa");
        jPanelFondo.add(jLabelEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 224, -1, -1));

        jButtonRegistrarEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        jButtonRegistrarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/registrar_datos.png"))); // NOI18N
        jButtonRegistrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarEmpresaActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonRegistrarEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 140));

        jButtonAsociarTrayectoEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAsociarTrayectoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asociar_ruta_empresa.png"))); // NOI18N
        jButtonAsociarTrayectoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsociarTrayectoEmpresaActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAsociarTrayectoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 140, 140));

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

        jButtonDesasociarTrayectoEmpresa.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDesasociarTrayectoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar_ruta.png"))); // NOI18N
        jButtonDesasociarTrayectoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesasociarTrayectoEmpresaActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonDesasociarTrayectoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 140, 140));

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

    //Boton registrar empresa
    private void jButtonRegistrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarEmpresaActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.REGISTRAR_EMPRESA);
        
    }//GEN-LAST:event_jButtonRegistrarEmpresaActionPerformed

    //Boton asociar trayecto a empresa
    private void jButtonAsociarTrayectoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsociarTrayectoEmpresaActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.ASOCIAR_TRAYECTO_EMPRESA);
        
    }//GEN-LAST:event_jButtonAsociarTrayectoEmpresaActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.PRINCIPAL_ADMIN);
        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton desasociar trayecto a empresa
    private void jButtonDesasociarTrayectoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesasociarTrayectoEmpresaActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.DESASOCIAR_TRAYECTO);
        
    }//GEN-LAST:event_jButtonDesasociarTrayectoEmpresaActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsociarTrayectoEmpresa;
    private javax.swing.JButton jButtonDesasociarTrayectoEmpresa;
    private javax.swing.JButton jButtonRegistrarEmpresa;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAsociarTrayectos;
    private javax.swing.JLabel jLabelCostosEmpresa;
    private javax.swing.JLabel jLabelDesasociarTrayeco;
    private javax.swing.JLabel jLabelEmpresa;
    private javax.swing.JLabel jLabelRegistrarEmpresa;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
