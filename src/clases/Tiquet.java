package clases;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author juanf
 */
public class Tiquet implements Serializable {
       
    //Atributos del Tiquete
    private final int serial;
    private String user;
    private String cedula;
    private String fechaCompra;
    private String trayecto;
    private String destino;
    private String pago;

    //Constructor
    public Tiquet(String user, String cedula, String trayecto,
            String destino, String pago) {

        this.serial = Serials.serialClassTiquet++;
        this.user = user;
        this.cedula = cedula;
        this.trayecto = trayecto;
        this.destino = destino;
        this.pago = pago;
        
        Serials.escribirSeriales();

        //Obtener la fecha actual del Computador
        Calendar c = Calendar.getInstance();

        this.fechaCompra = Integer.toString(c.get(Calendar.DATE)) + "/"
                + Integer.toString(c.get(Calendar.MONTH) + 1) + "/" //Se le suma uno dado que los meses empiezan de 0
                + Integer.toString(c.get(Calendar.YEAR));
    }

    //Getters and Setters            
    public int getSerial() {
        return this.serial;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCedula() {
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaCompra() {
        return this.fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getTrayecto() {
        return this.trayecto;
    }

    public void setTrayecto(String trayecto) {
        this.trayecto = trayecto;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPago() {
        return this.pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }    
}
