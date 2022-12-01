package clases;

import java.io.*;
import javax.swing.*;

/**
 *
 * @author juanf
 */
public class Serials implements Serializable {

    public static int serialClassUser = 1000;    
    public static int serialClassTranport = 1000;
    public static int serialClassTrayect = 1000;
    public static int serialClassTiquet = 1000;
    
    public Serials() {
        
    }
    
    public static void leerSeriales() {
                
        
        
        
    }
    
    public static void escribirSeriales() {
        
        Serials seriales = new Serials();
        
        try {

            OutputStream os = new FileOutputStream("src/bin/serials_data.txt");
            ObjectOutputStream oos = new ObjectOutputStream(os);

            oos.writeObject(seriales);
            
            oos.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error escribiendo el archivo,\ncontacte con un administrador");
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
