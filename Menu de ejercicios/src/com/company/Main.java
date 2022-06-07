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
            System.out.println("7. Extra 1");
            System.out.println("8. Extra 2");
            System.out.println("9. Extra 3");
            System.out.println("10. Salir");
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
                    case 7:
                        esPrimo();
                        break;
                    case 8:
                        mostarPrimos();
                        break;
                    case 9:
                        matriz();
                        break;
                    default:
                        System.out.println("Por favor, seleccione una opción válida");

            }
        }while (option != 10);
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
    private static void esPrimo() {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Escribe un número entero");
        int numero = myScanner.nextInt();
        int cantidadDedivisores = 0;

        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0) {
                cantidadDedivisores++;
            }
        }

        if (cantidadDedivisores!=2){
            System.out.println("Es compuesto");
        }else{
            System.out.println("Es primo");
        }
        System.out.println("¿Quieres jugar de nuevo?");
        System.out.println("1. Seguir jugando");
        System.out.println("2. Salir");
        int answer = myScanner.nextInt();
        if (answer==1){
            esPrimo();
        }else{
            System.out.println("Gracias por Jugar!");
            System.out.println("");
            System.out.println("");
            return;

        }

    }
    private static void mostarPrimos () {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Escribe un número entero y en pantalla se mostrarán todos los números primos que le preceden");
        int numberIn = myScanner.nextInt(); //10

        for (int number = 1; number <= numberIn; number++) {//va probando desde el uno al número dado 1
            int cantidadDedivisores = 0;
            for (int divisor = 1; divisor <= number; divisor++) {//probando si cada uno es primo
                if (number % divisor == 0) {
                    cantidadDedivisores++;
                }
            }
            if (cantidadDedivisores == 2) {
                System.out.println(number);
            }
        }

        System.out.println("¿Quieres jugar de nuevo?");
        System.out.println("1. Seguir jugando");
        System.out.println("2. Salir");
        int answer = myScanner.nextInt();
        if (answer == 1) {
            mostarPrimos();
        } else {
            System.out.println("Gracias por Jugar!");
            System.out.println("");
            System.out.println("");
            return;

        }
    }
    private static void matriz () {
        int[] numberList1 = {1, 2, 3};
        int[] numberList2 = {4, 5, 6};
        int[] numberList3 = {7, 8, 9};
        int[][] numberList = {numberList1, numberList2, numberList3};

        for (int i = 0; i < 3; i++) {
            int suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += numberList[i][j];
            }

            System.out.println("La suma de todos los valores de los tres arrays es: ");

            System.out.println(suma);

        }
        System.out.println("¿Quieres jugar de nuevo?");
        System.out.println("1. Seguir jugando");
        System.out.println("2. Salir");
        int answer = scanner.nextInt();
        if (answer == 1) {
            matriz();
        } else {
            System.out.println("Gracias por Jugar!");
            System.out.println("");
            System.out.println("");
            return;

        }
    }

}





