package function;
import java.util.*;
public class armstrong {
//   153 = 1^3 + 5^3 + 3^3 = 1+125+27
// Find armstrong number between two number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int digits=0;
		for(int i=num; i>0; i/=10) {
			digits++;
		}
		int sum=0, rem=0;
		for(int i=num;i>0;i/=10) {
			rem = i%10;
			sum += Math.pow(rem, digits);
		}
		if(sum==num) System.out.print("Given number is Armstrong");
		else System.out.print("Given number is not Armstrong");
		
	}
}
