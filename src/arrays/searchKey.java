package arrays;
import java.util.*;
public class searchKey {
public static void main(String[] args) {
// Take an array as input from the user. Search for a given
// number x and print the index at which it occurs.
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of array: ");
	int size = sc.nextInt();
	System.out.print("Enter key value: ");
	int key = sc.nextInt();
	int arr[] = new int[size];
	int found =0;
	System.out.print("Enter array element:  ");
	
	for(int i=0; i<size; i++) {
		arr[i] = sc.nextInt();
	}
	int i=0;
	for(i=0; i<size; i++) {
		if(arr[i]==key) {
			found=1;
			break;
		}
	}
	if(found==1) System.out.print("found at position "+(i+1));
	else System.out.print("not found");
}	
}
