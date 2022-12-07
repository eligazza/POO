public class Demo {

    public static void main(String[] args) {

        // Creo al creador
        CargaFactoryMethodSingleton creador = CargaFactoryMethodSingleton.obtenerInstancia();

        // Creo la carga simple del TV
        CargaSimple simple01 = (CargaSimple)creador.crearCarga("simple");
        simple01.setNombre("TV");
        simple01.setDescripcion("TV 32” LED");
        simple01.setPesoDeCarga(3.00);
        simple01.setRefrigerada(false);

        // Creo la carga simple de medicamentos
        CargaSimple simple02 = (CargaSimple)creador.crearCarga("simple");
        simple02.setNombre("Medicamentos");
        simple02.setDescripcion("Caja de medicamentos");
        simple02.setPesoDeCarga(2);
        simple02.setRefrigerada(true);

        // Creo el contenedor y le agrego las cargas
        ContenedorComposite contenedor01 = (ContenedorComposite)creador.crearCarga("contenedor");
        contenedor01.setNombre("Contenedor N°1");
        contenedor01.setPesoDelContenedor(100.00);
        contenedor01.agregarCarga(simple01);
        contenedor01.agregarCarga(simple02);

        // Muestro las cargas individuales junto a sus pesos
        System.out.println("\nCARGAS INDIVIDUALES");
        System.out.println(simple01.toString());
        System.out.println(simple02.toString());

        // Muestro el container, su peso y lo que contiene
        System.out.println("\nCARGAS CONTENEDOR");
        System.out.println(contenedor01.toString());

        // Creo al barco y le agrego las cargas
        System.out.println("\nMUESTRO LAS CARGAS DEL BARCO\n");
        Barco titanic = new Barco("001-PKG");
        titanic.agregarCarga(contenedor01);
        titanic.mostrarCargas();


    }

}