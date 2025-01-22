package exercicios.lista.aula15;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.print("Digite um número:");
		int numero = scan.nextInt();
		
		if (numero < 0) {
			System.out.println("O valor digitado é negativo");			
		} else {
			System.out.println("O valor digitado é positivo");
		}		
		
		scan.close();
	}
}
