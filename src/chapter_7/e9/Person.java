import java.io.*;
class Person{
	public static void main(String args[]){
	// Will it compile? If not, how many errors?
		try{}catch(Exception e){}
		try{}catch(NullPointerException e){}
		try{}catch(IOException e){}
	}

	public static void test(){
		throw new NullPointerException();
	}
	public static void test2(){
		throw new Exception();
	}
	public static void test3(){
		throw new IOException();
	}
}
