package frames.user;

import clases.Frames;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanf
 */
public class VerUsuarios extends javax.swing.JFrame {

    //Modelo del JTable
    private static DefaultTableModel modelo = new DefaultTableModel(){
        
        //Aca sobreescribimos el metodo isCellEditable para que ninguna columna ni fila sea editable
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }    
    };
    
    //Constructor
    public VerUsuarios() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); 
        setTitle("Ver Usuarios Registrados");
        
        VerUsuarios.modelo.addColumn("ID");
        VerUsuarios.modelo.addColumn("Usuario");
        VerUsuarios.modelo.addColumn("Cedula");
        VerUsuarios.modelo.addColumn("Telefono");
        VerUsuarios.modelo.addColumn("Correo");        
        
        VerUsuarios.jTableUsuario.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jTableUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 400));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 400));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 400));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 400));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Ver Usuarios");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

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

        jTableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane.setViewportView(jTableUsuario);

        jPanelFondo.add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 70, 540, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_USUARIO);        
    }//GEN-LAST:event_jButtonVolverActionPerformed
    
    //Metodo para llenar el JTable
    public static void llenarTable() {
        
        limpiarTable();        
        Frames.leerTxtUsuario();
        
        ArrayList<String []> listTable = new ArrayList<>();
        
        //Llenamos el ArrayList temporal que llenara el JTable
        for (int i = 0; i < Frames.LIST_USUARIO.size(); i++) {
            
            String aux [] = new String[] {String.valueOf(Frames.LIST_USUARIO.get(i).getSerial()), 
                    Frames.LIST_USUARIO.get(i).getNombre(), 
                    Frames.LIST_USUARIO.get(i).getCedula(), 
                    Frames.LIST_USUARIO.get(i).getTelefono(), 
                    Frames.LIST_USUARIO.get(i).getCorreoElectronico()};                    

            listTable.add(aux);
        }
        
        //Llenamos el JTable
        for (int i = 0; i < listTable.size(); i++) {
            
            VerUsuarios.modelo.addRow(listTable.get(i));            
        }        
    }
    
    //Metodo para limpiar las filas del JTable
    public static void limpiarTable() {
        
        try {
            
            int filas = jTableUsuario.getRowCount();
            
            for (int i = 0;filas>i; i++) {
                VerUsuarios.modelo.removeRow(0);
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane;
    private static javax.swing.JTable jTableUsuario;
    // End of variables declaration//GEN-END:variables
}
