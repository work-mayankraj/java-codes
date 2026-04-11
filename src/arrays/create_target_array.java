package arrays;
import java.util.*;
public class create_target_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of nums array: ");
	int n = sc.nextInt();
	
	int[] num = new int[n];
	int[] ind = new int[n];
	
	int[] result = new int[n];
	for(int i=0; i<n; i++) {
		if(ind[i]==i) {
			result[i] = num[i];
		}
		else {
			for(int j=nums-1; j>(nums-i-1); j++) {
				num[j]=num[j-1];
			}
			result[nums-i-1]=num[i] ;
		}
	}
	
}
}
