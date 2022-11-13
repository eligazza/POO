package clase02;

import java.util.Scanner;

/*
Escribir una función:
boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o
false, en caso de que coincidan.
*/
public class ejercicio03 {

    static boolean sonDistintas(String A, String B) {
        return !A.equals(B);
    }

    public static void main(String[] args) {

        // Preparo el scanner
        Scanner scanner = new Scanner(System.in);

        // Pido que me introduzca un primer string y lo capturo
        System.out.println("Escriba un primer texto:");
        String textoA = scanner.nextLine();

        // Pido que me introduzca un segundo string y lo capturo
        System.out.println("Escriba un segundo texto:");
        String textoB = scanner.nextLine();

        // Devuelvo entonces el resultado de la funcion que cree al principio
        System.out.println("¿Son distintos los textos? " + sonDistintas(textoA, textoB));

    }

}