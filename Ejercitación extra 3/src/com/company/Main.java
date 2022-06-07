package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numberList1 = {1, 2, 3};//02
        int[] numberList2 = {4, 5, 6};//11
        int[] numberList3 = {7, 8, 9};//20
        int[][] numberList = {numberList1, numberList2, numberList3};
        int suma = 0;
        int multiplicación = 1;
        int sumaDP = 0;
        int multiplicaciónDP = 1;
        int sumaDS = 0;
        int multiplicaciónDS = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma += numberList[i][j];
                multiplicación = multiplicación * numberList[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
                sumaDP += numberList[i][i];
                multiplicaciónDP = multiplicaciónDP * numberList[i][i];
        }

        for (int i = 0; i < 3; i++) {
                sumaDS += numberList[i][2-i];
                multiplicaciónDS = multiplicaciónDS * numberList[i][2-i];
        }


        System.out.println("La suma de todos los elementos es: ");
        System.out.println(suma);
        System.out.println("La multiplicación de todos los elementos es: ");
        System.out.println(multiplicación);
        System.out.println("La suma de la diagonal principal es: ");
        System.out.println(sumaDP);
        System.out.println("El producto de la diagonal principal es: ");
        System.out.println(multiplicaciónDP);
        System.out.println("La suma de la diagonal secundaria es: ");
        System.out.println(sumaDS);
        System.out.println("El producto de la diagonal secundaria es: ");
        System.out.println(multiplicaciónDS);
}
}
