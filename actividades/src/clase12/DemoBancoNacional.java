package clase12;

public class DemoBancoNacional {

    public static void main(String[] args) {

        Cliente montoto = new Cliente(123456, "Medina", 35888455);
        Cliente morondanga = new Cliente(654321, "Pereyra", 40557123);

        CajaDeAhorro ca001 = new CajaDeAhorro(1000.0, 3.0);
        ca001.setCliente(montoto);
        ca001.depositarEfectivo(100.0);
        ca001.extraerEfectivo(1850.0);

        CuentaCorriente cc001 = new CuentaCorriente(1500.0, 250.0);
        cc001.setCliente(morondanga);
        cc001.depositarEfectivo(100.0);
        cc001.extraerEfectivo(1850.0);


        CuentaComitente cm001 = new CuentaComitente(1000.00, "dhgato");
        cm001.extraerEfectivo(600);
        System.out.println("Su nuevo saldo es: " + cm001.getSaldo());
    }
}
