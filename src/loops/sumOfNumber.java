package loops;
import java.util.*;
public class sumOfNumber {
public static void main(String[] args) {
	// Print the sum of first "n" number
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number:");
	int num = sc.nextInt();
	int sum=0;
	
	for(int i=1;i<=num;i++) {
		sum+=i;
	}
	System.out.print(sum);
}
}
