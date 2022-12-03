package frames.user;

import clases.Frames;
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author juanf
 */
public class ModificarUsuario extends javax.swing.JFrame {

    //Constructor
    public ModificarUsuario() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Modificar Usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelModificarUsuario = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelSeleccionarUsuario = new javax.swing.JLabel();
        jButtonModificarUsuario = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButtonBorrarUsuario = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();
        jComboBoxSeleccionarUsuario = new javax.swing.JComboBox<>();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(562, 300));

        jPanelFondo.setBackground(new java.awt.Color(51, 51, 51));
        jPanelFondo.setMaximumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setMinimumSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(562, 300));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelModificarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarUsuario.setText("Modificar Usuario");
        jPanelFondo.add(jLabelModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Modificar Usuario");
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

        jLabelSeleccionarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelSeleccionarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeleccionarUsuario.setText("Seleccione Usuario:");
        jPanelFondo.add(jLabelSeleccionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButtonModificarUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jButtonModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modificar.png"))); // NOI18N
        jButtonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonModificarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 140, 140));

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

        jButtonBorrarUsuario.setBackground(new java.awt.Color(255, 0, 51));
        jButtonBorrarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonBorrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBorrarUsuario.setText("BORRAR");
        jButtonBorrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarUsuarioActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonBorrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, 30));

        jButtonLimpiarCampos.setBackground(new java.awt.Color(102, 102, 102));
        jButtonLimpiarCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiarCampos.setText("Limpiar Campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });
        jPanelFondo.add(jButtonLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, -1));

        jPanelFondo.add(jComboBoxSeleccionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));
        jPanelFondo.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, -1));
        jPanelFondo.add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));
        jPanelFondo.add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, -1));
        jPanelFondo.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, -1));

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

    //Boton modificar usuario
    private void jButtonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarUsuarioActionPerformed

        try {

            if (verificarCamposVacios() && verificarDatos() && verificarNombreUsuario()) {

                if (!ModificarUsuario.jComboBoxSeleccionarUsuario.getSelectedItem().equals("")) {

                    String itemSeleccionado;

                    itemSeleccionado = (String) ModificarUsuario.jComboBoxSeleccionarUsuario.getSelectedItem();

                    //Aca obtenemos el ID del Administrador
                    itemSeleccionado = itemSeleccionado.substring(3, 7);

                    int indice = -1;

                    for (int i = 0; i < Frames.LIST_USUARIO.size(); i++) {

                        if (Frames.LIST_USUARIO.get(i).getSerial() == Integer.parseInt(itemSeleccionado)) {
                            indice = i;
                            break;
                        }
                    }

                    Frames.LIST_USUARIO.get(indice).setNombre(jTextFieldNombre.getText().trim());
                    Frames.LIST_USUARIO.get(indice).setCedula(jTextFieldCedula.getText().trim());
                    Frames.LIST_USUARIO.get(indice).setTelefono(jTextFieldTelefono.getText().trim());
                    Frames.LIST_USUARIO.get(indice).setCorreoElectronico(jTextFieldCorreo.getText().trim());

                    Frames.escribirTxt(Frames.LIST_USUARIO, "src/bin/user_data.txt");

                    JOptionPane.showMessageDialog(null, "Usuario modificado correctamente");
                    llenarComboBox();
                    limpiar();

                } else {

                    JOptionPane.showMessageDialog(null, "No hay ningun usuario seleccionado");
                }

            }

        } catch (HeadlessException | NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No hay usuarios");
        }
    }//GEN-LAST:event_jButtonModificarUsuarioActionPerformed

    //Boton Volver
    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed

        this.setVisible(false);
        Frames.verFrame(Frames.GESTION_USUARIO);

    }//GEN-LAST:event_jButtonVolverActionPerformed

    //Boton borrar usuario
    private void jButtonBorrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarUsuarioActionPerformed

        int opt = JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar el Usuario?\nEsta accion no es reversible",
                "Confirmar accion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        try {

            if (opt == 0) {

                if (!jComboBoxSeleccionarUsuario.getSelectedItem().equals("")) {

                    String itemSeleccionado = (String) ModificarUsuario.jComboBoxSeleccionarUsuario.getSelectedItem();

                    //Aca obtenemos el ID del Usuario
                    int ID = Integer.parseInt(itemSeleccionado.substring(3, 7));

                    int indice = -1;

                    for (int i = 0; i < Frames.LIST_USUARIO.size(); i++) {

                        if (Frames.LIST_USUARIO.get(i).getSerial() == ID) {
                            indice = i;
                            break;
                        }
                    }

                    Frames.LIST_USUARIO.remove(indice);

                    Frames.escribirTxt(Frames.LIST_USUARIO, "src/bin/user_data.txt");

                    JOptionPane.showMessageDialog(null, "Usuario borrado correctamente");
                    llenarComboBox();
                    limpiar();

                } else {

                    JOptionPane.showMessageDialog(null, "No hay ningun usuario seleccionado");
                }
            }

        } catch (HeadlessException | NumberFormatException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No hay usuarios");
        }
    }//GEN-LAST:event_jButtonBorrarUsuarioActionPerformed

    //Boton limpiar campos
    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed

        limpiar();
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed

    //Metodo para llenar el jComboBox
    public static void llenarComboBox() {

        //Vacia el ComboBox para que no se dupliquen registros
        ModificarUsuario.jComboBoxSeleccionarUsuario.removeAllItems();

        try {

            BufferedReader br = new BufferedReader(new FileReader("src/bin/user_data.txt"));

            //Verificacion de que el txt no este vacio, en caso que este vacio, no hara nada
            if (br.readLine() == null) {

            } else {

                //Leemos el archivo para poder obtener todos los cambios
                Frames.leerTxtUsuario();
            }

        } catch (IOException e) {

            JOptionPane.showConfirmDialog(null, "Error llenando datos");
        }

        //Llenamos el ComboBox
        for (int i = 0; i < Frames.LIST_USUARIO.size(); i++) {

            ModificarUsuario.jComboBoxSeleccionarUsuario.addItem("ID:"
                    + Frames.LIST_USUARIO.get(i).getSerial()
                    + ",Usuario:" + Frames.LIST_USUARIO.get(i).getNombre());
        }
    }

    //Metodo para verificar que no hayan dos usuarios con el mismo nombre
    private boolean verificarNombreUsuario() {

        try {

            String itemSeleccionado = (String) ModificarUsuario.jComboBoxSeleccionarUsuario.getSelectedItem();

            String user = jTextFieldNombre.getText().trim();

            //Obtencion del Usuario actual
            String userActual = itemSeleccionado.substring(16, itemSeleccionado.length());

            Frames.leerTxtUsuario();

            //Recorremos todos los usuarios en busca del mismo nombre de usuario
            for (int i = 0; i < Frames.LIST_USUARIO.size(); i++) {

                if (user.equals(Frames.LIST_USUARIO.get(i).getNombre())) {

                    //Verificacion para ver si el nombre de usuario es el mismo que ya tiene actual el usuario
                    if (user.equals(userActual)) {
                        break;
                    } else {

                        JOptionPane.showMessageDialog(null, "El nombre de Usuario ya existe");
                        return false;
                    }
                }
            }

            return true;

        } catch (HeadlessException e) {

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

            } else if (jTextFieldTelefono.getText().trim().length() < 10
                    && jTextFieldTelefono.getText().trim().length() > 10) {

                JOptionPane.showMessageDialog(null, "El numero de telefono no es correcto");
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
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrarUsuario;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JButton jButtonModificarUsuario;
    private javax.swing.JButton jButtonVolver;
    private static javax.swing.JComboBox<String> jComboBoxSeleccionarUsuario;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelModificarUsuario;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSeleccionarUsuario;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
