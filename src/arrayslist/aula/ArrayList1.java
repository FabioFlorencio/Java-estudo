package arrayslist.aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//Cria uma lista de inteiros
		List<Integer> numeros = new ArrayList<>();
		
		System.out.print("Digite um número:");
		numeros.add(scan.nextInt());
		
		// pega o valor da posição determinada
		System.out.println("Número digitado:" + numeros.get(0));
		
		scan.close();
		
	}
}
