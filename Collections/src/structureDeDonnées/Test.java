package structureDeDonnées;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Car> cars = new ArrayList<>();

		cars.add(new Car("Renault", 2012));
		// cars.add(new SportsCar("Posrche", 2013, 4));

		Car car = cars.get(0);

		for (Car car1 : cars) {
			System.out.println(car1.describe());

		}
		// System.out.println(((Car) cars.get(0)).describe());

	}

}
