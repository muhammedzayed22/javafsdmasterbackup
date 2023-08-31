package functionsdemo;
import java.util.*;
public class Fun2 {
	public void fun11(Integer n1) {
		System.out.print("fun11(Integer1)");
	}
	public void fun11(String n2) {
		System.out.print("fun11(Integer2)");
	}
	public static void main(String[] args) {
		Fun2 a = new Fun2();
		Integer a1 = null;
		String a2 = null;
		a.fun11(a1);
		a.fun11(a2);
		
	}
}
