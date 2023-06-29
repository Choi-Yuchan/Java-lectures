import java.util.Scanner;
class Member2 {
	String color;
	Member2(String color){
		this.color = color;
	}
	public boolean equals(Object obj) {
		Member2 member = (Member2) obj;
		
		if(this.color.equals(member.color)) {
			return true;
		}
		
		return false;
	}
}

public class Test {
 
	public static void main(String[] args) {
		Member2 obj1 = new Member2("Black");
		Member2 obj2 = new Member2("Black");
		Member2 obj3 = new Member2("White");

		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3)); // false가 출
		
	}

}
