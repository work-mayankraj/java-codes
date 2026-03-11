package loops;
import java.util.*;
public class printEven {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	
	for(int i=2 ; i<=num ; i+=2) {
		System.out.print(i+" ");
	}

// infinite loop :)_
	for(; ;) {
		System.out.println("Hello");
	}
}
}
