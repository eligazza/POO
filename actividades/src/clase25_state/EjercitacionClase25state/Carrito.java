package PracticaClases.Programa1.EjercitacionClase25state;

import java.util.ArrayList;

public class Carrito {

    private CarritoState estado;
    private ArrayList<Producto> productos = new ArrayList();

    public Carrito() {
        this.estado = new Vacio(this);
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public void quitarProducto(Producto producto){
        this.productos.remove(producto);
    }

    public void cancelar(){
        this.estado.cancelar();
    };

    public void volver(){
        this.estado.volver();
    }

    public void pasar(){
        this.estado.pasar();
    }

    public CarritoState getEstado() {
        return estado;
    }

    public void setEstado(CarritoState estado) {
        this.estado = estado;
    }
}
