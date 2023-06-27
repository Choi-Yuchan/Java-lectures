package edu_global.two;

import java.util.Scanner;

public class Circle {
	public Circle() {
		System.out.println("edu_global.two package");
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] array = new String[6][6];

        // 행의 맨 위에 인덱스 저장
        for (int i = 0; i < 6; i++) {
            array[0][i] = String.valueOf(i);
        }

        // 열의 제일 앞에 인덱스 저장
        for (int i = 0; i < 6; i++) {
            array[i][0] = String.valueOf(i);
        }

        // 좌표 입력 받아 해당 좌표의 값을 'X'로 변환
        while (true) {
            System.out.print("행의 좌표를 입력하세요 (1~5): ");
            int row = scanner.nextInt();
            System.out.print("열의 좌표를 입력하세요 (1~5): ");
            int column = scanner.nextInt();

            if (row >= 1 && row <= 5 && column >= 1 && column <= 5) {
                array[row][column] = "X";
                break;
            } else {
                System.out.println("반드시 1~5 사이의 정수를 입력해야 합니다.");
            }
        }

        // 배열 출력
        printArray(array);
    }

    // 2차원 배열 출력 메소드
    public static void printArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
            	if (array[i][j] == null) {
                    System.out.print("  "); // 빈 칸 출력
                } else {
                    System.out.print(array[i][j] + " ");
                }            }
            System.out.println();
        }
        System.out.println();
    }
}


