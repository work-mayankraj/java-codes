package strings;
import java.util.*;
public class Comparison {
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        // Taking input 3 times
	        System.out.print("Enter first string: ");
	        String str1 = input.nextLine();

	        System.out.print("Enter second string: ");
	        String str2 = input.nextLine();

	        System.out.print("Enter third string: ");
	        String str3 = input.nextLine();

	        // Using different ways of creating strings
	        String s1 = str1;                  // Direct assignment
	        String s2 = new String(str2);      // Using new keyword
	        String s3 = str3;                  // Another normal string

	        // Display strings
	        System.out.println("\n--- Strings Entered ---");
	        System.out.println("s1: " + s1);
	        System.out.println("s2: " + s2);
	        System.out.println("s3: " + s3);

	        // Comparing strings
	        System.out.println("\n--- Comparisons ---");

	        // Reference comparison
	        System.out.println("s1 == s2 : " + (s1 == s2));

	        // Content comparison
	        System.out.println("s1.equals(s2) : " + s1.equals(s2));

	        System.out.println("s1.equals(s3) : " + s1.equals(s3));
	 }
}
