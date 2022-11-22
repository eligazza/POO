public class ArmaCorta extends Arma {

    // ATRIBUTOS
    private boolean esAutomatica;

    // CONSTRUCTOR

    public ArmaCorta(Policia portador, int cantidadDeMuniciones, int alcanceEnMetros, String marca, int calibre, String estado, boolean esAutomatica) {
        super(portador, cantidadDeMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    // METODOS
    public boolean consultarLargoAlcance() {
        if (this.alcanceEnMetros > 200) {
            return true;
        } else return false;
    };

    // GETTER & SETTERS

    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    public void setEsAutomatica(boolean esAutomatica) {
        this.esAutomatica = esAutomatica;
    }
}
