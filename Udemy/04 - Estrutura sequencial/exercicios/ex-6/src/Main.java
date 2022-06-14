import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b, c;
        double pi = 3.14159;

        System.out.println("Digite valores para A, B e C: ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();

        System.out.printf("A área do triangulo retângulo: %.3f\n", (a * c)/2);
        System.out.printf("A área do circulo: %.3f\n", pi * Math.pow(c,2));
        System.out.printf("A área do trapézio: %.3f\n", (a + b)*c/2);
        System.out.printf("A área do quadrado: %.3f\n", Math.pow(b,2));
        System.out.printf("A área do retângulo: %.3f\n", a * b);
    }
}
