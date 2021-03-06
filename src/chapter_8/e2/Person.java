import java.util.*;
class Person{
	public static void main(String args[]){
	Calendar cal = Calendar.getInstance();
	System.out.println(cal.getTime());

	Date date = new Date(100000);
	cal.setTime(date);
	System.out.println(cal.getTime());

	System.out.println(cal.getFirstDayOfWeek());
	System.out.println(cal.getFirstDayOfWeek() == Calendar.SUNDAY);
	System.out.println(cal.get(Calendar.DAY_OF_WEEK));
	cal.add(Calendar.MONTH, 1);

	Date date2 = cal.getTime();
	System.out.println(date2);

	cal.roll(Calendar.MONTH, 11);
	Date date3 = cal.getTime(); 
	System.out.println(date3);
	}

}
