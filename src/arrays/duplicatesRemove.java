package arrays;
import java.util.*;

public class duplicatesRemove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter sorted array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if(n == 0) {
            System.out.println("Unique count: 0");
            return;
        }

        int i = 0; // pointer for unique elements

        for(int j = 1; j < n; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        int k = i + 1;

        System.out.println("Unique count: " + k);

        System.out.print("Array after removing duplicates: ");
        for(int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}