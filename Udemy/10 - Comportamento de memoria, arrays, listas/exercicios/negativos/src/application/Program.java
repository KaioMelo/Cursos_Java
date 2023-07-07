package application;

import entities.Negatives;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        while (n > 10){
             System.out.println("Valor inválido, digite novamente: ");
             n = sc.nextInt();
        }

        Negatives[] vect = new Negatives[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            System.out.println("Digite um numero: ");
            int numbers = sc.nextInt();
            vect[i] = new Negatives(numbers);
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < vect.length; i++){
            if (vect[i].getNumbers() < 0){
                int result = vect[i].getNumbers();
                System.out.println(result);
            }
        }
    }
}
