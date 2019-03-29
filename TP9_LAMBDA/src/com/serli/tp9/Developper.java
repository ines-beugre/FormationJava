package com.serli.tp9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Developper extends Person {

	List<String> languages;

	public Developper(String name, int age) {
		super(name, age);
	}

	public Developper(String name, int age, List<String> languages) {
		super(name, age);
		this.languages = languages;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public static void main(String[] args) {
		List<Developper> developpers = new ArrayList<Developper>();

		developpers.add(new Developper("Alice", 23, Arrays.asList("Java", "PHP")));
		developpers.add(new Developper("Bob", 33, Arrays.asList("JavaScript", "R", "css")));
		developpers.add(new Developper("Dylan", 33, Arrays.asList("React", "Angular", "html")));

		List<String> language = developpers.stream().flatMap(l -> l.getLanguages().stream()).distinct()
				.collect(Collectors.toList());

		System.out.println("langages: " + language);
		System.out.println("");

		List<String> language30 = developpers.stream().filter(x -> x.getAge() > 30)
				.filter(c -> c.getLanguages().size() > 2).flatMap(l -> l.getLanguages().stream()).distinct()
				.collect(Collectors.toList());
		System.out.println(language30);

		//

		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		persons.parallelStream().reduce(0, (sum, p) -> {
			System.out.format("accumulator: sum= %s; person=%s[%s]\n", sum, p, Thread.currentThread().getName());
			return sum += p.getAge();
		}, (sum1, sum2) -> {
			System.out.format("combiner:sum1=%s;sum2=%s[%s]\n", sum1, sum2, Thread.currentThread().getName());
			return sum1 + sum2;
		}

		);
	}
}

//ArrayList<String> gfg = new ArrayList<String>() { 
//    { 
//        add("Geeks"); 
//        add("for"); 
//        add("Geeks"); 
//    } 
//}; 