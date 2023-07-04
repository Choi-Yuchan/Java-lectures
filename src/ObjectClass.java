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

public class ObjectClass {

	public static void main(String[] args) {
		Person kim = new Person("Jack", 33);
		Person park = new Person("Jack", 33);
		Person heo = new Person("Ariana", 29);

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
