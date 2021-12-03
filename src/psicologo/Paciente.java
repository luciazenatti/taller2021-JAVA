
package psicologo;


public class Paciente {
    private String nombre;
    private boolean obraSocial;
    private int costo;

    public String getNombre() {
        return nombre;
    }

    public boolean tieneObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(boolean obraSocial) {
        this.obraSocial = obraSocial;
    }
    
    public int getCosto() {
        return costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Paciente(String nombre, boolean obraSocial, int costo) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
        this.costo = costo;
    }
    
    

}


