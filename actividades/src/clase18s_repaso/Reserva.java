package clase18s_repaso;

import java.util.ArrayList;

public class Reserva {

    // ATRIBUTOS
    private Empresa empresa;
    private String codigo;
    private Estacion inicioRecorrido;
    private Estacion destinoRecorrido;
    private int cantidadDePersonas;
    private final double PRECIO_BOLETO = 50.00;

    // CONSTRUCTOR
    public Reserva(Empresa empresa, String codigo, Estacion inicioRecorrido, Estacion destinoRecorrido, int cantidadDePersonas) {
        this.empresa = empresa;
        this.codigo = codigo;
        this.inicioRecorrido = inicioRecorrido;
        this.destinoRecorrido = destinoRecorrido;
        this.cantidadDePersonas = cantidadDePersonas;
    }

    // METODOS
    public double calcularPrecioReserva(){
        double precio = this.cantidadDePersonas * PRECIO_BOLETO;
        if ( (this.inicioRecorrido.getNombre().equals("Buenos Aires") && this.destinoRecorrido.getNombre().equals("Bragado")) ||
                (this.inicioRecorrido.getNombre().equals("Bragado") && this.destinoRecorrido.getNombre().equals("Buenos Aires"))) {
            return (precio - (precio)*0.2);
        } else return precio;
    };

    // GETTERS & SETTERS
    public String getCodigo() {
        return this.codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Estacion getInicioRecorrido() {
        return this.inicioRecorrido;
    }
    public void setInicioRecorrido(Estacion inicioRecorrido) {
        this.inicioRecorrido = inicioRecorrido;
    }
    public Estacion getDestinoRecorrido() {
        return this.destinoRecorrido;
    }
    public void setDestinoRecorrido(Estacion destinoRecorrido) {
        this.destinoRecorrido = destinoRecorrido;
    }
    public int getCantidadDePersonas() {
        return this.cantidadDePersonas;
    }
    public void setCantidadDePersonas(int cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }
}
