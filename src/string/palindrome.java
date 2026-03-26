package string;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		
		StringBuilder str1 = new StringBuilder(str);
		
		boolean checkPalindrome = true;
		
		for(int i=0; i<str.length()/2; i++) {
			if(str1.charAt(i) != str1.charAt(str.length()-1-i)) {
				checkPalindrome = false;
				break;
			}
		}
		
		if(checkPalindrome) {
			System.out.print("String is palindrome");
		}
		else {
			System.out.print("String is not palindrome");
		}
	}

}
