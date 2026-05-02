package strings;
import java.util.*;
public class WhiteSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
	
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch!=' ') {
				sb.append(ch);
			}
		}
		System.out.println("Original String : "+ str);
		System.out.println("Modified String : "+ sb);
		
	}
}
