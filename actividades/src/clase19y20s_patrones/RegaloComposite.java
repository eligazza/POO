package clase19y20s_patrones;

import java.util.ArrayList;

public class RegaloComposite extends Producto {

    // ATRIBUTOS
    private String nombre;
    private ArrayList<Producto> productos;

    // CONSTRUCTOR
    public RegaloComposite() {}
    public RegaloComposite(String nombre, ArrayList<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    // METODOS
    @Override
    public double calcularEspacio() {
        double acumulador = 0.00;
        for (Producto p: this.productos) {
            acumulador += p.calcularEspacio();
        }
        return acumulador;
    }
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    public void removerProducto(Producto producto){
        this.productos.remove(producto);
    }


    // GETTERS & SETTER
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Producto> getProductos() {
        return productos;
    }
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
