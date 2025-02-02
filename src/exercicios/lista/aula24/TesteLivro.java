package exercicios.lista.aula24;

public class TesteLivro {

	public static void main(String[] args) {
		
		
		Livro livro = new Livro();
		
		livro.nome = "Mastering ExJS";
		livro.autor = "Loiane Groner";
		livro.qtdPaginas = 100;
		livro.anoLancamento = 2015;
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Auto = " + livro.autor);
		System.out.println("Quantidade de páginas = " + livro.qtdPaginas);
		System.out.println("Ano de lançamento = " + livro.anoLancamento);
		
		
	}

}
