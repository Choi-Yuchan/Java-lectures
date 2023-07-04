import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapClass {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();

		// Key-value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		Set<Integer> keys = map.keySet();
		
		for(Integer n: keys)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		for(Integer n: keys)
			System.out.print(map.get(n).toString() + '\t');
		System.out.println();
		
		for (Iterator iterator = keys.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(map.get(integer) +'\t');
			
		}

	}
}
