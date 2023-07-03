import java.util.HashSet;
import java.util.Set;

public class HashAlgorithm {

	public static void main(String[] args) {
		Set<Num> set = new HashSet<>(); 
		set.add(new Num(3));
		set.add(new Num(3));
		set.add(new Num(2));
		set.add(new Num(10));
		
		System.out.println(set.size());
		
	}

}

class Num {
	private int num;

	public Num(int num) {
		this.num = num;
	}

	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode call");
		return num % 3;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals call");
		if (num == ((Num) obj).num)
			return true;
		else
			return false;
	}
}
