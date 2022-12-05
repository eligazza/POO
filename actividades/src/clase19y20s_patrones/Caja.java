package clase19y20s_patrones;

public class Caja extends Producto {

    // ATRIBUTOS
    private double longitud;
    private double ancho;
    private double altura;

    // CONSTRUCTOR
    public Caja() {
    }
    public Caja(double longitud, double ancho, double altura) {
        this.longitud = longitud;
        this.ancho = ancho;
        this.altura = altura;
    }

    // METODOS
    @Override
    public double calcularEspacio() {
        return (this.altura * this.ancho * this.longitud);
    }

    // GETTERS & SETTERS
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
