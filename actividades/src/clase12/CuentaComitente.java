package clase12;

import java.util.Scanner;

public class CuentaComitente extends Cuenta {

    // ATRIBUTOS
    private String claveCNV;
    Scanner scanner = new Scanner(System.in);

    // CONSTRUCTOR

    public CuentaComitente(double saldo, String claveCNV) {
        super(saldo);
        this.claveCNV = claveCNV;
    }

    // METODOS

    @Override
    public void depositarEfectivo(double monto) {
        double montito = (monto*0.99);
        this.saldo += montito;
    }

    @Override
    public void extraerEfectivo(double monto) {
        if (monto < (this.saldo*0.5)) {
            this.saldo -= monto;
        }
        else if (monto > (this.saldo*0.5)) {
            System.out.println("Ingrese su clave, mostri");
            String input = scanner.nextLine();
            if (input.equals(this.claveCNV)) {
                this.saldo -= monto;
            }
        }
    }


    // Getters
    public String getClaveCNV() {
        return claveCNV;
    }

    // Setters
    public void setClaveCNV(String claveCNV) {
        this.claveCNV = claveCNV;
    }
}
