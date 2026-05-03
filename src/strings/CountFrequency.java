package strings;
import java.util.*;
public class CountFrequency {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string:");
	String str = sc.nextLine();
	
	for(int i=0; i<str.length();i++) {
		int sum = 0;
		char current = str.charAt(i);
		
		// check if already exist 
		boolean count = false;
		for(int k=0; k<i; k++) {
			if(current == str.charAt(k)){
				count = true;
				break;
			}
		}
		if(count) {
			continue;
		}
		 // count frequency
		for(int j=0; j<str.length(); j++) {
			if(current == str.charAt(j)) {
				sum++;
			}	
		}
		System.out.println(current +": "+ sum);
		}
	}
}
