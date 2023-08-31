package collections;
import java.util.*;



public class Lamb {
	interface f1{
		//int op(int a,int b);
		void abs(int x1,int x2);
		default void msg() {
			System.out.println("hi");
		}
	}
//	private int operation(int a,int b,f1 f) {
//		return f.op(a, b);
//	}
	public static void main(String[] args) {
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
//		a1.add(11);
//		a1.add(12);
//		a1.add(13);
//		a1.add(14);
//		a1.add(15);
//		a1.forEach(n -> System.out.println(n));
//		a1.forEach(n -> 
//		{
//			if (n%2==0)
//				System.out.println(n);
//		});
		Lamb l1 = new Lamb();
		
		f1 b1 = (int x1,int y1) -> System.out.println(x1*y1);
		b1.abs(9, 10);
		//System.out.println(l1.operation(2, 3, a));
	}
}
