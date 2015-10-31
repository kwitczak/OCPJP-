import java.io.*;
import java.sql.*;
class Person{
	public static void main(String args[]){
		try{

		}catch(Exception e){
			e = new Exception();		
		}

		try{
			if(true)
			throw new IOException();
			throw new SQLException();

		}catch(SQLException | IOException e){
			e = new Exception();		
		}
	}
}
