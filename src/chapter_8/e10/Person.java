import java.util.*;
class Person{
	public static void main(String args[]){
		Locale e = new Locale("fr");
		ResourceBundle rb = ResourceBundle.getBundle("Labels", e);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("ex"));
		System.out.println(rb.getString("srsly"));
	}
}
