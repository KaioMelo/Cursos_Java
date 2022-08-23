package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.print("Enter rectangle width and height: ");
        rectangle.width = scan.nextDouble();
        rectangle.height = scan.nextDouble();

        System.out.println();
        System.out.print("AREA = "+ String.format("%.2f", rectangle.Area()));

        System.out.println();
        System.out.print("PERIMETER = "+ String.format("%.2f", rectangle.Perimeter()));

        System.out.println();
        System.out.print("DIAGONAL = "+ String.format("%.2f", rectangle.Diagonal()));
    }
}
