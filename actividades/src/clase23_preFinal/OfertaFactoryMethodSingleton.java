package clase23_preFinal;

import org.jetbrains.annotations.NotNull;

public class OfertaFactoryMethodSingleton {

    // ATRIBUTOS
    private static OfertaFactoryMethodSingleton instancia;

    // CONSTRUCTOR
    private OfertaFactoryMethodSingleton(){}

    // METODOS
    public static OfertaFactoryMethodSingleton obtenerInstancia(){
        if (instancia == null) {
            instancia = new OfertaFactoryMethodSingleton();
        }
        return instancia;
    }
    public Oferta crearOferta(@NotNull String tipo){
        switch (tipo.toUpperCase()) {
            case "CURSO": return new Curso();
            case "CARRERA": return new CarreraComposite();
        }
        return null;
    }

    // GETTERS & SETTERS


}
