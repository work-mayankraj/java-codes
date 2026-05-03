package strings;
import java.util.*;
public class RotationManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		System.out.println("Enter number of positions: ");
		int num = sc.nextInt();
		
		System.out.println("Choose left or right [0/1]: ");
		int direction = sc.nextInt();
		
		System.out.println("Output: ");
		StringBuilder sb = new StringBuilder();
			if(direction==0) {
				for(int j=num ; j<str.length();j++) {
					sb.append(str.charAt(j));
				}for(int k=0 ; k<num; k++) {
					sb.append(str.charAt(k));
				}
			}
			else if(direction==1) {
				for(int j=str.length()-num; j<str.length(); j++) {
					sb.append(str.charAt(j));
				}for(int k =0; k<str.length()-num;k++) {
					sb.append(str.charAt(k));
				}
			}
			else {
				System.out.println("You entered wrong position");
			}
			System.out.println(sb.toString());
	}
}
