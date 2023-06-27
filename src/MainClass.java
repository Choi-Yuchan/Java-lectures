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

	public void setGrade(double kor, double eng, double math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	double getAvg() {
		return (kor + eng + math) / 3;
	};

	char getGrade() {
		char grade;
		double avg = getAvg();

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		return grade;
	};

}

class TV {
	String company;
	int year, inch;

	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(company + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
class Song{
	int year;
	String title, artist, country;
	
	Song(){}
	Song(int year, String country, String artist, String title){
		this.title = title;
		this.artist = artist;
		this.country = country;
		this.year = year;
	}
	
	void show() {
		System.out.println(year+ "년 "+ country+"국적의 " + artist + "가 부른 " + title);
	}
	
}

public class MainClass {

	public static void main(String[] args) {
	
	}

}
