package exceptionhandling;

class user extends Exception{
	public user (String str) {
		super(str);
	}
}

public class userdefined {
	public static void main(String[] args) {
		try {
			throw new user("i have created this exception");
		}
		catch(user u) {
			System.out.println(u);
			u.printStackTrace();
		}
	}
}
