package application;

import entities.Pensioner;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pensioner pensioner;

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        Pensioner[] vect = new Pensioner[10];

        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Rent #%d:%n", (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Pensioner(name, email, room);
        }

        System.out.printf("Busy rooms: %n");

        for (int i = 0; i < vect.length; i++){
            if (vect[i] != null){
                System.out.print(vect[i]);
                System.out.println();
            }
        }
    }
}
