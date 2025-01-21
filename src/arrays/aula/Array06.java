package arrays.aula;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		
		
		int[] numeros = {1,2,3};
		// Copia os elementos de um array para um novo array
		int[] copia = Arrays.copyOf(numeros, 5);
		
		System.out.println(Arrays.toString(copia));
		
		for (int c: copia) {
			System.out.println(c);
		}
	}
}
