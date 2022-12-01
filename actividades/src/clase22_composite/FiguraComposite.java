package clase22;

import java.util.ArrayList;

public class FiguraComposite extends Figura {

    //ATRIBUTOS
    private ArrayList<Figura> figuritas = new ArrayList<>();

    // CONSTRUCTOR

    public FiguraComposite() {}

    public FiguraComposite(ArrayList<Figura> figuritas) {
        this.figuritas = figuritas;
    }

    // METODOS

    @Override
    public double calcularArea() {
        double area = 0.00;
        for (Figura p: this.figuritas) {
            area += p.calcularArea();
        }
        return area;
    }

    public void agregarFigura(Figura figurita) {
        this.figuritas.add(figurita);
    };

    public void removerFigura(Figura figurita) {
        this.figuritas.remove(figurita);
    };

    // GETTERS & SETTERS

    public ArrayList<Figura> getFiguritas() {
        return figuritas;
    }

    public void setFiguritas(ArrayList<Figura> figuritas) {
        this.figuritas = figuritas;
    }
}
