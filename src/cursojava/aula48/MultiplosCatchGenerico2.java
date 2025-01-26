package cursojava.aula48;

public class MultiplosCatchGenerico2 {

	public static void main(String[] args) {
		
		int[] numeros = {4,8,16,32,64,128};
		int[] demon = {2,0,4,8,0};
						
		for (int i = 0; i < numeros.length;  i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
			} catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero.");
			} catch (Throwable e2) {   
				// Throwable é uma super classe de exceção
				// sempre as classes de exceção específicas primeiro e depois as classes genéricas 
				System.out.println("Ocorreu um erro.");
			}
		}		

	}
}
