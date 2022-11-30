package clases;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class Operador extends Usuario implements Serializable {

    //Atributos de la clase    
    private String usuario;
    private String password;
    private static final boolean PERMISOS = false;

    //Constructor
    public Operador(String nombre, String cedula, String telefono, 
            String correElectronico, String usuario, String password) {

        //Llamado al constructor de la Super clase
        super(nombre, cedula, telefono, correElectronico);

        this.usuario = usuario;
        this.password = password;
    }

    //Getter and Setter    
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
}
