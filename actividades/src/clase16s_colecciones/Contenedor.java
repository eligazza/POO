package clase16s_colecciones;
public class Contenedor implements Comparable<Contenedor> {

    // ATRIBUTOS
    private int numero;
    private String pais;
    private boolean tieneMaterialPeligroso;

    // CONSTRUCTOR
    public Contenedor(int numero, String pais, boolean tieneMaterialPeligroso) {
        this.numero = numero;
        this.pais = pais;
        this.tieneMaterialPeligroso = tieneMaterialPeligroso;
    }

    // GETTER & SETTERS

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isTieneMaterialPeligroso() {
        return this.tieneMaterialPeligroso;
    }

    public void setTieneMaterialPeligroso(boolean tieneMaterialPeligroso) {
        this.tieneMaterialPeligroso = tieneMaterialPeligroso;
    }

    // METODOS

    @Override
    public int compareTo(Contenedor o) {
        if (this.getNumero() > o.getNumero()) {
            return 1;
        } else if (this.getNumero() < o.getNumero()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Contenedor n°" + numero + " de " + pais;
    }
}
