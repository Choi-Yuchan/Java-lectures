import java.util.Scanner;

//예외처리
//2가지 방법
//1. try catch finally
//2. throws

public class ExceptionResolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			int num = sc.nextInt();
			System.out.println(num);
			
//			System.out.print(3/0);
		} catch (Exception e) {
			System.out.println("catch" + e);
		} finally {
			System.out.println("finally");
		}
		
		System.out.println("Program is closed.");
		
	
	}

}
