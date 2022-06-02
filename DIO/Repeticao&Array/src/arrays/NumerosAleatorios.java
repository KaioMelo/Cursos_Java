package arrays;

import java.util.Random;

public class NumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] numAleatorios = new int[20];
		
		for(int i = 0; i < numAleatorios.length; i++) {
			int num = random.nextInt(100);
			numAleatorios[i] = num;
		}
		
		System.out.print("Numeros Aleatorios: ");
		for(int num : numAleatorios) {
			System.out.println(num+" ");
		}
		
		System.out.print("\nSucessores dos numeros aleatorios: ");
		for(int num : numAleatorios) {
			System.out.print((num+1)+" ");
		}
		
		System.out.print("\nAntecessor dos numeros aleatorios: ");
		for(int num : numAleatorios) {
			System.out.print((num-1)+" ");
		}
		
	}

}
