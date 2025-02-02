package cursojava.aulaMetodo;

import java.util.ArrayList;
import java.util.List;

public class Metodo5 {
    
    public static String saudacao(String nome) {
        return "Olá! " + nome;
    }

    public static List<String> saudarPessoas(List<String> nomes) {
        List<String> mensagens = new ArrayList<>();
        for (String nome : nomes) {
            mensagens.add(saudacao(nome));
        }
        return mensagens;
    }

    public static void main(String[] args) {
    	// List.of -> Cria uma lista imutável
    	// new ArrayList<> -> cria ArrayList mutável 
        List<String> listaNomes = new ArrayList<>(List.of("Fábio", "Maria", "Julia"));
        listaNomes.add("José");
        List<String> resultado = saudarPessoas(listaNomes);
        
        for (String msg : resultado) {
            System.out.println(msg);
        }
    }
}
