

//inheritance
class Man {
	private String name;
	public Man() {}
	public Man(String name) {
		this.name = name;
	}
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man {
	private String company;
	private String position;
	//기본적으로 부모의 함수 및 변수의 접근 방법은 super
	public BusinessMan() {};
	
	public BusinessMan(String name, String company, String position) {
		super(name); // 부모 멤버 변수 접근 방법 = 기본적으로 super 생성자를 통해 접근한다.
		// super는 항상 먼저 선언되어야 한다.
		// super를 통해 상위 클래스의 생성자 변수를 호출할 수 있다.
		
		this.company = company;
		this.position = position;
	}
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Man man = new Man("logan");
		BusinessMan busiMan = new BusinessMan();
		busiMan.tellYourInfo();
	}

}
