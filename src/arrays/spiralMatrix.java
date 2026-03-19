package arrays;
import java.util.*;
public class spiralMatrix {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Row of matrix  : ");
	int row = sc.nextInt();
	
	System.out.print("Enter Column of matrix  : ");
	int column = sc.nextInt();
	
	System.out.print("Enter array elements : ");
	int arr[][] = new int [row][column];
	
	for(int i = 0; i < row ; i++) {
		for(int j=0; j<column; j++) {
			arr[i][j] = sc.nextInt();	
		}
	}
	int top = 0;
	int bottom = row-1;
	int left = 0;
	int right = column-1;
	
	int result[] = new int[row*column];
	int k=0;
	
	while(top <= bottom && left <= right) {
	// 1. left to right
		for(int i=left; i<=right; i++) {
			result[k++] = arr[top][i];
		}
		top++;
	// top to bottom
		for(int i=top; i<=bottom; i++) {
			result[k++]=arr[i][right];
		}
		right--;
	// right to left
		if(top<=bottom) {
			for(int i=right; i>=left; i--) {
				result[k++]=arr[bottom][i];
			}
		}
		bottom--;
	// bottom to top
		if (left <= right) {
            for (int i = bottom; i >= top; i--) {
            	result[k++] = arr[i][left];
            }
            left++;	
		}
	}
	for(int i=0; i<result.length;i++) {
		System.out.print(result[i]+" ");
	}
	
}

}
