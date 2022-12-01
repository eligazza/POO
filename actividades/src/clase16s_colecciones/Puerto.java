package clase16s_colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Puerto {

    // ATRIBUTOS
    private String nombre;
    private ArrayList<Contenedor> contenedores = new ArrayList();

    // CONSTRUCTOR

    public Puerto(String nombre) {
        this.nombre = nombre;
    }

    // METODOS

    public void ingresarContenedor(Contenedor pepito) {
        this.contenedores.add(pepito);
    };

    public ArrayList<Contenedor> mostrarContenedoresOrdenados() {
        Collections.sort(contenedores);
        return contenedores;
    };

    public int calcularContenedoresPeligrosos() {
        int contador = 0;
        for (Contenedor elemento : contenedores) {
            if (elemento.getPais() == "Desconocido" && elemento.isTieneMaterialPeligroso()) {
                contador++;
            }
        }
        return contador;
    }

    // GETTERS & SETTERS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Contenedor> getContenedores() {
        return this.contenedores;
    }

    public void setContenedores(ArrayList<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }
}