import java.util.ArrayList;

public class Barco {

    // ATRIBUTOS
    private String matricula;
    private ArrayList<Carga> cargas = new ArrayList();

    // CONSTRUCTOR
    public Barco() {}
    public Barco(String matricula) {
        this.matricula = matricula;
    }

    // METODOS
    public void agregarCarga(Carga carga) {
        this.cargas.add(carga);
    }
    public void quitarCarga(Carga carga) {
        this.cargas.remove(carga);
    }
    public void mostrarCargas(){
        for (Carga c: this.cargas) {
            System.out.println(c.toString());
        }
    }

    // GETTERS & SETTERS
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public ArrayList<Carga> getCargas() {
        return this.cargas;
    }
}
