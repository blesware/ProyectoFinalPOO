package frames.admin;

import clases.*;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author juanf
 */
public class ModificarAdmin extends javax.swing.JFrame {

    //Constructor
    public ModificarAdmin() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Modificar Administrador");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelModificarAdministrador = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jLabelSeleccionarAdministrador = new javax.swing.JLabel();
        jButtonModificarAdministrador = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonBorrarAdministrador = new javax.swing.JButton();
        jComboBoxSeleccionarAdministrador = new javax.swing.JComboBox<>();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldConfirmPassword = new javax.swing.JTextField();
        jButtonLimpiarCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelModificarAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModificarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarAdministrador.setText("Modificar Admin");
        jPanelFondo.add(jLabelModificarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Modificar Administrador");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre:");
        jPanelFondo.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabelCedula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCedula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("Cedula:");
        jPanelFondo.add(jLabelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabelTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelefono.setText("Telefono:");
        jPanelFondo.add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("Correo Electronico:");
        jPanelFondo.add(jLabelCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLabelUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuario:");
        jPanelFondo.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña:");
        jPanelFondo.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabelConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmPassword.setText("Confirme la Contraseña:");
        jPanelFondo.add(jLabelConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabelSeleccionarAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSeleccionarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeleccionarAdministrador.setText("Seleccione Administrador:");
        jPanelFondo.add(jLabelSeleccionarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButtonModificarAdministrador.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        jButtonModificarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarAdministradorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonModificarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 140, 140));

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

        jButtonBorrarAdministrador.setBackground(new java.awt.Color(255, 0, 51));
        jButtonBorrarAdministrador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBorrarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrarAdministrador.setText("BORRAR");
        jButtonBorrarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarAdministradorActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonBorrarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 140, 50));

