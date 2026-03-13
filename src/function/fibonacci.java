package function;
import java.util.*;
public class fibonacci 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of terms:");
		int num = sc.nextInt();
		int a=0, b=1;
		System.out.print("Fibonacci series: ");
		for(int i=0; i<num; i++) 
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		
		}
	}

}
