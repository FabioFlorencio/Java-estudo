package cursojava.aulaMetodo;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Metodo4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String msgPadrao = "Informe o valor da";
		String[] perguntas = {" base:", " altura:"};
				
		List<Double> valores = new ArrayList<>();
		
		for (String pergunta : perguntas) {
			System.out.print(msgPadrao + pergunta);
			double valor = scan.nextDouble();
			valores.add(valor);			
		}
		
		double resp = retangulo(valores);
		System.out.println(resp);
		
		scan.close();				
	}
	// passando list como parâmetro par função
	public static double retangulo(List<Double> valores) {
				
		return valores.get(0) * valores.get(1);					
	}
	
}
