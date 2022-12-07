package clase24_preFinal;

import java.util.ArrayList;

public class UnidadCombinadaComposite extends Unidad {

    // ATRIBUTOS
    private ArrayList<Unidad> unidades = new ArrayList();
    private double montoDeMateriales;
    private int coeficienteGlobal;

    // CONSTRUCTOR no va

    // METODOS
    public void agregarUnidad(Unidad unidad) {
        this.unidades.add(unidad);
    }
    public void quitarUnidad(Unidad unidad) {
        this.unidades.remove(unidad);
    }
    @Override
    public double calcularMonto() {
        double acumulador = 0.00;
        for (Unidad u: this.unidades) {
            acumulador += u.calcularMonto();
        }
        return acumulador * this.coeficienteGlobal ;
    }

    // GETTERS & SETTERS
    public ArrayList<Unidad> getUnidades() {
        return this.unidades;
    }
    public void setUnidades(ArrayList<Unidad> unidades) {
        this.unidades = unidades;
    }
    public double getMontoDeMateriales() {
        return this.montoDeMateriales;
    }
    public void setMontoDeMateriales(double montoDeMateriales) {
        this.montoDeMateriales = montoDeMateriales;
    }
    public int getCoeficienteGlobal() {
        return this.coeficienteGlobal;
    }
    public void setCoeficienteGlobal(int coeficienteGlobal) {
        this.coeficienteGlobal = coeficienteGlobal;
    }
}
