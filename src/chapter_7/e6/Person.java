class Person{
	public static void main(String args[]){
		assert(true):doSomething();
		assert(true):doNothing();
		assert(false):doNothing();
		
	}

	static void doNothing(){
	
	}

	static String doSomething(){
		return "Something";
	}
}
