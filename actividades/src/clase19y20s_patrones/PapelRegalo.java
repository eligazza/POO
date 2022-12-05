package clase19y20s_patrones;

public class PapelRegalo extends Producto {

    // ATRIBUTOS
    private double ancho;
    private double alto;

    // CONSTRUCTOR
    public PapelRegalo() {}
    public PapelRegalo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // METODOS
    @Override
    public double calcularEspacio() {
        return 0.00;
    }

    // GETTERS & SETTER
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }
}
