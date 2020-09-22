import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FILE {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		File f = new File("d:/hsbc/one.txt");
		FileInputStream in = new FileInputStream(f);
		
		int c=0;
		while((c=in.read())!=-1) {
			System.out.print((char)c);
		}
		
	}

}
