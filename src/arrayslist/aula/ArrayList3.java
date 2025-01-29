package arrayslist.aula;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        // Convertendo List para Array
        Integer[] array = lista.toArray(new Integer[0]);

        // Imprimindo o array
        for (Integer item : array) {
            System.out.println(item);
        }
	}
}

