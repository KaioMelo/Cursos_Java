package application;

import entities.VectorSum;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma, media;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        VectorSum[] vect = new VectorSum[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            double numbers = sc.nextDouble();
            vect[i] = new VectorSum(numbers);
        }

        System.out.println();
        System.out.print("VALORES: ");

        for (int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ", vect[i].getNumbers());
        }

        soma = 0;

        for (int i = 0; i < vect.length; i++){
            soma +=  vect[i].getNumbers();
        }

        media = soma / vect.length;

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();
    }
}
