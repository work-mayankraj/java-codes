package string;
import java.util.*;
public class introduction {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		/*String name = in.nextLine();
		System.out.println("Your name is :"+name);
		 */
// Concatination
	  String firstName = "Tony";
	  String secondName = "Stark";
	  String fullName = firstName + " " + secondName;
	  System.out.println(fullName);
	  System.out.println(fullName.length());
// charAt
	  for(int i=0;i<fullName.length(); i++) {
		  System.out.print(fullName.charAt(i));
	  }
// Compare 
	  /* 
	   s1 > s2 : +ve value
	   s1 < s2 : -ve value
	   s1 == s2 : zero (0)
	   */
	  String name1 = "Tony";
	  String name2 = "Tony";
	  
	  if(name1.compareTo(name2) == 0) {
		  System.out.println("String are equal:");
	  }
	  else {
		  System.out.println("String are not equal:");
	  }
}
}
