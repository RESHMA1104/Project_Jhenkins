package JavaCore;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileSystem_Example2 {

	public static void main(String[] args) {
		Path p1=Paths.get("D:\\\\FileSystem\\\\Demo1\\\\Demo2");
		Path normalizedPath=p1.normalize();
		Path p2=Paths.get("D:\\\\FileSystem\\\\Demo1\\\\Demo2.txt");
		System.out.println("Normalized:"+normalizedPath);
		Path subpath=p1.subpath(1, 3);
		System.out.println("SubPath: "+subpath);
		System.out.println("isAbsolute :" +p1.isAbsolute());
		System.out.println("toAbsolute :"+p1.toAbsolutePath());
		System.out.println("toURI:"+p1.toUri());
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}

}