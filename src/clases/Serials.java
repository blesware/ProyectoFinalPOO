package clases;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author juanf
 */
public class Serials implements Serializable {

    /*
        Desde esta clase se manejan todos los seriales de los objetos que llevan
        un ID, se cargan en un objeto en el TXT y se lee y escribe cada que
        sea necesario
    */
    
    public static int array [] = {1000, 1000, 1000, 1000};   
        
    /*
        Los indicices son los siguientes
        array[0] es el serial de los Usuarios
        array[1] es el serial de los Transportes
        array[2] es el serial de los Trayectos
        array[3] es el serial de los Tiquetes
    */
    
    public Serials() {
        
    }
    
    //Inicializar los seriales
    public static void iniciarSeriales() {
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader("src/bin/serials_data.txt"));
                        
            if(br.readLine() == null) {
                
                Serials.array[0] = 1000;
                Serials.array[1] = 1000;
                Serials.array[2] = 1000;
                Serials.array[3] = 1000;
                
            } else {
                
                Serials.leerSeriales();
                
            }            
                        
        } catch (IOException e) {
            
            JOptionPane.showConfirmDialog(null, "ERROR AL INICIALIZAR LOS SERIALES,\nCONTACTE CON UN ADMINISTRADOR");
        }        
    }
    
    //Metodo para leer los seriales
    public static void leerSeriales() {                        
        
        try {
         
            InputStream is = new FileInputStream("src/bin/serials_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            Serials.array = (int []) ois.readObject();
            
            ois.close();
                        
        } catch (IOException | ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "ERROR CRITICO LEYENDO SERIALES\nCONTACTE CON UN ADMINISTRADOR");            
        }                
    }
    
    //Metodo para escribir los seriales 
    public static void escribirSeriales() {                
        
        Frames.borrarTxt("src/bin/serials_data.txt");        
        
        try {

            OutputStream os = new FileOutputStream("src/bin/serials_data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);

            oos.writeObject(Serials.array);
            
            oos.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR CRITICO ESCRIBIENDO SERIALES\nCONTACTE CON UN ADMINISTRADOR");
        }        
    }

    //Getters and Setters
    public static int getSerialClassUser() {
        return Serials.array[0];
    }   

    public static int getSerialClassTranport() {
        return Serials.array[1];
    }

    public static int getSerialClassTrayect() {
        return Serials.array[2];
    }

    public static int getSerialClassTiquet() {
        return Serials.array[3];
    }        
}
