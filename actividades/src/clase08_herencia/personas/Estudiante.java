package clase08.personas;

public class Estudiante extends Persona{

    // Atributos
    private String carrera;
    private double promedioFinal;

    // Constructor
    public Estudiante(String nombre, String apellido, String carrera, double promedioFinal) {
        super(nombre, apellido);
        this.carrera = carrera;
        this.promedioFinal = promedioFinal;
    }

    // Metodos
    public void tomarClase(String clase) {}

}
