public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {

    // ATRIBUTOS
    private boolean tieneSelloRenar;
    private boolean tieneJustificacion;
    private int nivelDelArma;

    // CONSTRUCTOR

    public ArmaLarga(Policia portador, int cantidadDeMuniciones, int alcanceEnMetros, String marca, int calibre, String estado, boolean tieneSelloRenar, boolean tieneJustificacion, int nivelDelArma) {
        super(portador, cantidadDeMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.tieneSelloRenar    = tieneSelloRenar;
        this.tieneJustificacion = tieneJustificacion;
        this.nivelDelArma       = nivelDelArma;
    }

    // METODOS

    @Override
    public int compareTo(ArmaLarga arma) {
        if ( this.nivelDelArma > arma.getNivelDelArma() ) {
            return 1;
        } else if ( this.nivelDelArma < arma.getNivelDelArma() ) {
            return -1;
        } else {
            return 0;
        }
    }

    // GETTERS & SETTERS

    public boolean isTieneSelloRenar() {
        return tieneSelloRenar;
    }

    public void setTieneSelloRenar(boolean tieneSelloRenar) {
        this.tieneSelloRenar = tieneSelloRenar;
    }

    public boolean isTieneJustificacion() {
        return tieneJustificacion;
    }

    public void setTieneJustificacion(boolean tieneJustificacion) {
        this.tieneJustificacion = tieneJustificacion;
    }

    public int getNivelDelArma() {
        return nivelDelArma;
    }

    public void setNivelDelArma(int nivelDelArma) {
        this.nivelDelArma = nivelDelArma;
    }
}
