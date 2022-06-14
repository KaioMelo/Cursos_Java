import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, D;
        double dif;

        System.out.println("Digite valor de inteiro de A: ");
        A = scan.nextInt();
        System.out.println("Digite valor de inteiro de B: ");
        B = scan.nextInt();
        System.out.println("Digite valor de inteiro de C: ");
        C = scan.nextInt();
        System.out.println("Digite valor de inteiro de D: ");
        D = scan.nextInt();

        dif = A * B - C * D;

        System.out.printf("A diferenca do produto A e B pelo produto C e D: %.0f", dif);

    }
}
