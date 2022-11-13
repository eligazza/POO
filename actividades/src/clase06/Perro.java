package clase06;

import java.time.Year;

public class Perro {

    // ATRIBUTOS
    private String nombrePila;
    private String raza;
    private int anioNacimiento;
    private boolean esAdoptable;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;


    // CONSTRUCTORES
    public Perro(String nombrePila, String raza){
        this.nombrePila = nombrePila;
        this.raza       = raza;
    }
    public Perro(String nombrePila, String raza, int anioNacimiento, boolean esAdoptable, double peso,
                 boolean tieneChip, boolean estaLastimado){
        this.nombrePila     = nombrePila;
        this.raza           = raza;
        this.anioNacimiento = anioNacimiento;
        this.esAdoptable    = esAdoptable;
        this.peso           = peso;
        this.tieneChip      = tieneChip;
        this.estaLastimado  = estaLastimado;
    }

    // Getters
    public boolean getEsAdoptable() {
        return this.esAdoptable;
    }

    // Setters
    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }
    public void setEsAdoptable(boolean esAdoptable) {
        this.esAdoptable = esAdoptable;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }
    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    // METODOS
    public int consultarEdad(){
        return (Year.now().getValue() - this.anioNacimiento);
    }
    public boolean consultarChip() {
        return this.tieneChip;
    }
    public void enviarAdopcion() {
        if (this.peso>5.0 && !this.estaLastimado) {
            this.esAdoptable = true;
        }
    }

}
