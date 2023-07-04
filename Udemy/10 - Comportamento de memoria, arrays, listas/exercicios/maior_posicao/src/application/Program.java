package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double maior;
        int posicao;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        maior = vect[0];
        posicao = 0;
        for (int i = 0; i < vect.length; i++){
            if (vect[i] > maior){
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.2f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
    }
}
