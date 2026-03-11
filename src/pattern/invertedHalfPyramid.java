package pattern;
import java.util.*;
public class invertedHalfPyramid {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	
	for(int i=0; i<n; i++) {
		for(int j=0; j<(n-i);j++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
// inverted with rotated half pattern
	for(int i=0; i<n; i++) {
		for(int j=0; j<n; j++) {
			if(n%2==0) {
				if((i+j)<=(n/2)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			else {
				if((i+j)<=((n/2))+1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
			}
		}
	}
		System.out.print("\n");
}
}
}

