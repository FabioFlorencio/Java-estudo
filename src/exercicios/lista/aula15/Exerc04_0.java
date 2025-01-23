package exercicios.lista.aula15;

import java.util.Scanner;
import java.util.Arrays;

public class Exerc04_0 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String[] vogais = {"a","e","i","o","u"};
		
		System.out.print("Digite uma vogal ou uma consoante:");
		String busca = scan.next().toLowerCase();
		
		// Arrays.asList -> transforma uma array em list
		// conains -> metodo contains verifica o conteudo de list
		if (Arrays.asList(vogais).contains(busca)) {
			System.out.println("Você digitou vogal!");
		} else {
			System.out.println("Você digitou consoante!");		
		}		
				

		scan.close();		
	}
}
