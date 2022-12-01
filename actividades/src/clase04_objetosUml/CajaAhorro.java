package clase04;

public class CajaAhorro {

    // ATRIBUTOS
    private String numeroCuenta;
    private int cbu;
    private String alias;
    private String titular;
    private double saldo;

    // METODOS

    public CajaAhorro(String numeroCuenta, int cbu, String alias) {
        this.numeroCuenta = numeroCuenta;
        this.cbu = cbu;
        this.alias = alias;
        this.titular = "";
        this.saldo = 0.0;
    }

    public void asignarCajaAhorro(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void imprimirInfo() {
        System.out.println( "Su cuenta es: " + this.numeroCuenta + "\n" +
                "Titular: " + this.titular + "\n" +
                "Saldo: $" + this.saldo + "\n" +
                "CBU: " +this.cbu + "\n" +
                "Alias: " + this.alias);
    }

    public String imprimirTitular() {
        return titular;
    }

    public String imprimirCuenta() {
        return numeroCuenta;
    }

    public double consultarSaldo() {
        return saldo;
    }
    public void retirarDinero(double monto) {
        saldo -= monto;
        }

    public void depositarDinero(double monto) {
        saldo += monto;
    }

    public void recibirTransferencia(double monto) {
        saldo += monto;
    }

    public void enviarTransferencia(double monto) {
        saldo -= monto;
    }

}
