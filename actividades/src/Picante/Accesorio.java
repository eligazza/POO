package Picante;

public class Accesorio {

    // ATRIBUTOS
    private String marca;
    private String modelo;
    private String estado;

    // CONSTRUCTOR
    public Accesorio(String marca, String modelo, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    // METODOS

    // GETTERS && SETTERS

    public String getMarca() {
        return this.marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
