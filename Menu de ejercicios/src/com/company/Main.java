package com.company;

import java.util.Scanner;

public class Main {
    //Ejercitación 04: juntar todos los métodos en un menú, poder navegar en ellos
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option = 0;
        do {
            System.out.println("1. Condicionales: ¿cuál es el número mayor?");
            System.out.println("2. Condicionales: precio del producto");
            System.out.println("3. Condicionales: situación académica");
            System.out.println("4. Iterativas: foo");
            System.out.println("5. Iterativas: 1 al 10");
            System.out.println("6. Iterativas: triángulos y asteriscos");
            System.out.println("7. Salir");
            System.out.println("Ingrese el número de la opción deseada:");

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
                    default:
                        System.out.println("Por favor, seleccione una opción válida");

            }
        }while (option != 7);
        System.out.println("Gracias por utilizar nuestros servicios jajaaj");
    }
    private static void guessLargerThan () {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("¡Hola! dime dos números y te diré cuál es el más grande");
            System.out.println("Escribe tu primer número");
            double number1 = myScanner.nextDouble();
            System.out.println("Genial! ahora escribe tu segundo número");
            double number2 = myScanner.nextDouble();
            if (number1 > number2) {
                System.out.println("Tu primer número ("+ number1+") es el más grande");
            } else if (number2 > number1) {
                System.out.println("Tu segundo número ("+number2+") es el más grande");
            }else System.out.println("Tus números son iguales! Por favor, escribe dos números distintos entre sí");
            System.out.println("¿Quieres jugar de nuevo?");
            System.out.println("1. Seguir jugando");
            System.out.println("2. Salir");
            int answer = myScanner.nextInt();
            if (answer==1){
                guessLargerThan();
            }else{
                System.out.println("Gracias por Jugar!");
                System.out.println("");
                System.out.println("");
                return;
            }
        }
    private static void precioProducto () {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese el nombre de su producto");
        String producto = myScanner.nextLine();
        System.out.println("Por favor, ingrese el precio de su producto");
        int precio = myScanner.nextInt();
        System.out.println("Por favor, seleccione la forma de pago");
        System.out.println("1. CONTADO");
        System.out.println("2. TARJETA");
        System.out.println("3. DEBITO");
        int metodo = myScanner.nextInt();

        switch (metodo) {
            case 1:
                System.out.println(producto + " $" + (precio * 0.85));
                break;
            case 2:
                System.out.println(producto + " $" + (precio * 1.1));
                break;
            default:
                System.out.println(producto + " $" + precio);
        }
        System.out.println("¿Desea saber el precio de otro producto?");
        System.out.println("1. SI");
        System.out.println("2. Salir");
        int answer = myScanner.nextInt();
        if (answer == 1) {
            precioProducto();
        } else {
            System.out.println("Gracias por utilizar nuestros servicios ajjaj!");
            System.out.println("");
            System.out.println("");
            return;
        }
    }
    public static void academicSituation() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cursante");
        String nombre = myScanner.nextLine();
        System.out.println("Ingrese la primer nota");
        int nota1 = myScanner.nextByte();
        System.out.println("Ingrese la segunda nota");
        int nota2 = myScanner.nextByte();
        System.out.println("Ingrese la tercer nota");
        int nota3 = myScanner.nextByte();
        int promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 1 && promedio <= 5) {
            System.out.println("Nombre: " + nombre + " Promedio: " + promedio + " Estado: desaprobado");
        } else if (promedio >= 6 && promedio <= 8) {
            System.out.println("Nombre: " + nombre + " Promedio: " + promedio + " Estado: Aprobado");
        } else if (promedio >= 9 && promedio <= 10) {
            System.out.println("Nombre: " + nombre + " Promedio: " + promedio + " Estado: Promocionado");
        } else {
            System.out.println("Por favor, verifique que las notas ingresadas se encuentren en el rango del 1 al 10");
        }
        System.out.println("¿Desea consultar el estado académico de otro alumno?");
        System.out.println("1. SI");
        System.out.println("2. Salir");
        int answer = myScanner.nextInt();
        if (answer == 1) {
            academicSituation();
        } else {
            System.out.println("Gracias por utilizar nuestros servicios ajjaj!");
            System.out.println("");
            System.out.println("");
            return;
        }
    }
    private static void foox10 () {
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i <10; i++) {
            String texto= "foo";
            System.out.println(texto);
        }
        System.out.println("¿Desea volver a ejecutar este programa?");
        System.out.println("1. SI");
        System.out.println("2. Salir");
        int answer = myScanner.nextInt();
        if (answer == 1) {
            foox10();
            } else {
                System.out.println("Gracias por utilizar nuestros servicios ajjaj!");
                System.out.println("");
                System.out.println("");
                return;
            }
    }
    private static void oneTo10 () {
        Scanner myScanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("¿Desea volver a ejecutar este programa?");
        System.out.println("1. SI");
        System.out.println("2. Salir");
        int answer = myScanner.nextInt();
        if (answer == 1) {
            oneTo10();
        } else {
            System.out.println("Gracias por utilizar nuestros servicios ajjaj!");
            System.out.println("");
            System.out.println("");
            return;
        }
    }
    private static void triangles () {
        Scanner myScanner = new Scanner(System.in);
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

        System.out.println("¿Desea volver a ejecutar este programa?");
        System.out.println("1. SI");
        System.out.println("2. Salir");
        int answer = myScanner.nextInt();
        if (answer == 1) {
            foox10();
        } else {
            System.out.println("Gracias por utilizar nuestros servicios ajjaj!");
            System.out.println("");
            System.out.println("");
            return;
        }
    }


}





