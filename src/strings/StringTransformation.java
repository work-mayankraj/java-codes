package strings;
import java.util.*;
public class StringTransformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		String word[] = str.split("\\s+");
		String s1 = word[0];
		String s2 = word[1];
		String s3 = word[2];
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch == 'a' ||  ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
				ch = '%';
				sb.append(ch);
			}
			else {
				sb.append(ch);
			}
		}
		for(int i=0; i<s2.length(); i++) {
			char ch = s2.charAt(i);
			if(ch != 'a' &&  ch != 'e' && ch != 'i'&& ch != 'o'&& ch != 'u') {
				ch = '#';
				sb.append(ch);
			}
			else {
				sb.append(ch);
			}
		}
		s3 = s3.toUpperCase();
		sb.append(s3);
		
		System.out.println("Output : "+sb);
	}
}
