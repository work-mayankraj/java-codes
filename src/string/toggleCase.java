package string;
import java.util.*;
public class toggleCase {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		StringBuilder str1 = new StringBuilder(str);
		
		for(int i=0; i<str.length();i++) {
			char ch = str1.charAt(i); 
			
			if(ch>='a'&& ch<='z') // lowercase -> uppercase
			{ 
				str1.setCharAt(i,(char)(ch-32));
			}
			else // upper case -> lowercase
			{ 
				str1.setCharAt(i,(char)(ch+32));
			}
		}
		System.out.print(str1);
		
	}
}
