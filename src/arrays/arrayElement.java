package arrays;
import java.util.*;
public class arrayElement {
public static void main(String[] args) {
	// array initialisation :- [int marks[] = new int[3]]
	// type array name[] = new type[size]
	// for known array value -> known size
	// type array_name[]={1,2,3,4,5....}
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Size of array: ");
	int size = sc.nextInt();
	int number[] = new int[size];
	
	for(int i=0; i<size; i++) {
		number[i] = sc.nextInt();
	}
	
	for(int i=0; i<size; i++) {
		System.out.print(number[i]+" ");
	}
	
}
}
