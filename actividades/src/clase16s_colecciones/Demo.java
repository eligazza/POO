package clase16s_colecciones;

public class Demo {

    public static void main(String[] args) {

        Puerto madero = new Puerto("Buenos Aires");
        Puerto janeiro = new Puerto("Rio de Janeiro");

        Contenedor cont1 = new Contenedor(1, "Brasil", false);
        Contenedor cont2 = new Contenedor(2, "Argentina", true);
        Contenedor cont3 = new Contenedor(4, "Paraguay", true);
        Contenedor cont4 = new Contenedor(5, "Ecuador", false);
        Contenedor cont5 = new Contenedor(3, "Desconocido", true);

        madero.ingresarContenedor(cont1);
        madero.ingresarContenedor(cont2);
        madero.ingresarContenedor(cont5);
        madero.ingresarContenedor(cont4);
        madero.ingresarContenedor(cont3);

        System.out.println("GET CONENEDORES");
        System.out.println(madero.getContenedores());

        System.out.println("MOSTRARLOS ORDENADOS");
        System.out.println(madero.mostrarContenedoresOrdenados());

        System.out.println("PELIGROSOS DE ORIGEN DESCONOCIDO");
        System.out.println(madero.calcularContenedoresPeligrosos());

    }


}
