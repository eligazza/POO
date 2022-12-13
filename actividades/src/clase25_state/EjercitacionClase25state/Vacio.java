package PracticaClases.Programa1.EjercitacionClase25state;

public class Vacio implements CarritoState{


    private String nombreEstado;
    private Carrito carrito;

    public Vacio(Carrito carrito) {
        this.carrito = carrito;
    }

    @Override
    public void cancelar() {
        System.out.println("El carrito ya se encuentra vacio");
    }

    @Override
    public void volver() {
        System.out.println("El carrito esta vacio");
    }

    @Override
    public void pasar() {
        System.out.println("Carrito Cargado");
        this.carrito.setEstado(new Cargando(carrito));
    }
}
