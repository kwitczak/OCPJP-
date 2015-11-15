import java.nio.file.*;
import java.io.*;
class Person{
	public static void main(String args[]){
		Path path = Paths.get("/fold/file.txt");
		System.out.println(Files.exists(path));
		System.out.println(path.toFile().isFile());
		System.out.println(path.toFile().isDirectory());
		try {
		Files.createDirectories(path);
		Files.createFile(path);
		//Path p = Paths.get("/source");
		//Files.createDirectory(p);
		//Files.createFile(p);
		} catch(Exception e){ e.printStackTrace(); }
		System.out.println(Files.exists(path));
		System.out.println(path.toFile().isFile());
		System.out.println(path.toFile().isDirectory());
		

	}
}
