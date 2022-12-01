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
    
    
    public static int serialClassUser = 1000;    
    public static int serialClassTranport = 1000;
    public static int serialClassTrayect = 1000;
    public static int serialClassTiquet = 1000;
    
    public Serials() {
        
    }
    
    //Metodo para leer los seriales
    public static void leerSeriales() {
                
        Serials seriales;
        
        try {
         
            InputStream is = new FileInputStream("src/bin/serials_data.txt");
            ObjectInputStream ois = new ObjectInputStream(is);                                             
                                        
            seriales = (Serials) ois.readObject();
            
            Serials.setSerialClassUser(seriales.getSerialClassUser());
            Serials.setSerialClassTiquet(seriales.getSerialClassTiquet());
            Serials.setSerialClassTranport(seriales.getSerialClassTranport());
            Serials.setSerialClassTrayect(seriales.getSerialClassTrayect());
                                        
                        
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "ERROR CRITICO ESCRIBIENDO SERIALES\nCONTACTE CON UN ADMINISTRADOR");
            
        }                
    }
    
    //Metodo para escribir los seriales 
    public static void escribirSeriales() {
        
        Serials seriales = new Serials();
        
        Frames.borrarTxt("src/bin/serials_data.txt");        
        
        try {

            OutputStream os = new FileOutputStream("src/bin/serials_data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);

            oos.writeObject(seriales);
            
            oos.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR CRITICO ESCRIBIENDO SERIALES\nCONTACTE CON UN ADMINISTRADOR");
        }        
    }

    //Getters and Setters
    public static int getSerialClassUser() {
        return serialClassUser;
    }

    public static void setSerialClassUser(int serialClassUser) {
        Serials.serialClassUser = serialClassUser;
    }

    public static int getSerialClassTranport() {
        return serialClassTranport;
    }

    public static void setSerialClassTranport(int serialClassTranport) {
        Serials.serialClassTranport = serialClassTranport;
    }

    public static int getSerialClassTrayect() {
        return serialClassTrayect;
    }

    public static void setSerialClassTrayect(int serialClassTrayect) {
        Serials.serialClassTrayect = serialClassTrayect;
    }

    public static int getSerialClassTiquet() {
        return serialClassTiquet;
    }

    public static void setSerialClassTiquet(int serialClassTiquet) {
        Serials.serialClassTiquet = serialClassTiquet;
    }        
}
