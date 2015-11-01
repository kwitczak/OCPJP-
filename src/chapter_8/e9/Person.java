import java.util.*;
class Person{
	public static void main(String args[]){
		StringTokenizer st = new StringTokenizer("a bac da e");
		System.out.println("\n" + st.countTokens());
		while(st.hasMoreTokens()){
			System.out.print(">" + st.nextToken() + "<  ");
		}
		System.out.println("\n " + st.countTokens());

		// Delimeter as "a"
		StringTokenizer st2 = new StringTokenizer("a bac da e", "a");
		System.out.println("\n " + st2.countTokens());
		while(st2.hasMoreTokens()){
			System.out.print(">" + st2.nextToken() + "<  ");
		}
		System.out.println("\n " + st2.countTokens());
	}
}
