import java.nio.file.*;
class Person{
	public static void main(String args[]){
		Path source = Paths.get("test1/test.txt");
		Path target = Paths.get("test2/test2.txt");
		try{
		Files.move(source, target);
		Files.copy(target, source);
		Files.copy(target, source, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(target);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
