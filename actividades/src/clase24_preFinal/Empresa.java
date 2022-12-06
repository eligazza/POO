package clase24_preFinal;

import java.util.ArrayList;

public class Empresa {

    // ATRIBUTOS
    private ArrayList<Unidad> unidades = new ArrayList();

    // CONSTRUCTOR

    // METODOS
    public void agregarUnidad(Unidad unidad) {
        this.unidades.add(unidad);
    }
    public void quitarUnidad(Unidad unidad) {
        this.unidades.remove(unidad);
    }
    public void mostrarUnidades() {
        for (Unidad u: this.unidades) {
            System.out.println(u.toString());
        }
    }

    // GETTERS & SETTERS


}
