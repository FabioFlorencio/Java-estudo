package exercicios.lista.aula13;


import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a 1° nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.print("Digite a 2° nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.print("Digite a 3° nota: ");
		double nota3 = scan.nextDouble();
				
		System.out.print("Digite a 4° nota: ");
		double nota4 = scan.nextDouble();
		
		double totNotasBimestrais = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média das notas: " + totNotasBimestrais);
	}
}
