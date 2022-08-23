import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numF, numH;
        float valH, salario;

        System.out.println("Digite o número de um funcionário: ");
        numF = scan.nextInt();
        System.out.println("Digite número de horas trabalhadas: ");
        numH = scan.nextInt();
        System.out.println("Digite o valor recebido por hora: ");
        valH = scan.nextFloat();

        salario = numH * valH;

        System.out.printf("NUMBER = %d\n", numF);
        System.out.printf("SALARY = %.2f\n", salario);
    }
}
