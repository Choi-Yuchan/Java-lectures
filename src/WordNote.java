
import java.util.Scanner;

public class WordNote {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("영어 단어를 입력하세요: ");
		        String word = scanner.nextLine();
		        int length = word.length();
		        int vowelCount = 0;
		        int consonantCount = 0;

		        for (int i = 0; i < length; i++) {
		            char ch = Character.toLowerCase(word.charAt(i));
		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		                vowelCount++;
		            } else if (Character.isLetter(ch)) {
		                consonantCount++;
		            }
		        }

		        System.out.println("총 글자 수는: " + length + "개 입니다.");
		        System.out.println("모음은: " + vowelCount + "개 입니다.");
		        System.out.println("자음은: " + consonantCount + "개 입니다.");
		        
		        scanner.close();

	}

}
