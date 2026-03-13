package JavaCore;
import java.nio.file.*;

public class CreatingFile{
    public static void main(String[] args) throws Exception {

        Path path = Paths.get("D:\\FileSystem\\Demo1\\Demo2\\sample.txt");

        Files.createFile(path);

        System.out.println("File Created");

    }
}