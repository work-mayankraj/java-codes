package strings;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		// String to character array
		char ch[] = str.toCharArray();
		int length = str.length();
		
		// new Reverse array to match
		char rev[] = new char[length];
		for(int i = 0; i<length;i++) {
			rev[length-1-i] = ch[i];
		}
		System.out.println(rev);
		
		if(Arrays.equals(rev,ch)) {
			System.out.println("Strings is palindrom");
		}
		else {
			System.out.println("Strings is not palindrom");
		}
	}
}
