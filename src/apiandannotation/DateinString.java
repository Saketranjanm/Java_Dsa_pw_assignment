//2. program to convert date to a string in format "DD/MM/YYYY"
package apiandannotation;

import java.time.LocalDate;

public class DateinString {

	public static void main(String[] args) {
		LocalDate date  = LocalDate.now();
		
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		System.out.println("Date : "+ day + "/" + month + "/" + year);

	}

}
