package strings;
import java.util.*;

public class Formatting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter int value: ");
        long l = input.nextLong();

        System.out.println("Enter double value: ");
        double db = input.nextDouble();

        // Pass values inside format()
        System.out.println(String.format("Formatted integer: %,d", l));
        System.out.println(String.format("Formatted double: %.2f", db));
    }
}