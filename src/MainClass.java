//Object Oriented Programming
class Student {
	int age; // Data -> Variable;
	char gender;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() { // Function
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Circle {
	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircleArea() {
		return radius * radius * Math.PI;
	}
}

class Rectangle {
	double width, height;

	void setWidthHeight(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}
}

class Hotel {
	int towel, soap, coffee;
	char service;

	void SuiteRoom(char service) {
		System.out.println("suite room serve " + service + " class service");
	}

	void FamilyRoom(char service) {
		System.out.println("Family room serve " + service + " class service");
	}
}

class GetSum {
	int total, num;

	void setNum(int num) {
		this.num = num;
	}

	int sum() {
		for (int i = 0; i <= num; i++) {
			total += i;
		}
		return total;
	}
	
}

class Gugudan {
	void printGugu(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println(i + "*" + j + "=" + i * j);
		}
	}
}

class Grade {
	double kor, eng, math;
	double avg;
	char grade;
	
	void setGrade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	double getAvg() {
		avg = (kor+eng+math)/3;
		return avg;
	};
	
	char getGrade() {
		if(avg >= 90) {
			grade = 'A';
		} else if (avg >=80) {
			grade = 'B';
		}else if (avg >=70) {
			grade = 'C';
		}else if (avg >=60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	};

}

public class MainClass {

	public static void main(String[] args) {
//		StarPrint starPrint = new StarPrint();
//		
//		starPrint.printTriangle(3);
//		System.out.println();
//		starPrint.printReverseTriangle(3);
//		
//		
//		Hotel Hilton = new Hotel();
//		Hilton.SuiteRoom('A');

		//////////////////
		GetSum getsum = new GetSum();
		int num; // 2)num 변수 선언

		num = 10;

		getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50 저장

		num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-50까지 합 구함
		System.out.println(num);
		///////////////////////

		Gugudan gugudan = new Gugudan();
//		gugudan.printGugu(10);
		/////////////////////////
		Grade grade = new Grade();
		
		grade.setGrade(90, 70, 60);
		
		grade.getAvg();
		
		char yourGrade = grade.getGrade();
		
		System.out.println(yourGrade);
		
	}

}
