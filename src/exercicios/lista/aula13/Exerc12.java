package exercicios.lista.aula13;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite sua altura:");
		double altura = scan.nextDouble();		
		double calcPesoIdeal = (72.7 * altura) - 58;
		
		System.out.printf("O seu peso ideal é: %.2f kg", calcPesoIdeal);
		
	}
}
