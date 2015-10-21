class Person{
	public static void main(String args[]){
		int a = 1;
		if (a-- > 0) a++;
		if (a == 1){}
		else
		a = 0;
// What will be the a?
System.out.println(a);
}
}
