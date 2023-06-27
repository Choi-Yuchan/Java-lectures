package edu_global.one;

import java.util.Scanner;
import java.util.Random;

public class RockScissorPaper {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;

		do {
			System.out.print("가위, 바위, 보 중 하나를 입력하세요: ");
			String userChoice = scanner.next();

			String[] choices = { "가위", "바위", "보" };
			Random random = new Random();
			int computerChoiceIndex = random.nextInt(3);
			String computerChoice = choices[computerChoiceIndex];
			
			System.out.println("사용자: " + userChoice);
			System.out.println("컴퓨터: " + computerChoice);
			System.out.println();

			if (userChoice.equals(computerChoice)) {
				System.out.println("비겼습니다!");
			} else if ((userChoice.equals("가위") && computerChoice.equals("보"))
					|| (userChoice.equals("바위") && computerChoice.equals("가위"))
					|| (userChoice.equals("보") && computerChoice.equals("바위"))) {
				System.out.println("이겼습니다!");
			} else {
				System.out.println("졌습니다!");
			}

			System.out.print("계속하시겠습니까? (네/아니오)");
			answer = scanner.next();
		} while (answer.equalsIgnoreCase("네") || answer.equalsIgnoreCase("y"));

		System.out.println("프로그램을 종료합니다.");
		scanner.close();
	}
}
