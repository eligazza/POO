package clase04;

public class Main {
    public static void main(String[] args) {

        // Creo una nueva caja de ahorro
        CajaAhorro caja1 = new CajaAhorro("00-9876-9", 987654321, "cacho.rita.mimosa");

        // Le asigno la caja a Diego
        caja1.asignarCajaAhorro("Diego Sanchez", 1000000.00);

        // Diego paga la cuota de DH
        caja1.enviarTransferencia(600000.00);

        // Diego retira plata para comprar una pizza y festejar
        caja1.retirarDinero(10000);

        // Imprimimos toda la info de la caja de ahorro de Diego
        caja1.imprimirInfo();
    }
}
