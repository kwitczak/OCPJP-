import java.io.*;
class Person {
	public static void main(String args[]){
		char[] in = new char[10];
		int size = 0;
		File file = new File("test");
		FileWriter fw = null;
		try {
		fw = new FileWriter(file);
		fw.write("please\ndo\nsomethin");
		fw.flush();
		fw.close();
		

		FileReader fr = new FileReader(file);
		//fw = new FileWriter(file);
		size = fr.read(in);
		System.out.println(size);
		fr.close();
		for(char a : in)
			System.out.println(a);
		} catch (IOException e){
			System.out.println("Exception");
		}
		
	}
}
