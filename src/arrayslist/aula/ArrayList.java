package arrayslist.aula;

import java.util.List;
import java.util.LinkedList;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> frutas = new LinkedList<>();
		
		frutas.add("Maça");
		frutas.add("Banana");
		frutas.add("Laranja");
		
		System.out.println("Frutas:"  + frutas);
		
		frutas.remove(0);
		
		System.out.println("Frutas:"  + frutas);
		
		frutas.add(1, "Jaca");
		
		System.out.println("Frutas" + frutas);
				
	}
}
