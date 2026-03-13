package JavaCore;
import java.io.FileInputStream;
public class FileInStream {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("D:\\FileSystem\\Demo1\\Demo2\\FinalYearProject.txt");
			System.out.println("Data in the File");
			int i = input.read();
			while(i >= -1) {
				System.out.println((char)i);
				i = input.read();
			}
			input.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}