package Picante;

import java.util.Date;

public class Diagnostico extends Servicio {

    // ATRIBUTOS
    private Date fechaEmision;

    // CONSTRUCTOR
    public Diagnostico(int idServicio, Vehiculo vehiculo, Date fechaEmision) {
        this.idServicio     = idServicio;
        this.vehiculo       = new Vehiculo();
        this.fechaEmision   = fechaEmision;
    }

    // METODOS
    @Override
    public void calcularCosto() {
        this.costo = 1000.00;
    }

    // GETTERS & SETTERS
    public Date getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
}
