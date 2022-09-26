package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int soma;

        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < vectB.length; i++){
            vectB[i] = sc.nextInt();
        }

        soma = 0;
        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vectA.length; i++){
                soma = vectA[i] + vectB[i];
                System.out.println(soma);
        }
    }
}
