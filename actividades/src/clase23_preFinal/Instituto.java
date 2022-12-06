package clase23_preFinal;

import java.util.ArrayList;

public class Instituto {

    // ATRIBUTOS
    private String nombre;
    private ArrayList<Oferta> ofertaAcademica = new ArrayList();

    // CONSTRUCTOR
    public Instituto() {}
    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    // METODOS
    public void sumarOferta(Oferta oferta) {
        ofertaAcademica.add(oferta);
    }
    public void quitarOferta(Oferta oferta) {
        ofertaAcademica.remove(oferta);
    }
    public void generarInforme(){
        System.out.println("\n INSTITUTO: " + this.nombre.toUpperCase() + "\n Oferta Académica:");
        for (Oferta o: ofertaAcademica) {
            System.out.println(o.toString());
        }
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Oferta> getOfertaAcademica() {
        return this.ofertaAcademica;
    }
    public void setOfertaAcademica(ArrayList<Oferta> ofertaAcademica) {
        this.ofertaAcademica = ofertaAcademica;
    }
}
