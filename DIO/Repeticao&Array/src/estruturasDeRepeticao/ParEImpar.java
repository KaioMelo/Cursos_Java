package estruturasDeRepeticao;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qNumeros;
		int numero;
		int qPares = 0, qImpares = 0;
		
		System.out.println("Quantidade de número: ");
		qNumeros = scan.nextInt();
		
		int count = 0;
		do{
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0)qPares++;
			else qImpares++;
			
			count++;
		}while(count < qNumeros);
		
		System.out.println("Quantidade Par: "+ qPares);
		System.out.println("Quantidade Impares: "+ qImpares);
	}
}
