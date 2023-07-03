import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));

		System.out.println("저장된 데이터 수: " + hSet.size());
		System.out.println(hSet);

		Set<Integer> lottoSet = new HashSet<Integer>();

		for (int i = 0; i <= 6; i++) {
			int num;
			num = (int) (Math.random() * 45) + 1;
			lottoSet.add(num);
		}
		System.out.println(lottoSet);

	}

}
