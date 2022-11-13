package clase11;

public abstract class Cuenta {

    // ATRIBUTOS
    private double saldo;

    // METODOS
    public void depositarEfectivo(double monto) {
        this.saldo += monto;
    };
    public abstract void extraerEfectivo(double monto);

    public double informarSaldo() {
        return this.saldo;
    };

    // Setter
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }
}
