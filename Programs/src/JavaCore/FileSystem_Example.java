package JavaCore;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem_Example {

    public static void main(String[] args) {

        Path p1 = Paths.get("D:\\FileSystem\\Demo1\\Demo2");

        Path p2 = p1.subpath(1, 3);

        System.out.println("Original Path: " + p1);
        System.out.println("Sub Path: " + p2);
    }
}