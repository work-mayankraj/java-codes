package collectionFramework;
import java.util.ArrayList;
public class ArrayListBasics {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(80);
		al.add("Java");
		al.add(3.14);
		System.out.println(al); // 
		System.out.println(al.size()); // 4
		System.out.println(al.contains(10)); // true
		System.out.println(al.get(2)); // Java
		System.out.println(al.getFirst()); //10
		System.out.println(al.getLast()); // 3.14
		System.out.println(al.getClass()); // class java.util.ArrayList
		System.out.println(al.isEmpty()); // false
		System.out.println(al.indexOf(80)); // 1
		al.remove(0); 
		System.out.println(al); // [80, java, 3.14]
		al.add(55);
		System.out.println(al); // [80, java, 3.14, 55]
		System.out.println(al.lastIndexOf(55)); // 3
		al.removeLast();
		System.out.println(al); // [80, java, 3.14]
		al.set(2, "Html");
		System.out.println(al); // [80, java, Html]
		
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		al1.add("op");
		al1.add(512);
		al1.add(396591);
		
		al.addAll(al1);
		System.out.println(al); // [80, Java, html, op, 512, 396591]
		System.out.println(al1); // [op, 512, 396591]
		System.out.println(al.addAll(al1)); // true
		
		
	}
}
