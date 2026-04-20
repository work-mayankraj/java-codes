package arrays;
import java.util.*;
public class ArrayInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array :"); 
		int size = sc.nextInt();
		
		System.out.print("Enter array elements: ");
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		for(int i=0; i<size; i++) {
			sum = sum*10 + arr[i];
		}
		
		System.out.println("Enter key value :");
		int key = sc.nextInt();
		
		sum+=key;
		// String to Array
		int count=0;
		for(int i=sum; i>0; i/=10) {
			count++;
		}
		
		int[] result = new int[count];
		// Fill array from back
		for(int i=count-1; i>=0; i--) {
			result[i] = sum % 10;
			sum /= 10;
		}
		System.out.print("Output = ");
		for(int i=0; i<count; i++) {
			System.out.print(result[i]);
		}
		
	}
}
