package Practice;
import java.util.*;
public class ZeroEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.print("Enter elements :");
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		int k=0;
		int[] arr2 = new int[num];
		for(int j=0; j<num; j++) {
			if(arr[j]!=0) {
				arr2[k] = arr[j];
				k++;
			}
		}
		System.out.print("Array after moving all zeros at end :");
		for(int j=0; j< num; j++) {
			System.out.print(arr2[j] + " ");
		}
	
	}

}
