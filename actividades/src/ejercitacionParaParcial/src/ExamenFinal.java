public class ExamenFinal extends Examen implements Comparable<ExamenFinal> {

    // ATRIBUTOS

    private double notaDelOral;
    private String descripcionDelTema;

    // CONSTRUCTOR

    public ExamenFinal(String titulo, String enunciado) {
        super(titulo, enunciado);
    }

    // METODOS

    public boolean determinarEstadoAprobacion() {
        if (this.notaDelOral >= 4 && this.notaEscrita >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(ExamenFinal examen) {
        double promedio1 = (this.notaDelOral + this.notaEscrita) / 2;
        double promedio2 = (examen.getNotaDelOral() + examen.getNotaEscrita()) / 2;
        if (promedio1 > promedio2) { return 1; }
        else if (promedio1 < promedio2) { return -1; }
        else { return 0; }
    }

    // GETTERS && SETTERS

    public double getNotaDelOral() {
        return notaDelOral;
    }

    public void setNotaDelOral(double notaDelOral) {
        this.notaDelOral = notaDelOral;
    }

    public String getDescripcionDelTema() {
        return descripcionDelTema;
    }

    public void setDescripcionDelTema(String descripcionDelTema) {
        this.descripcionDelTema = descripcionDelTema;
    }

}
