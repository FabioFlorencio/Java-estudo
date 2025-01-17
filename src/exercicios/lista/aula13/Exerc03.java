package exercicios.lista.aula13;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();
		
		System.out.println("\nDigite outro número: ");		
		int num2 = scan.nextInt();
		
		System.out.println("A soma dos números é :" + (num1 + num2));
		
	}
}
