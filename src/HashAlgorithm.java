
public class HashAlgorithm {

	public static void main(String[] args) {
		
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
		return num % 3;
	}

	@Override
	public boolean equals(Object obj) {
		if (num == ((Num) obj).num)
			return true;
		else
			return false;
	}
}
