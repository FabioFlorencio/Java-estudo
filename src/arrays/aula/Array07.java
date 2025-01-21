package arrays.aula;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {

		int[] numeros = {1,2,3,4,5};
		int[] subArrays = Arrays.copyOfRange(numeros, 1, 4); // indices: 1 (inclusivo) a 4
		
		System.out.println(Arrays.toString(subArrays));
		
	}
}
