package string;
import java.util.*;
public class StringBuilderBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st string: ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter 2nd string: ");
		String s2 = sc.nextLine();
		
		System.out.println("Enter 3rd string:");
		String s3 = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		
		System.out.println(sb);
		sb.append(s2);
		
		
		System.out.println(sb);
		sb.append(s3);
		System.out.println(sb);
		
	}
}
