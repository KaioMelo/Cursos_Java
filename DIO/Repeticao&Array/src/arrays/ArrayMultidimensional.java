package arrays;

import java.util.Random;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[][] M =  new int[4][4];
		
		for(int i = 0; i < M.length; i++) {		
			for(int j = 0; j < M.length; j++) {
				M[i][j] = random.nextInt(9);
			}
		}	
		
		for(int[] linha : M) {
			for(int coluna : linha) {
				System.out.println(coluna +"");
			}
		}
		System.out.println();
	}
}
