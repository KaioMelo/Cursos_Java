import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int A, B, C, D, dif;
		
		System.out.println("Informe um valor para A: ");
		A = ler.nextInt();
		System.out.println("Informe um valor para B: ");
		B = ler.nextInt();
		System.out.println("Informe um valor para C: ");
		C = ler.nextInt();
		System.out.println("Informe um valor para D: ");
		D = ler.nextInt();
		
		dif = (A * B - C * D);
		
	}

}
