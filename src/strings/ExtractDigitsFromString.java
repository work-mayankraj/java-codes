package strings;
import java.util.*;
public class ExtractDigitsFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch > '0' && ch < '9') {
				sb.append(ch);
			}
		}
		System.out.println("Original String : ");
		System.out.println("Digits in string are: "+sb );
	}
}
