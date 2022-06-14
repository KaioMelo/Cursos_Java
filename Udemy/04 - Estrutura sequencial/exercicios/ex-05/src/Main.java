import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        float uni1, uni2, total;

        System.out.println("Código peça 1: ");
        cod1 = scan.nextInt();
        System.out.println("Número de peça 1: ");
        num1 = scan.nextInt();
        System.out.println("Valor unitário peça 1: ");
        uni1 = scan.nextFloat();

        System.out.println("Código peça 2: ");
        cod2 = scan.nextInt();
        System.out.println("Número de peça 2: ");
        num2 = scan.nextInt();
        System.out.println("Valor unitário peça 2: ");
        uni2 = scan.nextFloat();

        total = (num1 * uni1) + (num2 * uni2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        scan.close();
    }
}
