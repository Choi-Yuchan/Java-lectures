

public class StringClass {
	// String instance는 immutable instance
	// 따라서 생성되는 인스턴스의 수를 최소화한다. 

	public static void main(String[] args) {
		String str1 = "Simple";
		String str2 = "Hard";
		
		str1 = str1 + str2;
		System.out.println(str1);
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		//string 비교 
		if(str1.equals(str3)) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}
			
		//참조하는 주소값 비교 
		if(str1 == str2) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}
		
		
		if(str3 == str4) {
			System.out.println("str1과 str2는 동일 인스턴스 참조");
		} else {
			System.out.println("str1과 str2는 다른 인스턴스 참조");
		}

	}

}
