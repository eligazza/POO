package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Juan", "Perez", "12345", new Date(10, 5, 20));

        try {
            paciente.darAlta(new Date(10, 2, 20));

        } catch (NuestraException e) {
            System.out.println(e.getMessage());
        }
    }
}
