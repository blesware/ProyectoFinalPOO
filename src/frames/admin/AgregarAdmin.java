package frames.admin;

import clases.*;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author juanf
 */
public class AgregarAdmin extends javax.swing.JFrame {   

    //Constructor
    public AgregarAdmin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Agregar Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelAgregarAdministrador = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jButtonAgregarAdministrador = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldConfirmPassword = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAgregarAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelAgregarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarAdministrador.setText("Agregar Admin");
        jPanelFondo.add(jLabelAgregarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 220, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Agregar Administrador");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre:");
        jPanelFondo.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("Cedula:");
        jPanelFondo.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setText("Telefono:");
        jPanelFondo.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("Correo Electronico:");
        jPanelFondo.add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        jPanelFondo.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña:");
        jPanelFondo.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabelConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmPassword.setText("Confirme la Contraseña:");
        jPanelFondo.add(jLabelConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jButtonAgregarAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAgregarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/agregar_usuario.png"))); // NOI18N
        jButtonAgregarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarAdministradorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonAgregarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 140, 140));

        jButtonLimpiarCampos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiarCampos.setText("Limpiar Campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));
        jPanelFondo.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));
        jPanelFondo.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));
        jPanelFondo.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, -1));
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, -1));
        jPanelFondo.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, -1));
        jPanelFondo.add(jTextFieldConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, -1));

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

    //Boton agregar administrador
    private void jButtonAgregarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarAdministradorActionPerformed

        if (verificarCamposVacios() && verificarDatos() && verificarNombreUsuario()) {

            String nombre = jTextFieldNombre.getText().trim();
            String cedula = jTextFieldCedula.getText().trim();
            String telefono = jTextFieldTelefono.getText().trim();
            String correo = jTextFieldCorreo.getText().trim();
            String user = jTextFieldUsuario.getText().trim();
            String pass = jTextFieldPassword.getText().trim();

            Administrador admin = new Administrador(nombre, cedula, telefono, correo, user, pass);

            Frames.leerTxtAdmin();
            
            Frames.LIST_ADMIN.add(admin);                        

            Frames.escribirTxt(Frames.LIST_ADMIN, "src/bin/admin_data.txt");
            
            JOptionPane.showMessageDialog(null, "Administrador agregado correctamente");
            limpiar();
        }
    }//GEN-LAST:event_jButtonAgregarAdministradorActionPerformed

    //Boton limpiar campos
    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed

        limpiar();
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed
    
    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        
        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_ADMIN);        
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Metodo para verificar que no hayan dos usuarios con el mismo nombre
    private boolean verificarNombreUsuario() {
        
        try {
            
            String user = jTextFieldUsuario.getText().trim();
            
            Frames.leerTxtAdmin();
            Frames.leerTxtOperador();
            
            for (int i = 0; i < Frames.LIST_ADMIN.size(); i++) {
                
                if(user.equals(Frames.LIST_ADMIN.get(i).getUsuario())) {
                    JOptionPane.showMessageDialog(null, "El nombre de Usuario ya existe");
                    return false;
                }                
            }
            
            for (int i = 0; i < Frames.LIST_OPERADOR.size(); i++) {
                
                if(user.equals(Frames.LIST_OPERADOR.get(i).getUsuario())) {
                    JOptionPane.showMessageDialog(null, "El nombre de Usuario ya existe");
                    return false;
                }
            }
            
            return true;
            
        } catch (Exception e) {
         
            JOptionPane.showMessageDialog(null, "Error comprobando usuarios,\ncontacte con un administrador");
            return false;
        }        
    }
    
    //Metodo para Verificar que todos los datos sean correctos
    private boolean verificarDatos() {

        try {

            //Verificacion de que hayan los caracteres necesarios
            if(jTextFieldNombre.getText().trim().length() < 4) {
                
                JOptionPane.showMessageDialog(null, "El nombre minimo debe tener 4 caracteres");
                return false;
                
            } else if(jTextFieldUsuario.getText().trim().length() < 6) {
                
                JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener minimo\n6 caracteres");
                return false;
                
            } else if(jTextFieldTelefono.getText().trim().length() < 10 && 
                    jTextFieldTelefono.getText().trim().length() > 10) {
                
                JOptionPane.showMessageDialog(null, "El numero de telefono no es correcto");
                return false;
                
            } else if(jTextFieldPassword.getText().trim().length() < 6) {
                
                JOptionPane.showMessageDialog(null, "La contraseña debe tener minimo\n6 caracteres");
                return false;                
            }
                        
            /*
                Si no son numeros lo que se ingreso salta la exepcion y devuelve false
                Se usa Long y no Int porque el maximo de int es 2,147,483,647 y los numeros de celular
                tienen 10 digitos y suelen comenzar por 3, para evitar errores usamos Long
            */
            long cedula = Long.parseLong(jTextFieldCedula.getText().trim());
            long telefono = Long.parseLong(jTextFieldTelefono.getText().trim());
            
            //Variables que llevaran el conteo de cuantos "@" y "." se consiguen en el correo
            int punto = 0;
            int arroba = 0;
            
            //Aca se recorre todo el correo en busca de los "@" y los "."
            for (int i = 0; i < jTextFieldCorreo.getText().trim().length(); i++) {

                if (jTextFieldCorreo.getText().trim().charAt(i) == '.') {
                    punto++;
                }

                if (jTextFieldCorreo.getText().trim().charAt(i) == '@') {
                    arroba++;
                }
            }

            //Verificacion de que no hayan mas de 1 o 0 "@´s" y ".´s" en el correo
            if (punto > 1 || punto == 0) {

                JOptionPane.showMessageDialog(null, "Correo no valido, verifique su correo");
                return false;

            } else if (arroba > 1 || punto == 0) {

                JOptionPane.showMessageDialog(null, "Correo no valido, verifique su correo");
                return false;
            }

            //Verificacion de que la contraseña sea igual en ambos campos
            if (!jTextFieldPassword.getText().trim().equals(jTextFieldConfirmPassword.getText().trim())) {

                JOptionPane.showMessageDialog(null, "La contraseña no coincide\nvuelva a intentar");
                return false;
            }

        } catch (HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "Algunos Campos son incorrectos\nverifica los datos y vuelve a intentar");
            return false;
            
        } catch (NumberFormatException e) {
            
            //Exepcion en caso de que no sean numeros la cedula y el telefono
            JOptionPane.showMessageDialog(null, "La cedula o telefono no son correctos");
            return false;            
        }

        //Si todo esta bien devuelve true
        return true;
    }

    //Metodo para Verificar campos vacios
    private boolean verificarCamposVacios() {

        if (jTextFieldNombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return false;

        } else if (jTextFieldCedula.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return false;

        } else if (jTextFieldTelefono.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return false;

        } else if (jTextFieldCorreo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return false;

        } else if (jTextFieldUsuario.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return false;

        } else if (jTextFieldPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return false;

        } else if (jTextFieldConfirmPassword.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Debes llenar todos los campos");
            return false;

        } else {

            return true;
        }
    }

    //Metodo para Limpiar todos los campos
    private void limpiar() {
        jTextFieldNombre.setText("");
        jTextFieldCedula.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldCorreo.setText("");
        jTextFieldUsuario.setText("");
        jTextFieldPassword.setText("");
        jTextFieldConfirmPassword.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarAdministrador;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelAgregarAdministrador;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldConfirmPassword;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
