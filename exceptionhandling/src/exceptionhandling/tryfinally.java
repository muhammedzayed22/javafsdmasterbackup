package exceptionhandling;

public class tryfinally {
	static int a1[] = new int[3];
	public static void main(String[] args) {
		try {
			int i=a1[4];
		}
		finally {
			System.out.println("Error.....");
		}
		System.out.println("new lines....");
	}
}
