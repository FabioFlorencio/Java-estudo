package exercicios.lista.aula15;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int tamanho = 2;
		int[] numeros = new int[tamanho];

		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i+1) + "° número:");	
			numeros[i] = scan.nextInt();
		}
		
		if (numeros[0] > numeros[1]) {
			System.out.println("O número " + numeros[0] + " é o maior.");
		} else if ( numeros[1] > numeros[0] ){		
			System.out.println("O número " + numeros[1] + " é o maior.");	
		} else {
			System.out.println("Os números são iguais.");
		}
		
		scan.close();
	}
}
