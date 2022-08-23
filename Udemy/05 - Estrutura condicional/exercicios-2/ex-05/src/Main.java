import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod, quant;

        System.out.println("Digite o código do produto: ");
        cod = sc.nextInt();
        System.out.println("Digite a quantidade: ");
        quant = sc.nextInt();

        switch (cod){
            case 1:
                System.out.println("Total: R$ "+ quant * 4.00);
                break;
            case 2:
                System.out.println("Total: R$ "+ quant * 4.50);
                break;
            case 3:
                System.out.println("Total: R$ "+ quant * 5.00);
                break;
            case 4:
                System.out.println("Total: R$ "+ quant * 2.00);
                break;
            case 5:
                System.out.println("Total: R$ "+ quant * 1.50);
                break;
        }
    }
}
