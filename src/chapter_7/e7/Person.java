import java.io.*;
import java.sql.*;

// This example won't compile in J6
class Person {
	public static void main(String args[]) throws IOException, SQLException{
		
		try {
			throwSome();
		} catch(Exception e){
			throw e;

		}	
	}

	public static String throwSome() throws IOException, SQLException {
		return "Nothing";
	}
}
