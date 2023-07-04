import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		
		deque.addFirst("First");
		deque.addLast("Second");
		deque.addLast("Third");
		
		// 요소 출력하기
        System.out.println("요소들: ");
        for (String element : deque) {
            System.out.println(element);
        }
        
        System.out.println();
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());
	}

}
