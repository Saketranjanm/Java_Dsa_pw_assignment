//1.program to display current date and time in java

package apiandannotation;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date  = LocalDate.now();
		System.out.println("date :" + date);
		
		LocalTime time = LocalTime.now();
		System.out.println("time : " + time);
	}

}
