class PrivateGuy{
	private String privateName = "I'm secret";
	public PrivateGuy(){
		System.out.println(privateName);
}
public static void main(String args[]){
	PrivateGuy pg = new PrivateGuy();
PrivateGuy pg2 = new SecretGuy();
System.out.println(pg.privateName);
System.out.println(pg2.privateName);
}
}

class SecretGuy extends PrivateGuy{
	public SecretGuy(){
		System.out.println();
}
public void PrivateGuy(){
System.out.println("Overriden");
}

}
