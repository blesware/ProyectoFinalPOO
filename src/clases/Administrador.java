package clases;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class Administrador extends Usuario implements Serializable {

    //Atributos de la clase    
    private String usuario;
    private String password;
    private static final boolean PERMISOS = true;

    //Constructor
    public Administrador(String nombre, String cedula, String telefono, 
            String correElectronico, String usuario, String password) {

        //Llamado al constructor de la Super clase
        super(nombre, cedula, telefono, correElectronico);

        this.usuario = usuario;
        this.password = password;
    }

    //Getter and Setter
    public int getSerial() {
        return super.getSerial();
    }
    
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getCedula() {
        return super.getCedula();
    }

    public void setCedula(String cedula) {
        super.setCedula(cedula);
    }

    public String getCorreoElectronico() {
        return super.getCorreoElectronico();
    }

    public void setCorreoElectronico(String correoElectronico) {
        super.setCorreoElectronico(correoElectronico);
    }

    public String getTelefono() {
        return super.getTelefono();
    }

    public void setTelefono(String telefono) {
        super.setTelefono(telefono);
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Administrador[ID: " + super.getSerial() + ", Usuario: " + usuario + ", Password: " + password + 
               ", Nombre: " + super.getNombre() + ", Cedula: " + super.getCedula() +
               ", Telefono" + super.getTelefono() + ", Correo: " + super.getCorreoElectronico() +']';
    }        
}