        jPanelFondo.add(jComboBoxSeleccionarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));
        jPanelFondo.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));
        jPanelFondo.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, -1));
        jPanelFondo.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, -1));
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, -1));
        jPanelFondo.add(jTextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, -1));
        jPanelFondo.add(jTextFieldConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 180, -1));

        jButtonLimpiarCampos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiarCampos.setText("Limpiar Campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

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

    //Boton modificar administrador
    private void jButtonModificarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarAdministradorActionPerformed

        if (verificarCamposVacios() && verificarDatos() && verificarNombreUsuario()) {

            if (jComboBoxSeleccionarAdministrador != null) {

                String itemSeleccionado = (String) this.jComboBoxSeleccionarAdministrador.getSelectedItem();

                //Aca obtenemos el ID del Administrador
                itemSeleccionado = itemSeleccionado.substring(3, 7);

                int indice = -1;

                for (int i = 0; i < Frames.LIST_ADMIN.size(); i++) {

                    if (Frames.LIST_ADMIN.get(i).getSerial() == Integer.parseInt(itemSeleccionado)) {
                        indice = i;
                        break;
                    }
                }

                Frames.LIST_ADMIN.get(indice).setNombre(jTextFieldNombre.getText().trim());
                Frames.LIST_ADMIN.get(indice).setCedula(jTextFieldCedula.getText().trim());
                Frames.LIST_ADMIN.get(indice).setTelefono(jTextFieldTelefono.getText().trim());
                Frames.LIST_ADMIN.get(indice).setCorreoElectronico(jTextFieldCorreo.getText().trim());
                Frames.LIST_ADMIN.get(indice).setUsuario(jTextFieldUsuario.getText().trim());
                Frames.LIST_ADMIN.get(indice).setPassword(jTextFieldPassword.getText().trim());

                Frames.escribirTxt(Frames.LIST_ADMIN, "src/bin/admin_data.txt");

                JOptionPane.showMessageDialog(null, "Administrador modificado correctamente");
                llenarComboBox();
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "No hay ningun administrador seleccionado");
            }
        }
    }//GEN-LAST:event_jButtonModificarAdministradorActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_ADMIN);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton borrar administrador
    private void jButtonBorrarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarAdministradorActionPerformed

        int opt = JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar el Administrador?\nEsta accion no es reversible",
                "Confirmar accion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (opt == 0) {

            if (jComboBoxSeleccionarAdministrador != null) {

                String itemSeleccionado = (String) this.jComboBoxSeleccionarAdministrador.getSelectedItem();

                //Aca obtenemos el ID del Administrador
                itemSeleccionado = itemSeleccionado.substring(3, 7);

                int indice = -1;

                for (int i = 0; i < Frames.LIST_ADMIN.size(); i++) {

                    if (Frames.LIST_ADMIN.get(i).getSerial() == Integer.parseInt(itemSeleccionado)) {
                        indice = i;
                        break;
                    }
                }

                Frames.LIST_ADMIN.remove(indice);

                Frames.escribirTxt(Frames.LIST_ADMIN, "src/bin/admin_data.txt");

                JOptionPane.showMessageDialog(null, "Administrador borrado correctamente");
                llenarComboBox();
                limpiar();

            } else {

                JOptionPane.showMessageDialog(null, "No hay ningun administrador seleccionado");
            }
        }
    }//GEN-LAST:event_jButtonBorrarAdministradorActionPerformed

    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed

        limpiar();
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed

    //Metodo para llenar el jComboBox
    public static void llenarComboBox() {

        //Vacia el ComboBox para que no se dupliquen registros
        ModificarAdmin.jComboBoxSeleccionarAdministrador.removeAllItems();

        try {

            BufferedReader br = new BufferedReader(new FileReader("src/bin/admin_data.txt"));

            //Verificacion de que el txt no este vacio, en caso que este vacio, no hara nada
            if (br.readLine() == null) {

            } else {

                //Leemos el archivo para poder obtener todos los cambios
                Frames.leerTxtAdmin();
            }

        } catch (IOException e) {

            JOptionPane.showConfirmDialog(null, "Error llenando datos");
        }

        //Llenamos el ComboBox
        for (int i = 0; i < Frames.LIST_ADMIN.size(); i++) {

            ModificarAdmin.jComboBoxSeleccionarAdministrador.addItem("ID:"
                    + Frames.LIST_ADMIN.get(i).getSerial()
                    + ",Usuario:" + Frames.LIST_ADMIN.get(i).getUsuario());
        }
    }

    //Metodo para verificar que no hayan dos usuarios con el mismo nombre
    private boolean verificarNombreUsuario() {

        try {

            String user = jTextFieldUsuario.getText().trim();

            Frames.leerTxtAdmin();
            Frames.leerTxtOperador();

            for (int i = 0; i < Frames.LIST_ADMIN.size(); i++) {

                if (user.equals(Frames.LIST_ADMIN.get(i).getUsuario())) {
                    JOptionPane.showMessageDialog(null, "El nombre de Usuario ya existe");
                    return false;
                }
            }

            for (int i = 0; i < Frames.LIST_OPERADOR.size(); i++) {

                if (user.equals(Frames.LIST_OPERADOR.get(i).getUsuario())) {
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
            if (jTextFieldNombre.getText().trim().length() < 4) {

                JOptionPane.showMessageDialog(null, "El nombre minimo debe tener 4 caracteres");
                return false;

            } else if (jTextFieldUsuario.getText().trim().length() < 6) {

                JOptionPane.showMessageDialog(null, "El nombre de usuario debe tener minimo\n6 caracteres");
                return false;

            } else if (jTextFieldTelefono.getText().trim().length() < 10
                    && jTextFieldTelefono.getText().trim().length() > 10) {

                JOptionPane.showMessageDialog(null, "El numero de telefono no es correcto");
                return false;

            } else if (jTextFieldPassword.getText().trim().length() < 6) {

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
    private javax.swing.JButton jButtonBorrarAdministrador;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JButton jButtonModificarAdministrador;
    private javax.swing.JButton jButtonVolver;
    public static javax.swing.JComboBox<String> jComboBoxSeleccionarAdministrador;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelModificarAdministrador;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSeleccionarAdministrador;
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
