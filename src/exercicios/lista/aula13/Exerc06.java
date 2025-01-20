package exercicios.lista.aula13;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o raio do círculo:");
		double raio = scan.nextDouble();
		double calcArea = Math.PI * (Math.pow(raio, 2));
		
		System.out.printf("A área do círculo é: %.3f", calcArea);
		
		scan.close();
	}
}
