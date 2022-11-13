package Picante;

import java.util.Date;
import java.util.Objects;

public class Mecanico {

    // ATRIBUTOS
    String nombre;
    String apellido;
    int documento;
    Date fechaNaciemiento;
    String domicilio;
    Servicio[] servicios;
    Vehiculo[] vehiculos;
    double sueldoMensual;
    int antiguedad;
    String seniority = "Ayudante";
    double bono;
    int horasExtra;
    boolean presentismo;
    double sueldoBruto;

    // CONSTRUCTOR
    public Mecanico() {}
    public Mecanico(String nombre, String apellido, int documento) {
        this.nombre     = nombre;
        this.apellido   = apellido;
        this.documento  = documento;
    };

    // METODOS
    public void setSeniority(){
        if (this.antiguedad > 9) {
            this.seniority = "Experto";
        }
        if (this.antiguedad < 9 && this.antiguedad >= 5) {
            this.seniority = "Oficial";
        }
    };
    public void definirSueldoMensual() {
        if (this.seniority == "Ayudante") {
            this.sueldoMensual = 2000.00;
        } else if (this.seniority == "Oficial") {
            this.sueldoMensual = 3500.00;
        } else {
            this.sueldoMensual = 5000.00;
        } ;
    }
    public void calcularSueldoBruto(){
        if (this.presentismo) {
            this.bono += 500.00;
        }
        if (this.seniority == "Experto") {
            this.bono += ((this.antiguedad-9) * 100.00);
        } else if (this.seniority == "Oficial") {
            this.bono += ((this.antiguedad-5) * 100.00);
        } else {
            this.bono += (this.antiguedad*100);
        }
        double aux = this.sueldoMensual + bono + (this.horasExtra* 125.00);
        this.sueldoBruto = aux - (aux * 0.17);
    };
    public void hacerServicio(Vehiculo vehiculo) {
        /* logica */
    };
    public void diagnosticar(Vehiculo vehiculo) {
        /* logica */
    };
    public void conducir(Vehiculo vehiculo) {
        /* logica */
    };

    // GETTERS & SETTERS

    public void setFechaNaciemiento(Date fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    public void setServicios(Servicio[] servicios) {
        this.servicios = servicios;
    }
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
        this.setSeniority();
        this.definirSueldoMensual();
    }
    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    public void setPresentismo(boolean presentismo) {
        this.presentismo = presentismo;
    }
    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public int getDocumento() {
        return this.documento;
    }
    public Date getFechaNaciemiento() {
        return this.fechaNaciemiento;
    }
    public String getDomicilio() {
        return this.domicilio;
    }
    public Servicio[] getServicios() {
        return this.servicios;
    }
    public double getSueldoMensual() {
        return this.sueldoMensual;
    }
    public int getAntiguedad() {
        return this.antiguedad;
    }
    public String getSeniority() {
        return this.seniority;
    }
    public double getBono() {
        return this.bono;
    }
    public int getHorasExtra() {
        return this.horasExtra;
    }
    public boolean isPresentismo() {
        return this.presentismo;
    }
    public double getSueldoBruto() {
        return this.sueldoBruto;
    }


}
