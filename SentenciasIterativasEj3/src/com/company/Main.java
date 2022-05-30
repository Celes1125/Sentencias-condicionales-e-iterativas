package com.company;

public class Main {

    public static void main(String[] args) {
	// el ejercicio de los triángulos

      traingles();
    }

    private static void traingles() {
        for (int i = 0; i <7 ; i++) {
            String mensaje = " ";
            for (int j = 0; j < i+1 ; j++) {
                mensaje = mensaje + "*";
            }
            System.out.println(mensaje);

        }

        for (int i = 0; i <7 ; i++) {
            String mensaje = " ";
            for (int j = 0; j < 7-i ; j++) {
                mensaje = mensaje + "*";
            }
            System.out.println(mensaje);

        }


        for (int i = 0; i < 7; i++) {
            String mensaje = "";
            for (int j = 0; j < 6 - i; j++) {
                mensaje = mensaje + " ";
            }
            for (int j = 0; j < i + 1; j++) {
                mensaje = mensaje + "*";
            }
            System.out.println(mensaje);
        }
    }
}
