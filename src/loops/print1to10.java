package loops;

public class print1to10 {
	public static void main(String[] args) {
// Print number from 1 to 10
		
		
// Using for Loop		
		for(int i=1 ; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.print("\n");
		
		
// Using While Loop
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.print("\n");
		
		
// Using Do-While loop
		int j=1;
		do {
			System.out.print(j+" ");
			j++;
		}while(j<=10);
	}
}
