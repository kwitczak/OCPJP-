import java.io.*;
class Person{
	public static void main(String[] args){
		char[] in = new char[50];
		String[] a = new String[50];
		int size = 0;
		try {
			File file = new File("fileWriter.txt");
			FileWriter fw = new FileWriter(file);
			fw.write("What is it?");
			fw.flush();
			//fw.close();
			
			FileReader fr = new FileReader(file);
			//size = fr.read(a);
			size = fr.read(in);
			System.out.print(size + " ");
			for(char c : in)
				System.out.print(c);
			//fr.close();
		} catch (IOException e){

		}
	}
}
