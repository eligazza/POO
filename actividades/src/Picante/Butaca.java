package Picante;

public class Butaca {

    // ATRIBUTOS
    private String material;
    private String tipo;
    private String color;
    private String estado;

    // CONSTRUCTOR
    public Butaca(){};
    public Butaca(String material, String tipo, String color, String estado) {
        this.material = material;
        this.tipo = tipo;
        this.color = color;
        this.estado = estado;
    }

    // METODOS

    // GETTERS && SETTERS

    public String getMaterial() {
        return this.material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
