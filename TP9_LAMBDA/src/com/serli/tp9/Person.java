package com.serli.tp9;

import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Person implements Writable, Printable {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static boolean isMoreThanFifty(Integer age) {
		System.out.println(age > 50);
		return age > 50;

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Printable.super.print();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		Person john = new Person("John", 33);
		ToIntFunction<Person> ageFunction = person -> person.getAge();
		int age = ageFunction.applyAsInt(john);
		System.out.println(age);

		Extractor extra = (person, person2) -> person.getAge() + person.getAge();
		int age2 = extra.extractAge(john, john);

		System.out.println(age2);

		Consumer<Person> consumer = System.out::println;
//		Consumer<Person> consumer = (param) -> System.out.println(param);

		consumer.accept(new Person("B", 22));
		Consumer<Integer> consumer2 = Person::isMoreThanFifty;

		consumer2.accept(john.getAge());
		john.print();
	}

	public static void toto(Extractor extra) {

	}

}
