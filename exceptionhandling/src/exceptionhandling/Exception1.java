package exceptionhandling;

public class Exception1 {
	static void add(int a,int b) {
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		try {
			add(9,3);
		}
		catch(Exception e) {
			add(9,9);
		}
		finally {
			System.out.println("error handled.....");
		}
	}
}
