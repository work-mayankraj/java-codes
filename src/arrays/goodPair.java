package arrays;
import java.util.*;
public class goodPair {
	public static void main(String[] args) {
		// Number of Good Pairs
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]==arr[j]) {
					System.out.println((+i+","+j));
				}
			}
		}
		
	}
}
