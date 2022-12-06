package clase23_preFinal;

public class Curso extends Oferta {

    // ATRIBUTOS
    private int cargaHorariaMensual;
    private int duracionEnMeses;
    private double valorPorHora;

    // CONSTRUCTOR

    // METODOS
    @Override
    public double calcularPrecio() {
        return (this.cargaHorariaMensual * this.valorPorHora) * this.duracionEnMeses;
    }

    // GETTERS & SETTERS
    public int getCargaHorariaMensual() {
        return this.cargaHorariaMensual;
    }
    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }
    public int getDuracionEnMeses() {
        return this.duracionEnMeses;
    }
    public void setDuracionEnMeses(int duracionEnMeses) {
        this.duracionEnMeses = duracionEnMeses;
    }
    public double getValorPorHora() {
        return this.valorPorHora;
    }
    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
