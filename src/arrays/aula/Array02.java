package arrays.aula;

import java.util.Arrays;

public class Array02 {

public static void main(String[] args) {
		
		int[] num = {9,5,0,7,4,2,6,3,1,8};
		int[] num2 = new int[10];
		
		//                |------------------------> array de origem
		//                |   |--------------------> posição inicial do array de origem
		//                |   |   |----------------> array de destino (que vai receber os dados) 
		//                |   |   |    |-----------> posição inicial do array de destino      
		//                |   |   |    |  |--------> a quantidade de elementos que serão copiados       
		//                |   |   |    |  |	
		//System.arraycopy(num, 0, num2, 1, 8);
		System.arraycopy(num, 0, num2, 0, num.length);
				
		for (int n: num2) {
			System.out.printf("%d - ", n);
		}				
	}
}
