package collectionFramework;
import java.util.*;
public class RetriveElementArraylist {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter the size :");
		int size = sc.nextInt();
		
		// ArrayList
		ArrayList al = new ArrayList();
		for(int i=0; i<size; i++) {
			al.add(sc.nextInt());
		}
		
// Print element at that index using get()
		int index = sc.nextInt();
		System.out.println("Element at index "+index+ " is : "+ al.get(index));
		
		
	}
}
