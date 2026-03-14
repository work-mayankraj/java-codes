package arrays;
import java.util.*;
public class arrayOfpermutation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// Array of permutation
	System.out.print("Enter array size : ");
	int size = sc.nextInt();
	
	System.out.print("Enter elements : ");
	int arr[] = new int[size];
	for(int i=0; i<size; i++) {
		arr[i] = sc.nextInt();
	}
	int num = 0;
	int ans[] = new int[size];
	for(int i=0; i<size; i++) {
		num = arr[i];
		ans[i] = arr[num];
	}
	for(int i=0; i<size; i++) {
		
		System.out.print(ans[i]+" ");
	}
}
}
