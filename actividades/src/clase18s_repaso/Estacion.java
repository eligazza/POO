package clase18s_repaso;

public class Estacion {

    // ATRIBUTOS
    private String nombre;
    private int numero;

    // CONSTRUCTOR
    public Estacion(String nombre) {
        this.nombre = nombre;
    }
    public Estacion(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
