package exceptionhandling;

public class throwexample {
	static void demo() {
		try {
			throw new NullPointerException("no space to null");
		}
		catch (Exception e) {
			System.out.println("I'm inside my demo catch");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			demo();
		}
		catch(NullPointerException e) {
			System.out.println("I have handled the error"+e);
		}
		
	}
}
