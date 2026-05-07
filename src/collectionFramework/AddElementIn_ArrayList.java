package collectionFramework;
import java.util.*;
public class AddElementIn_ArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter size of ArrayList: ");
		int size = sc.nextInt();
		
		ArrayList ar = new ArrayList();
		
		System.out.println("Enter array elements: ");
		for(int i =0; i<size; i++) {
			ar.add(sc.nextInt());
		}
		System.out.println(ar);
		
	}		
}
