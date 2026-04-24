package strings;
import java.util.*;
public class Lower_to_Upper_case {

	public static void main(String[] args) {
		
		String str = "Hello";
		String result = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			// check if lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        System.out.println("Uppercase String: " + result);
	}
}
