package exercicios.lista.aula15;

import java.util.Scanner;

public class Exerc04_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String vogais = "aeiou";
		String msg = "Você digitou uma ";
		
		System.out.print("Digite uma letra:");
		String letra = scan.next().toLowerCase();		
		String result = (vogais.contains(letra) ? msg + "vogal." : msg + "consoante.");
		System.out.println(result);
				
		scan.close();				
	}
}
