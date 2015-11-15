import java.io.*;
class Person{
	public static void main(String args[]){
		// Case 1:
		// Create and delete file that is not in dir
		// Delete dir
		File file1 = new File("testFile1");
		File dir = new File("myDir");
		dir.mkdir();
		
		try {
			file1.createNewFile();
		} catch(IOException e){
			System.out.println("Exception");
		}

		file1.delete();
		dir.delete();

		// Case 2:
		// Create and delete file that is in dir
		// Delete dir - must be empty
		dir = new File("myDir");
		dir.mkdir();
		file1 = new File(dir, "test2");
		try {
			file1.createNewFile();
		} catch(IOException e){
			System.out.println("Exception");
		}
		// Will fail
		dir.delete();

		// Will succeed
		file1.delete();
		dir.delete();

		//Case 3
		//Rename file and rename to other dir
		dir = new File("myDir");
		dir.mkdir();
		file1 = new File("mySampleTextFile");
		try {
			file1.createNewFile();
		} catch(IOException e){
			System.out.println("Exception");
		}
		File file2 = new File(dir, "somthin");
		//System.out.println(file1.renameTo(new File("somthin")));
		System.out.println(file1.renameTo(file2));
		System.out.println(file2.renameTo(new File("somthin2")));

		
		
	}
}
