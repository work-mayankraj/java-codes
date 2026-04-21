package arrays;
import java.util.*;
public class Pivot_Index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Take array elements
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call function
        int result = pivotIndex(nums);

        // Output result
        System.out.println("Pivot Index: " + result);

        sc.close();
    }

    public static int pivotIndex(int[] nums) {
        int total = 0;

        // Calculate total sum
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == total - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}