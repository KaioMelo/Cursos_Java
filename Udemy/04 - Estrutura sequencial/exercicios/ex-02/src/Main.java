import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double r, area;
        double pi = 3.14159;

        System.out.println("Digite o valor do raio de um circulo: ");
        r = scan.nextDouble();

        area = pi * Math.pow(r,2);

        System.out.printf("A = %.4f", area);
    }
}
