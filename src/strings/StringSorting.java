package strings;
import java.util.*;
public class StringSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		
		for(int i=0; i<str1.length(); i++) {
			for(int j=i+1; j<str1.length(); j++) {
				if(ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		String result = new String(ch);
		System.out.println("Sorted string = "+result);
	}
}
