package cursojava.aula12;

import java.util.Scanner;


public class LeituraDadosTeclado {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		
		System.out.println("Seu nome completo é : " + nomeCompleto);
		
		System.out.println("Digite o seu primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é:" + primeiroNome);*/
		
		System.out.print("Digite sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.print("Digite sua altura:");
		double altura = scan.nextDouble();
		System.out.println("A sua altura é:" + altura);
		System.out.println("Teste");
	}
}
