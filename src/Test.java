import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		for (int i = 0; i <= 11; i++) {
			if(i%11 == 0) {
				for(int j = 1; j<=7; j++) {
					if(j%7 == 0) {
						System.out.println(i*j);
						break;
					}
				}
			}
		}
	}

}