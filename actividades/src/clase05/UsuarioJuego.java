package clase05;

public class UsuarioJuego {

    // atributos
    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private int nivel = 0;

    // constructor
    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    // metodos
    public void aumentarPuntaje() {
        this.puntaje += 1;
    }

    public void subirNivel() {
        this.nivel += 1;
    }

    public void bonus(int valorBonus) {
        this.puntaje += (double)valorBonus;
    }

    public String getNombre() {
        return this.nombre;
    }
    public Double getPuntaje() {
        return this.puntaje;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void imprimirInfo() {
        System.out.println(this.nombre + "\n" + "Nivel: " + this.nivel + "\n" + "Puntaje: " + this.puntaje);
    }
}
