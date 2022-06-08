package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingrese un monto en pesos : ");
        double pesosAmount = myScanner.nextDouble();
        System.out.println("Ingrese a qué moneda lo desea convertir : ");
        System.out.println("0. Dólares");
        System.out.println("1. Reales");
        System.out.println("2. Euros");
        int currency = myScanner.nextInt();
        convertCurrency(pesosAmount, currency);
    }

    private static void convertCurrency(double pesosAmount, int currency) {
        double [] currencyValues = {206, 44.02, 223.84*1.23};
        String [] currencyNames = {"dolares", "reales", "euros"};
        double convertedAmount = pesosAmount / currencyValues[currency];
        convertedAmount = Math.round(convertedAmount * 100.0) /100.0;
        String currencyName = currencyNames [currency];
        System.out.println("El valor de "+ pesosAmount + " pesos argentinos es igual a "+ convertedAmount + " "+ currencyName);
    }
}
