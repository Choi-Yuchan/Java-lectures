// function() 소괄호로 판단, 소괄호 앞에는 함수명
// 함수 -> 만드는 법 + 써먹는 법

public class Method {

	public static void main(String[] args) {
//		showFunction();
		
		int height = 190;
		showAge(22, height);
		
		System.out.println(add(3,5));
		
	}
	
	//변수 선언 = parameters
	public static void showAge(int age, int tall) {
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("제 키는 "+tall+"cm 입니다.");
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	
	public static void showFunction() {
		System.out.println("함수1");
		System.out.println("함수2");
		showStar1();
	}
	
	
	public static void showStar1() {
		for(int i = 0; i<= 5; i++) {
			for(int j = 0; j<i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
