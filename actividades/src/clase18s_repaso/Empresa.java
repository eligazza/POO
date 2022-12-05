package clase18s_repaso;

import java.util.ArrayList;

public class Empresa {

    // ATRIBUTOS
    private String nombre;
    private Recorrido recorrido;
    private ArrayList<Reserva> reservas = new ArrayList<>();

    // CONSTRUCTOR
    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    // METODOS
    public double recaudacionTotal() {
        double acumulador = 0.00;
        for (Reserva r: reservas) {
            acumulador += r.calcularPrecioReserva();
        }
        return acumulador;
    }

    public int cantidadDeVecesRecorrida(Estacion estacionConsultada) throws EstacionInexistenteExcepcion {
        int acumulador = 0;
        if (!recorrido.getEstaciones().contains(estacionConsultada))
            throw new EstacionInexistenteExcepcion("La estación consultada no existe. Por favor, intente de nuevo");
        for (Reserva r: reservas) {
            if (r.getInicioRecorrido() == estacionConsultada ||
                    r.getDestinoRecorrido() == estacionConsultada) {
            acumulador += 1;
            }
        }
        return acumulador;
    }

    // GETTERS & SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }

    public void setRecorrido(Recorrido recorrido) {
        this.recorrido = recorrido;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
}
