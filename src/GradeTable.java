package edu_global.two;

import java.util.Scanner;

class GradeData {
	private String name;
	private int kor, eng, math;
	private char result;

	GradeData() {
	}

	GradeData(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	double getAvg() {
		return (kor + eng + math) / 3;
	}

	char getGrade() {
		double avg = getAvg();
		if (avg >= 90) {
			result = 'A';
		} else if (avg >= 80) {
			result = 'B';
		} else if (avg >= 70) {
			result = 'C';
		} else if (avg >= 60) {
			result = 'D';
		} else {
			result = 'E';
		}

		return result;
	}
}

public class GradeTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String answer;

		do {
			System.out.print("이름: ");
			String name = scanner.next();
			System.out.print("국어: ");
			int kor = scanner.nextInt();
			System.out.print("영어: ");
			int eng = scanner.nextInt();
			System.out.print("수학: ");
			int math = scanner.nextInt();

			GradeData gradeData = new GradeData(name, kor, eng, math);
			double avg = gradeData.getAvg();
			char grade = gradeData.getGrade();

			System.out.println(name + "님의 평균은 " + avg + "성적은 " + grade + " 입니다.");

			System.out.println("계속하시겠습니까? (y/n)");
			answer = scanner.next();
		} while (answer.equalsIgnoreCase("y"));

	}

}
