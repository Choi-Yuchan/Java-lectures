package edu_global.two;
class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	public void answer() {
		System.out.println("Hi from " + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	public void playApp() {
		System.out.println("App is running in "+ androidVer);
	}
}

public class Practice2 {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("010-4523-2222", "Nougat");
		MobilePhone phone2 = new SmartPhone("010-6544-8998", "Nougat");

		phone.answer();
		phone.playApp();
		System.out.println();
		
		phone2.answer();
//		phone2.playApp();
	}

}
