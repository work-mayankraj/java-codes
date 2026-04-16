package Practice;
import java.util.*;
public class Transpose {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of matrix: ");
		int size = sc.nextInt();
		
		System.out.println("Enter array elements: ");
		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Transpose of given matrix is: ");
		int temp=0;
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(j>i) {
					temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		for(int i = 0; i < size; i++) {
		    for(int j = 0; j < size; j++) {
		        System.out.print(arr[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}
