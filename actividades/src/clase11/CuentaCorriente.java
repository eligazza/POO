package clase11;

public class CuentaCorriente extends Cuenta{

    // ATRIBUTOS
    private double giroDescubierto;

    // CONSTRUCTOR
    public CuentaCorriente(double giroDescubierto, double saldoInicial) {
        this.setSaldo(saldoInicial);
        this.giroDescubierto = giroDescubierto;
    }

    // METODOS
    @Override
    public void extraerEfectivo(double monto) {
        if ((this.getSaldo() + this.giroDescubierto) >= monto) {
            this.setSaldo(this.getSaldo() - monto);
        }
        else {
            System.out.println("No cuenta con fondos suficientes");
        }
    }

    // Getters
    public double getGiroDescubierto() {
        return giroDescubierto;
    }
    // Setters
    public void setGiroDescubierto(double giroDescubierto) {
        this.giroDescubierto = giroDescubierto;
    }
}
