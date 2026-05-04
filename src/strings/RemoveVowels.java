package strings;
import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
				sb.append(ch);
			}
		}
		System.out.println("Result : "+sb);
		
	}
}
