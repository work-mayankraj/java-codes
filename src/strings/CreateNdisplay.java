package strings;
import java.util.*;
public class CreateNdisplay {

	public static void mian(String[] args) {
		Scanner input = new Scanner(System.in);
		// Read input from user
		System.out.print("Enter a line of text");
		String str = input.nextLine();
		
		// Create a String using double quotes
		String str1 = str;
		
		// Create a String using the new keyword
		String str2 = new String(str);
			
		// Display both strings
		System.out.print("String created using double quotes: "+str1);
		System.out.println("String created using new keyword: " + str2);

        // TODO: Compare references using '=='
        boolean isEqual = str1 == str2;

        // TODO: Compare contents using 'equals()'
        boolean isEquals = str1.equals(str2);

        // TODO: Display the results
        System.out.println("Are the two strings equal by '=='? " + isEqual);
        System.out.println("Are the two strings equal by 'equals()'? " + isEquals);

        input.close();
	
	}
}
