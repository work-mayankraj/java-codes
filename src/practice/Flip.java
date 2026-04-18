package Practice;
import java.util.*;
public class Flip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter row and column of matrix: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		 
		int[][] arr = new int[row][col];
		System.out.print("Enter elements of matrix: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			
			int left =0;
			int right = col-1;
		// SWAP AND REVERT
			while(left<=right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				left++;
				right--;
			}
		}
		
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
