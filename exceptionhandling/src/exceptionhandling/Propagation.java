package exceptionhandling;

public class Propagation {
	static void f1() throws Exception{
		throw new Exception("error");
	}
	static void f2() throws Exception{
		f1();
	}
	static void f3() {
		try {
			f2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		f3();
	}
}
