class Person{
	public static void main(String args[]){
		try(A a = new A()){
			throw new Exception("E1");
		} catch (Exception e){
			// Supressed E1, or E1?
			e.printStackTrace();
			System.out.println("It's catchy");
		} finally {
			System.out.println("Finally!");		
		}
	}
}

class A implements AutoCloseable {
	public void close() throws Exception{
		System.out.println("I'm being closed!");
		throw new Exception("E2");
	}
}
