package pattern;
import java.util.*;
public class pattern1 {
public static void main(String [] args) {
	// rectangular star box
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	
	for(int i=0;i<n;i++) {
		for(int j=0; j<n; j++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
}
}
