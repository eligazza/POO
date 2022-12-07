public abstract class Carga {

    // ATRIBUTOS
    private String nombre;
    private String descripcion;

    // METODOS
    public abstract double calcularPeso();

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
