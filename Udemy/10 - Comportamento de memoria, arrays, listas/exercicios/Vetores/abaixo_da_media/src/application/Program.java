package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        double soma, media;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        soma = 0;
        media = 0;
        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        media = soma / vect.length;

        System.out.print("MEDIA DO VETOR = "+ media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for (int i=0; i<n; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }

        sc.close();
    }
}
