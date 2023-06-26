package edu_global.one;

import java.util.Scanner;

public class Lecture {
	// enhanced for
	void foreach() {

		int[] ar = { 1, 2, 3, 4, 5 };

		// for each
		// 배열 요소 전체 출력
		// Read만 되고 Write는 안된다.
		for (int e : ar) {
			System.out.print(e + " ");
		}
		System.out.println();

		int sum = 0;

		// 배열 요소 전체 합 출력
		for (int e : ar) {
			sum += e;
		}
		System.out.println("sum: " + sum);
	}

	void arrayTest() {
		int[][] arr = new int[3][4];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	void arrayTest2() {
		int[][] arr = { { 11 }, { 22, 33 }, { 44, 55, 66 } };

		// 배열의 구조 대로 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	void printUpperClass () {
		Scanner scanner = new Scanner(System.in);
        int rows, columns;

        while (true) {
            System.out.print("행의 크기를 입력하세요 (1~10): ");
            rows = scanner.nextInt();
            System.out.print("열의 크기를 입력하세요 (1~10): ");
            columns = scanner.nextInt();

            if (rows >= 1 && rows <= 10 && columns >= 1 && columns <= 10) {
                break;
            } else {
                System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
            }
        }

        char[][] array = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (char) (65 + (int) (Math.random() * 26));
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
       scanner.close();
	};

	public static void main(String[] args) {
		
	}

}


