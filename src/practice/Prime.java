package Practice;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int key = 0;

        for (int i = 2; i < (num / 2); i++) {
            if (num % i == 0) {
                // Not prime
                key = 1;
            }
        }

        if (key == 0)
            System.out.println("prime");
        else
            System.out.println("Not prime");
    }
}