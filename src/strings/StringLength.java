package strings;
import java.util.*;
public class StringLength {
	
	public static void main(String[] args) {
		String str = "Hello";
		
		int count = 0;
// toCharArray()
		for(char c: str.toCharArray()) {
			count++;
		}
		System.out.print("Length of string :"+count);
	}
}

