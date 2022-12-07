public class CargaFactoryMethodSingleton {

    // ATRIBIUTOS
    private static CargaFactoryMethodSingleton instancia;

    // CONSTRUCTOR
    private CargaFactoryMethodSingleton(){}

    // METODOS
    public static CargaFactoryMethodSingleton obtenerInstancia() {
        if (CargaFactoryMethodSingleton.instancia == null) {
            CargaFactoryMethodSingleton.instancia = new CargaFactoryMethodSingleton();
        }
        return CargaFactoryMethodSingleton.instancia;
    }
    public Carga crearCarga(String tipo){
        switch (tipo.toUpperCase()) {
            case "SIMPLE":
                return new CargaSimple();
            case "CONTENEDOR":
                return new ContenedorComposite();
        }
        return null;
    }

}
