class PrivateGuy{
	private String privateName = "I'm secret";
	public static void main(String args[]){
		PrivateGuy pg2 = new SecretGuy();
		System.out.println(pg2.privateName);
	}
}

class SecretGuy extends PrivateGuy{
}
