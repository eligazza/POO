package clase23_preFinal;

import java.util.ArrayList;

public class CarreraComposite extends Oferta {

    // ATRIBUTOS
    private ArrayList<Oferta> programa = new ArrayList();
    private double porcentajeDeBonificacion;
    // CONSTRUCTOR

    // METODOS
    public void sumarMateria(Oferta materia){
        programa.add(materia);
    }
    public void quitarMateria(Oferta materia){
        programa.remove(materia);
    }
    @Override
    public double calcularPrecio() {
        double acumulador = 0.00;
        for (Oferta o: programa) {
            acumulador += o.calcularPrecio();
        }
        return acumulador - (acumulador * this.porcentajeDeBonificacion/100);
    }

    // GETTERS & SETTERS
    public ArrayList<Oferta> getPrograma() {
        return this.programa;
    }
    public void setPrograma(ArrayList<Oferta> programa) {
        this.programa = programa;
    }
    public double getPorcentajeDeBonificacion() {
        return this.porcentajeDeBonificacion;
    }
    public void setPorcentajeDeBonificacion(double porcentajeDeBonificacion) {
        this.porcentajeDeBonificacion = porcentajeDeBonificacion;
    }
}
