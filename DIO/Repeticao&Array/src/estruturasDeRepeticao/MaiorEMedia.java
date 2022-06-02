package estruturasDeRepeticao;

import java.util.Scanner;

public class MaiorEMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int count = 0;
		do {
			System.out.println("Numero: ");
			numero = scan.nextInt();
			
			soma = soma + numero;
			
			if(numero > maior)maior = numero;
			
			count += 1;
		}while(count < 5);	
		
		System.out.println("Maior: "+ maior);
	}
}
