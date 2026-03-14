package arrays;
import java.util.*;
public class diagonalSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Matrix Diagonal Sum
		
		System.out.print("Enter matrix row size: ");
		int row = sc.nextInt();
		System.out.print("Enter matrix column size: ");
		int column = sc.nextInt();
		
		if(row!=column) System.out.print("Not a square matrix (Row==Column)");
		
		else {
			int arr[][] = new int[row][column];
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int sum=0;
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					if(i==j) sum += arr[i][j];  
				}
			}
			System.out.print("Sum of diagonal of a matrix : "+sum);
			
		}
		
	}
}
	
