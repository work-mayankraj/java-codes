package Practice;
import java.util.*;

public class Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] pos = new int[n];

        // input
        System.out.print("Enter positions: ");
        for(int i = 0; i < n; i++) {
            pos[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        // count even and odd positions
        for(int i = 0; i < n; i++) {
            if(pos[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        int cost;
        if(even < odd) {
            cost = even;
        } else {
            cost = odd;
        }

        System.out.println("Minimum cost: " + cost);
    }
}