package pattern;
import java.util.*;
public class halfPyramidWithNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	
	for(int i=0 ; i<num; i++) {
		int a=1;
		for(int j=0; j<=i; j++) {
			System.out.print(a);
			a++;
		}	
		System.out.print("\n");
	}
	System.out.print("\n");
// inverted half pyramid with numbers
	
	for(int i=0; i<num; i++) {
		int a=1;
		for(int j=0; j<(num-i); j++) {
			System.out.print(a);
			a++;
		}
		System.out.print("\n");
	}
}
}
