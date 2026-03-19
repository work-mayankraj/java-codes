package arrays;
import java.util.*;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        System.out.print("Enter digits: ");
        for(int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // 🔥 Plus One Logic (inside main)
        int carry = 1; // we need to add 1

        for(int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;

            if(sum < 10) {
                digits[i] = sum;
                carry = 0;
                break; // no more carry
            } else {
                digits[i] = 0;
                carry = 1;
            }
        }

        // If carry still remains → all digits were 9
        if(carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;

            // print new array
            for(int x : result) {
                System.out.print(x + " ");
            }
        } else {
            // print modified original array
            for(int x : digits) {
                System.out.print(x + " ");
            }
        }
    }
}