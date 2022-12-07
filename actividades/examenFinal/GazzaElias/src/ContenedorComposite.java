import java.util.ArrayList;

public class ContenedorComposite extends Carga {

    // ATRIBUTOS
    private double pesoDelContenedor;
    private ArrayList<Carga> cargas = new ArrayList();

    // METODOS
    public void agregarCarga(Carga carga) {
        this.cargas.add(carga);
    }
    public void quitarCarga(Carga carga) {
        this.cargas.remove(carga);
    }
    @Override
    public double calcularPeso() {
        double pesoTotal = this.pesoDelContenedor;
        for (Carga c: this.cargas) {
            pesoTotal += c.calcularPeso();
        }
        return pesoTotal;
    }
    @Override
    public String toString() {
        String str = this.getNombre() + ":\nPeso Total= " + this.calcularPeso() + "kg \nContiene:\n";
        for (Carga c : this.cargas) {
            str += "\t-" + c.getNombre() +" ("+  c.calcularPeso() + "kg)\n";
        }
        return str;
    }

    // GETTERS & SETTERS
    public double getPesoDelContenedor() {
        return this.pesoDelContenedor;
    }
    public void setPesoDelContenedor(double pesoDelContenedor) {
        this.pesoDelContenedor = pesoDelContenedor;
    }
    public ArrayList<Carga> getCargas() {
        return this.cargas;
    }

}
