package string;
import java.util.*;
public class convertUppercase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string:");
		String str = sc.nextLine();
		
		StringBuilder str1 = new StringBuilder(str);
		
		for(int i=0; i<str.length();i++) {
			char ch = str1.charAt(i);
			
			if(ch>='a' && ch<='z') {
				str1.setCharAt(i,(char)(ch-32));
			}
		}
		System.out.print(str1);
		
	}
}
