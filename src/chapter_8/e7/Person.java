
class Person{
	public static void main(String[] args){
		String[] tokens = "asd1aeqw1 341da ewq 4 qwe".split("\\d");
		for(String s : tokens)
			System.out.println("'" + s + "'");
	}
}
