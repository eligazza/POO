package clase22;

import org.w3c.dom.css.Rect;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {


        // METODO NUMERO 1
        /* Voy a crear el composite vacío, después voy a crear una a una las figuras, después añadir las figuras al composite creado -una a una- y, finalmente, voy a calcular el area */

        // Creo el vagon
        FiguraComposite vagon = new FiguraComposite();
        System.out.println("Vagon creado...");

        // Creo las figuras que van a ir adentro
        Rectangulo rectangulo01 = new Rectangulo(5,4);
        Circulo circulo01 = new Circulo(1);
        Circulo circulo02 = new Circulo(1);
        Circulo circulo03 = new Circulo(1);
        System.out.println("Figuras creadas...");

        // Añado las figuras de a una al composite
        vagon.agregarFigura(rectangulo01);
        vagon.agregarFigura(circulo01);
        vagon.agregarFigura(circulo02);
        vagon.agregarFigura(circulo03);
        System.out.println("Figuras añadidas...");

        System.out.println("La superficie total del vagon es de: " + vagon.calcularArea() + "\n");


        // METODO 2
        /* Voy a crear las figuras dentro de un ArrayList y se lo voy a pasar como parámetro para el constructor de una locomotora (composite)*/

        // Creo las figuras en un ArrayList
        ArrayList<Figura> arrayLocomotora;
        arrayLocomotora = new ArrayList<>(Arrays.asList(
                new Rectangulo(6, 4),
                new Circulo(1),
                new Circulo(1),
                new Triangulo(2, 2))
        );
        System.out.println("Array de formas creado...");

        // Creo el composite usando como parámetro el array de recién
        FiguraComposite locomotora = new FiguraComposite(arrayLocomotora);
        System.out.println("Locomotora creada...");

        // Calculo el área de la locomotora
        System.out.println("El area de la locomotora es de: " + locomotora.calcularArea() + "\n");
    };
}
