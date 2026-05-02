package strings;
import java.util.*;
public class CountFrequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		int size = str.length();

		System.out.println("Character Frequencies:");

		for (int i = 0; i < size; i++) {
			char current = str.charAt(i);
			int count = 0;

			// Check if already counted
			boolean alreadyCounted = false;
			for (int k = 0; k < i; k++) {
				if (str.charAt(k) == current) {
					alreadyCounted = true;
					break;
				}
			}
			if (alreadyCounted) {
				continue;
			}
			// Count frequency
			for (int j = 0; j < size; j++) {
				if (str.charAt(j) == current) {
					count++;
				}
			}

			System.out.println(current + ": " + count);
		}
	}
}
