import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box");
		set.add("Robot");
		set.add("Box");
		set.add("Ace");
		
		set.hashCode();

		System.out.println("instance number: " + set.size());

		for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.print(string + '\t');
		}
		System.out.println();
		
		for(String str: set) {
			System.out.print(str + '\t');
		}
		

	}

}
