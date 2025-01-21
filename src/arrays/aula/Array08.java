package arrays.aula;

import java.util.Arrays;
import java.util.List;

public class Array08 {

	public static void main(String[] args) {
		
		String[] frutas = {"Maçã" , "Banana", "Laranja"};
		// Transforma um array em uma lista
		List<String> listaFrutas = Arrays.asList(frutas);
		System.out.println(listaFrutas);
		
	}
}
