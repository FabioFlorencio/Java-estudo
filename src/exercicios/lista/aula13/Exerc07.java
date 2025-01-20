package exercicios.lista.aula13;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho do lado do quadrado:");
		int lado = scan.nextInt();
		
		double resultArea = Math.pow(lado, 2);
		double dobroArea = resultArea * 2;
		
		System.out.println("A área do quadrado é: " + resultArea);
		System.out.println("O dobro da área do quadrado é : " + dobroArea);
		

	}
}
