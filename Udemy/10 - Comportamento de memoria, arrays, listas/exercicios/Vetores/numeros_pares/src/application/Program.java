package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        int cont, num;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        cont = 0;
        System.out.println();
        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                num = vect[i];
                System.out.printf(num + " ");
                cont ++;
            }
        }

        System.out.println();
        System.out.print("QUANTIDADE DE PARES = "+ cont);

        sc.close();
    }
}
