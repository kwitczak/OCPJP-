import java.util.regex.*;
class Person{
	public static void main(String args[]){
		doRegex("\\B", "#ab de#");
		System.out.println("===");
		doRegex("0[xX][0-9a-fA-F]", "0x4 0XC 0xc1");
		System.out.println("===");
		doRegex("0[xX][0-9a-fA-F]+", "0x4 0XC 0xc1");
		System.out.println("===");
		doRegex("0[aA]", "000A0aa0A");
		System.out.println("===");
		doRegex("0+[aA]", "000A0aa0A");
		System.out.println("===");
		doRegex("01+[aA]", "01A001a011a0A");
		System.out.println("===");
		doRegex("(01)+[aA]", "01A001a011a0A");
		System.out.println("===");
		doRegex(".*xx", "yyxxxyxx");
		System.out.println("===");
		doRegex(".*?xx", "yyxxxyxx");
		System.out.println("===");
		doRegex("a?", "aba");
	}

	public static void doRegex(String myPattern, String myExample){
		Pattern p = Pattern.compile(myPattern);
		Matcher m = p.matcher(myExample);
		
		System.out.println("Look for " + m.pattern());
		System.out.println("In example: " + "\n" + myExample);
		System.out.println("01234567890123456789");
		while(m.find()){
			System.out.print(m.start() + "/" + m.end() + " " + m.group() + "\n");
		}
		System.out.println();
	} 
}
