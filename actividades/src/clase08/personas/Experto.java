package clase08.personas;

public class Experto extends Profesor {

    // Atributos
    private String temario;

    // Constructor
    public Experto(String nombre, String apellido, String materia, String temario) {
        super(nombre, apellido, materia);
        this.temario = temario;
    }

    // Metodos
    public void dictarClase() {};

}
