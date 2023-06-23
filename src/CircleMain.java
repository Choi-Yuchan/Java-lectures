//import edu_global.one.*;
class InstCnt {
	static int instNum = 0; 
	// static 변수 = 공유 변수 = class 변수
	// 함수와 변수에만 사용된다.
	// static = 먼저(new 객체 생성보다 먼저) method area에 한번 올려 공유
	// class 변수의 접근 방법 
	
	InstCnt(){
		instNum++; // class 내부에서 이름을 통한 접근
		System.out.println("create an instance: " + instNum);
	}
}
class NumberPrinter {
	private int myNum = 0;
	
	static void showInt(int n) {
//		myNum = 10; static이 먼저 method area에 올라가 있기 때문에 myNum을 인식할 수 가 없다. myNum은 객체 생성을 해야지만 메모리에 할당 되기 때문
		System.out.println(n);
	}
	
	static void showDouble(double n) {
		System.out.println(n);
	}
	
	void setMyNumber(int n) {
		myNum = n;
	}
	void showMyNumber() {
		showInt(myNum);
	}
}

public class CircleMain {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt(); // Class 선언할 때 class 내부의 변수와 함수를 읽어들일 때 static이 있는지 확인한다.
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
		cnt1.instNum++; // 외부에서 instance 객체의 이름을 통한 접근 -> 비추천 방법
		InstCnt.instNum++; // 외부에서 클래스의 이름을 통한 접근
		
		
	}

}
