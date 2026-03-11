package basic_InJava;
import java.util.*;
public class calculatorSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter first number: ");
		int b = sc.nextInt();
		
		System.out.print("Enter a choice \n 1. sum \n2. difference \n3. multiply \n4. divide ");
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			int sum=a+b;
			System.out.print(sum);
			break;
		 case 2:
			int difference=a-b;
			System.out.print(difference);
			break;
		case 3:
			int multiply=a*b;
			System.out.print(multiply);
			break;
		case 4: 
			int divide=a/b;
			System.out.print(divide);
			break;
		default: 
			System.out.println("Invalid choice");
			break;
		}
		
	}
}
