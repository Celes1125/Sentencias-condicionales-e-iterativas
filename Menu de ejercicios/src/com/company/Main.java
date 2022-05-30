package com.company;

import java.util.Scanner;

public class Main {
    //Ejercitación 04: juntar todos los métodos en un menú, poder navegar en ellos
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("1. Condicionales: ¿cuál es el número mayor?");
            System.out.println("2. Condicionales: precio del producto");
            System.out.println("3. Condicionales: situación académica");
            System.out.println("4. Iterativas: foo");
            System.out.println("5. Iterativas: 1 al 10");
            System.out.println("6. Iterativas: triángulos y asteriscos");
            System.out.println("7. Salir");
            System.out.println(" ");
            System.out.println("Ingrese el número de la opción deseada:");

            int option = 0;

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    guessLargerThan();
                    break;
                case 2:
                    precioProducto();
                    break;
                case 3:
                    academicSituation();
                    break;
                case 4:
                    foox10();
                    break;
                case 5:
                    oneTo10();
                    break;
                case 6:
                    triangles();
                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestros servicios jajaaj");
                default:
                    System.out.println("Por favor, seleccione una opción válida");

            }
        }while(option!= 7);

    }

    static void guessLargerThan() {

        System.out.println("hola");
    }
    static void precioProducto() {

        System.out.println("hola");
    }
    static void academicSituation() {

        System.out.println("hola");
    }
    static void foox10() {

        System.out.println("hola");
    }
    static void oneTo10() {

        System.out.println("hola");
    }
    static void triangles() {

        System.out.println("hola");
    }

}

