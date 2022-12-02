package clase18s;

import java.util.ArrayList;

public class Recorrido {

    // ATRIBUTOS
    private ArrayList<Estacion> estaciones = new ArrayList<>();

    // METODOS
    public void sumarEstacion(Estacion estacionNueva){
        estaciones.add(estacionNueva);
    };

    // GETTERS & SETTERS

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
}
