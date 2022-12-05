package clase18s_repaso;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        // CREO LA EMPRESA
        Empresa empresa01 = new Empresa("La nueva perla");

        // CREO ESTACIONES
        Estacion est01 = new Estacion("Buenos Aires", 1);
        Estacion est02 = new Estacion("Lujan", 2);
        Estacion est03 = new Estacion("Mercedes", 3);
        Estacion est04 = new Estacion("Suipacha", 4);
        Estacion est05 = new Estacion("Chivilcoy", 5 );
        Estacion est06 = new Estacion("Alberti", 6 );
        Estacion est07 = new Estacion("Bragado", 7 );

        // ASIGNO ESTACIONES A UN MISMO RECORRIDO
        Recorrido rec01 = new Recorrido();
        rec01.setEstaciones(new ArrayList<>(Arrays.asList(est01,est02,est03,est04,est05,est06,est07)));

        // LE ASIGNO EL RECORRIDO A LA NUEVA PERLA
        empresa01.setRecorrido(rec01);

        // CREO 3 RESERVAS
        Reserva res01 = new Reserva(empresa01,"res01", est01, est07,10);
        Reserva res02 = new Reserva(empresa01,"res02", est03, est04,21);
        Reserva res03 = new Reserva(empresa01,"res03", est01, est03,32);

        // CALCULO LOS PRECIOS DE LAS RESERVAS Y LOS MUESTRO
        System.out.println("Reserva 01 - Precio: $" + res01.calcularPrecioReserva());
        System.out.println("Reserva 02 - Precio: $" + res02.calcularPrecioReserva());
        System.out.println("Reserva 03 - Precio: $" + res03.calcularPrecioReserva());

        // CALCULO RECAUDACION TOTAL
        System.out.println("\nEmpresa: " + empresa01.getNombre() + "\n" +
                "Recaudacion Total: $" + empresa01.recaudacionTotal());

    }
}
