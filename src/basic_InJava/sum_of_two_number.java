package basic_InJava;

import java.util.*;
public class sum_of_two_number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		
		int sum=a+b;
		
		System.out.print("sum = "+sum);
		
	}
}
