import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Test {
	public static void main(String[] args) {
		new UrlConnect();
    }

}

class UrlConnect{
	public UrlConnect() {
		String code = null;
		System.out.println("웹 주소를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String address = scanner.next();
		
		try {
			URL url = new URL(address);
			URLConnection connection = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			FileWriter writer = new FileWriter("website.html", false);
			
			while((code = webData.readLine())!=null) {
				System.out.println(code);
				writer.write(code);
			}
			System.out.println("The End");
			
			writer.close();
			webData.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
