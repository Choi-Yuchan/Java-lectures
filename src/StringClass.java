

public class StringClass {
	// String instance는 immutable instance
	// String은 final로 선언되어 있다.
	// String이 생성됨에 따라 메모리를 사용하게 되므로 생성되는 인스턴스의 수를 최소화한다. 

	public static void main(String[] args) {
		//StringBuilder
		StringBuilder str = new StringBuilder("123");
		
		str.append(45678);
		str.delete(0, 2);
		str.replace(0, 3, "AB");
		str.reverse();
		
		String sub = str.substring(2, 4);
		
		System.out.println(sub);
		
	}

}
