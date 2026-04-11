// Variable length arguments
package arrays;
import java.util.*;
public class varArgs {
public static void main(String[] args) {
	fun(2,3,6,7,8);
}
static void fun(int ...v) {
	System.out.println(Arrays.toString(v));
}
}
