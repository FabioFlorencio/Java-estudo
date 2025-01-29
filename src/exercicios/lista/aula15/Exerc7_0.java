package exercicios.lista.aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc7_0 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);		
		List<Double> numeros = new ArrayList<>();
		
		int c = 3;
		
		for (int i = 0; i < c; i++) {
			System.out.print("Digite o " + (i+1) + "° número:");
			double valor = scan.nextDouble();
			numeros.add(valor);			
		}
		
		double numMaior = numeros.get(0);
		double numMenor = numeros.get(0);
		
		for (int j = 1; j < c; j++) {
			if (numeros.get(j) <= numMenor) {
				numMenor = numeros.get(j);
			}	
		}
		
		for (int k = 1; k < c; k++) {
			if (numeros.get(k) >= numMaior) {
				numMaior = numeros.get(k);
			}
		}
		
		System.out.println("\nO número menor é:"  + numMenor);
		System.out.println("O número maior é:"  + numMaior);
		
		scan.close();
		
	}
}
