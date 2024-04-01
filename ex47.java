// Write a Java program to display the current date and time in a specific format.
// 

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class ex47 {

	public static void main(String args[]) {
		// Create a SimpleDateFormat with a specific date and time format
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		
		// Set the time zone for the calendar to GMT
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		// Display the current date and time in the specified format
		System.out.println("\nNow: " + cdt.format(System.currentTimeMillis()));
	}
}