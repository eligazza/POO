package clase19y20s_patrones;

import org.jetbrains.annotations.NotNull;

public class ProductoFactoryMethodSingleton {

    // ATRIBUTOS

    private static ProductoFactoryMethodSingleton instancia;

    // CONSTRUCTOR

    private ProductoFactoryMethodSingleton(){}

    // METODOS

    public static ProductoFactoryMethodSingleton obtenerInstancia() {
        if (ProductoFactoryMethodSingleton.instancia == null) {
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }
        return ProductoFactoryMethodSingleton.instancia;
    }

    public Producto crearProducto(@NotNull String tipo) {
        switch (tipo.toUpperCase()) {
            case "CAJA10X10X10": return new Caja(10,10,10);
            case "PELOTAFUTBOL": return new Pelota(11);
            case "PELOTATENIS": return new Pelota(0.32);
        }
        return null;
    }

}
