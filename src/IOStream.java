
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {

	public static void main(String[] args) throws IOException {
		OutputStream out = null;
		try {
			out = new FileOutputStream("data.dat");
			out.write(7);

		} finally {
			if (out != null)
				out.close();
		}

		InputStream in = null;
		try {
			in = new FileInputStream("data.dat");
			int dat = in.read();
			System.out.println(dat);
		} finally {
			if (in != null)
				in.close();
		}

	}

}
