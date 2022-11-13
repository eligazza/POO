package clase02;

/*
Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer un NumeroC)
Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
el resultado.
*/

import java.util.Scanner;

public class ejercicio02 {

    static Integer maximoEntreTresNumeros(Integer A, Integer B, Integer C) {
        if ( A>B && A>C ) { return A; }
        else if ( B>A && B>C ) { return B; }
        else { return C; }
    }

    public static void main(String[] args) {

        // Preparo el Scanner
        Scanner scanner = new Scanner(System.in);

        // Le digo al usuario que me ingrese un valor y luego lo capturo
        System.out.println("Ingrese un primer número");
        Integer numA = scanner.nextInt();

        // Le digo al usuario que ingrese un segundo valor y luego lo capturo
        System.out.println("Ingrese un segundo número");
        Integer numB = scanner.nextInt();

        // Le digo al usuario que me ingrese un tercer valor y luego lo capturo
        System.out.println("Ingrese un tercer número");
        Integer numC = scanner.nextInt();

        // Le imprimo en la consola el resultado de aplicar la funcion
        System.out.println("RESULTADO: El número más grande es: " + maximoEntreTresNumeros(numA, numB, numC));

    }
}
