import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class SimpleWriter {

	public static void main(String[] args) {
//		try (Writer out = new FileWriter("data.txt")) {
//			for (char c = 'A'; c <= 'Z'; c++) {
//				out.write(c);
//			}
//		} catch (Exception e) {
//			e.getMessage();
//		}

		Scanner sc = new Scanner(System.in);
		System.out.print("읽을 파일 : ");
		String src = sc.nextLine();

		try (Reader in = new FileReader(src)) {
			int ch;
			while (true) {
				ch = in.read();

				if (ch == -1)
					break;
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
