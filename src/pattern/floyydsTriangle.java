package pattern;
import java.util.*;
public class floyydsTriangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number:");
	int num = sc.nextInt();
	int a=1;
	
	for(int i=0; i<num; i++) {
		for(int j=0; j<=i; j++) {
			System.out.print(a+" ");
			a++;
		}
		System.out.print("\n");
	}
	
}
}
