public class Main {

    public static void main(String[] args) {

        // Creo un policia
        Policia pepe = new Policia("Pepe", "Milanesa", "AB001/2");

        // Creo otro policia
        Policia carlitos = new Policia("Carlitos", "Bala", "AB001/3");

        // Creo un arma larga, lista para enfrentamiento de nivel 10
        ArmaLarga escopeta1 = new ArmaLarga(pepe, 200, 300, "Re Fuerte", 18, "EN USO", true, true,10);

        // Creo un arma larga, NO lista para enfrentamiento de nivel 8
        ArmaLarga escopeta2 = new ArmaLarga(pepe, 200, 300, "Re Fuerte", 8, "EN USO", true, true,8);

        // Creo un arma corta de corto alcance y manual
        ArmaCorta revolver = new ArmaCorta(carlitos, 200, 150, "Re Fuerte", 22, "EN USO", false);


        // CONSULTO SI ESTAN LISTAS PARA ENFRENTAMIENTO
        System.out.println("¿Escopeta 1 está lista para enfrentamiento? \n" + escopeta1.consultarListaParaEnfrentamiento());
        System.out.println("¿Escopeta 2 está lista para enfrentamiento? \n" + escopeta2.consultarListaParaEnfrentamiento());
        System.out.println("¿Revolver está listo para enfrentamiento? \n" + revolver.consultarListaParaEnfrentamiento());

        // CONSULTO SI ES DE LARGO ALCANCE
        System.out.println("¿Revolver es de largo alcance? \n" + revolver.consultarLargoAlcance());

        // CONSULTO CUAL ES MAYOR (Escopeta 1 es mayor)
        if (escopeta1.compareTo(escopeta2)==1) {
            System.out.println("Escopeta 1 es mayor que Escopeta 2");
        } else if (escopeta1.compareTo(escopeta2) == -1) {
            System.out.println("Escopeta 1 es menor que Escopeta 2");
        } else {
            System.out.println("Las escopetas son iguales");
        }
    }
}