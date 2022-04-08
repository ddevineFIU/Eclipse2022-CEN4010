package favoriteList;
import java.util.ArrayList;
import java.util.List;

import static favoriteList.Main.Gender.*;




public class Main{
	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person(name: "John", MALE),
				new Person(name: "Maria", FEMALE),
				new Person(name: "Aisha", FEMALE),
				new Person(name: "Alex", MALE),
				new Person(name: "Alice", FEMALE)
		);
		System.out.println("imperative approach");
		//imperative approach
		List<Person> females = new ArralyList<>();
		
		for (Person person: people) {
			if (FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		for (Person female : females) {
			System.out.println(female);
		}
	}									

	static class Person {
			private final String name;
			private final Gender gender;
			public Person(String name, Gender gender) {
				//super();
				this.name = name;
				this.gender = gender;
			}
		System.out.println("declarative approach");	
		//declarative approach
		people.stream().filter(person -> FEMALE.equals(person.gender))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		}
	
	
			Person(String name, Gender gender){
				this.name =  name;
				this.gender = gender;
			}
			@Override
			public String toString() {
				return "Person{" + 
						"name = '" name + '\'' +
						", gender =" + gender +
						'}';
			}
	
	enum Gender{
		MALE, FEMALE
	}
			
}

