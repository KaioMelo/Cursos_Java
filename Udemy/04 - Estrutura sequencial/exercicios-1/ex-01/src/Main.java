import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2, soma;

        System.out.println("Digite o primeiro valor: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = scan.nextInt();

        soma = n1 + n2;

        System.out.printf("SOMA = %d", soma);
    }
}
