package clase02;

import java.util.Scanner;

/*
Hacer una función que dado un número indica si es un número primo o no. Un número
primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya
que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por 17.
Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
divisor)
 */
public class ejercicio01 {

    static boolean esPrimo (int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

    public static void main(String[] args) {

        // Seteo el scanner para que me lea desde la consola
        Scanner scanner = new Scanner(System.in);

        // Imprimo el mensaje para que el usuario use la consola
        System.out.println("Esvriba un número que desee saber si es primo o no");

        // Capturo con el scanner el número ingresado (que sería un int)
        int numero = scanner.nextInt();

        System.out.println("El número " + numero + ", ¿es primo? " + esPrimo(numero));

    }
}

