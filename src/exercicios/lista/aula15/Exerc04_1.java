package exercicios.lista.aula15;

import java.util.Scanner;

public class Exerc04_1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] vogais = {"a","e","i","o","u"};
		
		System.out.print("Digite uma letra:");
		String letra = scan.next().toLowerCase();
		boolean valida = true;
		
		for (String v: vogais) {
			if (v.equals(letra)) {
				System.out.println("Você digitou uma vogal!");
				valida = false;
				break;
			}			
		}
		
		if (valida) {
			System.out.println("Você digitou uma consoante!");
		}
				
		scan.close();				
	}

}
