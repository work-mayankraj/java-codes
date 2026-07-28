package arrays;
import java.util.*;
public class MaximumProduct {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter string size: ");
		int size = sc.nextInt();
		
		System.out.println("Enter elements in the array: ");
		int arr[] = new int [size];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		int secondLargest =Integer.MIN_VALUE; 
		int largest = Integer.MIN_VALUE;
		
		for(int i=0; i<size; i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest) {
				secondLargest =arr[i];
			}
		}
		int maxProduct = (largest-1)*(secondLargest-1);
		System.out.println("Max Product is : "+ maxProduct);
		
	}
}
