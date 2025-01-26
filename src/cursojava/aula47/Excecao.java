package cursojava.aula47;

public class Excecao {

	public static void main(String[] args) {
		
		try {
			System.out.println("Antes da expcepation");
			
			int[] vetor = new int[4];			
			vetor[4] = 1;			
			
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		
		System.out.println("Esse texto não será impresso.");
		
	}
}
