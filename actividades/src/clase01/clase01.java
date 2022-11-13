package clase01;

import java.util.Scanner;

public class clase01 {
    public static void main(String[] args) {
        String especie;
        String nombre;
        int edad;
        double ingestaEnKilos;
        String respondemos;

        especie = "perro";
        nombre = "manchita";
        edad = 2;
        ingestaEnKilos = 1.5;

        Scanner ingresoConsola = new Scanner(System.in);

        System.out.println("ingrese que sonido hace el perro ");

        respondemos = ingresoConsola.nextLine();

        System.out.println("el " + especie + " se llama " + nombre + " y tiene " + edad + " años. Come " + ingestaEnKilos + " kilos de comida por dia y hace " + respondemos + ".");

    }
}
