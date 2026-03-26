package string;
import java.util.*;
public class stringLength {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string:");
	String str = sc.nextLine();
	
	System.out.println("Enter second string:");
	String str1 = sc.nextLine();
	
	String str2 = str + " " + str1;
	System.out.println(str2);
	System.out.println(str2.length());
}
}
