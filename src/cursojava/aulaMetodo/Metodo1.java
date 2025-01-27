package cursojava.aulaMetodo;

public class Metodo1 {

	public static void main(String[] args) {
		
		mensagem();
		msg("Bom dia!");
		enviandoParametros("Usando parametros", 2);
		
	}
	// método sem retorno
	public static void mensagem() {		
		System.out.println("Aprendendo a linguagem Java.");		
	}	
	// Exemplos de parâmetros de entrada
	public static void msg(String m) {
		System.out.println(m);
	}
	public static void enviandoParametros(String mensagem, int c) {
		for (int i = 0; i < c ; i++) {
			System.out.println(mensagem + " " + i);		
		} 
	}
}
