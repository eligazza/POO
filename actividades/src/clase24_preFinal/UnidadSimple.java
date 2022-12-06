package clase24_preFinal;

public class UnidadSimple extends Unidad {

    // ATRIBUTOS
    private int cantidadDePersonas;
    private double montoPorPersona;

    // CONSTRUCTOR no va

    // METODOS
    @Override
    public double calcularMonto() {
        double costo = this.cantidadDePersonas * this.montoPorPersona;
        if (this.cantidadDePersonas > 10) {
            return costo* 1.20;
        }
        return costo;
    }
    @Override
    public String toString() {
        return "\nUnidad Simple: " + this.getNombre() + " por $" + this.calcularMonto();
    }

    // GETTERS & SETTERS
    public int getCantidadDePersonas() {
        return this.cantidadDePersonas;
    }
    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }
    public double getMontoPorPersona() {
        return this.montoPorPersona;
    }
    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }
}
