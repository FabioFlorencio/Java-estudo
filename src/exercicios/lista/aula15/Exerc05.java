package exercicios.lista.aula15;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Exerc05 {
	
	public static final double MEDIA_10 = 10;
	public static final double MEDIA_MAIOR_7= 7;	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();		
		List<Double> notas = new ArrayList<>();
				
		int qtdNotas = 2;
		double resultMedia = 0;		
 
		sb.append("Você foi ");		
		
		for (int i = 0; i < qtdNotas; i++) {			
			System.out.print("Digite a " + (i+1) + "° nota:");
			notas.add(scan.nextDouble());
			resultMedia += notas.get(i) / 2;
		}
			
		if (resultMedia == MEDIA_10) {
			sb.append("aprovado com distinção.");			
		} else if (resultMedia >= MEDIA_MAIOR_7) {
			sb.append("aprovado.");
		} else {
			sb.append("reprovado.");
		}
		
		String msg = sb.toString();		
		System.out.println(msg);
		
		scan.close();
		
	}
}
