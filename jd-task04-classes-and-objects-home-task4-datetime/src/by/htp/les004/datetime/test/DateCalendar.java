package by.htp.les004.datetime.test;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateCalendar {
	public static void main(String args[]) {
		
		Calendar calendar=new GregorianCalendar();
		
		calendar.set(Calendar.HOUR, 10);
		   calendar.set(Calendar.MINUTE, 42);
		   calendar.set(Calendar.SECOND, 12);
		System.out.println(calendar.getTime());
	
	
	
	
	

}
}