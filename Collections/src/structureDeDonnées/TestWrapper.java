package structureDeDonnées;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestWrapper {
	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<>();

		Integer i = 12;
		integers.add(3);
		integers.add(2);
		integers.add(i);

		System.out.println("liste des integers:");
		for (Integer integer : integers) {
			System.out.println(integer);
		}

		System.out.println(" ");

		int myInt = integers.get(2); // null pointer exception car la valeur à l'index
		// 2 est null

		// Opérations surles collection

		// ordonner la liste
		Collections.sort(integers);
		System.out.println("Liste triée:\n" + integers);
		System.out.println(" ");

		// le max
		System.out.println("la valeur max est: " + Collections.max(integers));
		System.out.println(" ");

	}
}
