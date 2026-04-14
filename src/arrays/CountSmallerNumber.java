package arrays;
import java.util.*;
public class CountSmallerNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println("Enter array elements :");
		
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter key element :");
		int key = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<size; i++) {
			if(key >= arr[i]) count+=1;
		}
		System.out.print("Number less than "+key+ " are : "+count);
		
	}
}
