package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Consigna: crear un programa que pida dos números por consola y que diga cuál es el mayor
        guessLargerThan();

    }

    private static void guessLargerThan() {
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
            return;
        }
    }

}