package functionsdemo;

public class Args1 {
	public static void demo(int a,int b) {
		System.out.print(a+b+"\n");
	}
	public static void demo1(int ...a) {
		for  (int i:a)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		demo(1,2);
		demo1(8,9,10);
	}
}
