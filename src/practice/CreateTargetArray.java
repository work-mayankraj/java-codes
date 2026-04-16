package Practice;
import java.util.*;

public class CreateTargetArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        
        int[] nums = new int[size];
        int[] index = new int[size];
        
        System.out.print("Enter nums elements: ");
        for(int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        
        System.out.print("Enter index elements: ");
        for(int i = 0; i < size; i++) {
            index[i] = sc.nextInt();
        }
        
        int[] ans = new int[size];
        
        for(int i = 0; i < size; i++) {
            // shift only till index[i]
            for(int j = size - 1; j > index[i]; j--) {
                ans[j] = ans[j - 1];
            }
            ans[index[i]] = nums[i];
        }
        
        System.out.println(Arrays.toString(ans));
    }
}