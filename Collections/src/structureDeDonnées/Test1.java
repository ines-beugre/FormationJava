package structureDeDonnées;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {

		Set<Car> cars = new HashSet<Car>();
		cars.add(new Car("Renault", 2012));
		cars.add(new Car("Peugeot", 2013));
		cars.add(new Car("Peugeot", 2013));
		cars.add(new SportsCar("Porshe", 2012, 4));
		System.out.println(cars.size());

		Iterator iterator = cars.iterator();

		while (iterator.hasNext()) {
			Car car = (Car) iterator.next();
			System.out.print(car.describe() + " ");

		}
	}
}
