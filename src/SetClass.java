import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person {
	private int regiNum, passNum, age;
	private String name;

	public Person(int rnum, int pnum) {
		this.regiNum = rnum;
		this.passNum = pnum;
	}

	public Person(int rnum) {
		this(rnum, 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}

	@Override
	public int hashCode() {
		return age;
	}

	@Override
	public boolean equals(Object obj) {
		Person person = (Person) obj;
		if ((name.equals(person.name)) && (age == person.age))
			return true;
		else
			return false;
	}

	void showPersonalInfo() {
		System.out.println("주민등록 번호: " + regiNum);

		if (passNum != 0)
			System.out.println("여권 번호: " + passNum + '\n');
		else
			System.out.println("여권을 가지고 있지 않습니다. \n");
	}
}

public class SetClass {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(3);
		tree.add(1);
		tree.add(4);
		tree.add(2);
		for(Integer n : tree)
			System.out.print(n.toString() + '\t');

	}

}
