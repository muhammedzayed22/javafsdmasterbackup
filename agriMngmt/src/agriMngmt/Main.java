package agriMngmt;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. -> Admin\n2. -> Farmer\n3. -. Customer");
		int a = sc.nextInt();
		if (a==1) {
			System.out.println("1. -> Login\n2. -> Sign Up.");
			int b = sc.nextInt();
			if (b==1) {
				System.out.println("Enter Username");
				String Uname = sc.nextLine();
				System.out.println("Enter Password");
				String PW = sc.nextLine();
			}
		}
	}
}
