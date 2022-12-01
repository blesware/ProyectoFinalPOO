package clases;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class Usuario implements Serializable{
                
    //Atributos de la clase
    private final int serial;
    private String nombre;
    private String cedula;
    private String correoElectronico;
    private String telefono;    
    
    //Constructor
    public Usuario(String nombre, String cedula, String telefono, String correElectronico) {
        
        this.serial = Serials.serialClassUser++;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoElectronico = correElectronico;
        this.telefono = telefono;
        
        Serials.escribirSeriales();
    }
    
    //Getter and Setter
    public int getSerial() {
        return this.serial;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "Usuario[ID: " + serial + ", Nombre: " + nombre + ", Cedula: " + cedula +
               ", Telefono" + telefono + ", Correo: " + correoElectronico +']';
    }
}
