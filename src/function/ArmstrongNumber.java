package function;
import java.util.*;
public class ArmstrongNumber { // armstong -> 153 = 1^3 + 5^3 + 3^3
	public static int armstrong(int num){
		int count =0;
		for(int i=num ; i > 0; i/=10) {
			count++;
		}
		int sum=0;
		int rem;
		for(int j =num; j>0 ; j/=10) {
			rem = j%10;
			sum += Math.pow(rem,count);
		}
		return sum; 
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		int ans = armstrong(num);
		
		if(num==ans) System.out.print("Armstrong");
		else System.out.print("Not Armstrong");
	}
}
