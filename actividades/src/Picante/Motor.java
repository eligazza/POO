package Picante;

public class Motor {

    // ATRIBUTOS
    private String modelo;
    private int potenciaCV;
    private String combustible;

    // CONSTRUCTOR
    public Motor(){};
    public Motor(String modelo, int potenciaCV, String combustible) {
        this.modelo = modelo;
        this.potenciaCV = potenciaCV;
        this.combustible = combustible;
    }

    // METODOS

    // GETTERS && SETTERS

    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPotenciaCV() {
        return this.potenciaCV;
    }
    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    public String getCombustible() {
        return this.combustible;
    }
    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }
}
