package cursojava.aulaMetodo;

public class Metodo3 {

	public static void main(String[] args) {
		
		
		System.out.println(somaArray(1,2,3,4));
		System.out.println(somaArray(2.5, 6.7));
		
	}
	// Exemplo de método usando vários parâmetros
	// int... -> indica que é um array que vai receber uma lista de valores
	public static int somaArray(int... numeros) {
		int resp = 0;
		for (int n: numeros) {
			resp+= n;
		}
		return resp;
	}
	// Sobrecarga de métodos -> é um método com o mesmo nome, porém recebe tipos de valores de argumentos diferentes
	public static Double somaArray(Double... numeros) {
		double res = 0.0;
		for (double n: numeros) {
			res+=n;
		} 
		return res; 
	}
}
