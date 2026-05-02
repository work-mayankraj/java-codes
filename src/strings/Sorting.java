package strings;
import java.util.*;
public class Sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		char ch[] = str.toCharArray();
		
		Arrays.sort(ch);
		
		String sorted = new String(ch);
		
		System.out.println("Sorted array : "+sorted);
	}
}
