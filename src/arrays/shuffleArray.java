package arrays;
import java.util.*;
public class shuffleArray {
public static void main(String[] args) {
	// [x1,x2,...,xn,y1,y2,...,yn], Return the array in the form [x1,y1,x2,y2,...,xn,yn].
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter size: ");
	int size = sc.nextInt();
	
	System.out.print("Enter array elements: ");
	int[] arr = new int[size];
	int p=0;
	
	int[] result = new int[size];
	for(int i=0; i<size; i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0; i<size; i+=2) {
		result[i] = arr[p];
		result[i+1] = arr[(size/2)+p];
		p++;
	}
	System.out.print("required array: ");
	for(int i=0; i<size; i++) {
		System.out.print(result[i]+ " ");
	}
}
}
