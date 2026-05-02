package strings;

import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

	public static void main(String[] args) {

		// Get current date
		LocalDate today = LocalDate.now();

		// Create formatter
		DateTimeFormatter format = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

		// Format date into string
		String formattedDate = today.format(format);

		// Print result
		System.out.println("Today's date: " + formattedDate);
		
	}
}
