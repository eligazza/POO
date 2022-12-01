package clase22;

public class Triangulo extends Figura {

    //ATRIBUTOS
    private double base;
    private double altura;

    //CONSTRUCTOR

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //METODO

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }


    //GETTERS & SETTERS

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
