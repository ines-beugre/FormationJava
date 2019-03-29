package com.serli.tp9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestStream {
	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person("Adèle", 10));
		persons.add(new Person("Bertrand", 11));
		persons.add(new Person("Cédric", 12));
		persons.add(new Person("Dereck", 13));
		persons.add(new Person("Elyse", 14));
		persons.add(new Person("Anissa", 16));
		persons.add(new Person("Philipe", 18));
		persons.add(new Person("Java", 19));
		persons.add(new Person("Viviane", 30));
		persons.add(new Person("Mamady", 29));

		List<String> names = persons.stream().map(person -> person.getName()).collect(Collectors.toList());

		System.out.println("liste des prénoms: " + names);

		System.out.println("liste triée des prénoms: ");
		persons.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(p -> System.out.println(p.getName()));

		//
		List<String> names1 = persons.stream().filter(n -> n.getName().charAt(0) != 'A').map(p -> p.getName())
				.collect(Collectors.toList());

		System.out.println("nouvelle liste " + names1);

		System.out.println("");

		System.out.println("nouvelle liste triée");
		persons.stream().filter(n -> n.getName().charAt(0) != 'A')
				.sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).forEach(p -> System.out.println(p.getName()));

		System.out.println("");

		// reduce
		Optional<Integer> sum = persons.stream().map(Person::getAge).reduce(Integer::sum);
		System.out.println(sum);

		Optional<Integer> sum1 = persons.stream().map(x -> x.getAge()).reduce((x, y) -> x + y);
		System.out.println(sum1);

		int somme = persons.stream().reduce(0, (a, person) -> a + person.getAge(), (b, person1) -> b + person1);
		System.out.println(somme);

		System.out.println("");

		List<Integer> ints = persons.stream().map(p -> p.getAge()).collect(Collectors.toList());
		Integer min = ints.stream().reduce(Integer::min).orElse(0);
		System.out.println(ints);
		System.out.println("le minimum est: " + min);

		System.out.println("");

		// Collector
//		Map<Integer, String> map = persons.stream().collect(Collectors.toMap(Person::getAge, Person::getName));
//		map.forEach((a, n) -> System.out.println("age: " + a + ", nom: " + n));

		Map<Integer, Person> map1 = persons.stream().collect(Collectors.toMap(Person::getAge, Function.identity()));
		map1.forEach((age, person) -> System.out.println(age + ": " + person));

	}
}
