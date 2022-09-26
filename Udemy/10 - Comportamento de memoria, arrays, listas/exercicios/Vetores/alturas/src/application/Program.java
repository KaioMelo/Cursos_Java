package application;

import entities.Height;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minor;
        double totalHeight, percentage, averageHeight;

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Height[] vect = new Height[n];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            String name = sc.next();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Height(name, age, height);
        }

        minor = 0;
        totalHeight = 0;

        for (int i = 0; i < n; i++){
            if (vect[i].getAge() < 16){
                minor++;
            }
            totalHeight = totalHeight + vect[i].getAge();
        }

        averageHeight = totalHeight / n;
        percentage = ((double)minor / n) * 100.0;

        System.out.printf("Altura média: %.2f\n", averageHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentage);

        for(int i=0; i<n; i++) {
            if (vect[i].getAge() < 16) {
                System.out.printf("%s\n", vect[i].getName());
            }
        }

        sc.close();;
    }
}
