package strings;
import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();
        int maxLength = 0;

        // Try every starting point
        for (int i = 0; i < n; i++) {

            boolean[] visited = new boolean[256]; // ASCII

            int currentLength = 0;

            for (int j = i; j < n; j++) {

                char ch = str.charAt(j);

                if (visited[ch]) {
                    break; // duplicate found → stop this substring
                }

                visited[ch] = true;
                currentLength++;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);

        sc.close();
    }
}