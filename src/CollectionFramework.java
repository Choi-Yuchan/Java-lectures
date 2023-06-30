import java.util.LinkedList;
import java.util.List;

class MyLinkedList{
	int num;
	MyLinkedList myLinkedList;
	
}

public class CollectionFramework {

	public static void main(String[] args) {
		MyLinkedList my1 = new MyLinkedList();
		my1.num = 10;
		
		MyLinkedList my2 = new MyLinkedList();
		my1.num = 11;
		my1.myLinkedList = my2;
		
		my2.myLinkedList = new MyLinkedList();
		my2.num = 12;
		
		List<String> list = new LinkedList<>();
		
		System.out.println(my1.num);

		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");

		for (String item : list) {
			System.out.print(item + '\t');
		}

		list.remove(0);
		list.set(1, "Phone");
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + '\t');
		}
		System.out.println();
		System.out.println(list.contains("Box"));
	}

}
