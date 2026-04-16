package Practice;
import java.util.*;
public class DiagonalSum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of matrix :");
		int size = sc.nextInt();
		int arr[][] = new int[size][size];
		
		System.out.println("Enter array elements :");
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum=0;
		for(int i=0; i<size; i++) {
			for(int j=0 ;j<size; j++) {
				if(i==j) sum+=arr[i][j];
			}
		}
		System.out.println("Sum of Diagonal elements are: "+sum);
	}
}
