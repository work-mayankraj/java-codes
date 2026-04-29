package string;
import java.util.*;
public class Practice {

	public static void main(String[] args) {
		String str = "Rajaram";
		String str2 = new String("Rajaram");
		
		/*if(str.equalsIgnoreCase(str2)) {
			System.out.println("Values are equal");
		}
		else {
			System.out.println("Values are not equal");
		}*/
		
		// Length
		int length = str.length();
		System.out.println("Length = " +length);
		
		//character access
		int firstChar = str.charAt(0);
		int lastChar = str.charAt(length-1);
		System.out.println("First character = "+firstChar +" and last char = " +lastChar);
		 
		// Substring
		String sub_string = str.substring(0,5);
		System.out.println("Substring = "+sub_string);
		
		//Uppercase, lowercase
		String upper = str.toUpperCase();
		String lower = str.toLowerCase();
		System.out.println("Upper case convert = "+upper);
		System.out.println("Lower case convert = "+lower);
		
		// Concatenation
		String one = "Radhe";
		String two = "Radhe";
		String join = one + two;
		// first method
		System.out.println(join);
		// second method
		String greet = one.concat("".concat(two));
		System.out.println("Greet = "+greet);
		
		// charAt
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		
		// start and end
		System.out.println(str.endsWith("ram"));
		 
		// index of
		
	 	
		
	}
}
