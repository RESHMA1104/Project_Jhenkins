package JavaCore;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ByteStream {
    public static void main(String[] args) {
        byte[] b = new byte[128];
        try (FileInputStream fs = new FileInputStream("input.txt");
             FileOutputStream fss = new FileOutputStream("output.txt")) {
            System.out.println("Bytes Available: " + fs.available());
            int count = 0;
            int read = 0;
            while ((read = fs.read(b)) != -1) {
                fss.write(b, 0, read);
                count += read;
            }

            System.out.println("Total Count: " + count);
        }
        catch (FileNotFoundException f) {
            System.out.println("File not Found: " + f);
        }
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }
}