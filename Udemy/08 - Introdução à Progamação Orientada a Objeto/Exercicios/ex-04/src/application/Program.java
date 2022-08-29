package application;


import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        CurrencyConverter.dolar = scan.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.amount = scan.nextDouble();
        System.out.println();
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.DolarandReal());
    }
}
