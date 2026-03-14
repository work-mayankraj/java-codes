package arrays;
import java.util.*;
public class tranposeMatrix {
	public static void main(String[] args) {
		//Transpose of a Matrix
		Scanner sc = new Scanner(System.in);
		
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
			int temp=0;
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					if(i<j ) {
						temp=arr[i][j];
						arr[i][j]=arr[j][i];
						arr[j][i]=temp;
					}
				}
			}
			for(int i=0; i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}

}
}
