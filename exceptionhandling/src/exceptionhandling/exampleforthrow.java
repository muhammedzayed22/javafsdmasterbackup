package exceptionhandling;

public class exampleforthrow {
	static void demo() throws ArrayIndexOutOfBoundsException{
		int a1[] = new int[10];
		a1[11] = 7897;
		System.out.println(a1[11]);
		throw new ArrayIndexOutOfBoundsException();
	}
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("demo"+e);
		}
		System.out.println("continue...");
	}
}
