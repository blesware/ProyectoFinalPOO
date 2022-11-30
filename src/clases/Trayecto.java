package clases;

import java.io.Serializable;

/**
 *
 * @author juanf
 */
public class Trayecto implements Serializable {

    //Atributos de clase
    private double costo;
    private String lugar;
    private EmpresaTransporte empresa;
    
    //Constructor
    public Trayecto(String lugar, double costo) {
        
        this.costo = costo;
        this.lugar = lugar;                
    }
    
    //Getter and Setter
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }        

    public EmpresaTransporte getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaTransporte empresa) {
        this.empresa = empresa;
    }    
}
