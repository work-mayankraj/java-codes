package string;
import java.util.*;
public class countVowel {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		StringBuilder str1 = new StringBuilder(str);
		int count = 0;
		
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
