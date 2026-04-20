package arrays;
import java.util.*;
public class MaximumSubarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size]; 
		System.out.println("Enter array elements :");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int CurrentSum=0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<size; i++) {
			CurrentSum+=arr[i];
			
			if(CurrentSum > maxSum) {
				maxSum=CurrentSum;
			}
			
			if(CurrentSum < 0) {
				CurrentSum = 0;
			}
		}
		System.out.println("Maximu Subarray Sum :"+maxSum)
		;
		
	}
}
