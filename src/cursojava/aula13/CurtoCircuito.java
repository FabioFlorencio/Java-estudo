package cursojava.aula13;

public class CurtoCircuito {

	public static void main(String[] args) {
		
		boolean verdadeiro = true;
		boolean falso = false;
		
		// Diferença entre o & simples e o && curto circuito
		boolean resultado1 = falso & verdadeiro;
		boolean resultado2 = falso && verdadeiro;
		
		System.out.println(resultado1);
		System.out.println(resultado2);
		// Precedência 
		int resultado = 1 + 1 - 1 + 1 * 1 / 1;

	}
}
