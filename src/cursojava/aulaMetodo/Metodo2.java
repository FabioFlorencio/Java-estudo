package cursojava.aulaMetodo;

public class Metodo2 {

	public static void main(String[] args) {
		
		int result;
		result = soma(1,2);
		System.out.println(result);
		
	}
	// Exemplo de método usando parâmetros com retorno
	public static int soma(int n1, int n2) {
		int resp = n1 + n2;
		return resp;
	}	
}
