package clase11;

public class Main {

    public static void main(String[] args) {

    Cliente gusty = new Cliente(001, "Vecchi", 23234234, "20-23234234-3");
    Cliente elias = new Cliente(002, "Gazza", 23235235, "20-23235235-3");

    CajaAhorro ca001= new CajaAhorro(5.00,1000);
    CuentaCorriente cc001= new CuentaCorriente(1000.00, 1000.00);
    Cuenta[] cuentasGusty;
    //gusty.setCuentas(new Cuenta[] {ca001, cc001});

    CajaAhorro ca002= new CajaAhorro(6.00,2000000);
    CuentaCorriente cc002= new CuentaCorriente(2000.00, 20000.00);
    elias.setCuentas(ca002,cc002);

    }

}
