package clase19y20s_patrones;

public class Monio extends Producto {

    // ATRIBUTOS
    private String tamanio;

    // CONSTRUCTOR
    public Monio() {}
    public Monio(String tamanio) {
        this.tamanio = tamanio;
    }

    // METODOS
    @Override
    public double calcularEspacio() {
        return 0.00;
    }

    // GETTERS & SETTER
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
}
