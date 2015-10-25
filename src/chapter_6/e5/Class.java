class Class{
	public static void main (String args[]){
        System.out.println("EX1===");
	int a = 0;
	int b = 0;
	System.out.println((a == 0 || b == 0 | ++a > 0));
	System.out.println(a);
	System.out.println(b);

        System.out.println("EX2===");
	a = 0;
	b = 0;
	System.out.println((a == 0 && a == 1 & ++a > 0));
	System.out.println(a);
	System.out.println(b);

       System.out.println("EX3===");
	a = 0;
	b = 0;
	System.out.println((a == 0 && ++a == 1 | ++a > 0));
	System.out.println(a);
	System.out.println(b);
}	
}
