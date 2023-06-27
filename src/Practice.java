

//overriding 
//상속 관게에서 똑같은 함수(이름, 리턴타입, 파라미터)로 바디만 달리하는 것. 
class Cake {
	public void yummy() {
		System.out.println("yummy cake!");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("yummy cheese cake!");
	}
}

// polymorphism + overriding
class Robot {
	public void work() {
		
	}
}
class DanceRobot extends Robot {
	public void work() {
		System.out.println("I am a dancing bot");
	}
}
class DrawRobot extends Robot {
	public void work() {
		System.out.println("I am a drawing bot");
	}
}
class WashRobot extends Robot {
	public void work() {
		System.out.println("I am a washing bot");
	}
}

public class Practice {

	public static void main(String[] args) {
		Robot[] arrRobot = {new DanceRobot(), new DrawRobot(), new WashRobot()};
		
		for(Robot robot : arrRobot) {
			robot.work();
		}
	}

}
