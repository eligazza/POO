public class Estudiante {

    // ATRIBUTOS

    private String apellido;
    private String nombre;
    private int legajo;
    private Examen[] examenes;

    // CONSTRUCTOR

    public Estudiante(String apellido, String nombre, int legajo, Examen[] examenes) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.legajo = legajo;
        this.examenes = examenes;
    }


    // GETTERS && SETTERS

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Examen[] getExamenes() {
        return examenes;
    }

    public void setExamenes(Examen[] examenes) {
        this.examenes = examenes;
    }
}
