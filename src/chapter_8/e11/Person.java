import java.util.*;

class Person {
	public static void main(String args[]){
		Locale l = new Locale("en", "CA");
		ResourceBundle rb = ResourceBundle.getBundle("Labels", l);
		System.out.println(rb.getObject("hello"));
	}
}
