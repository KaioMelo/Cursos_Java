// Faça um programa para ler dois valores inteiros,
// e depois mostrar na tela a soma desses números
// com uma mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2, soma;
		
		System.out.println("Informe um valor inteiro: ");
		n1 = ler.nextInt();
		
		System.out.println("Informe outro valor inteiro: ");
		n2 = ler.nextInt();
		
		soma = n1 + n2;
		
		System.out.printf("A soma de %d + %d e igual a %d", n1, n2, soma);

	}

}
