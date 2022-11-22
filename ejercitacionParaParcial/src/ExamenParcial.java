public class ExamenParcial extends Examen {

    // ATRIBUTOS
    private int numeroDeUnidad;
    private int numeroDeIntentos;

    // CONSTRUCTOR

    public ExamenParcial(String titulo, String enunciado) {
        super(titulo, enunciado);
        this.numeroDeIntentos = 1;
    }

    // METODOS

    public boolean determinarEstadoAprobacion() {
        if (this.notaEscrita >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean determinarRecuperabilidad() {
        if (this.numeroDeUnidad <= 3 && this.numeroDeIntentos < 3) {
            return true;
        } else {
            return false;
        }
    }

    // GETTERS && SETTERS

    public int getNumeroDeUnidad() {
        return numeroDeUnidad;
    }

    public void setNumeroDeUnidad(int numeroDeUnidad) {
        this.numeroDeUnidad = numeroDeUnidad;
    }

    public int getNumeroDeIntentos() {
        return numeroDeIntentos;
    }

    public void setNumeroDeIntentos(int numeroDeIntentos) {
        this.numeroDeIntentos = numeroDeIntentos;
    }
}
