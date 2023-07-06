package edu.global.prj;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class JavaNetwork {

	public static void main(String[] args) {
//		new InetAddressEx();
		new URLConEx();
	}

}

class InetAddressEx {
	Scanner scanner;
	
	public InetAddressEx() {
		System.out.println("input Host name: ");
		scanner = new Scanner(System.in);
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			
			System.out.println("Computer Name: " + inetAddress.getHostName());
			System.out.println("Computer IP: " + inetAddress.getHostAddress());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class URLConEx{
	public URLConEx() {
		String code = null;
		System.out.println("웹 주소를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		String address = scanner.next();
		
		try {
			URL url = new URL(address);
			URLConnection con = url.openConnection();
			BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
			FileWriter fw = new FileWriter("workspace.html",false);
			
			while ((code = webData.readLine()) != null) {
				System.out.println(code);
				fw.write(code);
			}
			System.out.println("The end");
			
			fw.close();
			webData.close();
		} catch (Exception e) {
			e.printStackTrace();		}
		
	}
}