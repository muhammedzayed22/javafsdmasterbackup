package exceptionhandling;

public class printexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(Exception f) {
			f.printStackTrace();
			System.out.println(f);
			System.out.println(f.getMessage());
		}
		System.out.println("exception");
	}

}
