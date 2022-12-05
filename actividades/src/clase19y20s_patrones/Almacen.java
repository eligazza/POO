package clase19y20s_patrones;

import java.util.ArrayList;

public class Almacen {

    // ATRIBUTOS
    private ArrayList<Producto> productos = new ArrayList<Producto>();

    // CONSTRUCTOR

    public Almacen(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    // METODOS

    public double calcularEspacioNecesario() {
        double acumulador = 0.00;
        for (Producto p: productos) {
            acumulador += p.calcularEspacio();
        }
        return acumulador;
    };

    // GETTERS & SETTERS

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
