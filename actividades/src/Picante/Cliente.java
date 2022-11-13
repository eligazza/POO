package Picante;

import java.util.Date;

public class Cliente {

    // ATRIBUTOS
    String nombre;
    String apellido;
    int documento;
    Date fechaNacimiento;
    int[] telefonos;
    boolean vip;
    Vehiculo[] vehiculos;
    double deudaCliente;

    // CONSTRUCTOR
    public Cliente(){};
    public Cliente(String nombre, String apellido, int[] telefonos){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = telefonos;
    };

    // METODOS

    // GETTERS && SETTERS

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public int[] getTelefonos() {
        return this.telefonos;
    }
    public boolean isVip() {
        return this.vip;
    }
    public Vehiculo[] getVehiculos() {
        return this.vehiculos;
    }
    public double getDeudaCliente() {
        return this.deudaCliente;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }
    public void setDeudaCliente(double deudaCliente) {
        this.deudaCliente = deudaCliente;
    }
}
