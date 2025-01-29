package exercicios.lista.aula15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exerc7_2 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        
        // Lendo os três números
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
                
        
        // Determinando o maior número
        int maior = Math.max(num1, num2);
        // Determinando o menor número
        int menor = Math.min(num1, num2);
        
        // Exibindo os resultados
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
        scanner.close();
		
	}
}
