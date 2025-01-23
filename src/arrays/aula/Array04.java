package arrays.aula;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {

		
		int[] num1 = {0,1,2,3,4,5,6,7,8,9};
		int[] num2 = {0,1,2,3,4,5,6,7,8,9};
		int[] num3 = {9,8,7,6,5,4,3,2,1,0};
		int[] num4 = {10,4,7,23,4,10,8,0,4,9};
		
		int valor1 = 9;
		int valor2 = 100;
		Arrays.sort(num4);
		int pos3 = Arrays.binarySearch(num4, valor1);
		int pos1 = Arrays.binarySearch(num1,valor1);
		int pos2 = Arrays.binarySearch(num1,valor2);
		
		// O array precisa está ordenado para fazer a busca
		// Verifica sem tem o valor no array, e retorna a posição, caso não tenha retorna um valor negativo
		
		System.out.printf("%d está no array? %s - posição:%d%n", valor1, pos1 >-1 ?"Sim" :"Não", pos1);
		System.out.printf("%d está no array? - posição: %s", valor2, pos2);
		System.out.printf("%n%d está no array? - posição: %s valor:%d", valor1, pos3, num4[pos3]);
		
	}
}
