import java.io.*;
import java.sql.*;
class Propagate{
	public static void main(String args[]){
		try{		
			System.out.println(reverse("das"));
		} catch(IOException e){
			System.out.println("Bad bad");	
		} catch(SQLException e){
			System.out.println("Veryy baaad exeption1!!");	
		} finally {
			System.out.println("main() has finished.");		
		}
	}
	
	public static String reverse(String input) throws IOException{
		if (input.length() == 0){
			throw new IOException();		
		}
		
		String reverse = "";
		for(int i = input.length() - 1; i >= 0; --i){
			reverse += input.charAt(i);
		}
		return reverse;
	}
}
