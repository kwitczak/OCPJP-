class Class{
	public static void main(String args[]){
		
		outer:
		int age = 0;
		while(age <= 21){
			age++;
			if (age > 16){
				System.out.println("Get Your driver's license");
				continue outer;
			}else{
				System.out.println("Another year");
			}
		}
	}
}
