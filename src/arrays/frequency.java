package arrays;
import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        int[] freq = new int[n];

        // Initialize frequency array with -1
        for(int i = 0; i < n; i++) {
            freq[i] = -1;
        }

        // array input
        System.out.print("Enter array element: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // frequency logic
        for(int i = 0; i < n; i++){
            if(freq[i] == -1){
                int count = 1;

                for(int j = i + 1; j < n; j++){
                    if(nums[i] == nums[j]){
                        count++;
                        freq[j] = 0;   // mark duplicate
                    }
                }

                freq[i] = count;  // assign after loop
            }
        } 

        // print result
        System.out.println("\nElement  Frequency");
        for(int i = 0; i < n; i++) {
            if(freq[i] != 0) {
                System.out.println(nums[i] + "        " + freq[i]);
            }
        }
    }
}