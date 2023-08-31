package exceptionhandling;

public class nestedtry {
	static int a1[] = new int[3];
	public static void main(String[] args) {
		try {
			try {
				System.out.println(23/0);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				a1[5]=90;
			}
			catch(Exception e) {
				System.out.println(e);
			}
			try {
				String a = null;
				System.out.println(a.length());
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}	
