package clase08.personas;

public class Profesor extends Persona {

    // Atributos
    private String materia;

    // Constructor
    public Profesor(String nombre, String apellido, String materia) {
        super(nombre, apellido);
        this.materia = materia;
    }

    // Metodos
    public void proponerTema(String tema) {}
}
