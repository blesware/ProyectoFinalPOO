package clases;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class Usuario implements Serializable{
    
    //Atributos de la clase
    private String nombre;
    private String cedula;
    private String correoElectronico;
    private String telefono;    
    
    //Constructor
    public Usuario(String nombre, String cedula, String telefono, String correElectronico) {
        
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoElectronico = correElectronico;
        this.telefono = telefono;                
    }
    
    //Getter and Setter    
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
}
