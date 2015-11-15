import java.io.*;
class Person{
	public static void main(String args[]){
		try {
			File dir = new File("myDir");
			dir.mkdir();
			File fileInDir = new File(dir, "myTestFile");
			
			FileWriter fw = new FileWriter(fileInDir);
			fw.write("smth");
			fw.flush();
			fw.close();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
}
