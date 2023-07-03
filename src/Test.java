import java.util.Set;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<>();

		while (lotto.size() != 6) {
			int num;
			num = (int) (Math.random() * 45) + 1;
			lotto.add(num);
		}
		System.out.println(lotto);
	}

}
