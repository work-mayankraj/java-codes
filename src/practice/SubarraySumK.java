package Practice;
import java.util.*;

public class SubarraySumK {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int k = 2;

        int currentSum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k);
            }

            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        System.out.println("Number of subarrays: " + count);
    }
}