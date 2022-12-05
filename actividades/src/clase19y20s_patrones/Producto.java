package clase19y20s_patrones;

public abstract class Producto {

    // ATRIBUTOS
    private double peso;

    // CONSTRUCTOR
    // No pongo constructor para no tener problemas con el patrón de diseño

    // METODOS
    public abstract double calcularEspacio();

    // GETTERS & SETTERS

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
