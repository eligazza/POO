package Picante;

public class Demo {

    public static void main(String[] args) {

    Mecanico cucu = new Mecanico("Cucu","Arce", 23000000);
        cucu.setAntiguedad(5);
        System.out.println("Seniority del empleado " + cucu.getApellido() + ": " + cucu.getSeniority());
        System.out.println("Sueldo mensual: " + cucu.getSueldoMensual());


    }
}
