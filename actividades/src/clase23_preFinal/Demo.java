package clase23_preFinal;

public class Demo {

    public static void main(String[] args) {

        /*
        Reproducir la siguiente situación en una clase Demo que contenga el método main e invocar al método que genera el informe.
Curso: Front End tiene una carga horaria de 16 horas mensuales y una duración de 2 meses con un precio de $900 pesos la hora, es decir que tiene un precio de $36.000.
Curso: Back End tiene una carga horaria de 20 horas mensuales y una duración de 2 meses con un precio de $1000 pesos la hora, es decir que tiene un precio de $32.000.
Carrera: FullStack se compone de dos cursos (Front End y Back End) y tiene una bonificación del 20% sobre el total, resultando como precio final $54.400.
         */

        // CREO EL CREADOR
        OfertaFactoryMethodSingleton creador = OfertaFactoryMethodSingleton.obtenerInstancia();

        // CURSO DE FRONT END
        System.out.println("Creando el curso de Front End...");
        Curso front = (Curso)creador.crearOferta("Curso");
        front.setNombre("Front End");
        front.setCargaHorariaMensual(16);
        front.setDuracionEnMeses(2);
        front.setValorPorHora(900);
        front.calcularPrecio();
        System.out.println("Precio: $" + front.calcularPrecio());

        // CURSO DE BACK END
        System.out.println("Creando el curso de Back End...");
        Curso back = (Curso)creador.crearOferta("Curso");
        back.setNombre("Back End");
        back.setCargaHorariaMensual(20);
        back.setDuracionEnMeses(2);
        back.setValorPorHora(1000);
        back.calcularPrecio();
        System.out.println("Precio: $" + back.calcularPrecio());

        // CARRERA FULL STACK
        System.out.println("Creando la carrera Full Stack...");
        CarreraComposite full = (CarreraComposite) creador.crearOferta("Carrera");
        full.setNombre("FullStack");
        full.sumarMateria(front);
        full.sumarMateria(back);
        full.setPorcentajeDeBonificacion(20);
        full.calcularPrecio();
        System.out.println("Precio: $" + full.calcularPrecio());

        // INSTITUTO DH
        Instituto dh = new Instituto("Digital House");
        dh.sumarOferta(front);
        dh.sumarOferta(back);
        dh.sumarOferta(full);
        dh.generarInforme();

    }
}
