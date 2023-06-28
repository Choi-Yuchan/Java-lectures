//interface를 사용하는 이유
//1. 사용해왔기 때문에(표준 = 규약 = 강제 = 프린트 드라이버)
//2. 다중 상속 지원
//interface 안에 올 수 있는 것은 추상 메소드와 상수만 올 수 있다. 

//MS
interface Printable {
	public void print(String doc);
}

//Samsung 
class SamsungPrinter implements Printable {
	public void print(String doc) {
		System.out.println("From Samsung printer");
		System.out.println(doc);
	}
}

//LG
class LGPrinter implements Printable {
	public void print(String doc) {
		System.out.println("From LG printer");
		System.out.println(doc);
	}
}

interface ICalculator {
	public int add(int num1, int num2);

	public int sub(int num1, int num2);

	public int mul(int num1, int num2);

	public int div(int num1, int num2);
}

class AppleCalculator implements ICalculator {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}

}

//추상 클래스와 인터페이스의 차이
abstract class House { //추상 클래스
	public void methodOne(){
    	System.out.println("method one");
    }

	public abstract void methodTwo(); //추상 메소드
}

class House2 extends House{

	@Override
	public void methodTwo() {
		System.out.println("method two");
	}
}

public class InterfaceMain {

	public static void main(String[] args) {
		House house = new House2();
		house.methodTwo();
		

	}

}
