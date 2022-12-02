package clase18s;

public class EstacionInexistenteExcepcion extends Exception {

    // CONSTRUCTOR
    public EstacionInexistenteExcepcion(){};
    public EstacionInexistenteExcepcion(String mensaje) {
        super(mensaje);
    }

    // REDEFINO TOSTRING()
    @Override
    public String toString() {
        return "Se produjo una " + this.getClass().getName() + "\n" +
                "Mensaje: " + this.getMessage() + "\n";
    }
}
