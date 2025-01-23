package arrayslist.aula;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// Cria uma lista com espaço reservado de 10 posições, mas não adiciona elementos
		// Metodo length não funciona em list
		
		List<Integer> numeros = new ArrayList<>(10);
		int tamanho = 10;
		
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Digite o " + (i+1) + "° número:");
			numeros.add(scan.nextInt());
		}
		
		System.out.println("\n" + numeros);
		
		scan.close();
	}
}

