import java.io.*;
class Person{
	public static void main(String args[]){
		File file = new File("test");
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String s;
			while((s = br.readLine()) != null)
				System.out.println(s);
		} catch(Exception e){

		}
	}
}
