import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double r, area;
		double pi = 3.12159;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio da circuferencia:");
		r = sc.nextDouble();
		
		area = (double) (pi * (r * r));
		
		System.out.printf("O resultado da Area e igual a %.f4%n", area);
	}

}

