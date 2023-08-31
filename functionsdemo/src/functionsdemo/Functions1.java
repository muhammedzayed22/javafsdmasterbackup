package functionsdemo;
import java.util.*;
public class Functions1 {
	public void demo() {
		System.out.println("Java Functions with object");
	}
	public static void demo1() {
		System.out.println("Java functions");
		
	}
	public static int demo2() {
		int a = 10;
		return (a+2);
	}
	public static float demo3(float z) {
		return (z*3);
	}
	public static void main(String[] args) {
		Functions1 f = new Functions1();
		f.demo();
		demo1();
		int b = demo2();
		System.out.println(b);
		System.out.println(demo3((float) 2.2));
	}
}
