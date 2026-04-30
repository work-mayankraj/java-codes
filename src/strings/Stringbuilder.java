package strings;
import java.util.*;
public class Stringbuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append("Java");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" is a programming language");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
	}
}
