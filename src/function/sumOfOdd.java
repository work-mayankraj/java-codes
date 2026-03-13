package function;
import java.util.*;
public class sumOfOdd {
// Write a program to print sum of all odd number from 1 to n
	public static int odd(int num) {
		int a=1;
		int total=0;
		for(int i=1; i<=num; i+=2) {
			total+=i;
		}
		return total;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int a=1;
		int sum = odd(num);
		System.out.print("sum = " +sum);
	}
}
