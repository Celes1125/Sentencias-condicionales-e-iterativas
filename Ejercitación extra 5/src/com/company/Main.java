package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double pesosAmount;
        int currency;
        do {
            System.out.println("Ingrese un monto en pesos : ");
            pesosAmount = myScanner.nextDouble();
            System.out.println("Ingrese a qué moneda lo desea convertir : ");
            System.out.println("1. Dólares");
            System.out.println("2. Reales");
            System.out.println("3. Euros");
            currency = myScanner.nextInt();
        } while (convertCurrency(pesosAmount, --currency));
    }

    private static boolean convertCurrency(double pesosAmount, int currency) {
        double [] currencyValues = {206, 44.02, 223.84*1.23};
        if (currency < currencyValues.length+1 && currency > 0){
        String [] currencyNames = {"dolares", "reales", "euros"};
        double convertedAmount = pesosAmount / currencyValues[currency];
        convertedAmount = Math.round(convertedAmount * 100.0) /100.0;
        String currencyName = currencyNames [currency];
        System.out.println("El valor de "+ pesosAmount + " pesos argentinos es igual a "+ convertedAmount + " "+ currencyName);
        return true;
        }
        System.out.println("La opción no es válida");
        return false;
    }
}
