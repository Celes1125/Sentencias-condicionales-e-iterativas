package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Cree un programa para un colegio, en el que se pueda ingresar por consola
	el nombre del cursante y tres notas entre el 1 a 10. Con esta info imprimir:
	a. nombre del cursante b. promedio de las notas c. indicar el estado del cursante
	promedio entre 6 y 8 aprobado, 1 y 5 desaprobado, 9 y 10 promocionado
	 */

        academicSituation();
    }

    private static void academicSituation() {
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

        if (promedio>=1 && promedio<=5){
            System.out.println("Nombre: " + nombre + " Promedio: " + promedio + " Estado: desaprobado" );
        } else if (promedio>=6 && promedio<=8) {
            System.out.println("Nombre: " + nombre + " Promedio: " + promedio + " Estado: Aprobado" );
        } else if (promedio>=9 && promedio<=10) {
            System.out.println("Nombre: " + nombre +" Promedio: " + promedio + " Estado: Promocionado");
        }else{
            System.out.println("Por favor, verifique que las notas ingresadas se encuentren en el rango del 1 al 10");
        }
    }
}
