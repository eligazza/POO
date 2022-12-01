package clase22;

public class Rectangulo extends Figura {

    //ATRIBUTOS
    private double largo;
    private double alto;

    //CONSTRUCTOR

    public Rectangulo(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
    }

    //METODOS
    @Override
    public double calcularArea() {
        return (this.largo * this.alto);
    }

    //GETTER & SETTERS

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

}
