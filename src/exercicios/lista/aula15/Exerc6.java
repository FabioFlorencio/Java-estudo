package exercicios.lista.aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc6 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		List<Double> numeros = new ArrayList<>(3);
		int c = 3;
				
		for (int i = 0; i < c; i++) {
			System.out.print("Digite o " + (i+1) + "° número:");
			double valor = scan.nextDouble() ;
			numeros.add(valor);
		}
				
		double numMaior = 0;
		
		
		for (int j = 0; j < c; j++) { 
			if (numeros.get(j) >= numMaior) {
				numMaior = numeros.get(j);
			}
		}	
		
		System.out.println("O maior número é:" + numMaior);
		
		scan.close();
		
	}
}
