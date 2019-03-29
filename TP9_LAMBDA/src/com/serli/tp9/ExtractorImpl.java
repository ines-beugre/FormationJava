package com.serli.tp9;

public class ExtractorImpl implements Extractor {

//	@Override
//	public int extractAge(Person person) {
//
//		return person.getAge();
//	}

	public static void main(String[] args) {
		Person a = new Person("A", 32);
		System.out.println(a.getAge());
	}

	@Override
	public int extractAge(Person person1, Person person2) {
		return person1.getAge() + person2.getAge();
	}

}
