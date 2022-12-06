package clase24_preFinal;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {

        // Crear el creador
        UnidadFactoryMethodSingleton creador = UnidadFactoryMethodSingleton.obtenerInstancia();

        // Creo unidad simple
        UnidadSimple simple01 = (UnidadSimple) creador.crearUnidad("simple");
        simple01.setNombre("Mantenimiento");
        simple01.setCantidadDePersonas(4);
        simple01.setMontoPorPersona(120000);
        System.out.println("Creamos Mantenimiento...");

        // Creo unidad simple
        UnidadSimple simple02 = (UnidadSimple) creador.crearUnidad("simple");
        simple02.setNombre("Limpieza");
        simple02.setCantidadDePersonas(24);
        simple02.setMontoPorPersona(100000);
        System.out.println("Creamos Limpieza...");

        // Creo unidad compuesta
        UnidadCombinadaComposite comp01 = (UnidadCombinadaComposite) creador.crearUnidad("compuesta");
        comp01.setNombre("Servicios generales");
        comp01.agregarUnidad(simple01);
        comp01.agregarUnidad(simple02);
        comp01.setCoeficienteGlobal(3);
        System.out.println("Creamos Servicios generales...");

        // Crear la empresa y meterle las unidades
        Empresa empresa = new Empresa();
        empresa.agregarUnidad(comp01);
        empresa.mostrarUnidades();

    }
}
