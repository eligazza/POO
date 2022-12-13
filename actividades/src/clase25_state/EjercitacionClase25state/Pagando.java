package PracticaClases.Programa1.EjercitacionClase25state;

public class Pagando implements CarritoState{


    private String nombreEstado;
    private Carrito carrito;


    public Pagando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void cancelar() {
        this.carrito.setEstado(new Vacio(carrito));

    }

    @Override
    public void volver() {
        this.carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void pasar() {
        this.carrito.setEstado(new Cerrado(carrito));
    }
}
