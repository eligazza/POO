package PracticaClases.Programa1.EjercitacionClase25state;

public class Cerrado implements CarritoState{


    private String nombreEstado;
    private Carrito carrito;

    public Cerrado(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void cancelar() {
        System.out.println("No se puede cancelar la compra");
    }

    @Override
    public void volver() {
        System.out.println("No puedes volver");
    }

    @Override
    public void pasar() {
        this.carrito.setEstado(new Vacio(carrito));
    }
}
