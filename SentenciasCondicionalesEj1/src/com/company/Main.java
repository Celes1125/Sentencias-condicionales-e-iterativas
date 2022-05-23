package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Consigna: crear un programa que pida dos números por consola y que diga cuál es el mayor
        Scanner myScanner = new Scanner(System.in);
        System.out.println("¡Hola! dime dos números y te diré cuál es el más grande, quieres jugar? Escribe tu primer número");
        int number1 = myScanner.nextInt();
        System.out.println("Genial! ahora escribe tu segundo número");
        int number2 = myScanner.nextInt();
        if (number1 > number2) {
            System.out.println("Tu primer número ("+ number1+") es el más grande");
        } else if (number2 > number1) {
            System.out.println("Tu segundo número ("+number2+") es el más grande");

        }else{
            System.out.println("Por favor, escribe dos números que sean distintos");
    }
}
}