package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Escriba un número del 2 al 9");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();

        if (isNumberOK(number)) {
            showMultiplication(number);
        }

    }

        private static boolean isNumberOK (int number){
            boolean numberOK = true;
            if (number < 2 || number > 9) {
                numberOK = false;
                System.out.println("El número está fuera de rango");
            }
            return numberOK;
        }

        private static void showMultiplication (int number) {
            System.out.println("La tabla del " + number);
            int resultado;
            for (int i = 1; i <= 10; i++) {
                resultado = number * i;
                System.out.println(number + " x " + i + " = " + resultado);
            }
        }

}