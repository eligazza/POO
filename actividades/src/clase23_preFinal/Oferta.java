package clase23_preFinal;

public abstract class Oferta {

    // ATRIBUTOS
    private String nombre;
    private String descripcion;

    // CONSTRUCTOR
    public Oferta() {}
    public Oferta(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // METODOS
    public abstract double calcularPrecio();
    @Override
    public String toString() {
        return "\t->" + this.nombre + ": \t$" + this.calcularPrecio();
    }

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
