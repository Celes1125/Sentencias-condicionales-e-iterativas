package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Consigna: crear un programa que sirva para calcular el importe de una compra. Se debe solicitar al usuario que
     ingrese por consola: a) el nombre dle producto b) el precio del producto c) el método de pago, las opciones son:
      1. contado, tiene 15% de dto 2. débito, mismo precio al ingresado 3. tarjeta, 10% de recargo.
      Por último, imprimir en consola el nombre del producto y el importe total*/

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Por favor, ingrese el nombre de su producto");
        String producto = myScanner.nextLine();
        System.out.println("Por favor, ingrese el precio de su producto");
        int precio = myScanner.nextInt();
        System.out.println("Por favor, ingrese 1 para pago de CONTADO, 2 si abona con TARJETA y 3 para pagar con DEBITO");
        int metodo = myScanner.nextInt();

        switch (metodo) {
            case 1:
                System.out.println (producto + " $" + (precio-precio*0.15));
                break;
            case 2:
                System.out.println(producto + " $" + (precio+precio*0.1));
                break;
            default:
                System.out.println(producto +" $" + precio);
        }
    }
}
