package strings;
import java.util.*;
public class CountFrequency1 {

	public static void mian(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		
		System.out.println("Frequency = ");
		
		for(int i =0; i<str.length(); i++) {
			char current = str.charAt(i);
			int count = 0;
			
			// Check if a already counted
			boolean alreadyCounted = false;
			for(int k=0 ; k<i ; k++) {
				if(str.charAt(k)==current) {
					alreadyCounted=true;
					break;
				}
			}
			if(alreadyCounted) {
				continue;
			}
			
			// count frequency
			for(int j=0; j<str.length();j++) {
				if(str.charAt(j) == current) {
					count++;
				}
			}
			System.out.println(current + ": "+count);
		}
	}
}
