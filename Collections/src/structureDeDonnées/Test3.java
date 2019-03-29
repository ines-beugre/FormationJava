package structureDeDonnées;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {
	public static void main(String[] args) {

		Map<String, Car> carsByName = new HashMap<>();
		carsByName.put("Renault", new Car("Renault", 2012));
		carsByName.put("Peugeot", new Car("Peugeot", 2013));

		// System.out.println(carsByName.get("Renault").describe());

		Iterator<?> iterator = carsByName.entrySet().iterator();

		// boucle while
		System.out.println("Liste des clés");
		while (iterator.hasNext()) {
			Map.Entry<String, Car> mapEntry = (Map.Entry) iterator.next();
			System.out.println(mapEntry.getKey());
		}

		// boucle for
		System.out.println("Liste des clés et description");

		for (Map.Entry<String, Car> mapEntry : carsByName.entrySet()) {
			System.out.println("clé: " + mapEntry.getKey() + " valeur: " + mapEntry.getValue().describe());

		}
	}
}
