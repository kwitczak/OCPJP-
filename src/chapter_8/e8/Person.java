import java.util.*;
class Person{
	public static void main(String argsp[]){
		boolean b2, b;
		int i;
		String s, hits = " ";
		String hits2 = " ";
		String example = "as1 w21we a3a asd 123 True true 0.5";
		Scanner s1 = new Scanner(example);
		Scanner s2 = new Scanner(example);
		while(b = s1.hasNext()) {
			s = s1.next(); 
			hits += "s";
		}
		while(b = s2.hasNext()) {
			if(s2.hasNextInt()) {
			 	s2.nextInt(); hits2 += "i";
			} else if(s2.hasNextBoolean()) {
				b2 = s2.nextBoolean(); hits2 += "b";
			} else {
				s2.next(); hits2 += "s2";
			}
		}	
		System.out.println("hits " + hits);
		System.out.println("hits2 " + hits2);
	}
}
