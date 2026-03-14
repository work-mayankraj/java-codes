package arrays;
import java.util.*;
public class countNumber {
	public static void main(String[] args) {
		//How Many Numbers Are Smaller Than the Current Number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Enter Key : ");
		int key = sc.nextInt(); 
		int count=0;
		for(int i=0; i<size; i++) {
			if(arr[i]<key) count++;
		}
		System.out.print("Numbers Are Smaller Than the Current Number"+count);
	}

}
