package clase22;

public class Circulo extends Figura {

    // ATRIBUTOS
    private double radio;
    private final double PI = Math.PI;

    // CONSTRUCTOR

    public Circulo(double radio) {
        this.radio = radio;
    }

    // METODO
    @Override
    public double calcularArea() {
        return PI * this.radio * this.radio;
    }

    // GETTERS & SETTERS

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
