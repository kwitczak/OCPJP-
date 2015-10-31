import java.util.*;
import java.text.*;
class Person {
	public static void main(String args[]){
		Date d = new Date();
		DateFormat[] df = new DateFormat[6];
		df[0] = DateFormat.getInstance();
		df[1] = DateFormat.getDateInstance();
		df[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		df[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		df[4] = DateFormat.getDateInstance(DateFormat.LONG);
		df[5] = DateFormat.getDateInstance(DateFormat.FULL);

		for (DateFormat dd: df)
			System.out.println(dd.format(d));

		try{
			Date d2 = df[1].parse(df[4].format(d));
			System.out.println("Parse result: " + d2);
		} catch (ParseException e){
			System.out.println("Couldn't parse!");		
		}
	}
}
