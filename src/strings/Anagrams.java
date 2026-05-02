package strings;
import java.util.*;
public class Anagrams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second string: ");
		String str2 = sc.nextLine();
		
		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		String str1New = new String(ch1);
		String str2New = new String(ch2);
		
		if(str1New.equals(str2New)) {
			System.out.println("String are Anagrams :)");
		}
		else System.out.println("String are NOT anagrams :(");
	}
}
