package exercicios.lista.aula13;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade em metros:");		
		double metros = scan.nextDouble();
		double convertMetrosCentimetros = metros * 100;
		
		System.out.printf("%.2f metros é igual a %.1f centímetros" , metros, convertMetrosCentimetros);
		
		
		scan.close();
	}
}

