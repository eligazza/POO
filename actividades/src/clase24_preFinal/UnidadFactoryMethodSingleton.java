package clase24_preFinal;

public class UnidadFactoryMethodSingleton {

    // ATRIBUTOS
    private static UnidadFactoryMethodSingleton instancia;

    // CONSTRUCTOR
    private UnidadFactoryMethodSingleton(){}

    // METODOS
    public Unidad crearUnidad(String tipo) {
        switch (tipo.toUpperCase()){
            case "SIMPLE":
                return new UnidadSimple();
            case "COMPUESTA":
                return new UnidadCombinadaComposite();
        }
        return null;
    }
    public static UnidadFactoryMethodSingleton obtenerInstancia(){
        if (UnidadFactoryMethodSingleton.instancia == null) {
            UnidadFactoryMethodSingleton.instancia = new UnidadFactoryMethodSingleton();
        }
        return UnidadFactoryMethodSingleton.instancia;
    }

}
