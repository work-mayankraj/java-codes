package function;
import java.util.*;
public class hcf {
	public static int findhcf(int a, int b) {
		int hcf=1;
		for(int i=1; i<=a && i<=b; i++) {
			if(a % i==0 && b % i==0)
				hcf=i;
		}
		return hcf;
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int a = sc.nextInt();
	
	System.out.print("Enter second number: ");
	int b = sc.nextInt();
	
	int result = findhcf(a,b);
	System.out.print("hcf = "+result);
	
}
}
