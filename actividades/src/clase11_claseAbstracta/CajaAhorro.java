package clase11;

public class CajaAhorro extends Cuenta {

    // ATRIBUTOS
    private double tasaInteres;

    // CONSTRUCTOR PARA SERGIO
    public CajaAhorro(double tasaInteres, double saldoInicial) {
        this.setSaldo(saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    // METODOS
    @Override
    public void extraerEfectivo(double monto) {
        if (this.getSaldo() > 0 && this.getSaldo() > monto) {
            this.setSaldo(this.getSaldo() - monto);
        }
        else {
            System.out.println("No cuenta con fondos suficientes");
        }
    };
    public void cobrarInteres() {
        // logica
    };

    // Getters
    public double getTasaInteres() {
        return tasaInteres;
    }

    // Setters
    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
}

