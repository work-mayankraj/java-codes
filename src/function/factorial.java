package function;
import java.util.Scanner;
import java.util.concurrent.*;
public class function {
public static int fact(int num){
	if(num==0) return 1;
	if(num==1) return 1;
	else return num*fact(num-1);
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();
	int factorial= fact(num);
	System.out.print("factorial = "+factorial);
}

}
