import java.io.*;
class Person{
	public static void main(String args[]){
		File file = new File("notExisting");
		File dir = new File("well/well/well");
		System.out.println(file.exists());
		try{
			dir.mkdirs();
			(new File(dir, "Testfile")).createNewFile();
		} catch(Exception e){
		}
		System.out.println(file.exists());
		for(String a : dir.list())
			System.out.println(a);
		
	}
}
