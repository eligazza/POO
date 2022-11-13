package Picante;

public class Vehiculo {

    // ATRIBUTOS
    Cliente duenio;
    Mecanico mecanico;
    String tipo;
    String techoEstado;
    String patente;
    String modelo;
    int anioFabricacion;
    String color;
    String estadoGeneral;
    Motor motor;
    Rueda[] ruedas;
    Accesorio[] accesorios;
    Butaca[] butacas;
    Servicio servicios;
    double deudaVehiculo;

    // CONSTRUCTOR
    public Vehiculo() {};
    public Vehiculo(String patente) {
        this.duenio = new Cliente();
        this.patente = patente;
        this.mecanico = new Mecanico();
        this.motor = new Motor();
        this.ruedas = new Rueda[4];
        this.butacas = new Butaca[10];
    }

    public Vehiculo(String tipo, String techoEstado, String patente, String modelo,
                    int anioFabricacion, String color, String estadoGeneral) {
        this.duenio = new Cliente();
        this.mecanico = new Mecanico();
        this.tipo = tipo;
        this.techoEstado = techoEstado;
        this.patente = patente;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.color = color;
        this.estadoGeneral = estadoGeneral;
        this.motor = new Motor();
        this.ruedas = new Rueda[4];
        this.butacas = new Butaca[10];
    }

    // METODOS


    // GETTERS && SETTERS

    public Cliente getDuenio() {
        return this.duenio;
    }
    public Mecanico getMecanico() {
        return this.mecanico;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getTechoEstado() {
        return this.techoEstado;
    }
    public String getPatente() {
        return this.patente;
    }
    public String getModelo() {
        return this.modelo;
    }
    public int getAnioFabricacion() {
        return this.anioFabricacion;
    }
    public String getColor() {
        return this.color;
    }
    public String getEstadoGeneral() {
        return this.estadoGeneral;
    }
    public Motor getMotor() {
        return this.motor;
    }
    public Rueda[] getRuedas() {
        return this.ruedas;
    }
    public Accesorio[] getAccesorios() {
        return this.accesorios;
    }
    public Butaca[] getButacas() {
        return this.butacas;
    }
    public Servicio getServicios() {
        return this.servicios;
    }
    public double getDeudaVehiculo() {
        return this.deudaVehiculo;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setTechoEstado(String techoEstado) {
        this.techoEstado = techoEstado;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEstadoGeneral(String estadoGeneral) {
        this.estadoGeneral = estadoGeneral;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
    public void setAccesorios(Accesorio[] accesorios) {
        this.accesorios = accesorios;
    }
    public void setButacas(Butaca[] butacas) {
        this.butacas = butacas;
    }
    public void setServicios(Servicio servicios) {
        this.servicios = servicios;
    }
    public void setDeudaVehiculo(double monto) {
        this.deudaVehiculo = monto;
    }
}
