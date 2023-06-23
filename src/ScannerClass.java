import java.util.Scanner;

class Circle3 {
	double radius; // 변수선언 > 게터세터 넣기

	public double getRadius() {
		return radius; // 원의 넓이를 가져오는 함수
	}

	public void setRadius(double radius) { // 외부값받아서 원의넓이를 변경하는 함수
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI; // 원의 넓이 곱하는 함수만듦
	}
}

class Rectangle2 {
	double width, height;

	Rectangle2() {
	}

	Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}
}
class GradeTable{
	   private int kor, eng, math; //인스턴트 변수
	   private String name;

	   void setGrade(String name, int kor, int eng, int math) { 
	      this.name = name;
		   this.kor = kor;
	      this.eng = eng;
	      this.math = math; 
	   }

	   double getAvg() { 
	      return (kor + eng + math) / 3.0;
	   }

	   char getGrade() {
	      char ch = '가';
	      double avg = getAvg(); 
	      
	      if(avg >=90) {
	         ch='수';
	      }
	      else if (avg >=80) {
	         ch='우';
	      }
	      else if (avg >=70) {
	         ch='미';
	      }
	      else if (avg >=60) {
	         ch='양';
	      } else {
	    	  ch='가';
	      }
	      
	      return ch;
	   }
}
class Accumulator{
	static int num = 0;
	static void add(int i){
		num+=i;
	}
	static void showResult() {
		
		System.out.println(num);;
	}
}

public class ScannerClass {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GradeTable grade = new GradeTable();
		int kor,eng,math;
		String name;
		String answer;
		
		for(int i=0;i<=10;i++) {
			Accumulator.add(i);
		}
		Accumulator.showResult();
		
//		Circle3 cir = new Circle3();
//		Rectangle2 rec;

//		System.out.print("radius: ");
//		double radius = sc.nextDouble();
//
//		cir.setRadius(radius);
//		
//		System.out.println("Circle's area is " + cir.getArea());
		
		do {
			System.out.print("name:");
			name = sc.next();
			System.out.print("kor:");
			kor = sc.nextInt();
			System.out.print("eng:");
			eng = sc.nextInt();
			System.out.print("math:");
			math = sc.nextInt();
			
			grade.setGrade(name, kor, eng, math);
			System.out.println(name + "'s grade is " + grade.getGrade());
			
			System.out.print("Do you wanna continue? (yes/no)");
			answer = sc.next();
			
		} while (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y"));
		sc.close();
		
//		while(true) {
//			System.out.print("kor:");
//			double kor = sc.nextDouble();
//			System.out.print("eng:");
//			double eng = sc.nextDouble();
//			System.out.print("math:");
//			double math = sc.nextDouble();
//			
//			grade.setGrade(kor, eng, math);
//			System.out.println(grade.getGrade());
//			
//			System.out.print("Do you wanna continue? (yes/no)");
//			answer = sc.next();
//			
//			if(answer.compareToIgnoreCase("yes") == 0|| answer.compareToIgnoreCase("y") == 0) {
//				continue;
//			}
//			else if(answer.compareToIgnoreCase("no") == 0|| answer.compareToIgnoreCase("n") == 0)
//				break;
//		}
		
		
//		while(true) {
//			System.out.print("width:");
//			double width = sc.nextDouble();
//			System.out.print("height:");
//			double height = sc.nextDouble();
//			
//			rec = new Rectangle2(width, height);
//			System.out.println("Rectangle's area is " + rec.getArea());
//			
//			System.out.print("Do you wanna continue? (yes/no)");
//			String answer = sc.next();
//			
//			if(answer.compareToIgnoreCase("yes") == 0|| answer.compareToIgnoreCase("y") == 0) {
//				continue;
//			}
//			else if(answer.compareToIgnoreCase("no") == 0|| answer.compareToIgnoreCase("n") == 0)
//				break;
//		}
		
		

		
		

	}

}
