package arrays;
import java.util.*;
public class RunningSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array :");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum=0;
		System.out.print("Output :");
		for(int i=0; i<size; i++) {
			sum +=arr[i];
			System.out.print(sum +" ");
		}
	}
}
