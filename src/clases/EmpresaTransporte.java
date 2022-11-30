package clases;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class EmpresaTransporte implements Serializable {
    
    //Atributos de la clase
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    
    //Constructor
    public EmpresaTransporte(String nombre, String direccion, String telefono, String correoElectronico) {
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;        
    }
    
    //Getter and Setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }    
}
