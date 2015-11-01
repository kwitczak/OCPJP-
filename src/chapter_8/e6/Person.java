import java.util.*;
class Person {
	public static void main(String args[]){
		try {
			Scanner s = new Scanner("Well123WellWell123");
			String token;
			do {
				token = s.findInLine("\\d");
				System.out.println("found " + token);			
			} while (token != null);
		} catch(Exception e) { System.out.println("Exception");}
	}
}
