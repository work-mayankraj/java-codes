package Practice;
import java.util.*;
public class ArrayOfPermutation {
/*“Given an array representing a permutation, create a new array such that each element
at index i is replaced by the value at index arr[i] of the original array.” */ 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter array size:");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] =  sc.nextInt();
			if(arr[i]>=size) System.out.println("Invalid range");
		}
		int[] ans = new int[size];
		for(int i=0; i<size; i++) {
			ans[i] = arr[arr[i]];
		}
		
		System.out.print(Arrays.toString(ans));
	}
}
