//Method overloading = 같은 함수 이름을 사용할 수 있다. (매개 변수의 데이터 타입 또는 갯수 다르다면)
//class Person {
//	private int regiNum;
//	private int passNum;
//
//	public Person(int rnum, int pnum) {
//		this.regiNum = rnum;
//		this.passNum = pnum;
//	}
//
//	public Person(int rnum) {
//		this(rnum, 0);
//	}
//
//	public Person(String string, int pnum) {
//		// TODO Auto-generated constructor stub
//	}
//
//	void showPersonalInfo() {
//		System.out.println("주민등록 번호: " + regiNum);
//
//		if (passNum != 0)
//			System.out.println("여권 번호: " + passNum + '\n');
//		else
//			System.out.println("여권을 가지고 있지 않습니다. \n");
//	}
//}

public class Overloading {

	public static void main(String[] args) {
		Person Jung = new Person(335577, 112233);
		Person Hong = new Person(665533);

		Jung.showPersonalInfo();
		Hong.showPersonalInfo();
	}

}
