package basic_InJava;

import java.util.*;
public class conditional_Statements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.print("Adult");
		}
		else {
			System.out.print("Not adult");
		}
	}
}
