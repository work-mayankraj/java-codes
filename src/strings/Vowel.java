package strings;
import java.util.*;
public class Vowel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = input.nextLine();
		String strNew = str.toLowerCase();
		System.out.println("String = "+strNew);
		
		char ch[] = strNew.toCharArray();
		int count =0;
		
		for(int i = 0; i < str.length() ; i++) {
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i'  || ch[i] == 'o'  || ch[i] == 'u') {
				count++;
			}
		}
		System.out.println("Vowles = "+count);
		
	}
}
