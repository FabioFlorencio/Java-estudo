package exercicios.lista.aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc7_1 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		List<Double> numeros = new ArrayList<>();
		
		int c = 3;
		
		for (int i = 0; i < c; i++) {
			System.out.print("Digite o " + (i+1) + "° número:");
			double valor = scan.nextDouble();
			numeros.add(valor);			
		}
		
		double numMenor = Math.max(numeros.get(0), Math.max(numeros.get(1), numeros.get(2)));
		double numMaior = Math.min(numeros.get(0), Math.min(numeros.get(1), numeros.get(2)));		
		
		
		System.out.println("\nO número menor é:"  + numMenor);
		System.out.println("O número maior é:"  + numMaior);
		
		scan.close();
		
	}
}
