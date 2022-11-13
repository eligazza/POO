package Picante;

public abstract class Servicio {

    // ATRIBUTOS
    protected int idServicio;
    protected Vehiculo vehiculo;
    protected double costo;

    // CONSTRUCTOR

    // METODOS
    public void sumarDeudaVehiculo(double monto) {
        this.vehiculo.setDeudaVehiculo(monto);
    };
    public abstract void calcularCosto();

    // GETTERS && SETTERS
    public int getIdServicio() {
        return this.idServicio;
    }
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    public double getCosto() {
        return this.costo;
    }
}
