package clase19y20s_patrones;

public class Pelota extends Producto {

    // ATRIBUTOS
    private double radio;

    // CONSTRUCTOR
    public Pelota() {}
    public Pelota(double radio) {
        this.radio = radio;
    }

    // METODOS

    @Override
    public double calcularEspacio() {
        return (Math.PI * this.radio * this.radio);
    }

    // GETTERS & SETTERS

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
