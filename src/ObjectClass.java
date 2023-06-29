class Member {
	String color;

	Member() {
	}

	Member(String color) {
		this.color = color;
	}

	public boolean equals(Object obj) {
		Member member = (Member) obj;
		if (color.equals(member.color)) {
			return true;
		}
		return false;
	}
}

class Person2 {
	private String name;
	private int age;

	public Person2() {
	}

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		Person2 person = (Person2) obj;
		if (name.equals(person.name) && (age == person.age)) {
			return true;
		}
		return false;
	}
}

public class ObjectClass {

	public static void main(String[] args) {
		Person2 kim = new Person2("Jack", 33);
		Person2 park = new Person2("Jack", 33);
		Person2 heo = new Person2("Ariana", 29);

		if (kim.equals(park)) {
			System.out.println("same person");
		} else {
			System.out.println("different person");
		}

		if (kim.equals(heo)) {
			System.out.println("same person");
		} else {
			System.out.println("different person");
		}

	}
}
