import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite a senha: ");
        num = sc.nextInt();

        while(num != 2002){
            System.out.println("Senha Invalida");
            System.out.println("Digite a senha: ");
            num = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
