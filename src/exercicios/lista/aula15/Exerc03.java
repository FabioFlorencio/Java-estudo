package exercicios.lista.aula15;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite F-Feminino ou M-Masculino:");
		String genero = scan.next();
		
		
		// Para comparação de String, não se usa o comparador de igualdade ==
		// A classe String tem o seu prório método para fazer a comparação
		
		if (genero.equalsIgnoreCase("f")) {
			System.out.println(genero + "-feminino");
		} else if (genero.equalsIgnoreCase("m")) {
			System.out.println(genero + "-masculino");	
		} else {
			System.out.println("Você digitou algo diferente do solicitado.");
		}
					
		scan.close();
		
	}
}
