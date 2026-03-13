package JavaCore;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class ByteOfStream {

    public static void main(String[] args) {

        char[] b = new char[128];

        try (FileReader fr = new FileReader(args[0]);
             FileWriter fw = new FileWriter(args[1])) {
        	int count = 0;
            int read = 0;

            while ((read = fr.read(b)) != -1) {
                fw.write(b);
                count += read;
            }

            System.out.println("Total Count " + count + " Characters");

        } catch (FileNotFoundException f) {
            System.out.println("File " + args[0] + " not Found");

        } catch (IOException e) {
            System.out.println("IO Exception " + e);
        }
    }
}