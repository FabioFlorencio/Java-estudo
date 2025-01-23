package exercicios.lista.aula15;

import java.util.Scanner;

public class Exerc04_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String vogais = "aeiou";
		
		System.out.print("Digite uma letra:");
		String letra = scan.next().toLowerCase();
		
		if (vogais.contains(letra)) {
			System.out.println("Você digitou uma vogal.");
		} else {
			System.out.println("Você digitou uma consoante.");		
		}
				
		scan.close();				
	}
}
