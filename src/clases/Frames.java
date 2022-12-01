package clases;

import javax.swing.*;
import frames.main.*;
import frames.user.*;
import frames.admin.*;
import frames.journey.*;
import frames.operator.*;
import frames.ticket.*;
import frames.transport.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author juanf
 */
public class Frames extends JFrame {

    /* Aca estan todos los Objetos de los Frames del programa, son estaticos para poder acceder
       desde cualquier clase sin necesidad de crear objetos de la misma */
    public final static AgregarAdmin AGREGAR_ADMIN = new AgregarAdmin();
    public final static GestionAdministrador GESTION_ADMIN = new GestionAdministrador();
    public final static ModificarAdmin MODIFICAR_ADMIN = new ModificarAdmin();
    public final static VerAdministrador VER_ADMIN = new VerAdministrador();
    public final static GestionTrayecto GESTION_TRAYECTO = new GestionTrayecto();
    public final static ModificarSitioTuristico MODIFICAR_SITIO_TURISTICO = new ModificarSitioTuristico();
    public final static RegistrarSitioTuristico REGISTRAR_SITIO_TURISTICO = new RegistrarSitioTuristico();
    public final static VerSitioTuristico VER_SITIO_TURISTICO = new VerSitioTuristico();
    public final static Login LOGIN = new Login();
    public final static PrincipalAdministrador PRINCIPAL_ADMIN = new PrincipalAdministrador();
    public final static PrincipalOperador PRINCIPAL_OPERADOR = new PrincipalOperador();
    public final static AgregarOperador AGREGAR_OPERADOR = new AgregarOperador();
    public final static GestionOperador GESTION_OPERADOR = new GestionOperador();
    public final static ModificarOperador MODIFICAR_OPERADOR = new ModificarOperador();
    public final static VerOperador VER_OPERADOR = new VerOperador();
    public final static BuscarTiquete BUSCAR_TIQUETE = new BuscarTiquete();
    public final static CancelarTiquete CANCELAR_TIQUETE = new CancelarTiquete();
    public final static ComprarTiquete COMPRAR_TIQUETE = new ComprarTiquete();
    public final static GestionTiquete GESTION_TIQUETE = new GestionTiquete();
    public final static AsociarTrayectoEmpresa ASOCIAR_TRAYECTO_EMPRESA = new AsociarTrayectoEmpresa();
    public final static DesasociarTrayecto DESASOCIAR_TRAYECTO = new DesasociarTrayecto();
    public final static GestionTransporte GESTION_TRANSPORTE = new GestionTransporte();
    public final static RegistrarEmpresa REGISTRAR_EMPRESA = new RegistrarEmpresa();
    public final static AgregarUsuario AGREGAR_USUARIO = new AgregarUsuario();
    public final static GestionUsuario GESTION_USUARIO = new GestionUsuario();
    public final static ModificarUsuario MODIFICAR_USUARIO = new ModificarUsuario();
    public final static VerUsuarios VER_USUARIO = new VerUsuarios();

    //ArrayList en donde se guardan todos los objetos de manera temporal antes de escribirse en el .bin
    public static ArrayList<Administrador> LIST_ADMIN = new ArrayList<>();
    public static ArrayList<Operador> LIST_OPERADOR = new ArrayList<>();
    public static ArrayList<Usuario> LIST_USUARIO = new ArrayList<>();
    public static ArrayList<EmpresaTransporte> LIST_EMPRESA_TRANSPORTE = new ArrayList<>();
    public static ArrayList<Tiquet> LIST_TIQUETE = new ArrayList<>();
    public static ArrayList<Trayecto> LIST_TRAYECTO = new ArrayList<>();

    //Metodo para escribir el ArrayList en el archivo .txt
    public static void escribirTxt(ArrayList list, String nombreArchivo) {

        Frames.borrarTxt(nombreArchivo);
        
        try {

            OutputStream os = new FileOutputStream(nombreArchivo);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            oos.writeObject(list);
            
            oos.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error escribiendo el archivo,\ncontacte con un administrador");
        }
    }

    //Metodo para leer admin_data.txt
    public static void leerTxtAdmin() {

        try {
         
            InputStream is = new FileInputStream("src/bin/admin_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            Frames.LIST_ADMIN = (ArrayList<Administrador>) ois.readObject();
            
            ois.close();
                        
        } catch (IOException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");            
        }
    }
    
    //Metodo para leer oper_data.txt
    public static void leerTxtOperador() {

        try {
         
            InputStream is = new FileInputStream("src/bin/oper_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            Frames.LIST_OPERADOR = (ArrayList<Operador>) ois.readObject();
            
            ois.close();
                                                                
        } catch (IOException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");            
        }                
    }
    
    //Metodo para leer user_data.txt
    public static void leerTxtUsuario() {

        try {
         
            InputStream is = new FileInputStream("src/bin/user_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            Frames.LIST_USUARIO = (ArrayList<Usuario>) ois.readObject();                        
                                        
            ois.close();
                        
        } catch (IOException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");            
        }                
    }

    //Metodo para leer tiquets_data.txt
    public static void leerTxtTiquet() {

        try {
         
            InputStream is = new FileInputStream("src/bin/tiquets_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            Frames.LIST_TIQUETE = (ArrayList<Tiquet>) ois.readObject();                        
                            
            ois.close();
                        
        } catch (IOException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");            
        }                
    }
    
    //Metodo para leer transport_data.txt
    public static void leerTxtTransporte() {

        try {
         
            InputStream is = new FileInputStream("src/bin/transport_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            Frames.LIST_EMPRESA_TRANSPORTE = (ArrayList<EmpresaTransporte>) ois.readObject();                        
                          
            ois.close();
                        
        } catch (IOException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");            
        }                
    }
    
    //Metodo para leer trayect_data.txt
    public static void leerTxtTrayecto() {

        try {
         
            InputStream is = new FileInputStream("src/bin/trayect_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            Frames.LIST_TRAYECTO = (ArrayList<Trayecto>) ois.readObject();                        
                                        
            ois.close();           
            
        } catch (IOException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");            
        }                
    }
    
    //Metodo para borrar un .txt completo
    public static void borrarTxt(String nombreArchivo) {
        
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
            bw.write("");
            bw.close();
                        
        } catch (IOException e) {
            
            JOptionPane.showConfirmDialog(null, "Error al borrar el Archivo");
        }                                
    }
    
    //Metodo para mostrar estos Frames en pantalla
    public static void verFrame(JFrame frame) {

        frame.setVisible(true);
        frame.setLocationRelativeTo(null); //Este metodo ubica los Frames al centro del monitor
    }
}
