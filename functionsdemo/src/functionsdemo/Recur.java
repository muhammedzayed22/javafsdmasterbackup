package functionsdemo;
import java.util.*;
public class Recur {
	static int a=0;
	public static void fun1() {
		System.out.println("Example of Recursion");
		if (a<=5) {
			a++;
			fun1();
		}
	}
	public static void fun2() {
		System.out.println("Example 2");
		if (a>=4)
			return;
		a++;
		fun2();
		
	}
	public static void main(String[] args) {
		fun1();
		fun2();
	}
}
