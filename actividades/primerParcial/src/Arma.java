public abstract class Arma {

    // ATRIBUTOS
    protected Policia portador;
    protected int cantidadDeMuniciones;
    protected int alcanceEnMetros;
    protected String marca;
    protected int calibre;
    protected String estado;

    // CONSTRUCTOR

    public Arma(Policia portador, int cantidadDeMuniciones, int alcanceEnMetros, String marca, int calibre, String estado) {
        this.portador               = portador;
        this.cantidadDeMuniciones   = cantidadDeMuniciones;
        this.alcanceEnMetros        = alcanceEnMetros;
        this.marca                  = marca;
        this.calibre                = calibre;
        this.estado                 = estado;
    }

    // METODOS
    public boolean consultarListaParaEnfrentamiento() {
        if ( this.estado == "EN USO" && this.calibre >= 9 ) {
            return true;
        } else return false;
    };

    // GETTERS & SETTERS


    public Policia getPortador() {
        return this.portador;
    }

    public void setPortador(Policia portador) {
        this.portador = portador;
    }

    public int getCantidadDeMuniciones() {
        return this.cantidadDeMuniciones;
    }

    public void setCantidadDeMuniciones(int cantidadDeMuniciones) {
        this.cantidadDeMuniciones = cantidadDeMuniciones;
    }

    public int getAlcanceEnMetros() {
        return this.alcanceEnMetros;
    }

    public void setAlcanceEnMetros(int alcanceEnMetros) {
        this.alcanceEnMetros = alcanceEnMetros;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCalibre() {
        return this.calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
