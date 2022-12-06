package clase24_preFinal;

public abstract class Unidad {

    // ATRIBUTOS
    private String nombre;
    private String descripcion;

    // CONSTRUCTOR
    // Acá naranja fanta

    // METODOS
    public abstract double calcularMonto();

    // GETTERS & SETTERS
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
