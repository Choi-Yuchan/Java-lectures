
class DBox<L, R> {
	private L left;
	private R right;

	public void set(L o, R r) {
		left = o;
		right = r;
	}

	public String toString() {
		return left + " & " + right;
	}
}

class Box<T> {
	private T ob;

	public T get() {
		return ob;
	}

	public void set(T ob) {
		this.ob = ob;
	}
}

//class BoxFactory {
//	public static <T> Box<T> makeBox(T value) {
//		Box<T> box = new Box<T>();
//		box.set(value);
//		return box;
//	}
//}

public class GenericClass {

	public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
       box1.set(99);   //오토 박싱 

       Box<Integer> box2 = new Box<>();
       box2.set(55);   //오토 박싱 

       System.out.println(box1.get() + " & " + box2.get());
       swapBox(box1, box2);
       System.out.println(box1.get() + " & " + box2.get());

	}

	private static <T extends Number> void swapBox(Box<T> box1, Box<T> box2) {
		T temp = box1.get();
		box1.set(box2.get());
		box2.set(temp);
	}

}
