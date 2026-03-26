package string;
import java.util.*;
public class stringBuilderBasics {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a string: ");
	String name = sc.nextLine(); // taking input as string
	
	StringBuilder sb = new StringBuilder(name); // Convert to string builder
	
// 1.  setChar -> Tony ---Pony
	
	sb.setCharAt(0,'P');
	System.out.println(sb);
	
// 2.	insert -> Tony ---STony
	
	sb.insert(0, "S");
	System.out.println(sb);
	
// 3.	Append -> Add value at the end of string
	 StringBuilder sd = new StringBuilder("H");
	 sd.append("e");
	 sd.append("l");
	 sd.append("l");
	 sd.append("o");
	 System.out.println(sd);

// 4.	Reverse
	 sd.reverse();
	 System.out.println(sd);

// 5.	Length
	 
	 System.out.println(sd.length());
	
// 6.	Sub String :-
	 String str = "My name is Tony";
	 String str2 = str.substring(11,str.length());
	 System.out.println(str2);
	}
}
