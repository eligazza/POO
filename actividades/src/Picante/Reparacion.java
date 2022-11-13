package Picante;

import java.util.Date;

public class Reparacion extends Servicio {

    // ATRIBUTOS
    private String complejidad;
    private String informe;
    private Date fechaEntrada;
    private Date fechaSalida;

    // CONSTRUCTOR
    public Reparacion(int idServicio, Vehiculo vehiculo, Date fechaEntrada) {
        this.idServicio     = idServicio;
        this.vehiculo       = vehiculo;
        this.fechaEntrada   = fechaEntrada;
    }

    // METODOS
    @Override
    public void calcularCosto() {
        double aux;
        if (this.complejidad == "Alta") {
            aux = 6000.00;
        } else if (this.complejidad == "Media") {
            aux = 3500.00;
        } else { aux = 2000.00; };
        if ( this.vehiculo.getDuenio().getVip()) {
            aux -= (aux*0.3);
        }
        this.costo = aux;
    }
    public void imprimirInforme() {
        /* lógica */
    }
}
