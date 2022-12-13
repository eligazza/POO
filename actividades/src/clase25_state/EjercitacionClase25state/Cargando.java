package PracticaClases.Programa1.EjercitacionClase25state;

public class Cargando implements CarritoState{


    private String nombreEstado;
    private Carrito carrito;

    public Cargando(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void cancelar() {
        this.carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void volver() {
        this.carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void pasar() {
        System.out.println("Pagando Carrito");
        this.carrito.setEstado(new Pagando(carrito));
    }
}
