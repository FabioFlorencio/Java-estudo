package exercicios.lista.aula13;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora:");
		double valorHora = scan.nextDouble();
				
		System.out.print("Quantas horas você trabalha por mês:");
		double horasTrabalhadas = scan.nextDouble();
		
		double calcSalario = valorHora * horasTrabalhadas;
		
		System.out.println("O seu salário é: R$" + calcSalario);
		
		scan.close();
		
	}
}
