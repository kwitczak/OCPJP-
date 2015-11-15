import java.io.*;
class Person{
	public static void main(String args[]){
		File file = new File("test");				
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bfw = new BufferedWriter(fw);
			bfw.newLine();
			bfw.write("Test times");
			bfw.newLine();
			bfw.write("Tastey tests");
			bfw.flush();
			bfw.close();
			
		} catch(IOException e){
			System.out.println("Exception");
		}
	}	
}
